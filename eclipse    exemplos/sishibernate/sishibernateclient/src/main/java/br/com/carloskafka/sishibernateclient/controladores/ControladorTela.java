package br.com.carloskafka.sishibernateclient.controladores;

import java.awt.Window;

import br.com.carloskafka.sishibernateclient.infra.Registro;
import br.com.carloskafka.sishibernatecommons.servicos.ServicoSisHibernateServer;

abstract class ControladorTela {
	protected Window telaPai;
	protected ServicoSisHibernateServer servicoSisHibernateServer;

	public ControladorTela(Window telaPai) {
		super();
		this.telaPai = telaPai;
		servicoSisHibernateServer = Registro.obterServicoSisHibernateServer();
	}

	public void fechar() {
		telaPai.dispose();
	}

}
