package br.com.carloskafka.sishibernateclient.telas;

import java.net.ProxySelector;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;

public class SisHibernateClient extends SingleFrameApplication {

	@Override
	protected void startup() {
		show(new TelaCliente(this, new ClienteDTO()));
	}

	@Override
	protected void configureWindow(java.awt.Window root) {
	}

	public static SisHibernateClient getApplication() {
		return Application.getInstance(SisHibernateClient.class);
	}

	public static void main(String[] args) {
		ProxySelector.setDefault(null);
		launch(SisHibernateClient.class, args);
	}
}
