package br.com.bg.siscad.controlador;


import br.com.bg.siscad.dominio.Usuario;
import br.com.bg.siscad.repository.UsuarioRepositorio;
import br.com.bg.siscad.tela.TelaCadastroUsuario;
import br.com.bg.siscad.utils.Provider;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Optional;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ControladorTelaCadastroUsuario {
      private static final Logger logger = LoggerFactory.getLogger(ControladorTelaCadastroUsuario.class.getName());

    private TelaCadastroUsuario telaCadastroUsuario;
    private JTextField txtIdUser,
            txtNomeUser,
            jtfTelefone,
            txtLoginUser,
            txtSenhaUser;
    private JComboBox<String> cboPerfilUser;
    private JButton btnCadastrar,
                 btnVoltar;
  
    private Usuario usuario;
   
   
    private UsuarioRepositorio usuarioRepositorio;

    
    public ControladorTelaCadastroUsuario(TelaCadastroUsuario telaCadastroUsuario, JTextField txtIdUser, JTextField txtNomeUser,JTextField jtfTelefone,
            JTextField txtLoginUser, JTextField txtSenhaUser, JComboBox<String> cboPerfilUser, JButton btnCadastrar, JButton btnVoltar) {
        this.telaCadastroUsuario = telaCadastroUsuario;
	this.usuarioRepositorio = Provider.getBean(UsuarioRepositorio.class);
        this.txtIdUser = txtIdUser;
        this.txtNomeUser = txtNomeUser;
        this.jtfTelefone = jtfTelefone;
        this.txtLoginUser = txtLoginUser;
        this.txtSenhaUser = txtSenhaUser;
        this.cboPerfilUser = cboPerfilUser;
        this.btnCadastrar = btnCadastrar;
        this.btnVoltar = btnVoltar;

        this.txtIdUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });
        this.txtNomeUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });
        this.txtLoginUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });
        this.txtSenhaUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });
        this.cboPerfilUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    transferirFoco((JComponent) e.getSource());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        this.btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });
        this.btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fecharTela();
            }
        });
        this.telaCadastroUsuario.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {

            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                limparCampos();
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {

            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {

            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {

            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
              //  buscarId();
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {

            }
        });
    }

    private void transferirFoco(JComponent campo) {
        campo.transferFocus();
    }

    private void limparCampos() {
        txtIdUser.setText(null);
        txtNomeUser.setText(null);
        txtLoginUser.setText(null);
        txtSenhaUser.setText(null);
        jtfTelefone.setText(null);
        cboPerfilUser.setSelectedIndex(0);
    }

    private boolean camposPreenchidos() {
        return !(txtNomeUser.getText().isEmpty()
                || txtLoginUser.getText().isEmpty()
                || txtSenhaUser.getText().isEmpty());
    }

    private void fecharTela() {
        telaCadastroUsuario.setVisible(false);
        limparCampos();
    }

    private void salvar() {
        if (camposPreenchidos()) {
            if (inserir()) {
                JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não salvo!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        }
    }

    private boolean inserir() {
          logger.info("Inicializando o banco com os dados de teste inserir ...");
          Usuario usu = new Usuario(null,txtNomeUser.getText(),txtLoginUser.getText(),jtfTelefone.getText(),txtSenhaUser.getText(), cboPerfilUser.getSelectedItem().toString());
          logger.info("Inserindo usuário de teste: {}", usu);
          usuarioRepositorio.saveAll(Arrays.asList(usu));
          logger.info("Salvo com sucesso: {}", usu);
         
          return true;
    }


//
//    private void buscarId() {
//        txtIdUser.setText(String.valueOf(repUsuario.buscarUltimoId()));
//    }
}
