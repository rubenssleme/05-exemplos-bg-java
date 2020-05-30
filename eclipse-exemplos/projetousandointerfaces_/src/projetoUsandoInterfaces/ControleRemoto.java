package projetoUsandoInterfaces;

public interface ControleRemoto {
	
	/*
	* Perceba que apenas a assinatura dos métodos estão aqui.
	* E cada método termina com um ponto-e-vírgula (;)
	*/

	void mudarCanal(int canal);
	void aumentarVolume (int taxa);
	void diminuirVolume (int taxa);
	boolean ligar();
	boolean desligar();
	

}
