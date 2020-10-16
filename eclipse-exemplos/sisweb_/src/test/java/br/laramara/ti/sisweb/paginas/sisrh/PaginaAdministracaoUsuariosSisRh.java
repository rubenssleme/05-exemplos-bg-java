package br.laramara.ti.sisweb.paginas.sisrh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.PaginaBase;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaAdministracaoUsuariosSisRh extends PaginaBase {
	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":j_idt20")
	private WebElement formularioAlteracaoUsuario;
	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":email")
	private WebElement formularioEmail;
	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":j_idt31")
	private WebElement formularioBotaoAlterarUsuario;

	@FindBy(xpath = "//*[@id=\"j_idt7:usuarios_data\"]/tr[1]/td[3]")
	private WebElement novoEmail;
	@CacheLookup
	@FindBy(id = "j_idt7:usuarios:0:j_idt19")
	private WebElement botaoAlterarUsuario;

	private String textoEmail;

	public PaginaAdministracaoUsuariosSisRh(WebDriver driver) {
		super(driver);
	}

	public boolean paginaValida() {
		return super.paginaValida("SisRH - Administração de Usuários");
	}

	public void abrirFormularioAlteracaoUsuario() {
		DriverUtils.clicarEEsperar(botaoAlterarUsuario);
		DriverUtils.esperarElementoAparecerPorElemento(driver, formularioAlteracaoUsuario);
	}

	public boolean formularioAlteracaoUsuarioApareceu() {
		return formularioApareceu(formularioAlteracaoUsuario, "Editar Usuário");
	}

	public void alterarUsuario(String novoEmail) {
		textoEmail = novoEmail;
		DriverUtils.adicionarTexto(formularioEmail, novoEmail);
		DriverUtils.clicar(formularioBotaoAlterarUsuario);
	}

	public boolean alteracaoFeitaComSucesso() {
		return alteracaoFeitaComSucesso(novoEmail, textoEmail);
	}

}
