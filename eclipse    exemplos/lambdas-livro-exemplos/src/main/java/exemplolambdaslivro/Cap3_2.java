package exemplolambdaslivro;

//temos uma interface de Validador<T>, com um método que valida(T t) e que devolve boolean:
//@FunctionalInterface - Podemos marcar uma interface como funcional explicitamente
interface Validador<T> {
	boolean valida(T t);
}

class Cap3_2 {

//Exemplo 01 Implementação classe anônima
	void teste() {
		Validador<String> validadorCEP = new Validador<String>() {
			@Override
			public boolean valida(String t) {
				return t.matches("[0-09]{5}-[0-9]{3}");
			}

		};
	}
//Exemplo 01 Implementação classe anônima
 void teste2() {
	 Validador<String> validadorCEP = t ->{
		return t.matches("[0-09]{5}-[0-9]{3}");
	 };
 }
 
//Exemplo 03 Implementação classe anônima
 void teste3() {
	 Validador<String> validadorCEP = t-> t.matches("[0-09]{5}-[0-9]{3}");
 }
	

}
