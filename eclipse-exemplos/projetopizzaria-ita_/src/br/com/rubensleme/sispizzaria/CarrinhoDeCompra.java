package br.com.rubensleme.sispizzaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

import br.com.rubensleme.sispizzaria.utilitario.Mensagem;

public class CarrinhoDeCompra {
	List<Pizza> pizzas; 
	
	 public CarrinhoDeCompra(){
		 pizzas = new ArrayList<Pizza>();
	 }
	
	
	public int obterQuantidadePizzas(){
		return pizzas.size();
	}
	
	public void adicionarPizza(Pizza pizza){
		if(pizza.possuiIngredientes()){
			pizzas.add(pizza);
		}else {
			Mensagem.exibirMensagem("Pizza não possui ingrediente!! ");
		}
	}
	
	public double obterTotalPizzas(){
		return pizzas.stream().mapToDouble(pizza -> pizza.getPreco()).sum();
		
	}
	public int obterQuantidadeDeIngredientesGastos(){
		return Pizza.obterQuantidadeIngredientesGastos();
	}
	
	public Map<String, Integer> obterQuantidadeTotalPorIngrediente(){
		Map<String, Integer> ingredientes = new HashMap<String, Integer>();
		
		for(String ingredienteObtido : obterIngredientesSemRepeticao()){
			int ocorrenciaPorIngredienteObtido = pizzas.stream()
					.filter(Pizza.obterFiltroPorIngrediente(ingredienteObtido)).collect(Collectors.toList()).size();
			ingredientes.put(ingredienteObtido, ocorrenciaPorIngredienteObtido);
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
