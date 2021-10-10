package br.laramara.ti.sisweb.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.laramara.ti.sisweb.paginas.sislivros.PaginaAdministracaoInicialSisLivros;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAcessarHoleriteSisRh;
import br.laramara.ti.sisweb.paginas.sisrh.PaginaAdministracaoInicialSisRh;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaMenuSistemas extends PaginaBase {
	@CacheLookup
	@FindBy(id = "j_idt5:menu_input")
	private WebElement menu;
	@CacheLookup
	@FindBy(id = "j_idt5:botao")
	private WebElement botaoAcessar;

	public PaginaMenuSistemas(WebDriver driver) {
		super(driver);
	}

	public boolean paginaValida() {
		return super.paginaValida("SisWEB - Menu de Sistemas");
	}

	public int obterQuantidadeItensMenu() {
		return DriverUtils.obterOpcoes(menu).size();
	}

	private <T> T abrirPagina(String opcao, Class<T> pagina) {
		DriverUtils.selecionarValor(driver, menu, opcao);
		DriverUtils.clicar(botaoAcessar);
		return PageFactory.initElements(driver, pagina);
	}

	public PaginaAdministracaoInicialSisRh abrirPaginaAdministracaoInicialSisRh() {
		return abrirPagina("SISRH_ADMINISTRACAO", PaginaAdministracaoInicialSisRh.class);
	}

	public PaginaAcessarHoleriteSisRh abrirPaginaAcessarHoleriteSisRh() {
		return abrirPagina("SISRH_ACESSAR_HOLERITE", PaginaAcessarHoleriteSisRh.class);
	}

	public PaginaAdministracaoInicialSisLivros abrirPaginaAdministracaoInicialSisLivros() {
		return abrirPagina("SISLIVROS_ADMINISTRACAO", PaginaAdministracaoInicialSisLivros.class);
	}

	public boolean itensObtidosComSucesso() {
		return obterQuantidadeItensMenu() == 3;
	}
}
