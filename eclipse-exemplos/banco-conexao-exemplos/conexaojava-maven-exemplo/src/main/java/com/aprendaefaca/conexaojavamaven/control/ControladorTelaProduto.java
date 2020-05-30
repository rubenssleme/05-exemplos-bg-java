package com.aprendaefaca.conexaojavamaven.control;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.aprendaefaca.conexaojavamaven.model.Produto;
import com.aprendaefaca.conexaojavamaven.utilitarios.FormatacaoBigDecimal;
import com.aprendaefaca.conexaojavamaven.view.TelaMostraProduto;

@SuppressWarnings("serial")
public class ControladorTelaProduto extends ControladorTela {
	JLabel jlNome;
	JLabel jlID;
	JLabel jlPreco;
	JLabel jlCategoria;

	JButton jbtCadastrar;
	JButton jbtExcluir;
	JButton jbtConsultar;
	JButton jbtAlterar;
	JButton jbtFechar;
	JButton jbtLimpar;
	JButton jbtMostrarTudo;

	JTextField jtfNome;
	JTextField jtfId;
	JFormattedTextField jtfPreco;
	JComboBox<String> jcbCategoria;

	Container container;

	FormatacaoBigDecimal f = new FormatacaoBigDecimal();
	ControladorProduto controladorProduto = new ControladorProduto();

	public ControladorTelaProduto(JFrame telapai, JLabel jlNome, JLabel jlID,
			JLabel jlPreco, JLabel jlCategoria, JButton jbtCadastrar,
			JButton jbtExcluir, JButton jbtConsultar, JButton jbtAlterar,
			JButton jbtFechar, JButton jbtLimpar, JButton jbtMostrarTudo,
			JTextField jtfNome, JTextField jtfId, JFormattedTextField jtfPreco,
			JComboBox<String> jcbCategoria) {
		super(telapai);
		this.jlID = jlID;
		this.jlNome = jlNome;
		this.jlPreco = jlPreco;
		this.jlCategoria = jlCategoria;
		this.jbtCadastrar = jbtCadastrar;
		this.jbtExcluir = jbtExcluir;
		this.jbtConsultar = jbtConsultar;
		this.jbtAlterar = jbtAlterar;
		this.jbtFechar = jbtFechar;
		this.jbtLimpar = jbtLimpar;
		this.jtfId = jtfId;
		this.jtfNome = jtfNome;
		this.jtfPreco = jtfPreco;
		this.jcbCategoria = jcbCategoria;
		this.jbtMostrarTudo = jbtMostrarTudo;
		inicializarComponentes();
		configurarTela();
	}

	public void configurarTela() {
		definirTitulo("Produtos");
		definirTamanho(300, 350);
		definirLocalRelativo(null);
		Redimensionavel(false);
		Movel(false);
		definirOperacaoAoFechar(3);
		definirContainer(container);
	}

	public void adicionaComponentes() {
		container.add(jbtCadastrar);
		container.add(jbtExcluir);
		container.add(jbtConsultar);
		container.add(jbtAlterar);
		container.add(jbtFechar);
		container.add(jbtLimpar);
		container.add(jbtMostrarTudo);
		container.add(jtfId);
		container.add(jtfNome);
		container.add(jtfPreco);
		container.add(jcbCategoria);
		container.add(jlID);
		container.add(jlNome);
		container.add(jlPreco);
		container.add(jlCategoria);
	}

	public void configuraComponentes() {
		telapai = new JFrame();
		container = new Container();
		jbtCadastrar = new JButton("Cadastrar");
		jbtCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtExcluir = new JButton("Excluir");
		jbtExcluir.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtConsultar = new JButton("Consultar");
		jbtConsultar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtAlterar = new JButton("Alterar");
		jbtAlterar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtFechar = new JButton("Fechar");
		jbtFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtLimpar = new JButton("Limpar");
		jbtLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jbtMostrarTudo = new JButton("Mostrar Tudo");
		jbtMostrarTudo.setCursor(new Cursor(Cursor.HAND_CURSOR));

		jtfId = new JTextField();
		jtfNome = new JTextField();
		jtfPreco = new JFormattedTextField();

		jlID = new JLabel("ID: ");
		jlNome = new JLabel("Nome: ");
		jlPreco = new JLabel("Preco: ");
		jlCategoria = new JLabel("Categoria: ");

		jcbCategoria = new JComboBox<String>();

		jbtCadastrar.setBounds(30, 190, LARGURA, ALTURA);
		jbtConsultar.setBounds(140, 190, LARGURA, ALTURA);
		jbtExcluir.setBounds(30, 220, LARGURA, ALTURA);
		jbtAlterar.setBounds(140, 220, LARGURA, ALTURA);
		jbtMostrarTudo.setBounds(30, 250, 205, ALTURA);

		jbtFechar.setBounds(30, 280, LARGURA, ALTURA);
		jbtLimpar.setBounds(140, 280, LARGURA, ALTURA);

		jtfId.setBounds(140, 60, LARGURA, ALTURA);
		jtfNome.setBounds(140, 90, LARGURA, ALTURA);
		jtfPreco.setBounds(140, 150, LARGURA, ALTURA);

		jlID.setBounds(30, 60, LARGURA, ALTURA);
		jlNome.setBounds(30, 90, LARGURA, ALTURA);
		jlCategoria.setBounds(30, 120, LARGURA, ALTURA);
		jlPreco.setBounds(30, 150, LARGURA, ALTURA);

		jcbCategoria.setBounds(140, 120, LARGURA, ALTURA);
	}

	public void inicializarComponentes() {
		configuraComponentes();
		adicionaComponentes();
		carregarEventosBotoes();
		desabilitaCampos();
		inicializarCategorias();
	}

	public void inicializarCategorias() {
		jcbCategoria.addItem("Alimentos");
		jcbCategoria.addItem("Bebidas");
		jcbCategoria.addItem("Carnes");
		jcbCategoria.addItem("Frios");
		jcbCategoria.addItem("Frutas");
		jcbCategoria.addItem("Verduras");
		jcbCategoria.addItem("Legumes");
		jcbCategoria.addItem("Higiene");
		jcbCategoria.addItem("Limpeza");
		jcbCategoria.addItem("Padaria");
	}

	public void desabilitaCampos() {
		jtfId.setEnabled(false);
		jtfNome.setEnabled(false);
		jtfPreco.setEnabled(false);
		jbtExcluir.setEnabled(false);
		jbtAlterar.setEnabled(false);
		jcbCategoria.setEnabled(false);
	}

	public void habilitaCamposConsulta() {
		jtfId.setEnabled(true);
		jtfNome.setEnabled(false);
		jtfPreco.setEnabled(false);
		jcbCategoria.setEnabled(false);
	}

	public void habilitaCamposCadastro() {
		jtfId.setEnabled(false);
		jtfNome.setEnabled(true);
		jtfPreco.setEnabled(true);
		jcbCategoria.setEnabled(true);
		jbtConsultar.setEnabled(false);
	}

	public void habilitaCamposAlteracao() {
		habilitaCamposCadastro();
		jbtAlterar.setEnabled(true);
		jbtExcluir.setEnabled(true);
		jbtCadastrar.setEnabled(false);
		jbtConsultar.setEnabled(false);
	}

	public void limparCampos() {
		jtfId.setText("");
		jtfNome.setText("");
		jtfPreco.setText("");
		container.repaint();
		jtfId.requestFocus();
	}

	public void reiniciar() {
		jbtCadastrar.setEnabled(true);
		jbtConsultar.setEnabled(true);
		desabilitaCampos();
		limparCampos();
		jcbCategoria.setSelectedIndex(0);
	}

	public void carregarEventosBotoes() {

		jbtCadastrar.addActionListener(new ActionListener() {
			int i = 0;

			public void actionPerformed(ActionEvent e) {

				if (i == 1 && !(jtfNome.getText().isEmpty())
						&& !(jtfPreco.getText().isEmpty())) {
					try {
						controladorProduto.conectar();

						BigDecimal preco = new BigDecimal(jtfPreco.getText());

						f.FormatarBigDecimal(preco);

						Produto produto = new Produto();
						produto.setNome(jtfNome.getText());
						produto.setPreco(preco);
						produto.setCategoria(jcbCategoria.getSelectedItem()
								.toString());
						controladorProduto.salvar(produto);
						reiniciar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				} else {
					habilitaCamposCadastro();
					i = 1;
				}
			}
		});

		jbtConsultar.addActionListener(new ActionListener() {
			int i = 0;

			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				habilitaCamposConsulta();
				if (i == 1 && !(jtfId.getText().isEmpty())) {
					try {
						produto = controladorProduto.consultar(Integer
								.parseInt(jtfId.getText()));
						if (produto.getNome() != null) {
							habilitaCamposAlteracao();
							i = 0;
						} else {
							JOptionPane.showMessageDialog(null,
									"Nao encontrado");
						}
					} catch (NumberFormatException e1) {
						System.out.println("Formato do numero invalido");
					} catch (SQLException e1) {
						System.out.println("Falha: " + e1);
					}
					jtfNome.setText(produto.getNome());
					jtfPreco.setText(String.valueOf(produto.getPreco()
							.setScale(2, RoundingMode.HALF_EVEN)));
					jcbCategoria.setSelectedItem(produto.getCategoria());
					jbtLimpar.setEnabled(false);
				} else {
					habilitaCamposConsulta();
					i = 1;
				}
			}
		});

		jbtAlterar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Produto produto = new Produto();

					BigDecimal preco = new BigDecimal(jtfPreco.getText());

					f.FormatarBigDecimal(preco);

					produto.setId(Integer.parseInt(jtfId.getText()));
					produto.setNome(jtfNome.getText());
					produto.setPreco(preco.setScale(2, RoundingMode.HALF_EVEN));
					produto.setCategoria(jcbCategoria.getSelectedItem()
							.toString());

					System.out.println("ID digitado: " + jtfId.getText());
					System.out.println("Nome digitado: " + jtfNome.getText());
					System.out.println("Categoria selecionada: "
							+ jcbCategoria.getSelectedItem().toString());
					System.out.println("Preco digitado: "
							+ preco.setScale(2, RoundingMode.HALF_EVEN));

					jtfPreco.setText(preco.setScale(2, RoundingMode.HALF_EVEN)
							.toString());

					controladorProduto.alterar(produto);

					reiniciar();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		jbtMostrarTudo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new TelaMostraProduto();
			}
		});

		jbtLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				limparCampos();
				desabilitaCampos();
			}
		});

		jbtFechar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fecharTela();
			}
		});

		jbtExcluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				controladorProduto.excluir(Integer.parseInt(jtfId.getText()
						.toString()));
				limparCampos();
				desabilitaCampos();
			}
		});
	}
}
