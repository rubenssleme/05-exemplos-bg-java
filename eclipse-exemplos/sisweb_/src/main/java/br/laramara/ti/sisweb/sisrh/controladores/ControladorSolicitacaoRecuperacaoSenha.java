package br.laramara.ti.sisweb.sisrh.controladores;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.utilitarios.Email;
import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.RecuperadorSenha;

@ManagedBean
@SessionScoped
public class ControladorSolicitacaoRecuperacaoSenha {

	private String email;

	@Inject
	private Email enviadorEmail;

	@Inject
	private RecuperadorSenha recuperadorSenha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void solicitar(ActionEvent actionEvent) {
		if (enviadorEmail.enviarArquivoContagemPorEmail(email,
				recuperadorSenha.efetuarSolicitacao(email))) {
			Mensagem.exibirMensagem(
					FacesMessage.SEVERITY_INFO,
					"Link de alteração de senha enviado para o email com sucesso.",
					"");
		} else {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR,
					"Erro durante solicitação de alteração de senha.", "");
		}
	}
}
