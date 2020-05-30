package br.com.alura.servico.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDao;
import br.com.alura.entidade.AgendamentoEmailEntidade;
import br.com.alura.servico.AgendamentoEmail;

@Stateless
public class AgendamentoEmailImpl implements AgendamentoEmail {
	
	@Inject
	private AgendamentoEmailDao agendamentoEmailDao;
	
	public List<AgendamentoEmailEntidade> listarAgendamentosEmail() {
		return agendamentoEmailDao.listarAgendamentosEmail();
	}

	

//	public void salvarAgendamentoEmail( AgendamentoEmail agendamentoEmail) {
//		
//		agendamentoEmail.setEnviado(false);
//		agendamentoEmailDao.salvarAgendamentoEmail(agendamentoEmail);
//		
//	}

}
