package br.org.sistimeserver.dominio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private static final int PORTA = 3700;
	private Socket cliente;
	private PrintWriter mensagemServidor;
	private ServerSocket servidor;
	private String respostaCliente;

	public Servidor() {
		respostaCliente = "";
	}

	public void iniciarServidor() {
		System.out.println("Iniciando servidor na porta " + PORTA);

		try {
			servidor = new ServerSocket(PORTA);
			System.out.println("Servidor iniciado.");
			System.out.println("Aguardando cliente.");
			cliente = servidor.accept();
			System.out.println("Cliente " + obterIpCliente() + " conectado");

			mensagemServidor = new PrintWriter(cliente.getOutputStream(), true);

			while (true) {
				if (ipValido()) {
					sincronizarRespostaCliente();

					if (!respostaCliente.isEmpty()) {
						System.out.println("Cliente " + obterIpCliente() + " enviou a mensagem: " + respostaCliente);

						if (respostaCliente.equals("T")) {
							enviarMensagem("TIME");
						} else if (respostaCliente.equals("D")) {
							enviarMensagem("DAYTIME");
						}
					}
				} else {
					mensagemServidor.close();
					cliente.close();
					servidor.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String obterIpCliente() {
		return cliente.getLocalAddress().getHostAddress();
	}

	private boolean ipValido() {
		return !obterIpCliente().equals("0.0.0.0");
	}

	private void enviarMensagem(String mensagem) {
		try {
			mensagemServidor.println(mensagem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sincronizarRespostaCliente() {
		try {
			respostaCliente = new BufferedReader(new InputStreamReader(cliente.getInputStream())).readLine();
		} catch (Exception e) {
			try {
				cliente.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("Servidor perdeu contato com o cliente " + obterIpCliente() + ". Fechando conexão.");
		}
	}

}
