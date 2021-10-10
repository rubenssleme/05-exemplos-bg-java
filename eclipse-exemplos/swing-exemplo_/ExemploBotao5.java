import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBotao5 extends JFrame{
	JButton botao1,btnExibirInfo,btnCancelar,botao4;
	public ExemploBotao5(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		botao1 = new JButton ("Procurar");
		btnExibirInfo = new JButton ("<< Voltar");
		btnCancelar = new JButton ("Próximo >>");
		botao4 = new JButton ("Abrir");
		botao1.setBounds(50,20,100,20);
		btnExibirInfo.setBounds(50,60,100,20);
		btnCancelar.setBounds(50,100,100,20);
		botao4.setBounds(50,140,100,20);
		
		botao1.setBackground(Color.yellow);
		btnExibirInfo.setBackground(Color.red);
		btnCancelar.setBackground(Color.blue);
		botao4.setBackground(Color.white);
		
		tela.add(botao1);
		tela.add(btnExibirInfo);
		tela.add(btnCancelar);
		tela.add(botao4);
		setSize(400, 250);
		setVisible(true);
	}
	public static void main(String args[]){
		ExemploBotao5 app = new ExemploBotao5();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}