package projAbrirTela;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2 extends JFrame {
	JLabel lbcpf, lbrg;
	JTextField cpf, rg;
	JButton exInfo;
	
	public Tela2(){
		super("Tela 2");
		Container tela = getContentPane();
		setLayout(null);
		
		cpf = new JTextField("");
		cpf.setBounds(50, 30, 100, 30);
		rg = new JTextField("");
		rg.setBounds(50, 90, 100, 30);
		tela.add(cpf);
		tela.add(rg);
		
		lbcpf = new JLabel("cpf");
		lbcpf.setBounds(50, 10, 120, 10);
		lbrg = new JLabel("rg");
		lbrg.setBounds(50, 70, 120, 10);
		tela.add(lbcpf);
		tela.add(lbrg);
		
		
		
		exInfo = new JButton("exibir informações");
		exInfo.setBounds(50, 150, 150, 30);
		exInfo.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Pessoa p = new Pessoa(); 
						p.setCpf(cpf.getText());
						p.setRg(rg.getText());
						p.exibirInfo(p);
					}
				}
				);
		
		tela.add(exInfo);
		setSize(400,500);
		setVisible(true);
		setLocationRelativeTo(null);


		
	}
}
