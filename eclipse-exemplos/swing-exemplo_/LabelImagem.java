import javax.swing.*;
import java.awt.*;

public class LabelImagem extends JFrame{
	private JLabel jlaNome, jlaSenha, jlaImagem;
	private JTextField jtfNome, jtfSenha;
	private JButton jbuOK, jbuCancelar;
	// declaração da label
	public LabelImagem(){
		super("JLabel com Imagem!!");
		Container tela = getContentPane();
		setLayout(null);

		jlaNome = new JLabel("Nome:");
		jlaNome.setBounds(170,45,40,20);
		jlaNome.setForeground(Color.green);
		jtfNome = new JTextField();
		jtfNome.setBounds(220,45,40,20);
		this.add(jlaNome);
		this.add(jtfNome);

		jlaSenha = new JLabel("Senha");
		jlaSenha.setBounds(170,85,100,20);
		jlaSenha.setForeground(Color.black);
		jtfSenha = new JTextField();
		jtfSenha.setBounds(220,85,40,20);
		this.add(jlaSenha);
		this.add(jtfSenha);

		//Add imagem na label
		ImageIcon icone = new ImageIcon("Tux.gif");
		jlaImagem = new JLabel(icone);
		jlaImagem.setBounds(20, 20, 150, 150);
		this.add(jlaImagem);
		//fim de add imagem na label


		jbuOK = new JButton("OK");
		jbuOK.setBounds(30, 170, 130, 30);
		jbuCancelar = new JButton("Cancelar");
		jbuCancelar.setBounds(170, 170, 130, 30);
		this.add(jbuOK);
		this.add(jbuCancelar);

		setSize(345, 270);
		setVisible(true);
		//setLocationRelativeTo(null);
	}
	
	

//final 
	public static void main(String args[]){
		LabelImagem app = new LabelImagem();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}