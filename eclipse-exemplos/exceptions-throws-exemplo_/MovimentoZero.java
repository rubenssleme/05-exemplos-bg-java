// Implementacao da exception "personalizada" que trata a 
// entrada de valores zerados extendendo da classe Excepton

public class MovimentoZero extends Exception {
	
	public String toString(){
		// O metodo toString eh o padrao para emissao de mensagens				
		return "O valor nao pode ser zero!";
	}
}



