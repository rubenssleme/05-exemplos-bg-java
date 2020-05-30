package br.laramara.ti.sisweb.controladores;

import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorLogin {

	private Logger logger = Logger.getLogger(this.getClass().getPackage()
			.getName());

	private String cpf;
	private String senha;

	@Inject
	private Sessao sessao;

	public void logar(ActionEvent actionEvent) {
		if (sessao.logar(cpf, senha)) {
			sessao.redirecionamentoAutomatico();
		} else {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR,
					"Erro: Usuário ou senha incorreta.", "");
			logger.info("CPF " + cpf + " não conseguiu logar com a senha digitada.");
		}
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

}
