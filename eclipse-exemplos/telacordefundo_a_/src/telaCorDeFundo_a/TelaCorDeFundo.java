package telaCorDeFundo_a;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCorDeFundo extends JFrame {
	//Declaração dos componentes 
	JLabel jlaNome,jlaEndereco,jlaEMail,jlaConsulta,jlaTelefone,jlaCidade ;
	JTextField jtfNome,jtfEndereco,jtfEmail,jtfTelefone;
	JButton jbuSalvar,jbuCancelar;

	public TelaCorDeFundo(){
		super("Tela de Cadastro de Contato");	
		Container  tela = getContentPane();
		setLayout(null);
		jlaNome = new JLabel("Nome: ");
		jlaNome.setBounds(50,10,80,20);
		jtfNome = new JTextField(50);
		jtfNome.setBounds(50,30,170,20);
		
		jlaEndereco = new JLabel("Endereço: ");
		jlaEndereco.setBounds(50,10,80,20);
		jtfEndereco = new JTextField(50);
		jtfEndereco.setBounds(50,30,170,20);
		
		
		
		
		
		jbuSalvar = new JButton("OK");
		jbuSalvar.setBounds(150,220,100,20);
		jbuCancelar = new JButton("Cancelar");
		jbuCancelar.setBounds(350,220,100,20);
		
		tela.add(jlaNome);
		tela.add(jtfNome);
		tela.add(jbuSalvar);
		tela.add(jbuCancelar);
		
		tela.setBackground(Color.lightGray);
		setSize(805,605);
		setLocationRelativeTo(null);
		//setExtendedState(MAXIMIZED_BOTH);
		
		ImageIcon icone = new ImageIcon("Tux.gif");
		setIconImage(icone.getImage());
		
		
		
	}
}
