package br.laramara.ti.sisweb.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.laramara.ti.sisweb.dominio.Usuario;
import br.laramara.ti.sisweb.utilitarios.Conexao;

@Stateless
public class RepositorioUsuario extends RepositorioDB<Usuario> {

	private static final String COMANDO_SQL_BASE = "SELECT u FROM Usuario u";
	private static final String CONDICIONAL_WHERE = " WHERE ";
	private static final String CONDICIONAL_ORDEM = " ORDER BY ";
	private static final String CONDICIONAL_ATIVO = " u.ativo = TRUE";
	private static final String CONDICIONAL_EMAIL = COMANDO_SQL_BASE
			+ CONDICIONAL_WHERE + " u.email = :email AND" + CONDICIONAL_ATIVO;
	private static final String CONDICIONAL_AUTENTICACAO = COMANDO_SQL_BASE
			+ CONDICIONAL_WHERE + "u.cpf = :cpf AND u.senha = :senha AND"
			+ CONDICIONAL_ATIVO;
	private static final String CONDICIONAL_TODOS_USUARIOS = COMANDO_SQL_BASE
			+ CONDICIONAL_WHERE + CONDICIONAL_ATIVO + CONDICIONAL_ORDEM
			+ "u.cpf";

	public synchronized Usuario autenticar(String cpf, String senha) {
		Usuario usuario = null;
		try {
			Query query = em.createQuery(CONDICIONAL_AUTENTICACAO, Usuario.class);
			query.setParameter("cpf", cpf);
			query.setParameter("senha", senha);

			usuario = (Usuario) query.getSingleResult();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return usuario;
	}

	public synchronized boolean demitido(String cpf) {
		Connection connectionPEXXI = new Conexao().obterConexaoPEXXI();
		boolean retorno = false;
		try {
			PreparedStatement preparedStatement = connectionPEXXI
					.prepareStatement("SELECT t1.cpf, t1.nome, t1.dtreal_deslig FROM PEXXI.pessoal t1, "
							+ "(SELECT nome, Max(chapa) AS chapa FROM pexxi.pessoal "
							+ "GROUP BY nome "
							+ "ORDER BY nome) t2 "
							+ "WHERE t1.chapa = t2.chapa AND t1.dtreal_deslig IS NOT NULL AND t1.cpf = ?");
			preparedStatement.setString(1, cpf);
			preparedStatement.execute();
			ResultSet rs = preparedStatement.getResultSet();
			rs.next();
			if (rs.getRow() != 0) {
				retorno = true;
			}
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return retorno;
	}
	
	private synchronized String obterCampoPorCpfPexxi(String cpf, String campo) {
		String retorno = "";
		Connection connectionPEXXI = new Conexao().obterConexaoPEXXI();
		ResultSet rs = null;
		try {
			PreparedStatement preparedStatement = connectionPEXXI
					.prepareStatement("	SELECT " + campo + " FROM pexxi.pessoal "
							+ "WHERE cpf = ?");
			preparedStatement.setString(1, cpf);
			preparedStatement.execute();
			rs = preparedStatement.getResultSet();
			if (rs.next()) {
				retorno = rs.getString(campo);
			}
			preparedStatement.close();
			rs.close();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return retorno;
	}

	public String obterChapaPorCpf(String cpf) {
		return obterCampoPorCpfPexxi(cpf, "max(chapa)");
	}
	
	private String obterNomePorCpf(String cpf) {
		return obterCampoPorCpfPexxi(cpf, "nome");
	}
	
	private List<Usuario> carregarNomes(List<Usuario> usuarios) {
		List<Usuario> usuariosComNomeCarregado = new ArrayList<Usuario>();
		for (Usuario usuario : usuarios) {
			usuario.setNome(obterNomePorCpf(usuario.getCpf()));
			usuariosComNomeCarregado.add(usuario);
		}
		return usuariosComNomeCarregado;
	}

	public List<Usuario> obterTodosUsuarios() {
		List<Usuario> usuariosComNomesCarregado = new ArrayList<Usuario>();
		try {
			TypedQuery<Usuario> query = em.createQuery(
					CONDICIONAL_TODOS_USUARIOS, Usuario.class);
			usuariosComNomesCarregado = carregarNomes(query.getResultList());
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return usuariosComNomesCarregado;
	}
	
	public boolean salvar(Usuario usuarioSelecionado) {
		boolean sucesso = false;
		String acao = "";
		try {
			if (!usuarioSelecionado.possuiCpf()) {
				em.persist(usuarioSelecionado);
				acao = "Inclusão";
			} else {
				em.merge(usuarioSelecionado);
				acao = "Alteração";
			}
			sucesso = true;
		} catch (Exception e) {
			logger.severe("Error: " + e);
			sucesso = false;
		}
		logger.info(acao + " do " + usuarioSelecionado
				+ " realizada com sucesso.");
		return sucesso;
	}

	public Usuario obterPorEmail(String emailSolicitante) {
		Usuario usuario = null;
		try {
			Query query = em.createQuery(CONDICIONAL_EMAIL, Usuario.class);
			query.setParameter("email", emailSolicitante);

			usuario = (Usuario) query.getSingleResult();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
		return usuario;
	}

}
