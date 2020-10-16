package br.com.conexao.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.conexao.control.ControladorTelaProduto;

@SuppressWarnings("serial")
public class TelaProduto extends JFrame {
	JLabel jlNome;
	JLabel jlID;
	JLabel jlPreco;
	JLabel jlCategoria;
	
	JButton jbtCadastrar;
	JButton jbtExcluir;
	JButton jbtConsultar;
	JButton jbtAlterar;
	JButton jbtFechar;
	JButton jbtLimpar;
	JButton jbtMostrarTudo;
	
	JTextField jtfId;
	JTextField jtfNome;	
	JFormattedTextField jtfPreco;
	JComboBox<String> jcbCategoria;
	
	ControladorTelaProduto controlador;
	
	public TelaProduto() {
		controlador = new ControladorTelaProduto(this, jlNome, jlID,
				jlPreco,jlCategoria, jbtCadastrar, jbtExcluir, jbtConsultar, jbtAlterar,
				jbtFechar, jbtLimpar, jbtMostrarTudo, jtfNome, jtfId, jtfPreco, jcbCategoria);
		controlador.abrirTela();
	}

	public static void main(String[] args) {
		new TelaProduto();
	}
}
