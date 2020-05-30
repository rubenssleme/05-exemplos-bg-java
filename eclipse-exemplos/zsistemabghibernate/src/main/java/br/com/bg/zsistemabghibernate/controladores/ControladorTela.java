
package br.com.bg.zsistemabghibernate.controladores;

import br.com.bg.zsistemabghibernate.tela.TelaAcessoRapido;
import br.com.bg.zsistemabghibernate.tela.TelaCadastroCliente;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ControladorTela {
    //Atributos
    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane desktop;
    private TelaAcessoRapido acessoRapido;
    private TelaCadastroCliente telaCadastroCliente;
 //Construtor 
    public ControladorTela(JFrame telaPrincipal, JDesktopPane desktop) {
        this.telaPrincipal = telaPrincipal;
        this.desktop = desktop;
    }
    
     public void telaCadastroCliente() {
        if (telaCadastroCliente == null) {
            telaCadastroCliente = new TelaCadastroCliente();
            desktop.add(telaCadastroCliente);
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
        tela.setSize(desktop.getSize());
        desktop.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
