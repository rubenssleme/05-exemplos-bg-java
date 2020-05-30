package br.com.carloskafka.sishibernateclient.infra;

import br.com.carloskafka.sishibernatecommons.servicos.ServicoSisHibernateServer;

public class Registro {
	public static ServicoSisHibernateServer obterServicoSisHibernateServer() {
		return (ServicoSisHibernateServer) SpringInfra.obterInstancia()
				.getBean("servicoSisHibernateServer");
	}
}
