package br.com.alura.response;

import java.util.List;

import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDao;
import br.com.alura.entidade.AgendamentoEmailEntidade;

public class ResponseAgendamentoEmail {
	@Inject
    private AgendamentoEmailDao agendamentoEmailDao;



    public List<AgendamentoEmailEntidade> listarAgendamentosEmail() {
        List<AgendamentoEmailEntidade> response = agendamentoEmailDao.listarAgendamentosEmail();
        return response;
    }
}
