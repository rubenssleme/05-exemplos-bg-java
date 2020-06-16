package com.br.etec.formatacaoLocal;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double doubleNumero = 550.22;
		double doubleNumeroUm = 922.82;
		long longNumero = 99;
	
		Locale localBrasil = new Locale("pt", "BR");

		FormatacaoLocal fmt = FormatacaoLocal.getInstance();
	
		StringBuilder msg = new StringBuilder();

		msg.append("Formatando Moeda: ");
		msg.append("\n double formatada: de [");
		msg.append(doubleNumero);
		msg.append("] para [");
		msg.append(
				fmt.formatar(localBrasil, doubleNumero)
		);
		msg.append("]\n double formatada: de [");
		msg.append(doubleNumeroUm);	
		msg.append("] para [");			
		msg.append(
				fmt.formatar(localBrasil, doubleNumeroUm)
		);
		msg.append("]\n long formatada: de [");
		msg.append(longNumero);
		msg.append("] para [");
		msg.append(
				fmt.formatar(localBrasil, longNumero)
		);
		msg.append("]");
		JOptionPane.showMessageDialog(null, msg 
				, "Formatação de números"
				, JOptionPane.INFORMATION_MESSAGE);			



	}

}
