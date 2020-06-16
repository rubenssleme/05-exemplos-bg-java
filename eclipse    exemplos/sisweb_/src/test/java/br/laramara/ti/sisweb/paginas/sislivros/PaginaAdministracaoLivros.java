package br.laramara.ti.sisweb.paginas.sislivros;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import br.laramara.ti.sisweb.paginas.opcao.Opcao;
import br.laramara.ti.sisweb.utilitarios.DriverUtils;

public class PaginaAdministracaoLivros extends PaginaAdministracaoInicialSisLivros {
	private final int TOTAL_LIVROS_NO_XML = 20;
	private final String TAG_PESQUISA_GERAL_FORM = "pesquisaGeralFormDialog";
	private final String TAG_PESQUISA_FORM_DIALOG = "pesquisaFormDialog";
	private final String TITULO_FORMULARIO_ALTERACAO_LIVRO = "Editar Livro";
	private final String TITULO_FORMULARIO_PESQUISA = "Pesquisar";
	private final String TITULO_FORMULARIO_PESQUISA_GERAL = "Pesquisa Geral";

	private final String ID_LIVROS = "j_idt10:Livros";
	private final String ID_LIVROS_LISTA = ID_LIVROS + "_data";

	@FindBy(id = ID_LIVROS_LISTA)
	private WebElement listaLivros;

	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS + "_paginator_bottom\"]/span[2]/a[2]")
	private WebElement indicadorPagina;

	@CacheLookup
	@FindBy(id = "j_idt7")
	private WebElement botaoPesquisar;
	@CacheLookup
	@FindBy(id = "j_idt8")
	private WebElement botaoPesquisaGeral;
	@CacheLookup
	@FindBy(id = "j_idt9")
	private WebElement botaoListarTodos;
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS + "_paginator_bottom\"]/a[4]")
	private WebElement botaoAvancarParaUltimaPagina;

	@CacheLookup
	@FindBy(id = TAG_PESQUISA_FORM_DIALOG + ":j_idt46")
	private WebElement formularioPesquisa;
	@CacheLookup
	@FindBy(id = TAG_PESQUISA_FORM_DIALOG + ":categorias_input")
	private WebElement formularioPesquisaMenu;
	@CacheLookup
	@FindBy(id = TAG_PESQUISA_FORM_DIALOG + ":parametro")
	private WebElement formularioPesquisaParametro;
	@CacheLookup
	@FindBy(id = TAG_PESQUISA_FORM_DIALOG + ":j_idt53")
	private WebElement formularioPesquisaBotaoPesquisar;

	@CacheLookup
	@FindBy(id = TAG_PESQUISA_GERAL_FORM + ":j_idt54")
	private WebElement formularioPesquisaGeral;
	@CacheLookup
	@FindBy(id = TAG_PESQUISA_GERAL_FORM + ":parametroGeral")
	private WebElement formularioParametroGeral;
	@CacheLookup
	@FindBy(id = TAG_PESQUISA_GERAL_FORM + ":j_idt57")
	private WebElement formularioBotaoPesquisaGeral;

	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":j_idt33")
	private WebElement formularioAlteracaoLivro;
	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":titulo")
	private WebElement formularioTitulo;
	@CacheLookup
	@FindBy(id = TAG_EDICAO_FORM_DIALOG + ":j_idt45")
	private WebElement formularioBotaoAlterarLivro;

	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS_LISTA + "\"]/tr[1]/td[3]")
	private WebElement tituloPrimeiroLivro;

	@CacheLookup
	@FindBy(id = ID_LIVROS + ":0:j_idt14")
	private WebElement botaoAlterarPrimeiroLivro;

	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS_LISTA + "\"]/tr[1]/td[4]")
	private WebElement primeiroLivro;
	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS_LISTA + "\"]/tr[2]/td[3]")
	private WebElement segundoLivro;

	@FindBy(xpath = "//*[@id=\"" + ID_LIVROS_LISTA + "\"]/tr")
	private List<WebElement> resultadoLista;

	private String novoTitulo;
	private String texto;
	private int coluna;
	private int linha;

	private int quantidadeLivrosObtidosPorPagina;
	private int totalIndicesPaginasObtida;

	public PaginaAdministracaoLivros(WebDriver driver) {
		super(driver);
		limpar();
	}

	private void limpar() {
		this.texto = "";
		this.linha = -1;
		this.coluna = -1;
	}

	public boolean paginaValida() {
		return super.paginaValida("SisLivros - Administração de Livros");
	}

	public void abrirFormularioPesquisa() {
		abrirFormulario(botaoPesquisar, formularioPesquisa);
	}

	public void abrirFormularioPesquisaGeral() {
		abrirFormulario(botaoPesquisaGeral, formularioPesquisaGeral);
	}

	public void abrirFormularioAlteracaoPrimeiroLivro() {
		abrirFormulario(botaoAlterarPrimeiroLivro, formularioAlteracaoLivro);
	}

	public void pesquisarGeral(String parametro) {
		DriverUtils.adicionarTexto(formularioParametroGeral, parametro);
		DriverUtils.clicar(formularioBotaoPesquisaGeral);
	}

	private void pesquisar(Opcao opcao, String texto, int linha) {
		DriverUtils.selecionarValor(driver, formularioPesquisaMenu, opcao.toString());
		DriverUtils.adicionarTexto(formularioPesquisaParametro, texto);
		DriverUtils.clicar(formularioPesquisaBotaoPesquisar);

		this.texto = texto;
		this.linha = linha;
		this.coluna = opcao.obterColuna();
	}

	public void pesquisarPorId(int livro, String texto) {
		pesquisar(Opcao.ID, texto, livro);
	}

	public void pesquisarPorTitulo(int livro, String texto) {
		pesquisar(Opcao.CONTEM_TITULO, texto, livro);
	}

	public void pesquisarPorAutor(int livro, String texto) {
		pesquisar(Opcao.CONTEM_AUTOR, texto, livro);
	}

	public void pesquisarPorAssunto(int livro, String texto) {
		pesquisar(Opcao.CONTEM_ASSUNTO, texto, livro);
	}

	public void pesquisarPorLocalArmazenado(int livro, String texto) {
		pesquisar(Opcao.CONTEM_LOCAL_ARMAZENADO, texto, livro);
	}

	public void pesquisarPorAaat(int livro, String texto) {
		pesquisar(Opcao.CONTEM_AAAT, texto, livro);
	}

	public void pesquisarPorVolume(int livro, String texto) {
		pesquisar(Opcao.CONTEM_VOLUME, texto, livro);
	}

	public void pesquisarPorTipo(int livro, String texto) {
		pesquisar(Opcao.CONTEM_TIPO, texto, livro);
	}

	public void listarTodos() {
		DriverUtils.habilitarJavascript(driver, true);
		DriverUtils.clicar(botaoListarTodos);
		DriverUtils.esperarElementoAparecerPorElemento(driver, primeiroLivro);
	}

	public void alterarLivro(String novoTitulo) {
		DriverUtils.adicionarTexto(formularioTitulo, novoTitulo);
		DriverUtils.clicar(formularioBotaoAlterarLivro);

		this.novoTitulo = novoTitulo;
	}

	public void avancarParaUltimaPagina() {
		DriverUtils.clicarEEsperar(botaoAvancarParaUltimaPagina);
	}

	public void obterLivrosUltimaPagina() {
		quantidadeLivrosObtidosPorPagina = DriverUtils.obterElementosPorTag(listaLivros, TAG_TR).size();
		totalIndicesPaginasObtida = Integer.parseInt(DriverUtils.obterTextoNoAtributo(indicadorPagina, "textContent"));
	}

	public boolean ultimaPaginaAlcancadaComSucesso() {
		return DriverUtils.esperarElementoTerValorNoAtributo(driver, botaoAvancarParaUltimaPagina, TAG_TAB_INDEX, "-1");
	}

	public boolean livrosListadosComSucesso() {
		return sucesso(primeiroLivro, "AUTOR1");
	}

	public boolean pesquisaGeralFeitaComSucesso() {
		DriverUtils.esperarElementoAparecerPorElemento(driver, segundoLivro);

		return resultadoLista.size() == 7;
	}

	public boolean pesquisaFeitaComSucesso() {
		String xpathCampo = "//*[@id=\"" + ID_LIVROS_LISTA + "\"]/tr[" + linha + "]/td[" + coluna + "]";
		DriverUtils.esperarElementoTerTexto(driver, xpathCampo, texto);
		WebElement livroObtido = DriverUtils.obterElementoPorXpath(driver, xpathCampo);

		return sucesso(livroObtido, texto);
	}

	public boolean alteracaoFeitaComSucesso() {
		return alteracaoFeitaComSucesso(tituloPrimeiroLivro, novoTitulo);
	}

	public boolean livrosUltimaPaginaObtidosComSucesso() {
		return (quantidadeLivrosObtidosPorPagina * totalIndicesPaginasObtida) == TOTAL_LIVROS_NO_XML;
	}

	public boolean formularioAlteracaoLivroApareceu() {
		return formularioApareceu(formularioAlteracaoLivro, TITULO_FORMULARIO_ALTERACAO_LIVRO);
	}

	public boolean formularioPesquisaApareceu() {
		return formularioApareceu(formularioPesquisa, TITULO_FORMULARIO_PESQUISA);
	}

	public boolean formularioPesquisaGeralApareceu() {
		return formularioApareceu(formularioPesquisaGeral, TITULO_FORMULARIO_PESQUISA_GERAL);
	}

}