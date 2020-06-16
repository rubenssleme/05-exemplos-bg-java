// Implementacao da exception "personalizada" que trata a 
// entrada de valores negativos extendendo da classe Exception

public class MovimentoNegativo extends Exception {

	// O método toString é o padrão para emissão de mensagens
	public String toString(){
		return "O valor nao pode ser negativo!";
	}

}
