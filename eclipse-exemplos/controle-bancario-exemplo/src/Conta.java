import javax.swing.*;

public class Conta {

	// atributos
	private int numero;
	private String nome;
	private double saldo;

	// construtor sem valor 
	public Conta(){
		
	}
	//construtor com valores 
	public Conta(int numero, String nome,double saldo){
		this.saldo = saldo;
	}
	
	
	// getters e setters

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//metodos  comuns
		
	public void depositar(double valor){
		
		this.setSaldo(this.getSaldo()+ valor);
		JOptionPane.showMessageDialog(null,"Valor creditado com sucesso!!! ");

	}

	public void sacar(double valor){
	
		if (this.getSaldo()>= valor){
			this.setSaldo(this.getSaldo() - valor );
			JOptionPane.showMessageDialog(null,"Valor debitado com sucesso!!! ");
		}else{ 
			
			JOptionPane.showMessageDialog(null,"Saldo insuficiente !!!");

		}

	}



}


