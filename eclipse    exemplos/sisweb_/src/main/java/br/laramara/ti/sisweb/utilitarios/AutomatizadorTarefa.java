package br.laramara.ti.sisweb.utilitarios;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class AutomatizadorTarefa {

	@Schedule(hour="23", minute="59")
	private void renovarConexaoBancoDeDados() {
		new Conexao().inicializarBancoPEXXI();
	}
}
