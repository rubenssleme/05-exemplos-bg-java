package br.org.sistimecliente;

import java.util.Scanner;

import br.org.sistimecliente.dominio.Cliente;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Cliente cliente = new Cliente();

		cliente.conectar();

		while (cliente.conectado()) {
			System.out.print("Envie uma mensagem: ");
			cliente.enviarMensagem(new Scanner(System.in).nextLine());

			System.out.println("Servidor: " + cliente.obterRespostaServidor());
		}
	}
}
