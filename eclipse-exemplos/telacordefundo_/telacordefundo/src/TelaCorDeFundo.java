

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCorDeFundo extends JFrame {
// Declaração dos objetos
	JLabel jlaNome;
	JTextField jtfNome;
	JButton  jbuOK;
	
	public TelaCorDeFundo(){
		super("Primeira Tela no Java  :^)");
		Container tela = getContentPane();
		setLayout(null);
		jlaNome = new JLabel("Nome: ");
		jlaNome.setBounds(50,10,80,20);
		jtfNome = new JTextField(50);
		jtfNome.setBounds(50,40,80,20);
		
		
		tela.add(jlaNome);
		tela.add(jtfNome);
		tela.setBackground(Color.blue);
		setSize(600,300);
		
	}

}
