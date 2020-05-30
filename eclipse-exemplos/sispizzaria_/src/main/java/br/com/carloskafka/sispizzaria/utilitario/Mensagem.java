package br.com.carloskafka.sispizzaria.utilitario;

import java.util.Map;

public class Mensagem {

	public static void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public static void exibirMensagem(Map<String, Integer> mensagens, String descricaoChave, String descricaoValor) {
		mensagens.entrySet().forEach(mensagem -> System.out.println(
				descricaoChave + ": " + mensagem.getKey() + " | " + descricaoValor + ": " + mensagem.getValue()));
	}
}
