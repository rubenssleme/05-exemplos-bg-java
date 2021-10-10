package br.laramara.ti.sisweb.sislivros.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.TypedQuery;

import br.laramara.ti.sisweb.repositorios.ComandoSQLEParametros;
import br.laramara.ti.sisweb.repositorios.RepositorioDB;
import br.laramara.ti.sisweb.sislivros.dominio.livros.Livro;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@Stateless
public class RepositorioLivro extends RepositorioDB<Livro> {

	@Inject
	private Sessao sessao;

	private static final String COMANDO_BASE = "SELECT l FROM Livro l";
	private static final String COMANDO_ORDEM = " ORDER BY l.id";
	private static final String CONDICIONAL_TODOS_ATIVOS = COMANDO_BASE + " WHERE l.status = true " + COMANDO_ORDEM;
	private static final String ID = "id";
	private static final String TITULO = "titulo";
	private static final String AUTOR = "autor";
	private static final String ASSUNTO = "assunto";
	private static final String LOCAL_ARMAZENADO = "localArmazenado";
	private static final String AAAT = "aaat";
	private static final String VOLUME = "volume";
	private static final String TIPO = "tipo";
	private static final String STATUS = "status";

	public List<Livro> obterTodos() {
		List<Livro> livros = new ArrayList<>();
		try {
			TypedQuery<Livro> query = em.createQuery(CONDICIONAL_TODOS_ATIVOS, Livro.class);
			livros = query.getResultList();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return livros;
	}

	public boolean salvar(Livro livroSelecionado) {
		boolean sucesso = false;
		String acao = "";
		try {
			if (!livroSelecionado.possuiId()) {
				em.persist(livroSelecionado);
				em.flush();
				acao = "Inclusão";
			} else {
				em.merge(livroSelecionado);
				acao = "Alteração";
			}
			sucesso = true;
		} catch (Exception e) {
			sucesso = false;
		}
		String cpfUsuarioLogado = sessao.obterCpfUsuarioLogado();
		logger.info(acao + " do " + livroSelecionado
				+ " realizada com sucesso pelo CPF " + cpfUsuarioLogado + ".");
		return sucesso;
	}

	public List<Livro> obterPor(
			EspecificacaoPesquisaLivro especificacaoPesquisaLivro) {

		List<Livro> livros = new ArrayList<>();

		try {
			TypedQuery<Livro> query = super
					.obterQuery(comandoSql(especificacaoPesquisaLivro));

			livros = query.getResultList();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return livros;
	}

	protected ComandoSQLEParametros comandoSql(
			EspecificacaoPesquisaLivro especificacaoPesquisaLivro) {
		ComandoSQLEParametros comandoSQLEParametros = new ComandoSQLEParametros();

		comandoSQLEParametros.setComandoBase(COMANDO_BASE);

		if (especificacaoPesquisaLivro.possuiId()) {
			comandoSQLEParametros.adicionarComandoPorParametro(ID, especificacaoPesquisaLivro.getId());
		} else if (especificacaoPesquisaLivro.possuiTitulo()) {
			comandoSQLEParametros.adicionarComandoPorParametro(TITULO, especificacaoPesquisaLivro.getContemTitulo());
		} else if (especificacaoPesquisaLivro.possuiAutor()) {
			comandoSQLEParametros.adicionarComandoPorParametro(AUTOR, especificacaoPesquisaLivro.getContemAutor());
		} else if (especificacaoPesquisaLivro.possuiAssunto()) {
			comandoSQLEParametros.adicionarComandoPorParametro(ASSUNTO,
					especificacaoPesquisaLivro.getContemAssunto());
		} else if (especificacaoPesquisaLivro.possuiLocalArmazenado()) {
			comandoSQLEParametros.adicionarComandoPorParametro(LOCAL_ARMAZENADO,
					especificacaoPesquisaLivro.getContemLocalArmazenado());
		} else if (especificacaoPesquisaLivro.possuiAaat()) {
			comandoSQLEParametros.adicionarComandoPorParametro(AAAT, especificacaoPesquisaLivro.getContemAaat());
		} else if (especificacaoPesquisaLivro.possuiVolume()) {
			comandoSQLEParametros.adicionarComandoPorParametro(VOLUME, especificacaoPesquisaLivro.getContemVolume());
		} else if (especificacaoPesquisaLivro.possuiTipo()) {
			comandoSQLEParametros.adicionarComandoPorParametro(TIPO, especificacaoPesquisaLivro.getContemTipo());
		}

		comandoSQLEParametros.adicionarComandoPorParametro(STATUS,
				especificacaoPesquisaLivro.isStatus());

		comandoSQLEParametros.setComandoOrdem(COMANDO_ORDEM);

		return comandoSQLEParametros;
	}

	public List<String> obterListagemTipo() {
		return obterLista("l.tipo");
	}

	private List<String> obterLista(String campo) {
		SortedSet<String> textoSemRepeticao = new TreeSet<>();
		TypedQuery<String> query = em.createQuery("SELECT DISTINCT " + campo
				+ " FROM Livro l ORDER BY " + campo, String.class);
		try {
			List<String> resultados = query.getResultList();
			for (String resultado : resultados) {
				if (resultado != null) {
					textoSemRepeticao.add(resultado.toUpperCase().trim());
				}
			}
		} catch (Exception e) {
			logger.severe("Não foi possível obter. \nDetalhe:" + e);
		}
		return new ArrayList<>(textoSemRepeticao);
	}

	public List<Livro> obterPorParametro(Object parametro) {
		List<Livro> livros = new ArrayList<>();

		try {
			ComandoSQLEParametros comandoSQLEParametros = new ComandoSQLEParametros();
			
			comandoSQLEParametros.setComandoBase(COMANDO_BASE);
			
			String[] chaves = new String[] { TITULO, AUTOR, ASSUNTO, LOCAL_ARMAZENADO, AAAT, VOLUME, TIPO };
			comandoSQLEParametros.adicionarComandoPorParametroGlobal(chaves, parametro);
			
			comandoSQLEParametros.setComandoOrdem(COMANDO_ORDEM);
			
			TypedQuery<Livro> query = super
					.obterQuery(comandoSQLEParametros);

			livros = query.getResultList();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return livros;

	}

}
