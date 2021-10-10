package View;
import javax.swing.*;

import Controller.GerenciadorUsuario;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FormMenu extends JFrame {
	
	
	GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
	
	
	JMenuBar barra;
	JMenu manutencao,movimentacao;
	JMenuItem cliente,fornecedor,produto,usuario,compra,venda,sair;

	public FormMenu(){
	
		super("Sistema de Controle de Vendas");
		Container tela = getContentPane();
		tela.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		barra = new JMenuBar();
		setJMenuBar(barra);
		
		manutencao = new JMenu("Manutenção");
		movimentacao = new JMenu("Movimentação");
		cliente = new JMenuItem("Cliente");
		cliente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FormManutencaoCliente form = new FormManutencaoCliente(null, "Manutenção de Clientes.", true);
				form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				form.setVisible(true);
				}
		});
		
		fornecedor = new JMenuItem("Fornecedor");
		fornecedor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FormManutencaoFornecedor form = new FormManutencaoFornecedor(null, "Manutenção de Fornecedores.", true);
				form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				form.setVisible(true);
				}
		});
		
		
		produto = new JMenuItem("Produto");
		produto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FormManutencaoProduto form = new FormManutencaoProduto(null, "Manutenção de Produtos.", true);
				form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				form.setVisible(true);
				}
		});

		
		usuario = new JMenuItem("Usuário");
		usuario.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FormManutencaoUsuario form = new FormManutencaoUsuario(null, "Manutenção de Usuarios.", true);
				form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				form.setVisible(true);
				}
		});
		
		compra = new JMenuItem("Compra");
		venda = new JMenuItem("Venda");

		sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int resposta;
				resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Mensagem do Programa",JOptionPane.YES_NO_OPTION);
				if (resposta == 0)
					System.exit(0);
			}
		});
		manutencao.add(cliente);
		manutencao.add(fornecedor);
		manutencao.add(produto);
		manutencao.addSeparator();
		manutencao.add(usuario);
		movimentacao.add(compra);
		movimentacao.addSeparator();
		movimentacao.add(venda);
		barra.add(manutencao);
		barra.add(movimentacao);
		barra.add(sair);
		setVisible(true);
	}
}
