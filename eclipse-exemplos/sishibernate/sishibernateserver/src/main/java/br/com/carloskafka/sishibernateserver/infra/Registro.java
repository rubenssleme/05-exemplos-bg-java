package br.com.carloskafka.sishibernateserver.infra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.carloskafka.sishibernatecommons.servicos.ServicoSisHibernateServer;
import br.com.carloskafka.sishibernateserver.repositorio.RepositorioCliente;

public class Registro {
	private static ClassPathXmlApplicationContext contexto;

	public static final ApplicationContext inicializarContexto() {
		if (contexto == null) {
			contexto = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		}
		return contexto;
	}

	public static void finalizarContexto() {
		((AbstractApplicationContext) contexto).close();
	}

	public static final ServicoSisHibernateServer obterServicoSisHibernateServer() {
		inicializarContexto();
		return (ServicoSisHibernateServer) (contexto
				.getBean(ServicoSisHibernateServer.class));
	}

	public static final RepositorioCliente obterRepositorioCliente() {
		inicializarContexto();
		return (RepositorioCliente) (contexto.getBean(RepositorioCliente.class));
	}
	
}
