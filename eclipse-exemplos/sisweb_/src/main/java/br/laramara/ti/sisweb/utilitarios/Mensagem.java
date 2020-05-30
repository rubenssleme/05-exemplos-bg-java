package br.laramara.ti.sisweb.utilitarios;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Mensagem {
	public static synchronized void exibirMensagem(Severity severidade,
			String sumario, String detalhe) {
		FacesMessage message = new FacesMessage(sumario, detalhe);
		if (severidade != null) {
			message.setSeverity(severidade);
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
