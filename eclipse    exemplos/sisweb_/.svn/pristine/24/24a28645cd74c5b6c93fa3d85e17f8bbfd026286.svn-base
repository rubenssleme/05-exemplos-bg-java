package br.laramara.ti.sisweb.fabricas;

import java.io.File;

import org.openqa.selenium.WebDriver;

import br.laramara.ti.sisweb.dominio.Usuario;
import br.laramara.ti.sisweb.paginas.PaginaLogin;
import br.laramara.ti.sisweb.paginas.PaginaMenuSistemas;
import br.laramara.ti.sisweb.paginas.sislivros.PaginaAdministracaoInicialSisLivros;
import br.laramara.ti.sisweb.paginas.sislivros.PaginaAdministracaoLivros;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAcessarHoleriteSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoHoleritesSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoInicialSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoUsuariosSisRh;

public class ContextoPaginas {
	private final static String SENHA_PADRAO = "1234";
	private final static String SENHA_INCORRETA = "4321";

	public static PaginaLogin obterPaginaLogin(WebDriver driver) {
		return new PaginaLogin(driver);
	}

	public static PaginaLogin obterPaginaLoginComoUsuarioInvalido(WebDriver driver) {
		Usuario usuario = ContextoUsuario.fabricarUsuarioComumComTodosOsDados();

		PaginaLogin paginaLogin = ContextoPaginas.obterPaginaLogin(driver).logarComoUsuarioInvalido(usuario.getCpf(),
				SENHA_INCORRETA);

		return paginaLogin;
	}

	public static PaginaMenuSistemas obterPaginaMenuSistemas(WebDriver driver) {
		Usuario usuario = ContextoUsuario.fabricarUsuarioAdministradorComTodosOsDados();

		PaginaMenuSistemas paginaMenuSistemas = obterPaginaLogin(driver).logarComoAdministrador(usuario.getCpf(),
				SENHA_PADRAO);

		return paginaMenuSistemas;
	}

	public static PaginaAcessarHoleriteSisRh obterPaginaAcessarHoleriteComoUsuarioComumSisRh(WebDriver driver) {
		Usuario usuario = ContextoUsuario.fabricarUsuarioComumComTodosOsDados();

		PaginaAcessarHoleriteSisRh paginaAcessarHoleriteSisRh = ContextoPaginas.obterPaginaLogin(driver)
				.logarComoUsuarioComum(usuario.getCpf(), SENHA_PADRAO);

		return paginaAcessarHoleriteSisRh;
	}

	public static PaginaAcessarHoleriteSisRh obterPaginaAcessarHoleriteComoAdministradorSisRh(WebDriver driver) {
		Usuario usuario = ContextoUsuario.fabricarUsuarioAdministradorComTodosOsDados();

		PaginaMenuSistemas paginaMenuSistemas = ContextoPaginas.obterPaginaLogin(driver)
				.logarComoAdministrador(usuario.getCpf(), SENHA_PADRAO);

		return paginaMenuSistemas.abrirPaginaAcessarHoleriteSisRh();
	}

	public static PaginaAdministracaoInicialSisRh obterPaginaAdministracaoInicialSisRh(WebDriver driver) {
		PaginaAdministracaoInicialSisRh paginaAdministracaoInicialSisRh = ContextoPaginas
				.obterPaginaMenuSistemas(driver).abrirPaginaAdministracaoInicialSisRh();

		return paginaAdministracaoInicialSisRh;
	}

	public static PaginaAdministracaoHoleritesSisRh obterPaginaAdministracaoHoleritesSisRh(WebDriver driver) {
		PaginaAdministracaoHoleritesSisRh paginaAdministracaoHoleritesSisRh = obterPaginaAdministracaoInicialSisRh(
				driver).abrirPaginaAdministracaoHoleritesSisRh();

		return paginaAdministracaoHoleritesSisRh;
	}

	public static PaginaAdministracaoUsuariosSisRh obterPaginaAdministracaoUsuariosSisRh(WebDriver driver) {
		PaginaAdministracaoUsuariosSisRh paginaAdministracaoUsuariosSisRh = obterPaginaAdministracaoInicialSisRh(driver)
				.abrirPaginaAdministracaoUsuariosSisRh();

		return paginaAdministracaoUsuariosSisRh;
	}

	public static PaginaAdministracaoInicialSisLivros obterPaginaAdministracaoInicialSisLivros(WebDriver driver) {
		PaginaAdministracaoInicialSisLivros paginaAdministracaoInicialSisLivros = ContextoPaginas
				.obterPaginaMenuSistemas(driver).abrirPaginaAdministracaoInicialSisLivros();

		return paginaAdministracaoInicialSisLivros;
	}

	public static PaginaAdministracaoLivros obterPaginaAdministracaoLivros(WebDriver driver) {
		PaginaAdministracaoLivros paginaAdministracaoLivros = ContextoPaginas
				.obterPaginaAdministracaoInicialSisLivros(driver).abrirPaginaAdministracaoLivros();

		return paginaAdministracaoLivros;
	}

	public static boolean efetuarUploadHolerite(WebDriver driver, String holerite) {
		PaginaAdministracaoHoleritesSisRh paginaAdministracaoHoleritesSisRh = ContextoPaginas
				.obterPaginaAdministracaoHoleritesSisRh(driver);

		paginaAdministracaoHoleritesSisRh.efetuarUpload(holerite);

		return paginaAdministracaoHoleritesSisRh.uploadEfetuadoComSucesso();
	}

	public static boolean efetuarDownloadHolerite(WebDriver driver, File pastaTemporario) {
		PaginaAcessarHoleriteSisRh paginaAcessarHoleriteComoAdministradorSisRh = ContextoPaginas
				.obterPaginaMenuSistemas(driver).abrirPaginaAcessarHoleriteSisRh();
		paginaAcessarHoleriteComoAdministradorSisRh.efetuarDownload();

		return paginaAcessarHoleriteComoAdministradorSisRh.downloadEfetuadoComSucesso(pastaTemporario);
	}
}
