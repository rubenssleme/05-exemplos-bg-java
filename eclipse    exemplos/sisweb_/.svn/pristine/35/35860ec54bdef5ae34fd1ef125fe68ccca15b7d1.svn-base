package br.laramara.ti.sisweb.sislivros.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorAdministracaoInicialSisLivros {
	
	@Inject
	private Sessao sessao;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISLIVROS_ADMINISTRACAO);
	}
	
	public void sair(ActionEvent actionEvent) {
		sessao.sair();
	}
}
