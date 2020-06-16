package br.com.carloskafka.sispizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Pizza {
	private static int quantidadeIngredientesGastos;
	private List<String> ingredientes;

	public Pizza() {
		ingredientes = new ArrayList<>();
	}

	public static void contabilizaIngrediente() {
		quantidadeIngredientesGastos++;
	}

	public void adicionarIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente();
	}

	public static int obterQuantidadeIngredientesGastos() {
		return quantidadeIngredientesGastos;
	}

	public int getPreco() {
		int quantidade = obterQuantidadeIngredientes();
		return quantidade <= 2 ? 15 : quantidade <= 5 ? 20 : 23;
	}

	public boolean possuiIngredientes() {
		return obterQuantidadeIngredientes() != 0;
	}

	private int obterQuantidadeIngredientes() {
		return ingredientes.size();
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public static Predicate<? super Pizza> obterFiltroPorIngrediente(String ingredienteObtido) {
		return pizza -> pizza.getIngredientes().contains(ingredienteObtido);
	}
	
	@Override
	public String toString() {
		return "Pizza [ingredientes=" + ingredientes + "]";
	}

}
