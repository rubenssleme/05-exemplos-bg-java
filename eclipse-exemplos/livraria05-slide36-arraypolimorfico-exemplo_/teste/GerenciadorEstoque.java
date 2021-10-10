package teste;
import javax.swing.*;

public class GerenciadorEstoque {

	private double valorTotalEstoque;

	public GerenciadorEstoque() {
		this(0);
	}

	public GerenciadorEstoque(double valorTotalEstoque) {
		this.valorTotalEstoque = valorTotalEstoque;
	}

	public double getValorTotalEstoque() {
		return valorTotalEstoque;
	}

	public void setValorTotalEstoque(double valorTotalEstoque) {
		this.valorTotalEstoque = valorTotalEstoque;
	}

	// Recebe um objeto do tipo Produto por parametro
	public void comprar(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior:" + prod.getEstoqueDisponivel() + "\nQuantidade comprada:" + quantidade  + "\nEstoque atual:" + (prod.getEstoqueDisponivel() + quantidade));
		// Atribui o resultado da soma ao atributo estoqueDisponivel de prod
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel() + quantidade);
	}

	// Recebe a quantidade vendida por parametro
	public void vender(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior:" + prod.getEstoqueDisponivel() + "\nQuantidade vendida:" + quantidade  + "\nEstoque atual:" + (prod.getEstoqueDisponivel() - quantidade));
		// Atribui o resultado da subtracao do atributo estoqueDisponivel de prod		
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel() - quantidade);		
	}

	// Recebe um parametro do tipo Livro, ou seja, um objeto do tipo livro
	public void encomendar(Produto prod){
		// Lê a quantidade desejada
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros desejada: "));
		// Verifica se há estoque disponivel para a encomenda (no objeto pLivro)
		if(qtde <= prod.getEstoqueDisponivel()){
			JOptionPane.showMessageDialog(null, "Encomenda do " + prod.getClass().getName() + " " + prod.getDescricao() + " realizada com pronta entrega!");
		}else{
			JOptionPane.showMessageDialog(null, "Encomenda do " + prod.getClass().getName() + " " + prod.getDescricao() + " em analise, realizando pedido com fornecedores!");			
		}
	}

	// Metodo implementado para testar passagem de array por parametro
	public void totalizadorEstoque(Produto produtos[]){
		// Zera o valor total de estoque (para nao acumular com a totalizacao anterior)
		this.setValorTotalEstoque(0);
		// Percorre o array recebido por parametro do indice zero até seu tamanho total
		for (int i = 0; i <= produtos.length - 1; i++) {
			// Apresenta o produto e o preco de custo analizado
			JOptionPane.showMessageDialog(null, "Produto: " + produtos[i].getClass().getName() + "\nPreço de custo: " + produtos[i].getPrecoCusto() + "\nQuantidade: " + produtos[i].getEstoqueDisponivel());
			// Soma em valorTotalEstoque
			this.setValorTotalEstoque(this.valorTotalEstoque += ( produtos[i].getPrecoCusto() * produtos[i].getEstoqueDisponivel() ));			
		}
		// Apresenta o total
		JOptionPane.showMessageDialog(null, "Total em estoque: " + this.getValorTotalEstoque());		
	}


	public void criarListaProdutos(){
		// Declaracao e inicializacao de variaveis de controle de menu e indice do array
		int opProd = 0, indice = 0;
		// Declara e inicializa como nulo um objeto (uma referencia) do tipo Produto
		Produto prod = null;
		// Intancia um array do tipo Produto de 10 posicoes chamado produtos
		Produto produtos[] = new Produto[10];

		do{
			// Apresenta menu de produtos
			opProd = Integer.parseInt(JOptionPane.showInputDialog("Digite o produto desejado: \n1 - Livro \n2 - CD \n3 - DVD \n0 - Listar produtos cadastrados"));

			// Verifica o produto escolhido, instancia um objeto de acordo com a opcao
			// e atribui sua referencia ao objeto prod
			if(opProd == 1){
				prod = new Livro();
			}
			if(opProd == 2){
				prod = new Cd();
			}
			if(opProd == 3){
				prod = new Dvd();
			}
			// Se não foi escolhida a opcao Listar produtos cadastrados
			if(opProd !=0){
				// Lê a descricao o estoque disponivel e o preco de custo do objeto instanciado
				prod.setDescricao(JOptionPane.showInputDialog("Digite a descrição: "));
				prod.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque disponivel: ")));
				prod.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo: ")));
				// Atribui o objeto instanciado no array produtos
				produtos[indice] = prod;
				// Incrementa do indice
				indice++;
				// Destroi o objeto (limpa a referencia ) 
				prod = null;
			}
		// Enquanto a opcao Lista produtos cadastrados não for escolhida
		// repete as operacoes do looping
		}while(opProd != 0);
		
		// Apresenta os produtos armazenados no array produtos utilizando o metodo mostrarListaProdutos
		JOptionPane.showMessageDialog(null, mostrarListaProdutos(indice,produtos) + "\n");

	}

	// Metodo privado para leitura do array produtos
	// recebe a quantidade de itens lidos (tamanho) e o array produtos 
	private String mostrarListaProdutos(int tamanho,Produto[] prod){
		// Monta uma string comecando com um cabecalho
		String relacao="Relação de Produtos Cadastrados\n";
		// e concatenando cada um dos produtos armazenados no array
		for(int i = 0;i < tamanho; i++){
			relacao = relacao + "\n" + String.valueOf(i) + " - Tipo: " + prod[i].getClass().getName() + " - Descricao: " + prod[i].getDescricao() + " - Estoque: " + prod[i].getEstoqueDisponivel() + " - Preco custo: " + prod[i].getPrecoCusto();
		}
		// Retorna uma string com todos os produtos contidos no array
		return relacao;
	}



}
