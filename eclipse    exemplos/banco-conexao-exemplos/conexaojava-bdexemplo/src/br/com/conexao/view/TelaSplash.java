package br.com.conexao.view;

import javax.swing.*;

import br.com.conexao.control.ControladorTelaSplash;


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
