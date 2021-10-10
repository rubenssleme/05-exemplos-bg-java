package br.com.carloskafka.sispizzaria;

import java.util.Map;

import br.com.carloskafka.sispizzaria.utilitario.Mensagem;

public class Principal {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();

		pizza.adicionarIngrediente("Catupiry");
		pizza.adicionarIngrediente("Mussarela");

		Pizza pizza2 = new Pizza();

		pizza2.adicionarIngrediente("Catupiry");
		pizza2.adicionarIngrediente("Mussarela");
		pizza2.adicionarIngrediente("Chocolate");
		pizza2.adicionarIngrediente("Queijo");

		Pizza pizza3 = new Pizza();

		pizza3.adicionarIngrediente("Catupiry");
		pizza3.adicionarIngrediente("Mussarela");
		pizza3.adicionarIngrediente("Presunto");
		pizza3.adicionarIngrediente("Queijo");
		pizza3.adicionarIngrediente("Morango");
		pizza3.adicionarIngrediente("Azeitona");

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

		carrinhoDeCompra.adicionarPizza(pizza);
		carrinhoDeCompra.adicionarPizza(pizza2);
		carrinhoDeCompra.adicionarPizza(pizza3);

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
		Mensagem.exibirMensagem("Preço Total de Pizzas: R$ " + carrinhoDeCompra.obterTotalPizzas());
		Mensagem.exibirMensagem("================================================");
	}
}
