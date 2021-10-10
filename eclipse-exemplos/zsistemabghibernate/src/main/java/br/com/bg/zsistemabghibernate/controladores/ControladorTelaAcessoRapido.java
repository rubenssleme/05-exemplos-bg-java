package br.com.bg.zsistemabghibernate.controladores;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControladorTelaAcessoRapido extends ControladorTela{
    
    private JButton jbtOrdemServico;
    private JButton jbtAgendaContato;
    private JButton jbtCadastroUsuario;
    private JLabel lblConsultar;

    public ControladorTelaAcessoRapido(JFrame telaPrincipal, JDesktopPane desktop, JLabel lblConsultar,
            JButton jbtOrdemServico, JButton jbtAgendaContato, JButton jbtCadastroUsuario) {
        super(telaPrincipal, desktop);
        this.lblConsultar = lblConsultar;
        this.jbtOrdemServico = jbtOrdemServico;
        this.jbtAgendaContato = jbtAgendaContato;
        this.jbtCadastroUsuario = jbtCadastroUsuario;

    }
}
