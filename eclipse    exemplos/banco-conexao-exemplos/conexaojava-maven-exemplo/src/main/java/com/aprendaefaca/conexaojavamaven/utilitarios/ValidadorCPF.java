package com.aprendaefaca.conexaojavamaven.utilitarios;

public class ValidadorCPF {
	public void validaCPF(String cpf) {
		cpf = cpf.replace(".", "").replace("-", "").trim();
		int validar_Estado_CPF = cpf.charAt(9) - '0';

		if ((validar_Estado_CPF <= 9) && (cpf.length() == 11)
				&& !cpf.equals("00000000000") && !cpf.equals("11111111111")
				&& !cpf.equals("22222222222") && !cpf.equals("33333333333")
				&& !cpf.equals("44444444444") && !cpf.equals("55555555555")
				&& !cpf.equals("66666666666") && !cpf.equals("77777777777")
				&& !cpf.equals("88888888888") && !cpf.equals("99999999999")) {
			// C�lculo do Primeiro D�gito Verificador
			int pdv_multiplica_por_digito = 10; // pdv_multiplica_por_digito - i
												// = 2
			int pdv_total_multiplicacao = 0;

			int pdv_resto_multiplicacao = 0;

			// Calculo que multiplica os d�gitos pelo decremento de 10
			// decremento para na diferen�a de i com decremento
			// i = 8 e decremento = 10
			// decremento - i = 2
			for (int i = 0; i <= 8; i++) {
				pdv_total_multiplicacao += (cpf.charAt(i) - '0')
						* pdv_multiplica_por_digito;
				pdv_multiplica_por_digito--;
			}

			// System.out.println("Total multiplica��o acima: " +
			// pdv_total_multiplicacao);

			// Calculo para descobrir primeiro digito verificador
			// com base no resto da multiplicacao feita acima
			if (pdv_total_multiplicacao % 11 < 2) {
				pdv_resto_multiplicacao = 0;

			} else {
				pdv_resto_multiplicacao = 11 - (pdv_total_multiplicacao % 11);
			}
			// System.out.println("Primeiro Digito Verificador �: "+
			// pdv_resto_multiplicacao);

			// C�lculo do Segundo D�gito Verificador
			int sdv_multiplica_por_digito = 11; // sdv_multiplica_por_digito
												// - i
												// = 3
			int sdv_total_multiplicacao = 0;

			int sdv_resto_multiplicacao = 0;

			cpf = cpf.substring(0, 9) + pdv_resto_multiplicacao;

			// System.out.println("8 Digitos + pdv: " + cpf);

			// S�o os 8 digitos do CPF + primeiro digito verificador
			// Faz a multiplica��o por decremento de 11 at� chegar no 3
			for (int i = 0; i <= 9; i++) {
				sdv_total_multiplicacao += (cpf.charAt(i) - '0')
						* sdv_multiplica_por_digito;
				sdv_multiplica_por_digito--;
			}

			// System.out.println("Total multiplica��o acima: " +
			// sdv_total_multiplicacao);

			if (sdv_total_multiplicacao % 11 < 2) {
				sdv_resto_multiplicacao = 0;
			} else {
				sdv_resto_multiplicacao = 11 - (sdv_total_multiplicacao % 11);
			}
			// System.out.println("Segundo Digito Verificador �: "
			// + sdv_resto_multiplicacao);

			cpf = cpf + sdv_resto_multiplicacao;

			System.out.println("CPF v�lido.\nCPF: " + cpf
					+ "\nD�gito Verificador: " + pdv_resto_multiplicacao
					+ sdv_resto_multiplicacao);
		} else {
			System.out
					.println("CPF inv�lido ou n�o encontrado no banco de dados");
		}
	}
}
