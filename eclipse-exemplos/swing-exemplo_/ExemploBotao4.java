import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBotao4 extends JFrame{
	JButton botao1,botao2,botao3,botao4;
	public ExemploBotao4(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		botao1 = new JButton ("Procurar");
		botao2 = new JButton ("<< Voltar");
		botao3 = new JButton ("Próximo >>");
		botao4 = new JButton ("Abrir");
		botao1.setBounds(50,20,100,20);
		botao2.setBounds(50,60,100,20);
		botao3.setBounds(50,100,100,20);
		botao4.setBounds(50,140,100,20);
		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);
		tela.add(botao4);
		setSize(400, 250);
		setVisible(true);
	}
	public static void main(String args[]){
		ExemploBotao4 app = new ExemploBotao4();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}