package br.com.bg.bghibernate.controladores;


import br.com.bg.bghibernate.telas.AcessoRapido;
import br.com.bg.bghibernate.telas.TelaCadastroCliente;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;



public abstract class ControladorTela {
//Atributos
    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane jdpTelaCadastroCliente;
    private AcessoRapido acessoRapido;
    private TelaCadastroCliente telaCadastroCliente;
   
 
//Construtor 
    public ControladorTela(JFrame telaPrincipal, JDesktopPane jdpTelaCadastroCliente) {
        this.telaPrincipal = telaPrincipal;
        this.jdpTelaCadastroCliente = jdpTelaCadastroCliente;
    }

    
    
    
    
    
    
    
    
    
    
   /* public void acessoRapido(JFrame telaPrincipal, JDesktopPane desktop) {
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
    public void telaGerenciarServidores() {
        if (telaGerenciarServidor == null) {
            telaGerenciarServidor = new TelaGerenciarServidores();
            desktop.add(telaGerenciarServidor);
        }
        telaGerenciarServidor.setVisible(true);
        mostrarTela(telaGerenciarServidor);
    }*/
     public void telaCadastroCliente() {
        if (telaCadastroCliente == null) {
            telaCadastroCliente = new TelaCadastroCliente();
            jdpTelaCadastroCliente.add(telaCadastroCliente);
        }
        telaCadastroCliente.setVisible(true);
        mostrarTela(telaCadastroCliente);
    }
   
    private void mostrarTela(JInternalFrame tela) {
        if (tela != acessoRapido) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(jdpTelaCadastroCliente.getSize());
        jdpTelaCadastroCliente.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
