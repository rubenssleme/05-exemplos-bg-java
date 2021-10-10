// Implementacao da exception "personalizada" que trata a 
// entrada de valores negativos extendendo da classe Exception

public class MovimentoNegativo extends Exception {

	// O m�todo toString � o padr�o para emiss�o de mensagens
	public String toString(){
		return "O valor nao pode ser negativo!";
	}

}
