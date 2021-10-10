package br.com.conexao.control;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.conexao.utilitarios.LeituraArquivos;

@SuppressWarnings("serial")
public class ControladorTela extends JFrame {
	protected static final int LARGURA = 95;
	protected static final int ALTURA = 20;

	JButton jbtFechar, jbtLimpar;

	LeituraArquivos u = new LeituraArquivos();

	JFrame telapai;
	
	public ControladorTela(JFrame telapai) {
		this.telapai = telapai;
	}

	public void Movel(boolean verdadeiro_ou_falso) {
		if (verdadeiro_ou_falso) {
			telapai.setUndecorated(false);
		} else {
			telapai.setUndecorated(true);
		}
	}

	public void Redimensionavel(boolean verdadeiro_ou_falso) {
		if (verdadeiro_ou_falso) {
			telapai.setResizable(true);
		} else {
			telapai.setResizable(false);
		}
	}

	public void definirTitulo(String titulo) {
		telapai.setTitle(titulo);
	}

	public void definirTamanho(int largura, int altura) {
		telapai.setSize(largura, altura);
	}

	public void definirTelaCheia(boolean verdadeiro_ou_falso) {
		if (verdadeiro_ou_falso == true) {
			telapai.setExtendedState(MAXIMIZED_BOTH);
		} else {
			telapai.setExtendedState(NORMAL);
		}
	}

	public void definirLocalRelativo(Component component) {
		telapai.setLocationRelativeTo(component);
	}

	public void definirContainer(Container container) {
		telapai.setContentPane(container);
	}

	public void definirOperacaoAoFechar(int operacao) {
		if (operacao == 3) {
			telapai.setDefaultCloseOperation(EXIT_ON_CLOSE);
		} else {
			if (operacao == 2) {
				telapai.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			} else {
				if (operacao == 1) {
					telapai.setDefaultCloseOperation(HIDE_ON_CLOSE);
				} else {
					telapai.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				}
			}
		}
	}

	public void abrirTela() {
		telapai.setVisible(true);
	}

	public void fecharTela() {
		telapai.dispatchEvent(new WindowEvent(telapai, WindowEvent.WINDOW_CLOSING));
	}
	
	public void esconderTela() {
		telapai.setVisible(false);
	}

}
