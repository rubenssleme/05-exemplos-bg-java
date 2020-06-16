package br.laramara.ti.sisweb.paginas.sisrh;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.PaginaBase;
import br.laramara.ti.sisweb.utilitarios.ArquivoUtils;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaAcessarHoleriteSisRh extends PaginaBase {
	@FindBy(id = "j_idt5:j_idt8:0:j_idt10")
	private WebElement primeiroHolerite;

	private long tamanhoHoleriteObtido;
	private long tamanhoHoleriteTemporarioObtido;

	public PaginaAcessarHoleriteSisRh(WebDriver driver) {
		super(driver);
		limpar();
	}

	private void limpar() {
		tamanhoHoleriteObtido = 0;
		tamanhoHoleriteTemporarioObtido = 0;
	}

	public boolean paginaValida() {
		return super.paginaValida("SisRH - Holerites");
	}

	public void efetuarDownload() {
		DriverUtils.clicar(primeiroHolerite);
	}

	public void obterTamanhoHolerites(File pastaHolerite, File pastaTemporario) {
		File[] holerites = ArquivoUtils.listarArquivos(pastaHolerite);
		tamanhoHoleriteObtido = holerites[0].length();

		File[] holeritesTemporarios = ArquivoUtils.listarArquivos(pastaTemporario);
		tamanhoHoleriteTemporarioObtido = holeritesTemporarios[0].length();
	}

	public boolean tamanhoCorretoHolerites() {
		int novoLayoutBytes = 28;
		return (tamanhoHoleriteObtido + novoLayoutBytes) == tamanhoHoleriteTemporarioObtido;
	}

	public boolean downloadEfetuadoComSucesso(File pastaTemporario) {
		return sucesso(ArquivoUtils.listarArquivos(pastaTemporario).length, 1);
	}

}
