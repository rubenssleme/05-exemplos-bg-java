package com.br.etec.formatacaoSimples;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double doubleNumero = 550.22;
		double doubleNumeroUm = 922.82;
		long longNumero = 99;
		
		FormatacaoSimples fmt = 
			FormatacaoSimples.getInstance();
		StringBuilder msg = new StringBuilder();

		msg.append("Formatando Números: ");
		msg.append("\n double formatada: de [");
		msg.append(doubleNumero);
		msg.append("], pelo formato: [");
		msg.append("####.00");
		msg.append("] para [");
		msg.append(
				fmt.formatar("####.00", doubleNumero)
		);
		msg.append("]\n double formatada: de [");
		msg.append(doubleNumeroUm);
		msg.append("], pelo formato: [");
		msg.append(FormatacaoSimples.QUATRO_DIGITOS);		
		msg.append("] para [");			
		msg.append(
				fmt.formatar(FormatacaoSimples.QUATRO_DIGITOS, doubleNumeroUm)
		);
		msg.append("]\n long formatada: de [");
		msg.append(longNumero);
		msg.append("], pelo formato: [");
		msg.append(FormatacaoSimples.QUATRO_DIGITOS_FACULTATIVOS);		
		msg.append("] para [");
		msg.append(
				fmt.formatar(FormatacaoSimples.QUATRO_DIGITOS_FACULTATIVOS, longNumero)
		);
		msg.append("]");
		JOptionPane.showMessageDialog(null, msg 
				, "Formatação de números"
				, JOptionPane.INFORMATION_MESSAGE);			



	}

}
