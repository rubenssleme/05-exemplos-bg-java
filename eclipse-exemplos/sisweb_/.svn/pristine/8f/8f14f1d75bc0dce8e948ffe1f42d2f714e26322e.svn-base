package br.laramara.ti.sisweb.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public abstract class PaginaBase {

	protected final String TAG_TR = "tr";
	protected final String TAG_DIV = "div";
	protected final String TAG_SPAN = "span";
	protected final String TAG_TAB_INDEX = "tabindex";
	protected final String TAG_EDICAO_FORM_DIALOG = "edicaoFormDialog";

	protected WebDriver driver;

	public PaginaBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected boolean paginaValida(String titulo) {
		DriverUtils.esperarTituloConterTexto(driver, titulo);
		return tituloCorreto(titulo);
	}

	protected void abrirFormulario(WebElement botao, WebElement formulario) {
		DriverUtils.clicar(botao);
		DriverUtils.esperarElementoAparecerPorElemento(driver, formulario);
	}

	protected boolean formularioApareceu(WebElement formulario, String formularioTitulo) {
		return formulario.getText().contains(formularioTitulo);
	}

	protected boolean alteracaoFeitaComSucesso(WebElement elementoAlterado, String informacaoAlterada) {
		DriverUtils.esperarElementoTerTexto(driver, elementoAlterado, informacaoAlterada);
		return sucesso(elementoAlterado, informacaoAlterada);
	}

	private boolean tituloCorreto(String titulo) {
		return sucesso(driver.getTitle(), titulo);
	}

	protected boolean sucesso(Object objetoOriginal, Object objetoAlterado) {
		return objetoOriginal.equals(objetoAlterado);
	}

	protected boolean sucesso(WebElement elemento, String informacaoAlterada) {
		return elemento.getText().equals(informacaoAlterada);
	}

	protected <T> T abrir(WebElement botao, Class<T> pagina) {
		DriverUtils.habilitarJavascript(driver, true);
		DriverUtils.clicarEEsperar(botao);
		return PageFactory.initElements(driver, pagina);
	}

}