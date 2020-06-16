package br.laramara.ti.sisweb.utilitarios;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Usuario;
import br.laramara.ti.sisweb.repositorios.RepositorioUsuario;

@ApplicationScoped
public class RecuperadorSenha implements Serializable {

	private static final long serialVersionUID = -8738425326545907331L;

	private static Map<String, String> solicitacoes = new HashMap<>();

	@Inject
	private RepositorioUsuario repositorioUsuario;

	public synchronized String efetuarSolicitacao(String emailSolicitante) {
		String chave = UUID.randomUUID().toString();
		solicitacoes.put(chave, emailSolicitante);
		return chave;
	}

	public synchronized boolean alterarSenha(String chave, String novaSenha) {
		boolean retorno = false;
		try {
			String emailSolicitante = solicitacoes.get(chave);
			Usuario usuario = repositorioUsuario
					.obterPorEmail(emailSolicitante);
			usuario.setSenha(novaSenha);
			repositorioUsuario.salvar(usuario);
			solicitacoes.remove(chave);
			retorno = true;
		} catch (Exception e) {
			retorno = false;
		}
		return retorno;
	}
}
