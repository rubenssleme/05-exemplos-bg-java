import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// Inicializa os atribuots dos objetos direto no construtor.
		// Outra opcao seria criar um metodo cadastrar nas classes Livro, Cd e Dvd.
		Livro l1 = new Livro("Titulo do livro", "Suspense", 10, 80.00, 80.00,"Nome do autor", "Nome da Editora", "6 edicao"); 
		Cd c1 = new Cd("Titulo do CD", "Rock", 20, 40.00, 40.00, "Nome do artista", "Nome da gravadora", "Pais de origem");
		Dvd d1 = new Dvd("Titulo do DVD", "Terror", 15, 120.00, 120.00, "Nome do diretor", "Tempo de duracao", "18 anos");

		// Declaracao e inicializacao das variaveis com um valor qualquer 
		// para leitura das opcoes
		int opProd, opOperacao = 0;

		// Looping para controle do menu de produtos
		do {

			// menu de produtos
			opProd = Integer.parseInt(JOptionPane.showInputDialog("Digite o produto desejado: \n1 - Livro \n2 - CD \n3 - DVD \n0 - Sair"));

			// Se a opcao escolhido foi Sair nao mostra o menu de opcoes
			if (opProd != 0){

				// Looping para controle do menu de opcoes
				do {

					// menu de opcoes
					opOperacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operacao desejada: \n1 - Consultar \n2 - Comprar \n3 - Vender \n4 - Reajustar preco \n0 - Voltar ao menu de produtos"));

					// Desvio condicional para definicao do produto escolhido
					switch(opProd){

					case 1: // Livro

						// Desvio condicional para definicao da operacao escolhida
						if(opOperacao == 1){ // Consultar
							l1.listarProduto();
						}

						if(opOperacao == 2){ // Comprar
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
							l1.comprar(quantidade);
						}

						if(opOperacao == 3){ // Vender
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
							l1.vender(quantidade);
						}				

						if(opOperacao == 4){ // Reajuste
							l1.calcularPrecoVenda();
						}				

						break;

					case 2: // CD

						if(opOperacao == 1){ // Consultar
							c1.listarProduto();
						}

						if(opOperacao == 2){ // Comprar
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
							c1.comprar(quantidade);
						}

						if(opOperacao == 3){ // Vender
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
							c1.vender(quantidade);
						}				

						if(opOperacao == 4){ // Reajuste
							c1.calcularPrecoVenda();
						}				

						break;

					case 3: // DVD

						if(opOperacao == 1){ // Consultar
							d1.listarProduto();
						}

						if(opOperacao == 2){ // Comprar
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
							d1.comprar(quantidade);
						}

						if(opOperacao == 3){ // Vender
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
							d1.vender(quantidade);
						}				

						if(opOperacao == 4){ // Reajuste
							double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotacao do dolar:"));
							d1.calcularPrecoVenda(dolar);
						}				
						break;			

					}

				}while(opOperacao != 0);

			}

		}while(opProd != 0);




	}

}
