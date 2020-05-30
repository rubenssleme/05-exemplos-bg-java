package br.ufscar.si.catalogo;

import javax.swing.JOptionPane;

/**
 * @author Ana Paula
 */

public class Principal1 {

	public static void main(String[] args) {
		CD cd = null;
		DVD dvd = null;
		Jogo jogo = null; 

		int opPro, opOperacao = 0;
		do{ 
			opPro =Integer.parseInt(JOptionPane.showInputDialog("Escolha um Opção \n1- Cadastrar\n2- Listar\n0- Sair"));
			if ((opPro == 1)||(opPro == 2)){ 
				do{
					String titulo;
					int ano;
					opOperacao =Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção: \n1- CD \n2- DVD \n3- Jogo \n4- Voltar Menu"));
					switch(opPro){ // Abertura da estrutura de switch-case
					case 1: //Escolha da operação Cadastrar

						if (opOperacao == 1){//Cadastrar CD
							titulo = Mensagem.exibirPergunta("Digite o Titulo");
							ano  = Integer.parseInt((Mensagem.exibirPergunta("Digite o Ano")));
							String artista = Mensagem.exibirPergunta("Digite o Artista");
							String faixa = Mensagem.exibirPergunta("Digite a faixa");
							int duracao = Integer.parseInt((Mensagem.exibirPergunta("Digite a duração")));
							cd = new CD(titulo,ano,artista);
							cd.adicionaFaixa(faixa, duracao);
						}else if (opOperacao == 2){//Cadastrar DVD
							String artista = Mensagem.exibirPergunta("Digite o Artista");
							String diretor = Mensagem.exibirPergunta("Digite o Diretor");
							String papel = Mensagem.exibirPergunta("Digite o Papel");
							titulo = Mensagem.exibirPergunta("Digite o Titulo");
							ano  = Integer.parseInt((Mensagem.exibirPergunta("Digite o Ano")));
							dvd = new DVD(titulo,ano,diretor);
							dvd.adicionaArtista(artista, papel);
						}else if (opOperacao == 3){//Cadastrar Jogo
							String genero = Mensagem.exibirPergunta("Digite o Genero");
							String artista = Mensagem.exibirPergunta("Digite o Artista");
							titulo = Mensagem.exibirPergunta("Digite o Titulo");
							ano  = Integer.parseInt((Mensagem.exibirPergunta("Digite o Ano")));
							jogo = new Jogo(titulo,ano);
							jogo.adicionaGenero(genero);
						}
						break;

					case 2: //Escolha da operação Listar

						if (opOperacao == 1){//Listar CD
							
							cd.imprimeFichas();

						}if (opOperacao == 2){//Listar DVD
							
							dvd.imprimeFichas();
						}
						if (opOperacao == 3){//Listar Jogos
							
							jogo.imprimeFichas();
						}

						break;

					case 4:
						//JOptionPane.showMessageDialog(null,"Obrigado por usar o catalogo de midias");
						break;
					} 

				}while(opOperacao != 4);
			} else if(opPro == 2){


			}else if (opPro == 3){ // Totaliza Contas

				// Declaracao de um array do tipo Produto
				//					Conta cont[] = new Conta[2]; 
				// Atribuicao dos objetos no array
				//					cont[0] = cc1; // Objeto do tipo conta corrente
				//					cont[1] = cp1; // Objeto do tipo conta poupança

				// Chamada do metodo e passagem do array por parametro
				//gerenciador.totalizadorEstoque(prod);
				//					gerenciador.totalizarSaldo(cont);


				//JOptionPane.showMessageDialog(null , "Total dos Saldos:" + String.valueOf(cont.getSaldoTotal()));
			}

		}while(opPro != 0);
		JOptionPane.showMessageDialog(null,"Obrigado por usar o catalogo de midias");
	}
}

