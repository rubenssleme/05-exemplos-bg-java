import javax.swing.JOptionPane;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AppletValidarUsuario extends Applet implements ActionListener {

	public Dimension dFrame,dLabel,dTextField,dButton;
	public Button bAcessar, bSair;
	public TextField tfLogin, tfSenha;
	public Label lLogin, lSenha, lTitulo;

	public void init(){

		Dimension dLabel = new Dimension(40,25);
		Dimension dTextField = new Dimension(80,25);
		Dimension dButton = new Dimension(60,25);

		setBackground(Color.BLACK);
		// Não utiliza gerenciadores de layout
		setLayout(null);

		// Define as propriedades do lTitulo
		lTitulo = new Label("Área restrita");
		lTitulo.setSize(100,25);
		lTitulo.setLocation(40,10);
		lTitulo.setForeground(Color.YELLOW);

		// Define as propriedades do lLogin
		lLogin = new Label("Login:");
		lLogin.setSize(dLabel);
		lLogin.setLocation(10,50);
		lLogin.setForeground(Color.WHITE);

		// Define as propriedades do tfLogin
		tfLogin = new TextField();
		tfLogin.setSize(dTextField);		
		tfLogin.setLocation(60,50);

		// Define as propriedades do lSenha		
		lSenha = new Label("Senha:");
		lSenha.setSize(dLabel);
		lSenha.setLocation(10,90);
		lSenha.setForeground(Color.WHITE);

		// Define as propriedades do tfSenha
		tfSenha = new TextField();
		tfSenha.setSize(dTextField);		
		tfSenha.setLocation(60,90);

		// Define as propriedades do bValidar
		bAcessar = new Button("Acessar");
		bAcessar.setSize(dButton);
		bAcessar.setLocation(10,130);
		// Adiciona o botão no ActionListener
		bAcessar.addActionListener(this);		

		// Define as propriedades do bValidar
		bSair = new Button("Sair");
		bSair.setSize(dButton);
		bSair.setLocation(80,130);
		// Adiciona o botão no ActionListener
		bSair.addActionListener(this);		


		//Adiciona os objetos ao Frame
		add(lTitulo);
		add(lLogin);
		add(tfLogin);
		add(lSenha);
		add(tfSenha);
		add(bAcessar);					
		add(bSair);

	}


	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bAcessar){	

			// Verifica se os campos estão preenchidos
			if( tfLogin.getText().equals("") || tfSenha.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Favor preencher os dois campos!");

			}else{
				
				// Verifica se o usuario é válido
				if( tfLogin.getText().equals("aluno") && tfSenha.getText().equals("123") ){

					try {

						// Monta a URL para redirecionamento
						URL linkAcesso = new URL("file:///C:/AulaAppletSite1/areaRestritaInicial.htm");
						
						// Redireciona a página
						getAppletContext().showDocument(linkAcesso, "mainFrame");

					} catch (MalformedURLException erro) {
						JOptionPane.showMessageDialog(null, "Link inválido!");
						erro.printStackTrace();
					}

				}else{
					JOptionPane.showMessageDialog(null, "Usuario desconhecido!");
				}	
			}
		}		


		if (e.getSource() == bSair){

			try {

				// Monta a URL para redirecionamento
				URL linkSair = new URL("file:///C:/AulaAppletSite1/inicial.htm");

				// Redireciona a página
				getAppletContext().showDocument(linkSair, "mainFrame");

			} catch (MalformedURLException erro) {
				JOptionPane.showMessageDialog(null, "Link inválido!");
				erro.printStackTrace();
			}
		}
	}
}
