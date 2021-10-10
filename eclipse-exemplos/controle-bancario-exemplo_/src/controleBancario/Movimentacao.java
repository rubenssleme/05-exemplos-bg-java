package controleBancario;

public class Movimentacao {
	
	


	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(10.00);
		ContaPoupanca cp1 = new ContaPoupanca(50.00); 
		GerenciadorContas gerenciador = new GerenciadorContas();
				
		// Declaracao de um array do tipo Produto
		Conta conta[] = new Conta[2]; 
		// Atribuicao dos objetos no array
		conta[0] = cc1; // Objeto do tipo Conta Corrente
		conta[1] = cp1; // Objeto do tipo Conta Poupança
		 
		// Chamada do metodo e passagem do array por parametro
		//gerenciador.totalizadorEstoque(prod);
		gerenciador.totalizarSaldo(conta);
		
		
		
	}

}
