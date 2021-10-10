package br.laramara.ti.sisweb.sisrh.controladores;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.RecuperadorSenha;

@ManagedBean
@SessionScoped
public class ControladorRecuperacaoSenha {

	private String novaSenha;
	private String confirmacaoNovaSenha;
	private String chave;

	@Inject
	private RecuperadorSenha recuperadorSenha;

	public String getNovaSenha() {
		return novaSenha;
	}

	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}

	public String getConfirmacaoNovaSenha() {
		return confirmacaoNovaSenha;
	}

	public void setConfirmacaoNovaSenha(String confirmacaoNovaSenha) {
		this.confirmacaoNovaSenha = confirmacaoNovaSenha;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void recuperar(ActionEvent actionEvent) {
		if (recuperadorSenha.alterarSenha(chave, novaSenha)
				&& novaSenha.equals(confirmacaoNovaSenha)) {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_INFO,
					"Senha alterada com sucesso.", "");
		} else {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR,
					"Erro durante alteração de senha.", "");
		}
	}
}
