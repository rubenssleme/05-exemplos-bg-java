package br.org.lm.javaee7crud.utilitarios;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagem {


	//MOSTRAR MENSAGEM
	public static void exibirMensagem(String mensagem){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage("Alerta",mensagem));
	}

	//MOSTRAR MENSAGEM
	public static void exibirMensagemAtencao(String mensagem){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aten��o:", mensagem));
	}

	//MOSTRAR MENSAGEM
	public static void exibirMensagemInfo(String mensagem){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", mensagem));
	}

}
