package br.org.laramara.usse.controladores;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author l
 */
public class ControladorTelaAcessoRapido {

    private JButton jbtOrdemServico;
    private JButton jbtAgendaContato;
    private JButton jbtCadastroUsuario;
    private JLabel lblConsultar;

    public ControladorTelaAcessoRapido(JFrame telaPrincipal, JDesktopPane desktop, JLabel lblConsultar,
            JButton jbtOrdemServico, JButton jbtAgendaContato, JButton jbtCadastroUsuario) {
        this.lblConsultar = lblConsultar;
        this.jbtOrdemServico = jbtOrdemServico;
        this.jbtAgendaContato = jbtAgendaContato;
        this.jbtCadastroUsuario = jbtCadastroUsuario;

    }
}
