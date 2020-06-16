package br.com.bg.controlador;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bg.dominio.Servidor;
import br.com.bg.repositorio.RepositorioServidor;
import br.com.bg.utilitarios.Uteis;

@Named("controladorServidor")
@RequestScoped
public class ControladorServidor {

	@Inject
	private Servidor servidor; 


	@Inject
	private RepositorioServidor repositorioServidor;


	public Servidor getServidor() {
		return servidor;
	}


	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public void salvarNovoServidor(){
		repositorioServidor.salvarRegistro(this.servidor);
		this.servidor = null;
		Uteis.MensagemInfo("Registro Cadastrado com sucesso!!!");
	}

}
