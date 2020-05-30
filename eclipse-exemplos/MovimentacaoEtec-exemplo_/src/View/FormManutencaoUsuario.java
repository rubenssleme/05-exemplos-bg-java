package View;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.GerenciadorUsuario;
import Modell.Usuario;
@SuppressWarnings("serial")

// FormManutencaoUsuario é filho de FormPaiManutencao que é o modelo abstrato de todos os formularios de manutenção 
public class FormManutencaoUsuario extends FormPaiManutencao{ 
	
	// Declaração dos componentes especificos desse formulario
	JLabel lNome,lLogin,lSenha;
	JTextField tFNome,tFLogin;
	JPasswordField tPSenha;
	JButton bPesquisar;
	JComboBox cbLista; 
	
	public FormManutencaoUsuario(Frame owner, String title,boolean modal) {
		
		super(owner,title,modal);
		Container tela = getContentPane();
		setLayout(null);

		cbLista = new JComboBox();
		cbLista.setMaximumRowCount(5);
		cbLista.setBounds(200,25,200,20);
		cbLista.addActionListener( // Evento "click" do comboBox de usuarios 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
												
						// Obtém o indice (do comboBox) do item selecionado
						int posicao = cbLista.getSelectedIndex();
						
						// Utiliza o indice do comoBoc que coincide com o indece o array de usuarios
						// e carrega os textFields com os valores do objeto contido no array
						tFNome.setText(GerenciadorUsuario.getVetorUsuarios().get(posicao).getNome());
						tFLogin.setText(GerenciadorUsuario.getVetorUsuarios().get(posicao).getLogin());
						tPSenha.setText(GerenciadorUsuario.getVetorUsuarios().get(posicao).getSenha());
						
		}});

		
		bPesquisar = new JButton("Pesquisar");
		bPesquisar.setBounds(70,25,100,20);
		bPesquisar.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){

				int cont = 0;
				
				// *** VERIFICAR ***
				// *** COM ERRO ***
				// A intenção é limpar o comoBox antes de cada pesquisa (mas não esta acontecendo)
				cbLista.removeAll();
				
				// Varre o array e carrega o comboBox com o atributo nome de cada objeto do array
				while (cont < GerenciadorUsuario.getVetorUsuarios().size()) {
					cbLista.addItem(GerenciadorUsuario.getVetorUsuarios().get(cont).getNome());
					cont++;
				}
				
				}});
		
		
		lNome = new JLabel("Nome: ");
		lNome.setBounds(70,75,100,20);
		tFNome = new JTextField(50);
		tFNome.setBounds(120, 75, 360, 20);

		lLogin = new JLabel("Login: ");
		lLogin.setBounds(70,125,100,20);
		tFLogin = new JTextField(50);
		tFLogin.setBounds(120, 125, 100, 20);
			
		lSenha = new JLabel("Senha: ");
		lSenha.setBounds(70,175,100,20);
		tPSenha = new JPasswordField(10);
		tPSenha.setBounds(120,175,100,20);
			
		posicionaBotoes(250,100,20,20,10);
			
		tela.add(bPesquisar);
		tela.add(cbLista);
		tela.add(lNome);
		tela.add(tFNome);
		tela.add(lLogin);
		tela.add(tFLogin);
		tela.add(lSenha);
		tela.add(tPSenha);
		tela.add(bInclusao);
		tela.add(bAlteracao);
		tela.add(bExclusao);
		tela.add(bConsulta);
		tela.add(bSalvar);
		tela.add(bCancelar);
		
		desabilitaCampos();
		habilitaBotoes();
		setSize(710, 350);
		setResizable(false);
		setLocationRelativeTo(null);

	}
		
	public void habilitaCampos(){
		tFNome.setEnabled(true);
		tFLogin.setEnabled(true);
		tPSenha.setEnabled(true);
	}
	
	public void desabilitaCampos(){
		tFNome.setEnabled(false);
		tFLogin.setEnabled(false);
		tPSenha.setEnabled(false);
	}
	
	public void limpaCampos(){
		tFNome.setText("");
		tFLogin.setText("");
		tPSenha.setText("");
	}
	
	public void posicionaFocoPrimeiro() {
		tFNome.requestFocus();
	}

	
	// Sobrescrita dos metodos abstratos herdados da classe modelo dos formularios de manutenção
	
	/* 
	 *  Perceba que NÃO foi instanciado um objeto do tipo GerenciadorUsuario, 
	 *  mas é possivel realizar a chamada de seus metodos pelo fato deles serem estaticos
	 *  
	 *   UM METODO STATIC É VISIVEL EM QUALQUER PARTE DO PROJETO SEM A NECESSIDADE DE SER INSTANCIADO
	 */
	
	
	public void acaoInclusao() {
		
		// Instancia um objeto auxiliar para armazenar os valores lidos no formulario
		Usuario usuAux = new Usuario();
		
		// Popula 0 objeto auxiliar
		usuAux.setNome( tFNome.getText() );
		usuAux.setLogin( tFLogin.getText() );
		String senha = new String(tPSenha.getPassword());
		usuAux.setSenha( senha );
		
		// Passa o objeto auxiliar por parametro na chamada do metodo incluirUsuario
		GerenciadorUsuario.incluirUsuario(usuAux);
		
		// Destroi a referencia do objeto
		usuAux = null;
	}

	
	public void acaoAlteracao() {
		
		// Instancia um objeto auxiliar para armazenar os valores lidos no formulario
		Usuario usuAux = new Usuario();
		
		// Popula 0 objeto auxiliar
		usuAux.setNome( tFNome.getText() );
		usuAux.setLogin( tFLogin.getText() );
		String senha = new String(tPSenha.getPassword());
		usuAux.setSenha( senha );		
		
		// Passa o objeto auxiliar por parametro na chamada do metodo incluirUsuario e o indice onde ira armazena-lo (sobrescreve-lo)
		GerenciadorUsuario.alterarUsuario(usuAux, cbLista.getSelectedIndex());
		
		// Destroi a referencia do objeto
		usuAux = null;
	}


	public void acaoExclusao() {
		// Passa o indice (posição) do objeto a ser excluido por parametro na chamada do metodo excluirUsuario 
		GerenciadorUsuario.excluirUsuario(cbLista.getSelectedIndex());
	}

	
	public void acaoConsulta() {		
		// Chama o metodo consultarUsuario
		GerenciadorUsuario.consultarUsuario();	
	}

	
}