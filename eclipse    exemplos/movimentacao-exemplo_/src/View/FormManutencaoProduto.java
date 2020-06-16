package View;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.*;

@SuppressWarnings("serial")
public class FormManutencaoProduto extends FormPaiManutencao {
	JLabel lCodigo,lDescricao,lQuantidade,lVlUnitVenda,lVlUnitCompra;
	JTextField tFCodigo,tFDescricao,tFQuantidade,tFVlUnitCompra,tFVlUnitVenda;

	public FormManutencaoProduto(Frame owner, String title,boolean modal) {
		
		super(owner,title,modal);
		Container tela = getContentPane();
		setLayout(null);

		lCodigo = new JLabel("Código: ");
		lCodigo.setBounds(70,50,100,20);
		tFCodigo = new JTextField(50);
		tFCodigo.setBounds(120, 50, 50, 20);

		lDescricao = new JLabel("Descrição: ");
		lDescricao.setBounds(70,100,380,20);
		tFDescricao = new JTextField(50);
		tFDescricao.setBounds(140, 100, 380, 20);

		lQuantidade = new JLabel("Quantidade: ");
		lQuantidade.setBounds(70,150,80,20);
		tFQuantidade = new JTextField(50);
		tFQuantidade.setBounds(150, 150, 100, 20);
		
		lVlUnitCompra = new JLabel("Valor Compra: ");
		lVlUnitCompra.setBounds(70,200,100,20);
		tFVlUnitCompra = new JTextField(50);
		tFVlUnitCompra.setBounds(160, 200, 100, 20);

		lVlUnitVenda = new JLabel("Valor Venda: ");
		lVlUnitVenda.setBounds(70,250,100,20);
		tFVlUnitVenda = new JTextField(50);
		tFVlUnitVenda.setBounds(150, 250, 100, 20);
		
		posicionaBotoes(300,100,20,20,10);
		
		tela.add(lCodigo);
		tela.add(tFCodigo);
		tela.add(lDescricao);
		tela.add(tFDescricao);
		tela.add(lQuantidade);
		tela.add(tFQuantidade);
		tela.add(lVlUnitCompra);
		tela.add(tFVlUnitCompra);
		tela.add(lVlUnitVenda);
		tela.add(tFVlUnitVenda);
		tela.add(bInclusao);
		tela.add(bAlteracao);
		tela.add(bExclusao);
		tela.add(bConsulta);
		tela.add(bSalvar);
		tela.add(bCancelar);	
		
		desabilitaCampos();
		habilitaBotoes();
		setSize(710, 380);
		setResizable(false);
		setLocationRelativeTo(null);

	}
	
	public void habilitaCampos(){
		tFCodigo.setEnabled(true);
		tFDescricao.setEnabled(true);
		tFQuantidade.setEnabled(true);
		tFVlUnitCompra.setEnabled(true);
		tFVlUnitVenda.setEnabled(true);
	}
	
	public void desabilitaCampos(){
		tFCodigo.setEnabled(false);
		tFDescricao.setEnabled(false);
		tFQuantidade.setEnabled(false);
		tFVlUnitCompra.setEnabled(false);
		tFVlUnitVenda.setEnabled(false);;
	}
	
	public void limpaCampos(){
		tFCodigo.setText("");
		tFDescricao.setText("");
		tFQuantidade.setText("");
		tFVlUnitCompra.setText("");
		tFVlUnitVenda.setText("");
	}

	public void acaoAlteracao() {
		
	}

	public void acaoConsulta() {
		
	}

	public void acaoExclusao() {
		
	}

	public void acaoInclusao() {
		
	}

	public void posicionaFocoPrimeiro() {
		tFCodigo.requestFocus();
	}
}
