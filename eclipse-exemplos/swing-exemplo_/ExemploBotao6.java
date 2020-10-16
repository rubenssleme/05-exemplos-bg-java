import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBotao6 extends JFrame{
	JButton botao1,botao2,botao3,botao4;
	public ExemploBotao6(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		botao1 = new JButton ("Procurar");
		botao2 = new JButton ("<< Voltar");
		botao3 = new JButton ("Próximo >>");
		
		
		botao4 = new JButton ("Sair");
		botao4.setBounds(50,140,100,20);
		botao4.setForeground(Color.pink);
		botao4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
		
		botao1.setBounds(50,20,100,20);
		botao2.setBounds(50,60,100,20);
		botao3.setBounds(50,100,100,20);
		
		botao1.setForeground(Color.blue);
		botao2.setForeground(Color.green);
		botao3.setForeground(Color.red);
		
		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);
		tela.add(botao4);
		setSize(400, 250);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		ExemploBotao6 app = new ExemploBotao6();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}