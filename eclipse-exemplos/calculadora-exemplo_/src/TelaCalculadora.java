import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;





public class TelaCalculadora extends JFrame {
	private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	private JTextArea txt1;

	public TelaCalculadora(){
		super("Calculadora");
		Container tela = getContentPane();
		setLayout(null);
		txt1 = new JTextArea();
		txt1.setBounds(50, 20, 300, 20);
		
		btn1 = new JButton("1");
		btn1.setBounds(50,45, 100, 20);
		btn2 = new JButton("2");
		btn2.setBounds(50,65, 100, 20);
		btn3 = new JButton("3");
		btn3.setBounds(50,85, 100, 20);
		
		btn4 = new JButton("4");
		btn4.setBounds(150,45, 100, 20);
		btn5 = new JButton("5");
		btn5.setBounds(150,65, 100, 20);
		btn6 = new JButton("6");
		btn6.setBounds(150,85, 100, 20);
		
		
		
		
		
		btn7 = new JButton("7");
		btn7.setBounds(250,45, 100, 20);
		btn8 = new JButton("8");
		btn8.setBounds(250,65, 100, 20);
		btn9 = new JButton("9");
		btn9.setBounds(250,85, 100, 20);
		
		tela.add(btn1);
		tela.add(btn2);
		tela.add(btn3);
		tela.add(btn4);
		tela.add(btn5);
		tela.add(btn6);
		tela.add(btn7);
		tela.add(btn8);
		tela.add(btn9);
		tela.add(txt1);
		setSize(400,250);
		setVisible(true);
		
	
	}
	
	public static void main(String[] args) {
		TelaCalculadora app = new TelaCalculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
