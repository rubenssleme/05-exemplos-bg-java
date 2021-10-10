package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.RepositorioUsuario;
import model.Usuario;

public class CadastroUsuario1 extends JFrame {
	//Atributos
	JLabel jlaCodigo,jlaNome,jlaEmail,jlaTipo,jlaLogin,jlaSenha;
	JTextField jtfCodigo,jtfNome,jtfEmail,jtfLogin,jtfSenha;
	JButton jbuPesquisar,jbuIncluir,jbuAlterar,jbuExcluir,jbuConsultar,jbuTestarConexao,jbuSair;
	JComboBox jcbTipo;
	Usuario usu;
	RepositorioUsuario rep ;
	String tipos[] ={"Administrador","Usuario"}; 

//Construtor
	public CadastroUsuario1(){
		super("Manutenção de usuarios1");
		Container tela = getContentPane(); 
		setSize(350,260);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);

		jlaCodigo = new JLabel("Codigo:");
		jlaCodigo.setBounds(3,2,50,20);
		jtfCodigo = new JTextField();
		jtfCodigo.setBounds(55,2,130,20);

		jbuPesquisar = new JButton("Pesquisar");
		jbuPesquisar.setBounds(230,2,100,20);

		jlaNome = new JLabel("Nome:");
		jlaNome.setBounds(3,27,50,20);
		jtfNome = new JTextField();
		jtfNome.setBounds(55,27,275,20);

		jlaEmail = new JLabel("Email:");
		jlaEmail.setBounds(3,52,50,20);
		jtfEmail = new JTextField();
		jtfEmail.setBounds(55,52,275,20);

		jlaTipo = new JLabel("Tipo:");
		jlaTipo.setBounds(3,77,50,20);
		jcbTipo = new JComboBox<String>(tipos);
		jcbTipo.setBounds(55,77,150,20);

		jlaLogin = new JLabel("Login:");
		jlaLogin.setBounds(3,102,50,20);
		jtfLogin = new JTextField();
		jtfLogin.setBounds(55,102,275,20);

		jlaSenha = new JLabel("Senha:");
		jlaSenha.setBounds(3,127,50,20);
		jtfSenha = new JTextField();
		jtfSenha.setBounds(55,127,275,20);

		jbuIncluir = new JButton("Incluir");
		jbuIncluir.setBounds(3,152,105,20);
		jbuAlterar = new JButton("Alterar");
		jbuAlterar.setBounds(113,152,105,20);
		jbuExcluir = new JButton("Excluir");
		jbuExcluir.setBounds(224,152,105,20);

		jbuConsultar = new JButton("Consultar");
		jbuConsultar.setBounds(3,180,105,20);
		jbuTestarConexao = new JButton("Testar");
		jbuTestarConexao.setBounds(113,180,105,20);
		jbuSair = new JButton("Sair");
		jbuSair.setBounds(223,180,105,20);

//Adicionar na Tela
		tela.add(jlaCodigo);
		tela.add(jtfCodigo);
		tela.add(jbuPesquisar);
		tela.add(jlaNome);
		tela.add(jtfNome);
		tela.add(jlaEmail);
		tela.add(jtfEmail);
		tela.add(jlaTipo);
		tela.add(jcbTipo);
		tela.add(jlaLogin);
		tela.add(jtfLogin);
		tela.add(jlaSenha);
		tela.add(jtfSenha);
		tela.add(jbuIncluir);
		tela.add(jbuAlterar);
		tela.add(jbuExcluir);
		tela.add(jbuConsultar);
		tela.add(jbuTestarConexao);
		tela.add(jbuSair);

		setVisible(true);

		
		inicializarObjetos();
		inicializarBotoesSuperiores();
		inicializarBotoesInferiores();
	}
	
	private void inicializarObjetos(){
		//inicializar Repositorio
		rep = new RepositorioUsuario();
	}
	private void preencherObjetos(){
		//Inicializar Usuario
		usu = new Usuario();
		usu.setNome(jtfNome.getText());
		usu.setEmail(jtfEmail.getText());
		usu.setLogin("rleme");
		usu.setSenha("jovem");
		usu.setTipo("Admin");
	}
		

	private void inicializarBotoesSuperiores(){
		//Evento botão incluir
		jbuIncluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				preencherObjetos();
				if(rep.salvar(usu)){
					//JOptionPane.showMessageDialog(null,usu.getNome() + " Incluido com sucesso!!!");
				}else{
					//JOptionPane.showMessageDialog(null,usu.getNome() + " Não pode ser incluido!");
				}
				
				
			}
		});
		
		//Evento botão Alterar
				jbuAlterar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!");

					}
				});

	}//fim de metodo superior

	private void inicializarBotoesInferiores(){
		// Evento Botão Sair
		jbuSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

}
