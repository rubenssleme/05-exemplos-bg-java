package br.laramara.ti.sisweb;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.laramara.ti.sisweb.fabricas.ContextoPaginas;
import br.laramara.ti.sisweb.paginas.PaginaLogin;
import br.laramara.ti.sisweb.paginas.PaginaMenuSistemas;
import br.laramara.ti.sisweb.paginas.sislivros.PaginaAdministracaoInicialSisLivros;
import br.laramara.ti.sisweb.paginas.sislivros.PaginaAdministracaoLivros;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAcessarHoleriteSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoHoleritesSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoInicialSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoUsuariosSisRh;

public class TestesSisweb extends TestesIntegracaoAbstrato {
	private static final int PRIMEIRO_LIVRO = 1;
	private static final int SEGUNDO_LIVRO = 1;

	protected TestesSisweb() {
		super("DadosTestesSisweb.xml", "http://localhost:8080/sisweb/");
	}

	@Test
	public void obtem_pagina_administracao_inicial_sisrh() {
		PaginaAdministracaoInicialSisRh paginaAdministracaoInicialSisRh = ContextoPaginas
				.obterPaginaAdministracaoInicialSisRh(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAdministracaoInicialSisRh.paginaValida());
	}

	@Test
	public void autenticar_usuario_comum_com_sucesso_sisrh() {
		PaginaAcessarHoleriteSisRh paginaAcessarHoleriteSisRh = ContextoPaginas
				.obterPaginaAcessarHoleriteComoUsuarioComumSisRh(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAcessarHoleriteSisRh.paginaValida());
	}

	@Test
	public void autenticar_usuario_sem_sucesso_sisrh() {
		PaginaLogin paginaLogin = ContextoPaginas.obterPaginaLoginComoUsuarioInvalido(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaLogin.loginInvalido());
	}

	@Test
	public void obtem_pagina_administracao_de_holerites_sisrh() {
		PaginaAdministracaoHoleritesSisRh paginaAdministracaoHoleritesSisRh = ContextoPaginas
				.obterPaginaAdministracaoHoleritesSisRh(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAdministracaoHoleritesSisRh.paginaValida());
	}

	@Test
	public void obtem_pagina_administracao_de_usuarios_sisrh() {
		PaginaAdministracaoUsuariosSisRh paginaAdministracaoUsuariosSisRh = ContextoPaginas
				.obterPaginaAdministracaoUsuariosSisRh(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAdministracaoUsuariosSisRh.paginaValida());
	}

	@Test
	public void obtem_pagina_menu_de_sistemas() {
		PaginaMenuSistemas paginaMenuSistemas = ContextoPaginas.obterPaginaMenuSistemas(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaMenuSistemas.paginaValida());
	}

	@Test
	public void obtem_itens_da_pagina_menu_de_sistemas() {
		PaginaMenuSistemas paginaMenuSistemas = ContextoPaginas.obterPaginaMenuSistemas(obterInstanciaHtmlUnitDriver());
		paginaMenuSistemas.obterQuantidadeItensMenu();

		Assert.assertTrue(paginaMenuSistemas.itensObtidosComSucesso());
	}

	@Test
	public void obtem_pagina_acessar_holerites_sisrh() {
		PaginaAcessarHoleriteSisRh paginaAcessarHoleriteSisRh = ContextoPaginas
				.obterPaginaAcessarHoleriteComoAdministradorSisRh(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAcessarHoleriteSisRh.paginaValida());
	}

	@Test
	public void obtem_pagina_alteracao_de_usuario_sisrh() {
		PaginaAdministracaoUsuariosSisRh paginaAdministracaoUsuariosSisRh = ContextoPaginas
				.obterPaginaAdministracaoUsuariosSisRh(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoUsuariosSisRh.abrirFormularioAlteracaoUsuario();

		Assert.assertTrue(paginaAdministracaoUsuariosSisRh.formularioAlteracaoUsuarioApareceu());
	}

	@Test
	public void efetua_upload_holerite_sisrh() {
		boolean uploadEfetuadoComSucesso = false;
		limparPastaHoleriteETemporario();
		inicializarFirefoxDriver();

		uploadEfetuadoComSucesso = ContextoPaginas.efetuarUploadHolerite(obterInstanciaFirefoxDriver(),
				obterHoleriteLocal());

		Assert.assertTrue(uploadEfetuadoComSucesso);
	}

	@Test
	public void efetua_download_holerite_sisrh() {
		boolean uploadEfetuadoComSucesso = false;
		boolean downloadEfetuadoComSucesso = false;

		limparPastaHoleriteETemporario();
		inicializarFirefoxDriver();

		uploadEfetuadoComSucesso = ContextoPaginas.efetuarUploadHolerite(obterInstanciaFirefoxDriver(),
				obterHoleriteLocal());

		redirecionarParaPaginaInicial();

		downloadEfetuadoComSucesso = ContextoPaginas.efetuarDownloadHolerite(obterInstanciaFirefoxDriver(),
				obterPastaTemporario());

		Assert.assertTrue(uploadEfetuadoComSucesso);
		Assert.assertTrue(downloadEfetuadoComSucesso);
	}

	@Test
	public void obtem_tamanho_de_holerites_sisrh() {
		limparPastaHoleriteETemporario();
		inicializarFirefoxDriver();

		ContextoPaginas.efetuarUploadHolerite(obterInstanciaFirefoxDriver(), obterHoleriteLocal());

		redirecionarParaPaginaInicial();

		ContextoPaginas.efetuarDownloadHolerite(obterInstanciaFirefoxDriver(), obterPastaTemporario());

		redirecionarParaPaginaInicial();

		PaginaAcessarHoleriteSisRh paginaAcessarHoleriteComoAdministradorSisRh = ContextoPaginas
				.obterPaginaAcessarHoleriteComoAdministradorSisRh(obterInstanciaFirefoxDriver());
		paginaAcessarHoleriteComoAdministradorSisRh.obterTamanhoHolerites(obterPastaHolerite(), obterPastaTemporario());

		Assert.assertTrue(paginaAcessarHoleriteComoAdministradorSisRh.tamanhoCorretoHolerites());
	}

	@Test
	public void exclui_holerite_sisrh() {
		limparPastaHoleriteETemporario();
		inicializarFirefoxDriver();

		ContextoPaginas.efetuarUploadHolerite(obterInstanciaFirefoxDriver(), obterHoleriteLocal());

		redirecionarParaPaginaInicial();

		PaginaAdministracaoHoleritesSisRh paginaAdministracaoHoleritesSisRh = ContextoPaginas
				.obterPaginaAdministracaoHoleritesSisRh(obterInstanciaFirefoxDriver());
		paginaAdministracaoHoleritesSisRh.excluirHolerite();

		Assert.assertTrue(paginaAdministracaoHoleritesSisRh.holeriteExcluidoComSucesso());
	}

	@Test
	public void altera_usuario_com_sucesso_sisrh() {
		String novoEmail = "teste@teste.com.br";

		PaginaAdministracaoUsuariosSisRh paginaAdministracaoUsuariosSisRh = ContextoPaginas
				.obterPaginaAdministracaoUsuariosSisRh(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoUsuariosSisRh.abrirFormularioAlteracaoUsuario();
		paginaAdministracaoUsuariosSisRh.alterarUsuario(novoEmail);

		Assert.assertTrue(paginaAdministracaoUsuariosSisRh.alteracaoFeitaComSucesso());
	}

	@Test
	public void obtem_pagina_administracao_inicial_sislivros() {
		PaginaAdministracaoInicialSisLivros paginaAdministracaoInicialSisLivros = ContextoPaginas
				.obterPaginaAdministracaoInicialSisLivros(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAdministracaoInicialSisLivros.paginaValida());
	}

	@Test
	public void obtem_pagina_administracao_de_livros_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());

		Assert.assertTrue(paginaAdministracaoLivros.paginaValida());
	}

	@Test
	public void obtem_listagem_de_livros_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.listarTodos();

		Assert.assertTrue(paginaAdministracaoLivros.livrosListadosComSucesso());
	}

	@Test
	public void obtem_ultima_pagina_da_listagem_de_livros_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.listarTodos();
		paginaAdministracaoLivros.avancarParaUltimaPagina();

		Assert.assertTrue(paginaAdministracaoLivros.ultimaPaginaAlcancadaComSucesso());
	}

	@Test
	public void obtem_livros_ultima_pagina_de_livros_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.listarTodos();
		paginaAdministracaoLivros.avancarParaUltimaPagina();
		paginaAdministracaoLivros.obterLivrosUltimaPagina();

		Assert.assertTrue(paginaAdministracaoLivros.livrosUltimaPaginaObtidosComSucesso());
	}

	@Test
	public void obtem_pagina_alteracao_de_livro_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.listarTodos();
		paginaAdministracaoLivros.abrirFormularioAlteracaoPrimeiroLivro();

		Assert.assertTrue(paginaAdministracaoLivros.formularioAlteracaoLivroApareceu());
	}

	@Test
	public void altera_livro_com_sucesso_sislivros() {
		String novoTitulo = "TITULO_ALTERADO_COM_SUCESSO";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.listarTodos();
		paginaAdministracaoLivros.abrirFormularioAlteracaoPrimeiroLivro();
		paginaAdministracaoLivros.alterarLivro(novoTitulo);

		Assert.assertTrue(paginaAdministracaoLivros.alteracaoFeitaComSucesso());
	}

	@Test
	public void obtem_pagina_pesquisa_livro_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();

		Assert.assertTrue(paginaAdministracaoLivros.formularioPesquisaApareceu());
	}

	@Test
	public void pesquisar_livro_com_id_com_sucesso_sislivros() {
		String id = "1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorId(PRIMEIRO_LIVRO, id);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_titulo_com_sucesso_sislivros() {
		String titulo = "TITULO PESQUISA_GERAL";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorTitulo(SEGUNDO_LIVRO, titulo);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_autor_com_sucesso_sislivros() {
		String autor = "AUTOR1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorAutor(PRIMEIRO_LIVRO, autor);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_assunto_com_sucesso_sislivros() {
		String assunto = "ASSUNTO1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorAssunto(PRIMEIRO_LIVRO, assunto);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_local_armazenado_com_sucesso_sislivros() {
		String localArmazenado = "LOCAL_ARMAZENADO1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorLocalArmazenado(PRIMEIRO_LIVRO, localArmazenado);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_aaat_com_sucesso_sislivros() {
		String aaat = "AAAT1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorAaat(PRIMEIRO_LIVRO, aaat);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_volume_com_sucesso_sislivros() {
		String volume = "VOLUME1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorVolume(PRIMEIRO_LIVRO, volume);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void pesquisar_livro_com_tipo_com_sucesso_sislivros() {
		String tipo = "TIPO1";

		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisa();
		paginaAdministracaoLivros.pesquisarPorTipo(PRIMEIRO_LIVRO, tipo);

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaFeitaComSucesso());
	}

	@Test
	public void obtem_pagina_pesquisa_geral_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisaGeral();

		Assert.assertTrue(paginaAdministracaoLivros.formularioPesquisaGeralApareceu());
	}

	@Test
	public void pesquisar_livro_com_parametro_geral_com_sucesso_sislivros() {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoLivros(obterInstanciaHtmlUnitDriver());
		paginaAdministracaoLivros.abrirFormularioPesquisaGeral();
		paginaAdministracaoLivros.pesquisarGeral("PESQUISA_GERAL");

		Assert.assertTrue(paginaAdministracaoLivros.pesquisaGeralFeitaComSucesso());
	}

}