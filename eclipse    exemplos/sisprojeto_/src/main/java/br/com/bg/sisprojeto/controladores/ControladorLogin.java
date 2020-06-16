package br.com.bg.sisprojeto.controladores;

import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.bg.sisprojeto.dominio.ContaAcesso;
import br.com.bg.sisprojeto.repositorios.RepositorioContaAcesso;

public class ControladorLogin extends ControladorTelaBase {
	private JTextField jtfLogin;
	private JPasswordField jpfSenha;

	private RepositorioContaAcesso repositorioContaAcesso;

	private ContaAcesso contaAcesso;

	public ControladorLogin(JTextField jtfLogin, JPasswordField jpfSenha,
			JDialog telaPai) {
		super(telaPai);
		this.jtfLogin = jtfLogin;
		this.jpfSenha = jpfSenha;

		repositorioContaAcesso = new RepositorioContaAcesso();
	}
        
	public boolean autenticar() {
		boolean autenticado = false;

		contaAcesso = inicializarObjeto();

		if (possuiContaAcesso()) {
			contaAcesso = repositorioContaAcesso.autenticar(contaAcesso);
		}

		if (contaAcesso != null) {
			autenticado = true;
		}
		return autenticado;
	}

	public ContaAcesso inicializarObjeto() {
		contaAcesso = new ContaAcesso();

		contaAcesso.setLogin(jtfLogin.getText());
		contaAcesso.setSenha(String.valueOf(jpfSenha.getPassword()));

		return contaAcesso;
	}

	private boolean possuiContaAcesso() {
		return contaAcesso != null;
	}

}

