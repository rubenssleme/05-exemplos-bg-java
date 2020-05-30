package br.com.carloskafka.sishibernateserver;

import org.apache.log4j.Logger;

import br.com.carloskafka.sishibernateserver.infra.Registro;

public class AplicacaoSisHibernateServer {
	private static final Logger logger = Logger
			.getLogger(AplicacaoSisHibernateServer.class);

	public static void main(String[] args) {
		// Inicializa o Servico
		Registro.inicializarContexto();
		logger.warn("Servico do SisHibernate iniciado.");
	}
}