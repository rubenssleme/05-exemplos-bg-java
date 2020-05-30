
public class Concatenacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//String valor = "Uma" + " " + "aula" + " " + "java";
		String valor = "";
		valor = valor.concat("Uma");
		valor = valor.concat(" ");
		valor = valor.concat("aula");
		valor = valor.concat(" ");
		valor = valor.concat("java");
				
		System.out.println(valor);
		
		StringBuilder valor2 = new StringBuilder();
		valor2.append("Uma");
		valor2.append(" ");
		valor2.append("aula");
		valor2.append(" ");
		valor2.append("java");
		
		StringBuilder valor3 = new StringBuilder();
		valor3.append(valor2.toString());
		valor3.append(valor);
		
		System.out.println(valor2);
	}

}
