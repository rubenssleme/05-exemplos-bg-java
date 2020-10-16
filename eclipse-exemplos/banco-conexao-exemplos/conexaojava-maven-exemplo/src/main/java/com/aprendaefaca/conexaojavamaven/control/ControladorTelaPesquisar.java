package com.aprendaefaca.conexaojavamaven.control;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ControladorTelaPesquisar extends JFrame {
	private static final int LARGURA = 140;
	private static final int ALTURA = 40;
	private static final int Y = 515;

	JFrame telapai;
	JTable jta;
	Container container;
	JButton jbtFechar;
	JButton jbtLimpar;
	Object[] colunas;
	Object[][] dados;

	DefaultTableModel modeloTabela;

	public ControladorTelaPesquisar(JFrame telapai, JTable jta, Object[] colunas) {
		this.jta = jta;
		this.colunas = colunas;
		this.telapai = telapai;
	}

	public void inicializarJTable() {
		modeloTabela = new DefaultTableModel(dados, colunas) {

			 public boolean isCellEditable(int row, int column)
			 {
			     return false;
			 }
		};		
		jta = new JTable(modeloTabela);
		jta.setBounds(50, 10, 200, 200);
		jta.setSize(500, 480);
		jta.getTableHeader().setReorderingAllowed(false);

		Container cont = new Container();

		cont.setLayout(new BorderLayout());
		cont.setBounds(50, 10, 500, 500);
		cont.add(jta.getTableHeader(), BorderLayout.NORTH);
		cont.add(new JScrollPane(jta), BorderLayout.CENTER);
		cont.setVisible(true);

		container.add(cont);
	}

	public void configurarTela(String titulo, int largura, int altura,
			Component localRelativo, boolean redimensionavel, boolean movel,
			int operacao_ao_fechar) {
		definirTitulo(titulo);
		definirTamanho(largura, altura);
		definirLocalRelativo(localRelativo);
		Redimensionavel(redimensionavel);
		Movel(movel);
		definirOperacaoAoFechar(operacao_ao_fechar);
		definirContainer(container);
	}

	public void adicionaComponentes() {
		container.add(jbtFechar);
		container.add(jbtLimpar);
	}

	public void configuraComponentes() {
		container = new Container();

		jbtFechar = new JButton("Fechar");
		jbtFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtLimpar = new JButton("Limpar");
		jbtLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtFechar.setBounds(150, Y, LARGURA, ALTURA);
		jbtLimpar.setBounds(300, Y, LARGURA, ALTURA);

	}

	public void inicializarComponentes() {
		configuraComponentes();
		adicionaComponentes();
		inicializarJTable();
		carregarEventosBotoes();
	}

	public void carregarEventosBotoes() {
		jbtFechar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fecharTela();
			}
		});

		jbtLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				modeloTabela.setRowCount(0);
			}
		});
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
		telapai.setVisible(false);
	}
	
}
