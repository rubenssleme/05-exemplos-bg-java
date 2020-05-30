package br.org.lm.javaee7crud.controlador;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.lang3.StringUtils;
import br.org.lm.javaee7crud.dominio.Usuario;
import br.org.lm.javaee7crud.repositorio.RepositorioUsuario;
import br.org.lm.javaee7crud.utilitarios.Mensagem;



@Named("controladorLogin")
@SessionScoped
@ManagedBean
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

			Mensagem.exibirMensagem("Favor informar o login!");
			return "/index.xhtml?faces-redirect=true";
		} else if (StringUtils.isEmpty(usuario.getSenha()) || StringUtils.isBlank(usuario.getSenha())) {

			Mensagem.exibirMensagem("Favor informara senha!");
			return "/index.xhtml?faces-redirect=true";
		} else {

			usuario = usuarioRepository.ValidaUsuario(usuario);

			if (usuario != null) {

				FacesContext facesContext = FacesContext.getCurrentInstance();

				facesContext.getExternalContext().getSessionMap().put("usuarioAutenticado", usuario);

				return "sistema/home?faces-redirect=true";
			} else {

				Mensagem.exibirMensagem("Não foi possivel efetuar login com este usuario e senha!");
				FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
				return "/index.xhtml?faces-redirect=true";
			}
		}

	}

}