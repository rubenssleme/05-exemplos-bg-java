package Controller;

import Model.Temperatura;

public class Gerenciadortemperatura {
	private Temperatura retorno = new Temperatura();
	
	public Temperatura convertCF(double valor){
		//retorno = new Temperatura();
		retorno.setNome("Fahrenheit");
		retorno.setValor((valor*1.8)+32);
		return retorno;
	}
	public String retorna(){
		return "olá";
	}
	
}
