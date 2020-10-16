package br.laramara.ti.sisweb.paginas.sisrh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.PaginaBase;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaAdministracaoHoleritesSisRh extends PaginaBase {

	@FindBy(id = "formUploadHolerite:uploadHolerites_input")
	private WebElement campoUpload;

	@FindBy(xpath = "//*[@id=\"formUploadHolerite:messages_container\"]/div/div/div[2]/p")
	private WebElement mensagemUpload;

	@CacheLookup
	@FindBy(id = "j_idt6:arquivos:0:j_idt12")
	private WebElement botaoRemover;
	@CacheLookup
	@FindBy(id = "j_idt6:arquivos:0:j_idt14")
	private WebElement BotaoConfirmacao;

	public PaginaAdministracaoHoleritesSisRh(WebDriver driver) {
		super(driver);
	}

	public boolean paginaValida() {
		return super.paginaValida("SisRH - Administração de Holerites");
	}

	public void excluirHolerite() {
		DriverUtils.clicarEEsperar(botaoRemover);
		DriverUtils.clicarEEsperar(BotaoConfirmacao);
	}

	public void efetuarUpload(String holerite) {
		DriverUtils.adicionarTexto(campoUpload, holerite);
	}

	public boolean uploadEfetuadoComSucesso() {
		return sucesso(mensagemUpload, "holerite.pdf foi enviado com sucesso.");
	}

	public boolean holeriteExcluidoComSucesso() {
		return DriverUtils.possuiTagComConteudo(driver, TAG_DIV, "Nenhum arquivo.");
	}
}
