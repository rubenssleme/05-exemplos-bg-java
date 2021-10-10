import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			
		/* A data � representada por um n�mero gigantesco e �nico, 
		 * correspondete � quantidade de milissegundos decorridos desde 
		 * a data convencionada como inicial (dependendo do caso, 
		 * pode ser 01/01/1900, �s 00:00:00, ou outra data parecida, 
		 * anterior ou posterior, dependendo de qual objeto e qual linguagem 
		 * voc� esteja utilizando) at� a data do momento em que o objeto 
		 * foi instanciado na mem�ria.
		 */
		
		// Instancia um objeto do tipo DataHora e inicializa-o pelo construtor (que por sua vez l� a data e hora do sistema operacional)
		DataHora tempo = new DataHora();

		
		int op;
		
		do{
			
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua op��o \n1 - Visualizar a data de hoje no formato padr�o" +
					                                                                 "\n2 - Visualizar as formata��es atrav�s da classe DateFormat" +
					                                                                 "\n3 - Visualizar as formata��es atrav�s da classe SimpleDateFormat" +
					                                                                 "\n4 - Visualizar as formata��es de internacionaliza��o atrav�s das classes SimpleDateFormat e Locale" +
					                                                                 "\n5 - Calculo de idade atrav�s da classe GregorianCalendar" +
					                                                                 "\n0 - Sair" ,
					                                                                 "Menu", JOptionPane.QUESTION_MESSAGE));

			
			switch(op){
			case 1:
				JOptionPane.showMessageDialog(null, "Hoje �: " + tempo.getHoje(), "Formato padr�o Date", JOptionPane.INFORMATION_MESSAGE);		
				break;
				
			case 2:
				/* Para converter este n�mero imenso em uma data intelig�vel, 
				 * com dia, m�s, dia da semana, ano, hora, minuto, segundo e cent�simo
				 * existem classes especiais de formata��o, dentre elas:
				 */

				/* DateFormat do pacote java.text.
				 * Atrav�s do m�todo getDateInstance s�o passados os formatos short, medium, long e full.
				 */	
				DateFormat formatoDF1 = DateFormat.getDateInstance();
				DateFormat formatoDF2 = DateFormat.getDateInstance(DateFormat.SHORT);
				DateFormat formatoDF3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
				DateFormat formatoDF4 = DateFormat.getDateInstance(DateFormat.LONG);
				DateFormat formatoDF5 = DateFormat.getDateInstance(DateFormat.FULL);
				

				JOptionPane.showMessageDialog(null, "Hoje � (Padr�o do DateFormat): " + formatoDF1.format(tempo.getHoje()) +
						                            "\nHoje � (short): " + formatoDF2.format(tempo.getHoje()) +
						                            "\nHoje � (medium): " + formatoDF3.format(tempo.getHoje()) +
						                            "\nHoje � (long): " + formatoDF4.format(tempo.getHoje()) +
				                                    "\nHoje � (full): " + formatoDF5.format(tempo.getHoje()),
				                                    "Classe DateFormat", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 3:
				 /* SimpleDateFormat do pacote java.text.
				 * Para definir o formato basta passar uma String, com caracteres que 
				 * representam as partes do formato de data que queremos.
				 */		
				
				SimpleDateFormat formatoSDF1 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
				SimpleDateFormat formatoSDF2 = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat formatoSDF3 = new SimpleDateFormat("HH:mm:ss:SS");
				SimpleDateFormat formatoSDF4 = new SimpleDateFormat("EEE");
				SimpleDateFormat formatoSDF5 = new SimpleDateFormat("EEEE");

				JOptionPane.showMessageDialog(null, "\nData e hora: " + formatoSDF1.format(tempo.getHoje()) +
						                            "\nDia da semana (3 digitos): " + formatoSDF4.format(tempo.getHoje()) +
						                            "\nDia da semana (completo): " + formatoSDF5.format(tempo.getHoje()) +
				                                    "\nData: " + formatoSDF2.format(tempo.getHoje()) +
						                            "\nHora: " + formatoSDF3.format(tempo.getHoje()),
						                            "Classe SimpleDateFormat", JOptionPane.INFORMATION_MESSAGE);				
				break;
				
			case 4:
				/* Opcionalmente pode-se definir tamb�m a localidade. 
				 * Isto � �til para dados de formata��o que dependam de idioma e pa�s, 
				 * como o nome dos dias da semana ou do m�s. 
				 * Para fazer isto, basta acrescentar mais um argumento no construtor do SimpleDateFormat,
				 * o objeto Locale, do pacote java.util. 
				 * O locale deve ser constru�do com as siglas da l�ngua e do pa�s
				 */
				
				Locale localBrasil = new Locale("pt", "BR"); //Portugu�s, Brasil
				Locale localEstadosUnidos = new Locale("en", "US"); //Ingl�s, Estados Unidos
				Locale localFranca = new Locale("fr", "FR"); //Franc�s, Fran�a
				Locale localAlemanha = new Locale("de", "GE"); //Alem�o, Alemanha
				
				SimpleDateFormat formato1a = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localBrasil);
				SimpleDateFormat formato1b = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localEstadosUnidos);
				SimpleDateFormat formato1c = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localFranca);
				SimpleDateFormat formato1d = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localAlemanha);
				
				JOptionPane.showMessageDialog(null, "Hoje (Brasil): " + formato1a.format(tempo.getHoje()) +
						                            "\nHoje (Estados Unidos): " + formato1b.format(tempo.getHoje()) +
						                            "\nHoje (Fran�a): " + formato1c.format(tempo.getHoje()) +
				                                    "\nHoje (Alemanha): " + formato1d.format(tempo.getHoje()),
				                                    "SimpleDateFormat + Locale", JOptionPane.INFORMATION_MESSAGE);
				
				break;
				
			case 5:
				tempo.calcularIdade();				
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando a aplica��o!", "Sair", JOptionPane.WARNING_MESSAGE);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Op��o invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			
		}while(op != 0);
		
	}

}
