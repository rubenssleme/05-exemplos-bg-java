package com.rubensleme.sisimc;

/**
 * @author rubens.leme
 *
 */
public class Principal {

	public static void main(String[] args) {
		// Instancia 1 - Paciente com Baixo peso grave.
		Paciente p = new Paciente(150.00,167.50);
		p.diagnostico();
		
		/*// Instancia 2 - Paciente com Peso Normal.
		Paciente p1 = new Paciente(45.00,167.50);
		p1.diagnostico();
			
		// Instancia 3 - Paciente com Obesidade grau III (obesidade mórbida).
		Paciente p2 = new Paciente(115.00,167.50);
		p2.calculaIMC();
		p2.diagnostico();
*/
	}

}
