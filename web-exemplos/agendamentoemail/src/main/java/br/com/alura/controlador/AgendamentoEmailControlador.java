package br.com.alura.controlador;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.alura.entidade.AgendamentoEmailEntidade;
import br.com.alura.servico.AgendamentoEmail;
@RequestScoped
@Path(CaminhoRecurso.URL_AGENDAMENTO_EMAIL)
public class AgendamentoEmailControlador {

	
	@Inject
	private AgendamentoEmail agendamentoEmail;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(CaminhoRecurso.URL_OBTER_LISTA_EMAIL)
	public Response listarAgendamentosEmail() {
		List<AgendamentoEmailEntidade> emails = agendamentoEmail.listarAgendamentosEmail();
		return Response.ok(emails).build();
		
	}
	
}
