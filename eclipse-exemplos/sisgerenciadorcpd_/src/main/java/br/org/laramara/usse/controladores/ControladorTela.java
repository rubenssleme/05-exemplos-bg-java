package br.org.laramara.usse.controladores;

import br.org.laramara.usse.modelos.ModeloTabela;
import br.org.laramara.usse.telas.AcessoRapido;
import br.org.laramara.usse.telas.TelaCadastroCliente;
import br.org.laramara.usse.telas.TelaCadastroUsuario;
import br.org.laramara.usse.telas.TelaEditarEquipamento;
import br.org.laramara.usse.telas.TelaLogin;
import br.org.laramara.usse.telas.TelaGerenciarEquipamentos;
import br.org.laramara.usse.telas.TelaSobre;
import br.org.laramara.usse.utilitarios.Mensagem;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author l
 */
public abstract class ControladorTela {

    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane desktop;
    private AcessoRapido acessoRapido;
    private TelaLogin login;
    private TelaCadastroUsuario usuario;
    private TelaGerenciarEquipamentos telaGerenciarEquipamento;
    private TelaEditarEquipamento telaEditarEquipamento;
    private TelaCadastroCliente telaCadastroCliente;

    public ControladorTela(JFrame telaPrincipal, JDesktopPane desktop) {
        this.telaPrincipal = telaPrincipal;
        this.desktop = desktop;
    }

    public void acessoRapido(JFrame telaPrincipal, JDesktopPane desktop) {
        if (acessoRapido == null) {
            acessoRapido = new AcessoRapido(telaPrincipal, desktop);
            desktop.add(acessoRapido);
        }
        acessoRapido.setVisible(true);
        mostrarTela(acessoRapido);
    }

    public void acessoRapido() {
        if (acessoRapido == null) {
            acessoRapido = new AcessoRapido();
            desktop.add(acessoRapido);
        }
        acessoRapido.setVisible(true);
        mostrarTela(acessoRapido);
    }

    public void telaLogin() {
        login = new TelaLogin();
        login.setVisible(true);
        telaPrincipal.dispose();
    }

    public void telaSobre() {
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }

    public void telaCadastroUsuario() {
        if (usuario == null) {
            usuario = new TelaCadastroUsuario();
            desktop.add(usuario);
        }
        usuario.setVisible(true);
        mostrarTela(usuario);
    }

    public void telaGerenciarEquipamento() {
        if (telaGerenciarEquipamento == null) {
            telaGerenciarEquipamento = new TelaGerenciarEquipamentos();
            desktop.add(telaGerenciarEquipamento);
        }
        telaGerenciarEquipamento.setVisible(true);
        mostrarTela(telaGerenciarEquipamento);
    }

    public void telaCadastroCliente() {
        if (telaCadastroCliente == null) {
            telaCadastroCliente = new TelaCadastroCliente();
            desktop.add(telaCadastroCliente);
        }
        telaCadastroCliente.setVisible(true);
        mostrarTela(telaCadastroCliente);
    }

    public void telaEditarEquipamento() {
        if (telaEditarEquipamento == null) {
            telaEditarEquipamento = new TelaEditarEquipamento();

            desktop.add(telaEditarEquipamento);
            telaEditarEquipamento.toFront();
        }
        telaEditarEquipamento.setVisible(true);
        mostrarTela(telaEditarEquipamento);
    }

    public void abrirOrdemServico() {
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://lm-webserver/suporte/admin/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AcessoRapido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AcessoRapido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirRamais() {
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://10.10.10.4/ramais"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AcessoRapido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AcessoRapido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirPastaCPD() {
        try {
            Runtime.getRuntime().exec("explorer \\\\lm-fileserver\\cpd\\CPD");
        } catch (java.io.IOException ex) {
            Mensagem.exibirMensagem("Não foi possivel abrir CPD");
        }
    }

    public void mostrarTela(JInternalFrame tela) {
        if (tela != acessoRapido) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(desktop.getSize());
        desktop.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    protected ModeloTabela obterModeloTabela(JTable tabela) {
        return ((ModeloTabela) tabela.getModel());
    }

    protected boolean estaComItemValidoSelecionado(JComboBox jComboBox) {
        return jComboBox.getSelectedIndex() == 0;
    }

}
