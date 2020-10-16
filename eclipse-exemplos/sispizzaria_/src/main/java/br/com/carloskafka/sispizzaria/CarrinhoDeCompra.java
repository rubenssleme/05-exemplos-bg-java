package br.com.carloskafka.sispizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarrinhoDeCompra {
	private List<Pizza> pizzas;

	public CarrinhoDeCompra() {
		pizzas = new ArrayList<Pizza>();
	}
	
	public int obterQuantidadePizzas() {
		return pizzas.size();
	}

	public void adicionarPizza(Pizza pizza) {
		if (pizza.possuiIngredientes()) {
			pizzas.add(pizza);
		} else {
			System.out.println("A pizza nao possui nenhum ingrediente.");
		}
	}

	public int obterTotalPizzas() {
		return pizzas.stream().mapToInt(pizza -> pizza.getPreco()).sum();
	}

	public int obterQuantidadeDeIngredientesGastos() {
		return Pizza.obterQuantidadeIngredientesGastos();
	}

	public Map<String, Integer> obterQuantidadeTotalPorIngrediente() {
		Map<String, Integer> ingredientes = new HashMap<String, Integer>();

		for (String ingredienteObtido : obterIngredientesSemRepeticao()) {
			int ocorrenciasPorIngredienteObtido = pizzas.stream()
					.filter(Pizza.obterFiltroPorIngrediente(ingredienteObtido)).collect(Collectors.toList()).size();

			ingredientes.put(ingredienteObtido, ocorrenciasPorIngredienteObtido);
		}

		return ingredientes;
	}

	private List<String> obterIngredientesSemRepeticao() {
		return pizzas.stream().flatMap(pizza -> pizza.getIngredientes().stream()).distinct().sorted()
				.collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompra [pizzas=" + pizzas + "]";
	}

}
