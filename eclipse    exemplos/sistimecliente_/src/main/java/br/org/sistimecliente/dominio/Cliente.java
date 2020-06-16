package br.org.sistimecliente.dominio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Cliente {
	private static final String IP = "localhost";
	private static final int PORTA = 3700;
	private static final SocketAddress URL_SERVIDOR = new InetSocketAddress(IP, PORTA);

	private Socket socket;

	public Cliente() {
		socket = new Socket();
	}

	public void conectar() {
		try {
			System.out.println("Iniciando servidor '" + IP + "' na porta " + PORTA);
			socket.connect(URL_SERVIDOR);
			System.out.println("Servidor '" + IP + "' iniciado na porta " + PORTA);
		} catch (Exception e) {
			System.out.println("Falha ao conectar no servidor.\nDetalhes: " + e.getMessage());
		}
	}

	public void enviarMensagem(String mensagem) {
		if (conectado()) {
			try {
				new PrintWriter(socket.getOutputStream(), true).println(mensagem);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public boolean conectado() {
		return socket != null && socket.isConnected();
	}

	public void desconectar() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String obterRespostaServidor() {
		String respostaServidor = "";

		try {
			respostaServidor = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
		} catch (IOException e) {
			System.out.println("Falha ao obter resposta do servidor.\nDetalhes: " + e.getMessage());
		}

		return respostaServidor;
	}
}
