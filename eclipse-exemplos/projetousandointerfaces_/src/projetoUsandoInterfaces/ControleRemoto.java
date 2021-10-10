package projetoUsandoInterfaces;

public interface ControleRemoto {
	
	/*
	* Perceba que apenas a assinatura dos m�todos est�o aqui.
	* E cada m�todo termina com um ponto-e-v�rgula (;)
	*/

	void mudarCanal(int canal);
	void aumentarVolume (int taxa);
	void diminuirVolume (int taxa);
	boolean ligar();
	boolean desligar();
	

}
