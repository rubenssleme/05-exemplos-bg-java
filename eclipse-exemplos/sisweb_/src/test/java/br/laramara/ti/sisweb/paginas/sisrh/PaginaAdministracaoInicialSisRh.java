package br.laramara.ti.sisweb.paginas.sisrh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.PaginaBase;

public class PaginaAdministracaoInicialSisRh extends PaginaBase {
	@CacheLookup
	@FindBy(id = "j_idt5:admHolerites")
	private WebElement botaoAdmHolerites;
	@CacheLookup
	@FindBy(id = "j_idt5:admUsuarios")
	private WebElement botaoAdmUsuarios;

	public PaginaAdministracaoInicialSisRh(WebDriver driver) {
		super(driver);
	}

	public boolean paginaValida() {
		return super.paginaValida("SisRH - Administração");
	}

	public PaginaAdministracaoHoleritesSisRh abrirPaginaAdministracaoHoleritesSisRh() {
		return abrir(botaoAdmHolerites, PaginaAdministracaoHoleritesSisRh.class);
	}

	public PaginaAdministracaoUsuariosSisRh abrirPaginaAdministracaoUsuariosSisRh() {
		return abrir(botaoAdmUsuarios, PaginaAdministracaoUsuariosSisRh.class);
	}

}
