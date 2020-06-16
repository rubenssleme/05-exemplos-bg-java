package br.org.laramara.usse.controladores;

import br.org.laramara.usse.repositorios.RepositorioUsuario;
import br.org.laramara.usse.dominio.Usuario;
import br.org.laramara.usse.telas.TelaPrincipal;
import br.org.laramara.usse.utilitarios.HibernateUtil;
import br.org.laramara.usse.utilitarios.Mensagem;
import java.awt.Color;
//import br.com.apf.gerenciadorfinanceiro.utilitarios.Conexao;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.hibernate.HibernateException;
import org.hibernate.Session;

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
    public TelaPrincipal telaPrincipal;

    public ControladorTelaLogin(JFrame tela, JTextField txtUsuario, JTextField txtSenha, JLabel lblStatus, JButton btnLogin) {
        this.telaLogin = tela;
        this.txtUsuario = txtUsuario;
        this.txtSenha = txtSenha;
        this.lblStatus = lblStatus;
        this.btnLogin = btnLogin;

        this.txtUsuario.addActionListener((ActionEvent e) -> {
            transferirFoco((JComponent) e.getSource());
        });
        this.txtSenha.addActionListener((ActionEvent e) -> {
            logar();
        });
        this.btnLogin.addActionListener((ActionEvent e) -> {
            logar();
        });

        checarConexao();
    }

    private void checarConexao() {
        try {
            Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
            if (sessao != null) {
                lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/br/org/laramara/usse/icones/db-ok.png")));
                lblStatus.setToolTipText("Status de conexão: Conectado");
            } else {
                lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/br/org/laramara/usse/icones/db-error.png")));
                lblStatus.setToolTipText("Status de conexão: Não conectado");
            }
        } catch (HibernateException ex) {
            Logger.getLogger(ControladorTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void transferirFoco(JComponent campo) {
        campo.transferFocus();
    }

    private boolean camposPreenchidos() {
        return !(txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty());
    }

    private void logar() {
        if (camposPreenchidos()) {
            if (usuarioCadastrado()) {
                telaPrincipal = TelaPrincipal.obterInstancia();
                telaPrincipal.lblUsuario.setText(usuario.getNome());
                if (usuario.getPerfil().equals("Admin")) {
                    TelaPrincipal.menuRelatorio.setEnabled(true);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(true);
                    telaPrincipal.lblUsuario.setText(usuario.getNome());
                    telaPrincipal.lblUsuario.setForeground(Color.red);
                } else {
                    TelaPrincipal.menuRelatorio.setEnabled(false);
                    TelaPrincipal.menuCadastroUsuario.setEnabled(false);
                }
                telaPrincipal.setVisible(true);
                telaLogin.dispose();
            } else {
                Mensagem.exibirMensagem("Usuário não cadastrado");
                txtSenha.selectAll();
            }
        } else {
            Mensagem.exibirMensagem("Preencha os campos");
            txtUsuario.requestFocus();
        }
    }

    private boolean usuarioCadastrado() {
        // usuario = new RepositorioUsuario().buscarPorUsuarioSenha(txtUsuario.getText(), txtSenha.getText());
        Long codigo = 1L;
        usuario = new RepositorioUsuario().buscar(codigo);
        return (usuario != null);
    }

    private void fechar() {
        telaLogin.setVisible(false);;
        telaPrincipal.setVisible(true);
    }
}
