import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJTextArea extends JFrame{
	JLabel rotulo;
	JTextArea texto;
	JScrollPane painelrolagem;
	JPanel painel;
	public ExemploJTextArea(){
		super("Exemplo com JTextField");
		Container tela = getContentPane();
		tela.setLayout(null);
		rotulo = new JLabel ("Endereço");
		rotulo.setBounds(50,20,100,20);
		texto = new JTextArea(10,20);
		painelrolagem = new JScrollPane(texto);
		painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		painel = new JPanel();
		painel.add(painelrolagem);
		painel.setBounds(40,40,250,250);
		tela.add(rotulo);
		tela.add(painel);
		setSize(300, 280);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		ExemploJTextArea app = new ExemploJTextArea();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}