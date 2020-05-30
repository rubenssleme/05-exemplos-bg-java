package projAbrirTela;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela3 extends JFrame {
	JLabel lbemail, lbnome;
	JTextField txtnome, txtemail;
	JButton exInfo;
	

	public Tela3(){
		super("Tela 3");
		Container tela = getContentPane();
		setLayout(null);
		
		lbnome = new JLabel("nome:");
		lbnome.setBounds(50, 10, 120, 10);
		
		lbemail = new JLabel("email:");
		lbemail.setBounds(50, 70, 120, 10);
		
		tela.add(lbnome);
		tela.add(lbemail);
		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);	


		txtnome = new JTextField("");
		txtnome.setBounds(50, 30, 100, 30);
		txtemail = new JTextField("");
		txtemail.setBounds(50, 90, 100, 30);

		tela.add(txtemail);
		tela.add(txtnome);
		
		
		exInfo = new JButton("exibir informações");
		exInfo.setBounds(50, 150, 150, 30);
		exInfo.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Pessoa p = new Pessoa();
						p.setNome(txtemail.getText());
						p.setEmail(txtnome.getText());
						p.exibirInfo(p);	
					}
				}
				);
		tela.add(exInfo);
		setSize(400,250);
		setVisible(true);
		setLocationRelativeTo(null);

	}
}