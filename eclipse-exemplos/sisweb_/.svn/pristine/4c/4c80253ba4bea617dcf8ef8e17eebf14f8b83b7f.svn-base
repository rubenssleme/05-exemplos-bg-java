package br.laramara.ti.sisweb.sisrh.controladores;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.dominio.Usuario;
import br.laramara.ti.sisweb.repositorios.RepositorioUsuario;
import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorAdministracaoUsuarios {

	@Inject
	private Sessao sessao;

	@Inject
	private RepositorioUsuario repositorioUsuario;

	private List<Usuario> usuarios;

	private Usuario usuarioSelecionado;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISRH_ADMINISTRACAO);
		usuarios = repositorioUsuario.obterTodosUsuarios();
	}

	public List<Usuario> getTodosUsuarios() {
		return usuarios;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public void prepararInclusaoUsuario(ActionEvent event) {
		usuarioSelecionado = new Usuario();
		usuarioSelecionado.atribuirAutorizacaoDeAcessoAoHolerite();
	}

	public void editarUsuarioSelecionado() {
		if (repositorioUsuario.salvar(usuarioSelecionado)) {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_INFO,
					"Informação gravada com sucesso.", "");
		} else {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR,
					"Erro durante gravação de dados.", "");
		}
	}
}
