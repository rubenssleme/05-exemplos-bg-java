package br.laramara.ti.sislaraserver.dominio.grupo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.laramara.ti.sislaracommons.utilitarios.TiposDeTeste;
import br.laramara.ti.sislaraserver.dominio.Horario;
import br.laramara.ti.sislaraserver.dominio.atendimento.AtendimentoGrupo;
import br.laramara.ti.sislaraserver.dominio.usuario.Usuario;
import br.laramara.ti.sislaraserver.fabricas.ContextoGenerico;
import br.laramara.ti.sislaraserver.fabricas.ContextoGrupo;
import br.laramara.ti.sislaraserver.fabricas.ContextoModuloPeriodo;

public class TestesGrupo {

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_obrigatoriedade() {
		Grupo grupo = new Grupo();

		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertEquals(grupo.obterNumeroErros(), 7);
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_de_tamanho_maximo_e_data_unica_grupo_incompativel_com_dia_semana() {
		Grupo grupo = ContextoGrupo.fabricarGrupoComTodosOsDados();
		grupo.setTurma("11111111");
		grupo.setNivel("11111111");
		grupo.setDescricao(ContextoGenerico.obterGrande());
		grupo.setDataInicio("01/01/2000");
		grupo.setDataTermino("01/01/2000");
		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertEquals(grupo.obterNumeroErros(), 4);
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_de_dados_invalidos() {
		Grupo grupo = ContextoGrupo.fabricarGrupoComTodosOsDados();
		grupo.setTurma("A1");
		grupo.setNivel("AA");
		List<AtendimentoGrupo> atendimentos = new ArrayList<>();
		AtendimentoGrupo atendimento = new AtendimentoGrupo();
		atendimento.setData("872974");
		atendimento.setHorario(new Horario("4828734", "34872374"));
		atendimentos.add(atendimento);
		grupo.getModulosPeriodos().get(0).setAtendimentosGrupo(atendimentos);
		
		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertEquals(grupo.obterNumeroErros(), 6);
	}
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_de_data_termino_anterior_data_inicio() {
		Grupo grupo = ContextoGrupo.fabricarGrupoComTodosOsDados();
		grupo.setDataInicio("01/12/2012");
		grupo.setDataTermino("01/01/2012");
		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(grupo.validado());
		Assert.assertEquals(grupo.obterNumeroErros(), 1);
	}
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_de_obrigatoriedade_de_usuario_ou_pre_cadastro_para_atendimento() {
		Grupo grupo = ContextoGrupo
				.fabricarGrupoComTodosOsDadosSemAtendimentos();
		grupo.getModulosPeriodos().get(0).getModulosUsuarios().clear();
		grupo.getModulosPeriodos().get(0).getModulosPreCadastro().clear();
		grupo.getModulosPeriodos()
				.get(0)
				.gerarAtendimentos("31/12/2012", "09:00", "12:00");
		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(grupo.validado());
		Assert.assertEquals(grupo.obterNumeroErros(), 1);
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_obtem_todos_usuarios() {
		Grupo grupo = ContextoGrupo.fabricarGrupoComTodosOsDados();
		
		List<Usuario> usuarios = grupo.obterTodosUsuarios();

		Assert.assertEquals(usuarios.size(), 2);
	}
		
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_validacao_com_erro_de_modulo_periodo_duplicado() {
		Grupo grupo = ContextoGrupo.fabricarGrupoComTodosOsDados();

		List<ModuloPeriodo> modulosPeriodos = new ArrayList<>();
		modulosPeriodos.add(ContextoModuloPeriodo
				.fabricarComTodosOsDadosInformatica());
		modulosPeriodos.add(ContextoModuloPeriodo
				.fabricarComTodosOsDadosInformatica());
		grupo.setModulosPeriodos(modulosPeriodos);

		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(grupo.validado());
	}
	
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void grupo_gera_atendimentos_padroes() {
		Grupo grupo = ContextoGrupo
				.fabricarGrupoComTodosOsDadosSemAtendimentos();
		grupo.getModulosPeriodos().get(0)
				.gerarAtendimentos("31/12/2012", "09:00", "12:00");
		grupo.getModulosPeriodos().get(0)
				.gerarAtendimentos("31/12/2012", "09:00", "12:00");
		grupo.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertEquals(grupo.getModulosPeriodos().get(0)
				.getAtendimentosGrupo().size(), 2);
	}
}
