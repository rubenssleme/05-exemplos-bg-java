import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJCheckBox2 extends JFrame{
	JCheckBox primeira,segunda,terceira,quarta,quinta;
	public ExemploJCheckBox2(){
		super("Exemplo de um JCheckBox");
		Container tela = getContentPane();
		tela.setLayout(null);
		primeira = new JCheckBox("Java");
		segunda = new JCheckBox("C++");
		terceira = new JCheckBox("Delphi");
		quarta = new JCheckBox("Visual Basic");
		quinta = new JCheckBox("Python");
		primeira.setMnemonic(KeyEvent.VK_J);
		segunda.setMnemonic(KeyEvent.VK_C);
		terceira.setMnemonic(KeyEvent.VK_D);
		quarta.setMnemonic(KeyEvent.VK_V);
		quinta.setMnemonic(KeyEvent.VK_P);
		primeira.setBounds(40,60,60,20);
		segunda.setBounds(100,60,60,20);
		terceira.setBounds(160,60,60,20);
		quarta.setBounds(230,60,100,20);
		quinta.setBounds(335,60,70,20);
		primeira.setSelected(true);
		tela.add(primeira);
		tela.add(segunda);
		tela.add(terceira);
		tela.add(quarta);
		tela.add(quinta);
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main (String args[]){
		ExemploJCheckBox2 app = new ExemploJCheckBox2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}