package View;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")


// Formulario abstrato modelo para todos os formularios de manutenção
// * Definição de componentes e metodos comuns a todos os forms de manutenção

public abstract class FormPaiManutencao extends JDialog{ // Herda de JDialog para ser usado como modal

	public JButton bInclusao,bAlteracao,bExclusao,bConsulta,bSalvar,bCancelar;
	private String operacao;
	
	public FormPaiManutencao(Frame owner, String title,boolean modal){
		
		super(owner,title,modal);
		
		// Definição do botões comuns 
		
		bInclusao = new JButton("Inclusão");
		bInclusao.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						setOperacao("Inclusão");
						habilitaCampos();
						desabilitaBotoes();
						posicionaFocoPrimeiro();
					}
				}
		);

		bAlteracao = new JButton("Alteração");
		bAlteracao.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						setOperacao("Alteração");
						habilitaCampos();
						desabilitaBotoes();
						posicionaFocoPrimeiro();
					}
				}
		);
		
		bExclusao = new JButton("Exclusão");
		bExclusao.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						int resposta;
						resposta = JOptionPane.showConfirmDialog(null,"Confirma a Exclusão ?","Atenção.",JOptionPane.YES_NO_OPTION);
						if (resposta == 0) {
							acaoExclusao();
							desabilitaCampos();
							habilitaBotoes();
						}
					}
				}
		);

		bConsulta = new JButton("Consulta");
		bConsulta.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						acaoConsulta();
					}
				}
		);
		
		bSalvar = new JButton("Salvar");
		bSalvar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						int resposta;
						resposta = JOptionPane.showConfirmDialog(null,"Confirma a "+operacao+" ?","Confirmação.",JOptionPane.YES_NO_OPTION);
						if (resposta == 0) {
							if (operacao.equals("Inclusão")){
								acaoInclusao();
								limpaCampos();
								posicionaFocoPrimeiro();
							}
							else {
								if (operacao.equals("Alteração"))
									acaoAlteracao();
								    desabilitaCampos();
								    habilitaBotoes();
							}
						}
					}
				}
		);

		bCancelar = new JButton("Cancelar");
		bCancelar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						int resposta;
						resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar ?","Atenção.",JOptionPane.YES_NO_OPTION);
						if (resposta == 0) {
							desabilitaCampos();
							habilitaBotoes();
						}
					}
				}
		);
	}
	
	// get e set do atributo operacao usado para distinguir entre inclusão e alteração
	
	public String getOperacao() {
		return operacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	// Metodos de comportamento do formulario
	
	public void posicionaBotoes(int linha,int largura,int altura, int margem, int distancia){
		bInclusao.setBounds(margem,linha,largura,altura);
		bAlteracao.setBounds(largura+distancia+margem,linha,largura,altura);
		bExclusao.setBounds(((largura+distancia)*2)+margem,linha,largura,altura);
		bConsulta.setBounds(((largura+distancia)*3)+margem,linha,largura,altura);
		bSalvar.setBounds(((largura+distancia)*4)+margem,linha,largura,altura);
		bCancelar.setBounds(((largura+distancia)*5)+margem,linha,largura,altura);
	}
	
	public void habilitaBotoes(){
		bInclusao.setEnabled(true);
		bAlteracao.setEnabled(true);
		bExclusao.setEnabled(true);
		bConsulta.setEnabled(true);

		bSalvar.setEnabled(false);
		bCancelar.setEnabled(false);
	}
	
	public void desabilitaBotoes(){
		bInclusao.setEnabled(false);
		bAlteracao.setEnabled(false);
		bExclusao.setEnabled(false);
		bConsulta.setEnabled(false);

		bSalvar.setEnabled(true);
		bCancelar.setEnabled(true);
	}
	
	// Metodos abstratos que serão sobrescritos nos formularios filhos
	
	public abstract void posicionaFocoPrimeiro();
	public abstract void habilitaCampos();	
	public abstract void desabilitaCampos();
	public abstract void limpaCampos();
	public abstract void acaoInclusao();
	public abstract void acaoAlteracao();
	public abstract void acaoExclusao();
	public abstract void acaoConsulta();
}