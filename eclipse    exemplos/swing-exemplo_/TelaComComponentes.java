import javax.swing.*;
import java.awt.*;

public class TelaComComponentes extends JFrame{
	//Declaração dos componentes de tela
	JLabel jlaImagemCadeado,jlaUsuario,jlaSenha; // labels
	JTextField jtfUsuario, jtfSenha; // campos de texto
	JButton jbuOK, jbuCancelar; // botões
		

	
	//Contrutor da classe
	public TelaComComponentes(){
		super("Tela de Login");
		setLayout(null);
		Container tela = getContentPane();
		tela.setBackground(new Color(0,255,255));
	
		
		//instancia dos objetos e definição de parametros.
		jlaImagemCadeado =  new JLabel();
		jlaImagemCadeado.setIcon(new ImageIcon("cadeado.png") );
		jlaImagemCadeado.setBounds(20, 10, 100, 150);
		
		jlaUsuario = new JLabel("Usuario:");
		jlaUsuario.setBounds(130,50,100,20);
		
		jtfUsuario = new JTextField();
		jtfUsuario.setBounds(130,70,200,25);
				
		jlaSenha = new JLabel("Senha:");
		jlaSenha.setBounds(130,85,100,30);
		
		jtfSenha = new JTextField();
		jtfSenha.setBounds(130,110,200,25);
		
		jbuOK = new JButton("OK");
		jbuOK.setBounds(130,145,90,30);
		
		jbuCancelar = new JButton("Cancelar");
		jbuCancelar.setBounds(240,145,90,30);
		
		
		
		//colocar os objetos em tela
		tela.add(jlaImagemCadeado);
		tela.add(jlaUsuario);
		tela.add(jtfUsuario);
		tela.add(jlaSenha);
		tela.add(jtfSenha);
		tela.add(jbuOK);
		tela.add(jbuCancelar);
		
		
		//definor tamanho da tela e localização em relação ao windows e deixar visivel
		setSize(400, 230);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		TelaComComponentes app = new TelaComComponentes();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
}