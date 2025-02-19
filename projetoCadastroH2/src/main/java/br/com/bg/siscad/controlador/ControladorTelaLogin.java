package br.com.bg.siscad.controlador;

import br.com.bg.siscad.tela.TelaPrincipal;
import br.com.bg.siscad.dominio.Usuario;
import br.com.bg.siscad.service.UsuarioServico;
import br.com.bg.siscad.tela.TelaMenu;
//import br.com.bg.sgfapm.utilitarios.Conexao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorTelaLogin {

    private JFrame telaLogin;
    private JTextField txtUsuario;
    private JTextField txtSenha;
    private JButton btnLogin;
    private Usuario usuario;

    private UsuarioServico usuarioServico;

    public ControladorTelaLogin(JFrame tela, JTextField txtUsuario, JTextField txtSenha, JButton btnLogin, UsuarioServico usuarioServico) {
        this.telaLogin = tela;
        this.txtUsuario = txtUsuario;
        this.txtSenha = txtSenha;
        this.btnLogin = btnLogin;

        this.txtUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });
        this.txtSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar2();
            }
        });
        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar2();
            }
        });

        //checarConexao();
        this.usuarioServico = usuarioServico;
    }

    private void transferirFoco(JComponent campo) {
        campo.transferFocus();
    }

    private boolean camposPreenchidos() {
        return !(txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty());
    }

    private void logar2() {
        if (camposPreenchidos()) {
            if (usuarioCadastrado()) {
                TelaMenu telaMenu = new TelaMenu();
                telaMenu.setUsuarioLogado(usuario.getNome());
                telaMenu.setVisible(true);
                telaLogin.setVisible(false);

            }
        }
    }

    private void logar() {
        if (camposPreenchidos()) {
            if (usuarioCadastrado()) {
                TelaPrincipal principal = new TelaPrincipal();
                //  principal.setUsuarioLogado(usuario.getNome());
                principal.lblUsuario.setText(usuario.getNome());
                if (usuario.getPerfil().equals("admin")) {
                    TelaPrincipal.menuRelatorio.setEnabled(true);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(true);
                    principal.lblUsuario.setText(usuario.getNome());
                    // principal.lblUsuario.setForeground(Color.red);
                } else {
                    TelaPrincipal.menuRelatorio.setEnabled(false);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(false);
                }
                principal.setVisible(true);
                telaLogin.setVisible(false);

                txtUsuario.setText("");
                txtSenha.setText("");

                principal.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        telaLogin.setVisible(true);
                        txtUsuario.grabFocus();
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                txtSenha.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos");
            txtUsuario.requestFocus();
        }
    }

    private boolean usuarioCadastrado() {
        usuario = usuarioServico.autenticar(txtUsuario.getText(), txtSenha.getText());
        return usuario != null;
    }

    public void fecharTela() {
        telaLogin.setVisible(false);
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }
}
