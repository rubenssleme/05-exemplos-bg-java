package br.laramara.ti.sislaraserver.repositorios;

import java.util.List;

import br.laramara.ti.sislaraserver.dominio.usuario.Comprometimento;

public interface RepositorioComprometimento {
	public List<Comprometimento> obterTodos();
}
