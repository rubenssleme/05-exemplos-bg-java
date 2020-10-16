import java.awt.*;
import java.awt.event.*;

public class FLogin extends Frame implements ActionListener,WindowListener {
	// Cria os atributos da Classe FLogin
	private Button bOK, bCancelar;
	private TextField tNome, tSenha;
	private Label lNome, lSenha;
	
	//Cria o construtor da Classe FLogin
	public FLogin(){
		//Define os atributos do label lNome
		lNome = new Label("Nome:");
		lNome.setSize(40,20);
		lNome.setLocation(50,50);
		
		//Define os atributos do TextField tNome
		tNome = new TextField();
		tNome.setSize(90,20);		
		tNome.setLocation(100,50);
		
		//Define os atributos do label lSenha		
		lSenha = new Label("Senha:");
		lSenha.setSize(40,20);
		lSenha.setLocation(50,100);
		
		//Define os atributos do TextField tSenha
		tSenha = new TextField();
		tSenha.setSize(90,20);		
		tSenha.setLocation(100,100);
		tSenha.setEchoChar('*');
		
		//Define os atributos do Button bOK
		bOK = new Button("OKj");
		bOK.setSize(90,30);
		bOK.setLocation(25,150);
		
		//Define os atributos do Button bCancelar
		bCancelar = new Button("Cancelar");
		bCancelar.setSize(90,30);
		bCancelar.setLocation(150,150);
		bCancelar.addActionListener(this);
		
		//Define os atributos do frame FLogin
		this.setTitle("Login");
		this.setResizable(false);
		this.setSize(260,200);
		this.setLocation(400,200);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		//Adiciona os objetos que são atributos ao Frame FLogin
		this.add(lNome);
		this.add(tNome);
		this.add(lSenha);
		this.add(tSenha);
		this.add(bOK);
		this.add(bCancelar);
		
		/*Adiciona aoFrame o WindowListener passando como parâmetro a localização da
		  codificação de seus eventos, neste caso o própio Frame */ 
		this.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bCancelar){
			System.exit(0);
		}
	}

	public void windowActivated(WindowEvent e) {
		
	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}

	public void windowDeactivated(WindowEvent e) {
		
	}

	public void windowDeiconified(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
		
	}

	public void windowOpened(WindowEvent e) {
		
	}
}
