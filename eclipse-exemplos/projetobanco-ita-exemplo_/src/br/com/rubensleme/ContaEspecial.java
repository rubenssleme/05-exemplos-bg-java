package br.com.rubensleme;

public class ContaEspecial extends ContaCorrente{

	protected int limite;

	public ContaEspecial(int limite) {
		this.limite = limite;	
	}

	public int  sacar(int valor){
		if(valor > getSaldo() + limite){
			return 0;
		}else{
			 valor -= getSaldo();
			return valor;
		}
	}
	
}
