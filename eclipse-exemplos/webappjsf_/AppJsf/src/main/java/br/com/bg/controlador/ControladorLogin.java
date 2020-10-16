package br.com.bg.controlador;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import br.com.bg.dominio.Usuario;
import br.com.bg.repositorio.RepositorioUsuario;
import br.com.bg.utilitarios.Uteis;

@Named("controladorLogin")
@SessionScoped
public class ControladorLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private RepositorioUsuario usuarioRepository;

	@Inject
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario GetUsuarioSession() {

		FacesContext facesContext = FacesContext.getCurrentInstance();

		return (Usuario) facesContext.getExternalContext().getSessionMap().get("usuarioAutenticado");
	}

	public String Logout() {

		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		return "/index.xhtml?faces-redirect=true";
	}

	public String EfetuarLogin() {

		if (StringUtils.isEmpty(usuario.getUsuario()) || StringUtils.isBlank(usuario.getUsuario())) {

			Uteis.Mensagem("Favor informar o login!");
			return null;
		} else if (StringUtils.isEmpty(usuario.getSenha()) || StringUtils.isBlank(usuario.getSenha())) {

			Uteis.Mensagem("Favor informara senha!");
			return null;
		} else {

			usuario = usuarioRepository.ValidaUsuario(usuario);

			if (usuario != null) {

				FacesContext facesContext = FacesContext.getCurrentInstance();

				facesContext.getExternalContext().getSessionMap().put("usuarioAutenticado", usuario);

				return "sistema/home?faces-redirect=true";
			} else {

				Uteis.Mensagem("Não foi possível efetuar o login com esse usuário e senha!");
				return null;
			}
		}

	}

}