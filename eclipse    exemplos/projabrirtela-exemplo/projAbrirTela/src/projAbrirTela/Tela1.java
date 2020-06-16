package projAbrirTela;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela1 extends JFrame {
	JButton botaoTela2,botaoTela3;
	public Tela1(){
		super("Tela 1");
		Container tela = getContentPane();
		setLayout(null);

		botaoTela2 = new JButton("tela 2");
		botaoTela2.setBounds(50, 30, 100, 30);
		botaoTela2.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Tela2 tela = new Tela2();
					}
				}
				);

		botaoTela3 = new JButton("tela 3");
		botaoTela3.setBounds(50, 90, 100, 30);
		botaoTela3.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Tela3 tela = new Tela3();
					}
				}
				);
		tela.add(botaoTela3);
		tela.add(botaoTela2);
		setSize(500, 100);
		setVisible(true);
		setLocationRelativeTo(null);	

	}
}