package br.laramara.ti.sisweb.paginas.sislivros;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.PaginaBase;

public class PaginaAdministracaoInicialSisLivros extends PaginaBase {
	@CacheLookup
	@FindBy(id = "j_idt5:admLivros")
	private WebElement botaoAdmLivros;

	public PaginaAdministracaoInicialSisLivros(WebDriver driver) {
		super(driver);
	}
	
	public boolean paginaValida() {
		return super.paginaValida("SisLivros - Administração Inicial");
	}

	public PaginaAdministracaoLivros abrirPaginaAdministracaoLivros() {
		return abrir(botaoAdmLivros, PaginaAdministracaoLivros.class);
	}
	
}
