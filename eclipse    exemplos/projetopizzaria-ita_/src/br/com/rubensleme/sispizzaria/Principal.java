package br.com.rubensleme.sispizzaria;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.rubensleme.sispizzaria.utilitario.*;

public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		 
		pizza1.adicionarIngrediente("Queijo");
		pizza1.adicionarIngrediente("Tomate");
		
		
		Pizza pizza2 = new Pizza();
		
		pizza2.adicionarIngrediente("Presunto");
		pizza2.adicionarIngrediente("Mussarela");
		pizza2.adicionarIngrediente("Catupiry");
		pizza2.adicionarIngrediente("Catupiry");
	/*	
		Pizza pizza3 = new Pizza();
		
		pizza3.adicionarIngrediente("Azeitona");
		pizza3.adicionarIngrediente("Mussarela");
		pizza3.adicionarIngrediente("Catupiry");
		pizza3.adicionarIngrediente("Presunto");
		pizza3.adicionarIngrediente("Mussarela");
		pizza3.adicionarIngrediente("Chocolate");
		*/
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		
		carrinhoDeCompra.adicionarPizza(pizza1);
		carrinhoDeCompra.adicionarPizza(pizza2);
	//	carrinhoDeCompra.adicionarPizza(pizza3);
		
		Map<String, Integer> quantidadesTotaisPorIngredienteObtido = carrinhoDeCompra
				.obterQuantidadeTotalPorIngrediente();
		
		Mensagem.exibirMensagem("================================================");
		Mensagem.exibirMensagem("Total por Ingrediente no Carrinho");
		Mensagem.exibirMensagem("================================================");
		Mensagem.exibirMensagem(quantidadesTotaisPorIngredienteObtido, "Ingrediente", "Quantidade");
		
		int quantidadeDeIngredientesGastos = carrinhoDeCompra.obterQuantidadeDeIngredientesGastos();
		
		Mensagem.exibirMensagem("================================================");
		Mensagem.exibirMensagem("Quantidade de Ingredientes Gastos: " + quantidadeDeIngredientesGastos);
		Mensagem.exibirMensagem("Quantidade de Pizzas: " + carrinhoDeCompra.obterQuantidadePizzas());
		Mensagem.exibirMensagem("Preço Total das Pizzas: R$ " + carrinhoDeCompra.obterTotalPizzas());
		Mensagem.exibirMensagem("================================================");
		
		
		
		

	}

}
