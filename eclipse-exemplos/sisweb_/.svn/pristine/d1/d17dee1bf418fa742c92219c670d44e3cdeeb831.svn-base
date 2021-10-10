package br.laramara.ti.sisweb.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.laramara.ti.sisweb.paginas.sisrh.PaginaAcessarHoleriteSisRh;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaLogin extends PaginaBase {
	private static final String MENSAGEM_LOGIN_INVALIDO = "Erro: Usuário ou senha incorreta.";
	
	@CacheLookup
	@FindBy(id = "j_idt5:cpf")
	private WebElement cpf;
	@CacheLookup
	@FindBy(id = "j_idt5:senha")
	private WebElement senha;
	@CacheLookup
	@FindBy(id = "j_idt5:botao")
	private WebElement botaoAcessar;

	public PaginaLogin(WebDriver driver) {
		super(driver);
	}
	
	private <T> T logar(String cpf, String senha, Class<T> proximaPagina) {
		DriverUtils.adicionarTexto(this.cpf, cpf);
		DriverUtils.adicionarTexto(this.senha, senha);
		DriverUtils.clicar(botaoAcessar);
		return PageFactory.initElements(driver, proximaPagina);
	}

	public PaginaMenuSistemas logarComoAdministrador(String cpf, String senha) {
		return logar(cpf, senha, PaginaMenuSistemas.class);
	}

	public PaginaAcessarHoleriteSisRh logarComoUsuarioComum(String cpf, String senha) {
		return logar(cpf, senha, PaginaAcessarHoleriteSisRh.class);
	}
	
	public PaginaLogin logarComoUsuarioInvalido(String cpf, String senha) {
		return logar(cpf, senha, PaginaLogin.class);
	}

	public boolean loginInvalido() {
		return DriverUtils.possuiTagComConteudo(driver, TAG_SPAN, MENSAGEM_LOGIN_INVALIDO);
	}

}
