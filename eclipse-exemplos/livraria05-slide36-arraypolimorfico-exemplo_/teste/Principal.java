package teste;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// Inicializa os atribuots dos objetos direto no construtor.
		// Outra opcao seria criar um metodo cadastrar nas classes Livro, Cd e Dvd.
		Livro l1 = new Livro("Titulo do livro", "Suspense", 10, 80.00, 80.00,"Nome do autor", "Nome da Editora", "6 edicao"); 
		Cd c1 = new Cd("Titulo do CD", "Rock", 20, 40.00, 40.00, "Nome do artista", "Nome da gravadora", "Pais de origem");
		Dvd d1 = new Dvd("Titulo do DVD", "Terror", 15, 120.00, 120.00, "Nome do diretor", "Tempo de duracao", "18 anos");

		GerenciadorEstoque gerenciador = new GerenciadorEstoque();
		
		// Instancia um objeto do tipo GerenciadorEstoque
		// Repare que apesar da classe GerenciadorEstoque não conter atributos e não ter um contrutor implementado
		// eh possivel chamar um construtor padrão
		GerenciadorEstoque controle = new GerenciadorEstoque();

		// Declaracao e inicializacao das variaveis
		int opProd, opOperacao = 0;

		// Looping para controle do menu de produtos
		do {

			// menu de produtos
			opProd = Integer.parseInt(JOptionPane.showInputDialog("Digite o produto desejado: \n1 - Livro \n2 - CD \n3 - DVD \n4 - Total em estoque \n5 - Criar relacao de produtos \n0 - Sair"));

				// Looping para controle do menu de opcoes
				do {

					// Se a opcao escolhida foi Sair, Total em estoque ou Criar relacao de produtos
					// nao mostra o menu de opcoes
					if (opProd != 0 && opProd != 4 && opProd != 5){
						// menu de opcoes de acordo com string montada acima
						if (opProd ==3){
							opOperacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operacao desejada: \n1 - Consultar \n2 - Comprar \n3 - Vender \n4 - Exibir Preço em Dolar \n5 - Encomendas \n0 - Voltar ao menu de produtos"));
						}
						else
						{
							opOperacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operacao desejada: \n1 - Consultar \n2 - Comprar \n3 - Vender \n4 - Reajustar preco \n5 - Encomendas \n0 - Voltar ao menu de produtos"));
						}
						}
					}
					
					// Desvio condicional para definicao do produto escolhido
					switch(opProd){

					case 1: // Livro

						// Desvio condicional para definicao da operacao escolhida
						if(opOperacao == 1){ // Consultar
							l1.consultar();
						}

						if(opOperacao == 2){ // Comprar
							// Realiza chamada ao metodo comprar e passa o objeto l1 por parametro 
							controle.comprar(l1);
						}

						if(opOperacao == 3){ // Vender
							// Realiza chamada ao metodo vender e passa o objeto l1 por parametro
							controle.vender(l1);
						}				

						if(opOperacao == 4){ // Reajuste
							l1.calcularPrecoVenda();
						}				

						if(opOperacao == 5){ // Encomenda de livros
							// Realiza chamada ao metodo encomendar e passa o objeto l1 por parametro
							controle.encomendar(l1);
						}				

						break;

					case 2: // CD

						if(opOperacao == 1){ // Consultar
							c1.consultar();
						}

						if(opOperacao == 2){ // Comprar
							// Realiza chamada ao metodo comprar e passa o objeto c1 por parametro
							controle.comprar(c1);
						}

						if(opOperacao == 3){ // Vender
							// Realiza chamada ao metodo vender e passa o objeto c1 por parametro
							controle.vender(c1);
						}				

						if(opOperacao == 4){ // Reajuste
							c1.calcularPrecoVenda();
						}				

						if(opOperacao == 5){ // Encomenda de livros
							// Realiza chamada ao metodo encomendar e passa o objeto c1 por parametro
							controle.encomendar(c1);
						}				

						break;

					case 3: // DVD

						if(opOperacao == 1){ // Consultar
							d1.consultar();
						}

						if(opOperacao == 2){ // Comprar
							// Realiza chamada ao metodo comprar e passa o objeto d1 por parametro
							controle.comprar(d1);
						}

						if(opOperacao == 3){ // Vender
							// Realiza chamada ao metodo vender e passa o objeto d1 por parametro
							controle.vender(d1);
						}				

						if(opOperacao == 4){ // Reajuste
							double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotacao do dolar:"));
							d1.calcularPrecoVenda(dolar);
						}				

						if(opOperacao == 5){ // Encomenda de livros
							// Realiza chamada ao metodo encomendar e passa o objeto d1 por parametro
							controle.encomendar(d1);
						}				

						break;			

					case 4: // Total em estoque
					
						// Declaracao de um array do tipo Produto
						Produto prod[] = new Produto[3]; 
						// Atribuicao dos objetos no array
						prod[0] = l1; // Objeto do tipo Livro
						prod[1] = c1; // Objeto do tipo Cd
						prod[2] = d1; // Objeto do tipo Dvd 
						// Chamada do metodo e passagem do array por parametro
						gerenciador.totalizadorEstoque(prod);
						
						break;			
					

					case 5: // Criar relacao de produtos
						gerenciador.criarListaProdutos();
					break;
					
					}
				}while(opOperacao != 0);

		}while(opProd != 0);




	}

}
