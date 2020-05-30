package br.org.laramara.usse.controladores;

import br.org.laramara.usse.dominio.Usuario;
import br.org.laramara.usse.repositorios.RepositorioUsuario;
import br.org.laramara.usse.telas.TelaCadastroUsuario;
import br.org.laramara.usse.utilitarios.Mensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author rubens leme
 * @data  11/04/2017
 * 
 */
public class ControladorTelaCadastroUsuario {

    private TelaCadastroUsuario telaCadastroUsuario;
    private JTextField txtIdUser, txtNomeUser, txtLoginUser, txtSenhaUser;
    private JComboBox<String> cboPerfilUser;
    private JButton btnCadastrar, btnVoltar;
    private Usuario usuario;
    private RepositorioUsuario repUsuario = new RepositorioUsuario();

    public ControladorTelaCadastroUsuario(TelaCadastroUsuario telaCadastroUsuario, JTextField txtNomeUser,
            JTextField txtLoginUser, JTextField txtSenhaUser, JComboBox<String> cboPerfilUser, JButton btnCadastrar, JButton btnVoltar) {
        this.telaCadastroUsuario = telaCadastroUsuario;
        this.txtNomeUser = txtNomeUser;
        this.txtLoginUser = txtLoginUser;
        this.txtSenhaUser = txtSenhaUser;
        this.cboPerfilUser = cboPerfilUser;
        this.btnCadastrar = btnCadastrar;
        this.btnVoltar = btnVoltar;

      /*  this.txtIdUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferirFoco((JComponent) e.getSource());
            }
        });*/
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
        /* this.btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });*/
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
                buscarId();
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
        txtNomeUser.setText(null);
        txtLoginUser.setText(null);
        txtSenhaUser.setText(null);
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

    public void salvar() {
        if (camposPreenchidos()) {
            if (salvarUsuario()) {
                Mensagem.exibirMensagem("Usuário salvo com sucesso!");
                limparCampos();
            } else {
                Mensagem.exibirMensagem("Usuário não salvo!");
            }
        } else {
            Mensagem.exibirMensagem("Preencha todos os campos obrigatórios");
        }
    }

    private boolean salvarUsuario() {
        return repUsuario.salvar(new Usuario(txtNomeUser.getText(), txtLoginUser.getText(),
                txtSenhaUser.getText(), cboPerfilUser.getSelectedItem().toString()));

    }

    private void buscarId() {
        //  txtIdUser.setText(String.valueOf(repUsuario.buscarUltimoId()));
    }
}
