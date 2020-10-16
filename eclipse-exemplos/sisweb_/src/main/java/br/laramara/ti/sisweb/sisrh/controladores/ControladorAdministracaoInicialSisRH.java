package br.laramara.ti.sisweb.sisrh.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorAdministracaoInicialSisRH {
	
	@Inject
	private Sessao sessao;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISRH_ADMINISTRACAO);
	}
	
	public void sair(ActionEvent actionEvent) {
		sessao.sair();
	}
}
