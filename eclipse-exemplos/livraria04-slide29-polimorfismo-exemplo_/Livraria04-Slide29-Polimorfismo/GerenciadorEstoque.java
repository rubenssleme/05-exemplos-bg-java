import javax.swing.*;

public class GerenciadorEstoque {

	
	// Recebe um objeto do tipo Produto por parametro
	public void comprar(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior de " + prod.getClass().getName() + ": " +
				                  prod.getEstoqueDisponivel() + "\nQuantidade comprada:" + quantidade + 
				                    "\nEstoque atual:" + (prod.getEstoqueDisponivel() + quantidade));
		// Atribui o resultado da soma ao atributo estoqueDisponivel de prod
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel() + quantidade);
	}
	
	// Recebe um objeto do tipo Produto por parametro
	public void vender(Produto prod){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Estoque anterior " + prod.getClass().getName() + ": " + 
				                prod.getEstoqueDisponivel() + "\nQuantidade vendida:" + quantidade + 
				                 "\nEstoque atual:" + (prod.getEstoqueDisponivel() - quantidade));
		// Atribui o resultado da subtracao do atributo estoqueDisponivel de prod		
		prod.setEstoqueDisponivel(prod.getEstoqueDisponivel() - quantidade);		
	}
	
	// Recebe um objeto do tipo Produto por parametro
	public void encomendar(Produto prod){
		// Lê a quantidade desejada
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de " + 
				                               prod.getClass().getName() + " desejada: "));
		// Verifica se há estoque disponivel para a encomenda do objeto desejado
		if(qtde <= prod.getEstoqueDisponivel()){
			JOptionPane.showMessageDialog(null, "Encomenda do " + prod.getClass().getName() + " - " + 
					                         prod.getDescricao() + " realizada com pronta entrega!");
		}else{
			JOptionPane.showMessageDialog(null, "Encomenda do " + prod.getClass().getName() + " - " + 
					       prod.getDescricao() + " em analise, realizando pedido com fornecedores!");			
		}
	}
	
}



