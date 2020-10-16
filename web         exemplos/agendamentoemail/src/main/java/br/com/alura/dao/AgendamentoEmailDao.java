package br.com.alura.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.entidade.AgendamentoEmailEntidade;

@Stateless
public class AgendamentoEmailDao {
	@Inject
	private  AgendamentoEmailEntidade email1 ;
	
	@Inject
	private  AgendamentoEmailEntidade email2 ;
	
	
	public List<AgendamentoEmailEntidade> listarAgendamentosEmail(){
		List<AgendamentoEmailEntidade> emails = new ArrayList<AgendamentoEmailEntidade>();
		email1.setId(1L);
		email1.setEmail("rubenss-leme1@teste.com");
		
		email2.setId(1L);
		email2.setEmail("arthur2@teste.com");
		email1.setEnviado(false);
		
		emails.add(email1);
		emails.add(email2);
		return  emails;
	}
}
