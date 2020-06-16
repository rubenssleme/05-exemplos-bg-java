package br.laramara.ti.sisweb.sislivros.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.dtos.ChavePesquisaDTO;
import br.laramara.ti.sisweb.sislivros.dominio.livros.Livro;
import br.laramara.ti.sisweb.sislivros.dtos.EspecificacaoPesquisaLivroDTO;
import br.laramara.ti.sisweb.sislivros.fabricas.FabricaEspecificacaoPesquisaLivro;
import br.laramara.ti.sisweb.sislivros.repositorios.EspecificacaoPesquisaLivro;
import br.laramara.ti.sisweb.sislivros.repositorios.RepositorioLivro;
import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorAdministracaoLivros {

	private static final String INFORMACAO_GRAVADA_COM_SUCESSO = "Informação gravada com sucesso.";
	private static final String MENSAGEM_ERRO_DURANTE_GRAVACAO_DE_DADOS = "Erro durante gravação de dados.";

	@Inject
	private Sessao sessao;

	@Inject
	private RepositorioLivro repositorioLivro;

	private List<Livro> livros;
	private EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto;
	private Livro livroSelecionado;
	private ChavePesquisaDTO categoriaSelecionada;
	private Object parametro;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISLIVROS_ADMINISTRACAO);
		especificacaoPesquisaLivroDto = new EspecificacaoPesquisaLivroDTO();
	}

	public List<ChavePesquisaDTO> getCategorias() {
		return especificacaoPesquisaLivroDto.obterOpcoes();
	}

	public List<String> getTipos() {
		return repositorioLivro.obterListagemTipo();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public EspecificacaoPesquisaLivroDTO getEspecificacaoPesquisaLivroDto() {
		return especificacaoPesquisaLivroDto;
	}

	public void setEspecificacaoPesquisaLivroDto(
			EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto) {
		this.especificacaoPesquisaLivroDto = especificacaoPesquisaLivroDto;
	}

	public Livro getLivroSelecionado() {
		return livroSelecionado;
	}

	public void setLivroSelecionado(Livro livroSelecionado) {
		this.livroSelecionado = livroSelecionado;
	}

	public ChavePesquisaDTO getCategoriaSelecionada() {
		return categoriaSelecionada;
	}

	public void setCategoriaSelecionada(ChavePesquisaDTO categoriaSelecionada) {
		this.categoriaSelecionada = categoriaSelecionada;
	}

	public Object getParametro() {
		return parametro;
	}

	public void setParametro(Object parametro) {
		this.parametro = parametro;
	}

	public void prepararInclusaoLivro(ActionEvent event) {
		livroSelecionado = new Livro();
	}

	public void listarTodos() {
		livros = repositorioLivro.obterTodos();
	}

	public void prepararListagemLivros(ActionEvent event) {
		livros = new ArrayList<Livro>();
	}

	public void pesquisarComParametro() {		
		especificacaoPesquisaLivroDto.adicionarParametro(categoriaSelecionada,
				parametro);

		EspecificacaoPesquisaLivro especificacaoPesquisaLivro = new FabricaEspecificacaoPesquisaLivro()
				.converterParaDominio(especificacaoPesquisaLivroDto);

		livros = repositorioLivro.obterPor(especificacaoPesquisaLivro);
	}
	
	public void pesquisarGeral() {
		livros = repositorioLivro.obterPorParametro(parametro);
	}

	public void editarLivroSelecionado() {
		if (repositorioLivro.salvar(livroSelecionado)) {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_INFO,
					INFORMACAO_GRAVADA_COM_SUCESSO, "");
		} else {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR,
					MENSAGEM_ERRO_DURANTE_GRAVACAO_DE_DADOS, "");
		}
		listarTodos();
	}
}
