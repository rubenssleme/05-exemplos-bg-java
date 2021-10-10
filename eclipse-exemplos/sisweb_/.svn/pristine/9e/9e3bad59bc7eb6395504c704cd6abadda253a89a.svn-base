package br.laramara.ti.sisweb.controladores;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorSistema {

	private Sistema sistemaSelecionado;

	@Inject
	private Sessao sessao;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogado();
	}

	public Sistema getSistemaSelecionado() {
		return sistemaSelecionado;
	}

	public void setSistemaSelecionado(Sistema sistemaSelecionado) {
		this.sistemaSelecionado = sistemaSelecionado;
	}

	public List<Sistema> getSistemas() {
		return sessao.obterSistemasUsuarioLogado();
	}

	public void acessar() {	
		sessao.redirecionarParaSistema(sistemaSelecionado);
	}

}
