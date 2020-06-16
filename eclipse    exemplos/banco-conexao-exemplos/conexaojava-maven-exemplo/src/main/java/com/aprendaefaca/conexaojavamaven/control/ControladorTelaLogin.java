package com.aprendaefaca.conexaojavamaven.control;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.aprendaefaca.conexaojavamaven.view.TelaProduto;

@SuppressWarnings("serial")
public class ControladorTelaLogin extends ControladorTela {
	JButton jbtFechar;
	JButton jbtEntrar;
	JPasswordField jtfSenha;
	JTextField jtfUsuario;
	JLabel jlUsuario;
	JLabel jlSenha;

	Container container;

	public ControladorTelaLogin(JFrame tela, JButton jbtFechar,
			JButton jbtEntrar, JPasswordField jtfSenha, JTextField jtfUsuario,
			JLabel jlUsuario, JLabel jlSenha) {
		super(tela);
		this.jbtFechar = jbtFechar;
		this.jbtEntrar = jbtEntrar;
		this.jtfSenha = jtfSenha;
		this.jtfUsuario = jtfUsuario;
		this.jlUsuario = jlUsuario;
		this.jlSenha = jlSenha;
		inicializarComponentes();
		configurarTela();
	}

	private void inicializarComponentes() {
		configuraComponentes();
		adicionaComponentes();
		carregarEventosBotoes();
	}

	private void carregarEventosBotoes() {
		jbtFechar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fecharTela();
			}
		});

		jbtEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String usuario = jtfUsuario.getText();
				char[] senha = jtfSenha.getPassword();
				
				ControladorUsuario controlador = new ControladorUsuario();

				try {
					boolean ret = controlador.autenticarUsuario(usuario,
							String.valueOf(senha));
					if (ret) {
						esconderTela();
						new TelaProduto();
						JOptionPane.showMessageDialog(
								null,
								"Seja bem vindo, Usuario: "
										+ jtfUsuario.getText());
					}
				} finally {
					limparTela();
				}
			}
		});
	}

	private void configuraComponentes() {
		telapai = new JFrame();
		container = new Container();

		jbtEntrar = new JButton("Entrar");
		jbtEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtFechar = new JButton("Fechar");
		jbtFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jtfUsuario = new JTextField();
		jtfSenha = new JPasswordField();

		jlUsuario = new JLabel("Usuario: ");
		jlSenha = new JLabel("Senha: ");

		jbtFechar.setBounds(140, 130, LARGURA, ALTURA);
		jbtEntrar.setBounds(30, 130, LARGURA, ALTURA);

		jtfUsuario.setBounds(140, 30, LARGURA, ALTURA);
		jtfSenha.setBounds(140, 60, LARGURA, ALTURA);

		jlUsuario.setBounds(30, 30, LARGURA, ALTURA);
		jlSenha.setBounds(30, 60, LARGURA, ALTURA);
	}

	public void adicionaComponentes() {
		container.add(jbtFechar);
		container.add(jbtEntrar);
		container.add(jlUsuario);
		container.add(jlSenha);
		container.add(jtfUsuario);
		container.add(jtfSenha);
	}

	public void configurarTela() {
		definirTitulo("Tela de Login");
		definirTamanho(300, 200);
		definirLocalRelativo(null);
		Redimensionavel(false);
		Movel(true);
		definirOperacaoAoFechar(3);
		definirContainer(container);
	}

	public void limparTela() {
		jtfUsuario.setText("");
		jtfSenha.setText("");
		jtfUsuario.requestFocus();
	}
}
