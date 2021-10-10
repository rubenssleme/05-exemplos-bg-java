import javax.swing.*;
import java.awt.*;
public class ExemploBotao extends JFrame{
	JButton botao;
	public ExemploBotao(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		botao = new JButton ("Procurar");
		botao.setBounds(50,30,100,30);
		tela.add(botao);
		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		ExemploBotao app = new ExemploBotao();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}