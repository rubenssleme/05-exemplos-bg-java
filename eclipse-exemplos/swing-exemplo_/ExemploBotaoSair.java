import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBotaoSair extends JFrame{
	JButton botaosair;
	public ExemploBotaoSair(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		botaosair = new JButton ("Sair");
		botaosair.setBounds(100,50,100,20);
		botaosair.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.exit(0);
					}
				}
		);
		tela.add(botaosair);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String args[]){
		ExemploBotaoSair app = new ExemploBotaoSair();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
