import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploBotao2 extends JFrame{
	JButton botao;
	ImageIcon icone;
	public ExemploBotao2(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		icone = new ImageIcon("Abrir.gif");
		botao = new JButton ("Abrir",icone);
		botao.setBounds(50,30,100,30);
		tela.add(botao);
		setSize(300, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		ExemploBotao2 app = new ExemploBotao2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}