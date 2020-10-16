import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJPasswordField extends JFrame{
	JPasswordField caixa;
	JLabel rotulo;
	public ExemploJPasswordField(){
		super("Exemplo com JPasswordField");
		Container tela = getContentPane();
		setLayout(null);
		rotulo = new JLabel("Senha: ");
		caixa = new JPasswordField(10);
		rotulo.setBounds(50,20,100,20);
		caixa.setBounds(50,60,100,20);
		tela.add(rotulo);
		tela.add(caixa);
		setSize(400, 250);
		setVisible(true);
	}
	public static void main(String args[]){
		ExemploJPasswordField app = new ExemploJPasswordField();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
