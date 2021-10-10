package com.aprendaefaca.conexaojavabd.view;

import com.aprendaefaca.conexaojavabd.model.Cliente;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.aprendaefaca.conexaojavabd.persistencia.ConexaoBD;





/*
 * Classe da tela de cadastro de usu�rios 
 */

public class CadastroCliente extends JFrame {

	// Instanciacao dos objetos utilizados para manipulacao de dados
	
	// Objeto cli do tipo Cliente para armazenar os dados lidos da tela
	Cliente cli = new Cliente();
	
	// Objeto cliBD do tipo ClienteBD para persistencia no banco
	ConexaoBD cliBD = new ConexaoBD();
	
	
	/*
	 * Construcao do formulario e dos componentes nele inseridos
	 */
	
	// Declaracao dos componentes swing utilizados no formulario
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lblNome = null;
	private JLabel lblSenha = null;
	private JTextField txtNome = null;
	private JTextField txtEmail = null;
	private JButton cmdIncluir = null;
	private JButton cmdAlterar = null;
	private JButton cmdExcluir = null;
	private JButton cmdSair = null;
	private JButton cmdConsultar = null;
	private JLabel lblEmail = null;
	private JLabel lblLogin = null;
	private JTextField txtLogin = null;
	private JTextField txtSenha = null;
	private JLabel lblTipo = null;
	private JButton cmdTeste = null;
	private JButton cmdPesquisar = null;
	private JTextField txtIdCliente = null;
	private JLabel lblIdCliente = null;
	private JComboBox cmbTipo = null;
	
	
	// *** Construtores
	
	// Criacao da tela
	public CadastroCliente() {
		super();
		initialize();
	}

	// Inicializacao do JContentPane (que eh o formulario propriamente dito)
	private void initialize() {
		this.setSize(364, 342);
		this.setContentPane(getJContentPane());
		this.setTitle("Manutencao de usuarios");
	}

	// Montagem do JContentPane (insercao dos componentes na tela)
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblIdCliente = new JLabel();
			lblIdCliente.setBounds(new Rectangle(10, 10, 50, 15));
			lblIdCliente.setName("lblIdCliente");
			lblIdCliente.setText("IdCliente:");
			lblTipo = new JLabel();
			lblTipo.setBounds(new Rectangle(10, 130, 45, 15));
			lblTipo.setText("Tipo:");
			lblTipo.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			lblTipo.setName("lblTipo");
			lblLogin = new JLabel();
			lblLogin.setBounds(new Rectangle(10, 170, 45, 15));
			lblLogin.setText("Login:");
			lblLogin.setName("lblLogin");
			lblEmail = new JLabel();
			lblEmail.setBounds(new Rectangle(10, 90, 45, 15));
			lblEmail.setText("Email:");
			lblEmail.setName("lblEmail");
			lblSenha = new JLabel();
			lblSenha.setBounds(new Rectangle(10, 210, 45, 15));
			lblSenha.setName("lblSenha");
			lblSenha.setText("Senha:");
			lblNome = new JLabel();
			lblNome.setBounds(new Rectangle(10, 50, 45, 15));
			lblNome.setName("lblNome");
			lblNome.setText("Nome:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lblNome, null);
			jContentPane.add(lblSenha, null);
			jContentPane.add(getTxtNome(), null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getCmdIncluir(), null);
			jContentPane.add(getCmdAlterar(), null);
			jContentPane.add(getCmdExcluir(), null);
			jContentPane.add(getCmdSair(), null);
			jContentPane.add(getCmdConsultar(), null);
			jContentPane.add(lblEmail, null);
			jContentPane.add(lblLogin, null);
			jContentPane.add(getTxtLogin(), null);
			jContentPane.add(getTxtSenha(), null);
			jContentPane.add(lblTipo, null);
			jContentPane.add(getCmdTeste(), null);
			jContentPane.add(getCmdPesquisar(), null);
			jContentPane.add(getTxtIdCliente(), null);
			jContentPane.add(lblIdCliente, null);
			jContentPane.add(getCmbTipo(), null);
		}
		return jContentPane;
	}

	
	// *** Metodos de criacao e definicoes basicas dos componentes utilizados no formulario
	
	
	// JTextFileds e JComboBox 
	
	// IdCliente
	private JTextField getTxtIdCliente() {
		if (txtIdCliente == null) {
		txtIdCliente = new JTextField();
			txtIdCliente.setBounds(new Rectangle(70, 10, 100, 22));
			txtIdCliente.setName("txtIdCliente");
			txtIdCliente.setText("");
		}
		return txtIdCliente;
	}

	// Nome
	private JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(new Rectangle(70, 50, 270, 22));
			txtNome.setName("txtNome");
		}
		return txtNome;
	}

	// Email
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(new Rectangle(70, 90, 270, 22));
			txtEmail.setName("txtEmail");
		}
		return txtEmail;
	}

	// Tipo
	private JComboBox getCmbTipo() {
		if (cmbTipo == null) {
			cmbTipo = new JComboBox();
			cmbTipo.setBounds(new Rectangle(70, 130, 150, 22));
			cmbTipo.setName("cmbTipo");
			cmbTipo.addItem("administrador");
			cmbTipo.addItem("usuario");
		}
		return cmbTipo;
	}	
	
	// Login
	private JTextField getTxtLogin() {
		if (txtLogin == null) {
			txtLogin = new JTextField();
			txtLogin.setBounds(new Rectangle(70, 170, 270, 22));
			txtLogin.setName("txtLogin");
		}
		return txtLogin;
	}

	// Senha
	private JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(new Rectangle(70, 210, 270, 22));
			txtSenha.setName("txtSenha");
		}
		return txtSenha;
	}
	
	
	
	// JButtons

	// *** Definicao das prorpiedades dos botoes e chamada dos eventos 
	

	// Pesquisar
	private JButton getCmdPesquisar() {
		if (cmdPesquisar == null) {
			cmdPesquisar = new JButton();
			cmdPesquisar.setBounds(new Rectangle(240, 10, 100, 25));
			cmdPesquisar.setText("Pesquisar");
			cmdPesquisar.setName("Pesquisar");
			cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
					// Instancia um objeto usuPesquisa para receber o retorno (um objeto Cliente)
					// do metodo pesquisar de p
					Cliente cliPesquisa = new Cliente();
					
					// Le o codigo do formulario e armazena no obeto u 
					cli.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
					
					// Passa o objeto cli por parametro para o metodo Pesquisar do objeto cliBD (ClienteBD)
					// que por sua vez retorna o objeto populado com os dados do usuario pesquisado
					cliPesquisa = cliBD.Pesquisar(cli);
				
					// Carrega o formulario com os dados do usuario pesquisado
					txtNome.setText(cliPesquisa.getNome());
					txtEmail.setText(cliPesquisa.getEmail());
					/*if (cliPesquisa.getTipo().equals("administrador")){
						cmbTipo.setSelectedIndex(0);
					}else{
						cmbTipo.setSelectedIndex(1);
					}*/
					txtLogin.setText(cliPesquisa.getLogin());
					txtSenha.setText(cliPesquisa.getSenha());
				}
			});				
		}
		return cmdPesquisar;
	}

	
	// Incluir	
	private JButton getCmdIncluir() {
		if (cmdIncluir == null) {
			cmdIncluir = new JButton();
			cmdIncluir.setBounds(new Rectangle(10, 240, 100, 25));
			cmdIncluir.setName("cmdIncluir");
			cmdIncluir.setText("Incluir");
			cmdIncluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// Le os campos do formulario e carrega o objeto u
					cli.setNome(txtNome.getText());
					cli.setEmail(txtEmail.getText());
					//cli.setTipo(cmbTipo.getSelectedItem().toString());
					cli.setLogin(txtLogin.getText());
					cli.setSenha(txtSenha.getText());
					
					// Passa o objeto cli por parametro para o metodo Incluir 
					// do objeto cliBD (usuarioBD)
					cliBD.Incluir(cli);
					
					JOptionPane.showMessageDialog(null, "Inclus�o realizada com sucesso!", 
							              "Confirma��o", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return cmdIncluir;
	}

	
	// Alterar
	private JButton getCmdAlterar() {
		if (cmdAlterar == null) {
			cmdAlterar = new JButton();
			cmdAlterar.setBounds(new Rectangle(125, 240, 100, 25));
			cmdAlterar.setName("cmdAlterar");
			cmdAlterar.setText("Alterar");
			cmdAlterar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// Le os campos do formulario e carrega o objeto cli
					// Na alteracao os campos sao preenchidos atraves do botao Pesquisar
					cli.setNome(txtNome.getText());
					cli.setEmail(txtEmail.getText());
					//cli.set(cmbTipo.getSelectedItem().toString());
					cli.setLogin(txtLogin.getText());
					cli.setSenha(txtSenha.getText());
					
					// Passa o objeto cli por parametro para o metodo Alterar do 
					// objeto cliBD (usuarioBD)
					cliBD.Alterar(cli);
					
					JOptionPane.showMessageDialog(null, "Altera��o realizada com sucesso!",
							               "Confirma��o", JOptionPane.INFORMATION_MESSAGE);
				}
			});	
		}
		return cmdAlterar;
	}

	// Excluir
	private JButton getCmdExcluir() {
		if (cmdExcluir == null) {
			cmdExcluir = new JButton();
			cmdExcluir.setBounds(new Rectangle(240, 240, 100, 25));
			cmdExcluir.setName("cmdExcluir");
			cmdExcluir.setText("Excluir");
			cmdExcluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
			
					// Le o codigo do registro a ser excluido no formulario 
					// e carrega o objeto u
					cli.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
					
					// Passa o objeto cli por parametro para o metodo Excluir do 
					// objeto cliBD (usuarioBD)
					cliBD.Excluir(cli);
						
					JOptionPane.showMessageDialog(null, "Exclus�o realizada com sucesso!", 
							              "Confirma��o", JOptionPane.INFORMATION_MESSAGE);
				}
			});	
			
		}
		return cmdExcluir;
	}

	// Consultar
	private JButton getCmdConsultar() {
		if (cmdConsultar == null) {
			cmdConsultar = new JButton();
			cmdConsultar.setBounds(new Rectangle(10, 275, 100, 25));
			cmdConsultar.setText("Consultar");
			cmdConsultar.setName("cmdConsultar");
			cmdConsultar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					// Chama o metodo Consultar do objeto cliBD (ClienteBD)
					cliBD.Consultar();
				
				}
			});				
		}
		return cmdConsultar;
	}

	// Conexao
	private JButton getCmdTeste() {
		if (cmdTeste == null) {
			cmdTeste = new JButton();
			cmdTeste.setBounds(new Rectangle(125, 275, 100, 25));
			cmdTeste.setText("Conexao");
			cmdTeste.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
					// Chama o metodo TestaConexao do objeto cliBD e apresenta mensagens de acordo com o retorno
					if(cliBD.testaConexao()){
						JOptionPane.showMessageDialog(null, "Conexao com banco de dados realizada com sucesso!", 
								                                "Confirma��o", JOptionPane.INFORMATION_MESSAGE);					
					}else{
						JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!", "Confirma��o", 
								                                                         JOptionPane.ERROR_MESSAGE);						
					}
				}
			});				
		}
		return cmdTeste;
	}

	// Sair
	private JButton getCmdSair() {
		if (cmdSair == null) {
			cmdSair = new JButton();
			cmdSair.setBounds(new Rectangle(240, 275, 100, 25));
			cmdSair.setName("cmdSair");
			cmdSair.setText("Sair");
			cmdSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					// Finaliza a aplicacao
					System.exit(0);
				
				}
			});				
		}
		return cmdSair;
	}
	
}
