package br.laramara.ti.sisweb.utilitarios;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.dominio.Usuario;
import br.laramara.ti.sisweb.repositorios.RepositorioUsuario;

@Stateful
@SessionScoped
public class Sessao implements Serializable {

	private static final long serialVersionUID = -6781109768093888408L;

	private static Logger logger = Logger.getLogger(Sessao.class.getName());

	@Inject
	private RepositorioUsuario repositorioProfissional;

	private String chapa;

	private Usuario usuarioLogado;

	public static final String SISWEB = "sisweb";

	private String CAMINHO_SISLIVROS = "/sislivros";
	private String CAMINHO_SISRH = "/sisrh";
	private String PAGINA_LOGIN = "/login.xhtml";
	private String PAGINA_MENU_DE_SISTEMAS = "/menuSistemas.xhtml";
	private String PAGINA_SISRH_HOLERITES = CAMINHO_SISRH + "/holerites.xhtml";
	private String PAGINA_SISRH_ADM_INICIAL = CAMINHO_SISRH
			+ "/administracaoInicialSisRH.xhtml";
	private String PAGINA_SISRH_ADM_HOLERITES = CAMINHO_SISRH
			+ "/administracaoHolerites.xhtml";
	private String PAGINA_SISLIVROS_ADM_INICIAL = CAMINHO_SISLIVROS
			+ "/administracaoInicialSisLivros.xhtml";

	public Sessao() {
		chapa = "";
	}

	public void redirecionarParaPaginaInicialSeNaoEstiverLogado() {
		if (!this.estaLogado()) {
			redirectParaPaginaInicial();
		}
	}
	
	public void redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao() {
		redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISRH_ACESSAR_HOLERITE);
	}

	public synchronized void redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema sistema) {
		if (!this.estaLogado()		
				|| !possuiAcessoAoSistema(sistema)) {
			redirectParaPaginaInicial();
		}
	}
	
	private boolean possuiAcessoAoSistema(Sistema sistema) {
		return usuarioLogado.possuiSistema(sistema);
	}

	private void redirectParaPagina(String pagina) {
		try {
			ExternalContext externalContext = FacesContext.getCurrentInstance()
					.getExternalContext();
			externalContext.redirect(externalContext.getRequestContextPath()
					+ pagina);
		} catch (Exception e) {
			logger.severe("Erro durante direcionamento. \nDetalhes: "
					+ e.getMessage());
		}
	}

	private void redirectParaPaginaInicial() {
		redirectParaPagina(PAGINA_LOGIN);
	}

	public void redirecionarParaPaginaSisRHHolerites() {
		redirectParaPagina(PAGINA_SISRH_HOLERITES);
	}

	public void redirecionarParaPaginaInicialSisRHAdministracao() {
		redirectParaPagina(PAGINA_SISRH_ADM_INICIAL);
	}

	public void redirecionarParaPaginaSisRHAdministracaoHolerites() {
		redirectParaPagina(PAGINA_SISRH_ADM_HOLERITES);
	}

	public void redirecionarParaPaginaMenuDeSistemas() {
		redirectParaPagina(PAGINA_MENU_DE_SISTEMAS);
	}

	public void redirecionarParaPaginaSisLivrosAdministracao() {
		redirectParaPagina(PAGINA_SISLIVROS_ADM_INICIAL);
	}

	public boolean logar(String cpf, String senha) {
		usuarioLogado = repositorioProfissional.autenticar(cpf,
				Criptografia.converterParaMD5(senha));
		if (possuiUsuarioLogado() && !repositorioProfissional.demitido(cpf)) {
			chapa = repositorioProfissional.obterChapaPorCpf(cpf);
		} else {
			chapa = "";
		}
		return contemChapa();
	}

	public boolean possuiUsuarioLogado() {
		return usuarioLogado != null;
	}

	public boolean estaLogado() {
		return (contemChapa() && possuiUsuarioLogado());
	}

	public String getChapa() {
		return chapa;
	}
	
	public boolean contemChapa() {
		return !chapa.isEmpty();
	}

	public boolean usuarioLogadoAdministrador() {
		return usuarioLogado.isAdministradorSisRh();
	}

	public Object obterParametro(String parametro) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletRequest req = (HttpServletRequest) facesContext
				.getExternalContext().getRequest();
		return req.getParameter(parametro);
	}

	private void limpar() {
		usuarioLogado = null;
		chapa = "";
	}

	public void sair() {
		limpar();
		redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao();
	}

	public String obterCpfUsuarioLogado() {
		return usuarioLogado.getCpf();
	}

	public List<Sistema> obterSistemasUsuarioLogado() {
		return usuarioLogado.getSistemas();
	}

	public void redirecionamentoAutomatico() {
		if (usuarioLogado.possuiPermissaoAdministracao()) {
			redirecionarParaPaginaMenuDeSistemas();
		} else {
			Sistema sistemaObtido = usuarioLogado.getSistemas().get(0);
			redirecionarParaSistema(sistemaObtido);
		}		
	}

	public void redirecionarParaSistema(Sistema sistema) {
		if (sistema == Sistema.SISLIVROS_ADMINISTRACAO) {
			redirecionarParaPaginaSisLivrosAdministracao();
		} else if (sistema == Sistema.SISRH_ADMINISTRACAO) {
			redirecionarParaPaginaInicialSisRHAdministracao();
		} else {
			redirecionarParaPaginaSisRHHolerites();
		}
		logger.info("CPF " + usuarioLogado.getCpf() + " logou com sucesso no "
				+ sistema + ".");
	}
}
