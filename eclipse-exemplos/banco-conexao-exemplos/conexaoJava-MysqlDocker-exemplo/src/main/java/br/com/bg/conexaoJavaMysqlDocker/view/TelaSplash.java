package br.com.bg.conexaoJavaMysqlDocker.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import br.com.bg.conexaoJavaMysqlDocker.control.ControladorTelaSplash;

@SuppressWarnings("serial")
public class TelaSplash extends JFrame {

	ControladorTelaSplash controlador;
	JLabel jlImagem;
	JLabel jlLoading;
	JLabel jlContador;
	JProgressBar jpBar;

	public TelaSplash() {
		controlador = new ControladorTelaSplash(this, jlImagem, jlLoading,
				jpBar, jlContador);
		controlador.abrirTela();
	}

	public static void main(String[] args) {
		new TelaSplash();
	}
}
