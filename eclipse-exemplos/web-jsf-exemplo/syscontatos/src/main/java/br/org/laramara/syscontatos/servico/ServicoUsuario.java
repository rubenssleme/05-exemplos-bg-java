package br.org.laramara.syscontatos.servico;

import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.org.laramara.syscontatos.model.Usuario;

public class ServicoUsuario implements Serializable {

	private static final long serialVersionUID = 5010827324048581441L;

	public Usuario buscarUsuario(String urlJson){
		System.out.println("CHAMOU O SERVI�O....");
		
		final GsonBuilder  gsonBuilder = new GsonBuilder();
		final Gson gson = gsonBuilder.create();
		Gson g = new Gson();
		Usuario retornoUsuario = gson.fromJson(urlJson, Usuario.class);
		return retornoUsuario;
	}
	
	
}
