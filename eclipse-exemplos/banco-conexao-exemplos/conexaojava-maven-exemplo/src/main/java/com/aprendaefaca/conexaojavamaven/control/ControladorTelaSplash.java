package com.aprendaefaca.conexaojavamaven.control;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import com.aprendaefaca.conexaojavamaven.view.TelaLogin;

@SuppressWarnings("serial")
public class ControladorTelaSplash extends ControladorTela {

	Container container;

	ControladorSplash controlador;

	JLabel jlImagem;
	JLabel jlLoading;
	JLabel jlContador;
	JProgressBar jpBar;

	static int jpContador;

	public ControladorTelaSplash(JFrame telapai, JLabel jlImagem,
			JLabel jlLoading, JProgressBar jlBar, JLabel jlContador) {
		super(telapai);
		this.jlImagem = jlImagem;
		this.jlLoading = jlLoading;
		this.jpBar = jlBar;
		this.jlContador = jlContador;
		inicializarComponentes();
		configurarTela();
		inicializarBD();
		carregarProgressBar();
	}

	private void configurarTela() {
		definirTitulo("Tela de Splash");
		definirTamanho(600, 300);
		definirLocalRelativo(null);
		Redimensionavel(false);
		Movel(false);
		definirOperacaoAoFechar(3);
		definirContainer(container);
	}

	private void inicializarComponentes() {
		configuraComponentes();
		adicionaComponentes();
	}

	private void adicionaComponentes() {
		container.add(jlImagem);
		container.add(jlLoading);
		container.add(jpBar);
		container.add(jlContador);
	}

	private void configuraComponentes() {
		telapai = new JFrame();
		container = new Container();

		jlImagem = new JLabel(new ImageIcon(
				"resources/images/splash_imagem.jpg"));
		jlImagem.setBounds(0, 0, 600, 200);

		jlLoading = new JLabel("Carregando...");
		jlLoading.setBounds(250, 200, 150, 50);

		jpBar = new JProgressBar();
		jpBar.setBounds(130, 250, 320, 20);

		jlContador = new JLabel();
		jlContador.setBounds(460, 250, 320, 20);
	}

	public void inicializarBD() {
		controlador = new ControladorSplash();
		controlador.inicializarBD();
	}

	public void carregarProgressBar() {
		Thread t = new Thread() {
			public void run() {

				while (jpContador < 101) {
					final int porcentagem = jpContador;
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							if (jpContador == 101) {
								jlContador.setText(String.valueOf(porcentagem - 1)
										+ "%");							
								
							} else {
								jpBar.setValue(porcentagem);
								jlContador.setText(String.valueOf(porcentagem)
										+ "%");
								jpContador++;
							}
						}
					});

					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
					}
				}
				esconderTela();
				new TelaLogin();
			}
		};
		t.start();		
	}

}
