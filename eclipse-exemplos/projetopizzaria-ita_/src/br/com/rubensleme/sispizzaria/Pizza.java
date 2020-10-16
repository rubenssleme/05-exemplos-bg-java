package br.com.rubensleme.sispizzaria;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class Pizza {
	private static int quantidadeIngredientesGastos = 0;
	/*private static Map<String,Integer> ingredientes  = new HashMap<String,Integer>();*/
	private List<String> ingredientes;


	public Pizza(){
		ingredientes = new ArrayList<>();
	}

	public static void contabilizaIngrediente(){
		quantidadeIngredientesGastos++;
	}
	
	public void adicionarIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente();
	}
	public static int obterQuantidadeIngredientesGastos() {
		return quantidadeIngredientesGastos;
		
	}

	public double getPreco(){
		double precoPizza = 0.0;
		if(quantidadeIngredientesGastos<=2){
			precoPizza = (15.0);
		}else if((quantidadeIngredientesGastos >= 3)&&(quantidadeIngredientesGastos <=5)){
			precoPizza = (20.0);
		}else if (quantidadeIngredientesGastos >5){
			precoPizza = (23.0);
		}
		return precoPizza;
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
	
	public static int zeraIngredientes(){
		
		return quantidadeIngredientesGastos = 0;
		
	}

	@Override
	public String toString() {
		return "Pizza [ingredientes=" + ingredientes + "]";
	}


}
