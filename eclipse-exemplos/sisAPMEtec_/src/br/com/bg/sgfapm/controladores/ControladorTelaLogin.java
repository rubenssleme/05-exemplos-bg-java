package br.com.bg.sgfapm.controladores;

import br.com.bg.sgfapm.repositorio.RepositorioUsuario;
import br.com.bg.sgfapm.dominio.Usuario;
import br.com.bg.sgfapm.telas.TelaPrincipal;
import br.com.bg.sgfapm.utilitarios.Conexao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author l
 */
public class ControladorTelaLogin {

    private JFrame telaLogin;
    private JTextField txtUsuario;
    private JTextField txtSenha;
    private JLabel lblStatus;
    private JButton btnLogin;
    private Usuario usuario;

    public ControladorTelaLogin(JFrame tela, JTextField txtUsuario, JTextField txtSenha, JLabel lblStatus, JButton btnLogin) {
        this.telaLogin = tela;
        this.txtUsuario = txtUsuario;
        this.txtSenha = txtSenha;
        this.lblStatus = lblStatus;
        this.btnLogin = btnLogin;
        
        this.txtUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent)e.getSource());
            }
        });
        this.txtSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar();
            }
        });
        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar();
            }
        });
        
        checarConexao();
    }

    private void checarConexao() {
        try (Connection conexao = new Conexao().getConnection()) {
            if (conexao != null) {
                lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/br/com/bg/sgfapm/icones/db-ok.png")));
                lblStatus.setToolTipText("Status de conexão: Conectado");
            } else {
                lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/br/com/bg/sgfapm/icones/db-error.png")));
                lblStatus.setToolTipText("Status de conexão: Não conectado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void transferirFoco(JComponent campo){
        campo.transferFocus();
    }

    private boolean camposPreenchidos() {
        return !(txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty());
    }

    private void logar() {
        if (camposPreenchidos()) {
            if (usuarioCadastrado()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.lblUsuario.setText(usuario.getNome());
                if (usuario.getPerfil().equals("admin")) {
                    TelaPrincipal.menuRelatorio.setEnabled(true);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(true);
                    principal.lblUsuario.setText(usuario.getNome());
                    principal.lblUsuario.setForeground(Color.red);
                } else {
                    TelaPrincipal.menuRelatorio.setEnabled(false);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(false);
                }
                principal.setVisible(true);
                telaLogin.dispose();
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
        usuario = new RepositorioUsuario().buscarPorUsuarioSenha(txtUsuario.getText(), txtSenha.getText());
        return (usuario != null);
    }

    private void fechar() {
        telaLogin.setVisible(false);
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}
