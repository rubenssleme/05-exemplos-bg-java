import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploBotao3 extends JFrame{
	JButton botao;
	ImageIcon icone;
	public ExemploBotao3(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		icone = new ImageIcon("abrir.gif");
		botao = new JButton (icone);
		botao.setBounds(50,30,100,30);
		tela.add(botao);
		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		ExemploBotao3 app = new ExemploBotao3();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}