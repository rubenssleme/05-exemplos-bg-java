package br.laramara.ti.sislaraserver.repositorios;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.laramara.ti.sislaracommons.utilitarios.TiposDeTeste;
import br.laramara.ti.sislaraserver.TestesIntegracaoAbstrato;
import br.laramara.ti.sislaraserver.dominio.usuario.TipoConstrucao;
import br.laramara.ti.sislaraserver.utilitarios.Registro;

public class TestesRepositorioTipoConstrucao extends TestesIntegracaoAbstrato {

	public TestesRepositorioTipoConstrucao() {
		super("DadosTestesRepositorioTipoConstrucao.xml");
	}

	@Test(groups = { TiposDeTeste.INTEGRACAO_COM_DB })
	public void repositorio_tipo_construcao_pesquisa_todos() {
		RepositorioTipoConstrucao repositorio = Registro.obterRepositorioTipoConstrucao();

		List<TipoConstrucao> tipoConstrucao = repositorio.obterTodos();

		Assert.assertEquals(tipoConstrucao.size(), 2);
	}
}
