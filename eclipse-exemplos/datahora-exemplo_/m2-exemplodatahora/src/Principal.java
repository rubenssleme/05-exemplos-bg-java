import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			
		/* A data é representada por um número gigantesco e único, 
		 * correspondete à quantidade de milissegundos decorridos desde 
		 * a data convencionada como inicial (dependendo do caso, 
		 * pode ser 01/01/1900, às 00:00:00, ou outra data parecida, 
		 * anterior ou posterior, dependendo de qual objeto e qual linguagem 
		 * você esteja utilizando) até a data do momento em que o objeto 
		 * foi instanciado na memória.
		 */
		
		// Instancia um objeto do tipo DataHora e inicializa-o pelo construtor (que por sua vez lê a data e hora do sistema operacional)
		DataHora tempo = new DataHora();

		
		int op;
		
		do{
			
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua opção \n1 - Visualizar a data de hoje no formato padrão" +
					                                                                 "\n2 - Visualizar as formatações através da classe DateFormat" +
					                                                                 "\n3 - Visualizar as formatações através da classe SimpleDateFormat" +
					                                                                 "\n4 - Visualizar as formatações de internacionalização através das classes SimpleDateFormat e Locale" +
					                                                                 "\n5 - Calculo de idade através da classe GregorianCalendar" +
					                                                                 "\n0 - Sair" ,
					                                                                 "Menu", JOptionPane.QUESTION_MESSAGE));

			
			switch(op){
			case 1:
				JOptionPane.showMessageDialog(null, "Hoje é: " + tempo.getHoje(), "Formato padrão Date", JOptionPane.INFORMATION_MESSAGE);		
				break;
				
			case 2:
				/* Para converter este número imenso em uma data inteligível, 
				 * com dia, mês, dia da semana, ano, hora, minuto, segundo e centésimo
				 * existem classes especiais de formatação, dentre elas:
				 */

				/* DateFormat do pacote java.text.
				 * Através do método getDateInstance são passados os formatos short, medium, long e full.
				 */	
				DateFormat formatoDF1 = DateFormat.getDateInstance();
				DateFormat formatoDF2 = DateFormat.getDateInstance(DateFormat.SHORT);
				DateFormat formatoDF3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
				DateFormat formatoDF4 = DateFormat.getDateInstance(DateFormat.LONG);
				DateFormat formatoDF5 = DateFormat.getDateInstance(DateFormat.FULL);
				

				JOptionPane.showMessageDialog(null, "Hoje é (Padrão do DateFormat): " + formatoDF1.format(tempo.getHoje()) +
						                            "\nHoje é (short): " + formatoDF2.format(tempo.getHoje()) +
						                            "\nHoje é (medium): " + formatoDF3.format(tempo.getHoje()) +
						                            "\nHoje é (long): " + formatoDF4.format(tempo.getHoje()) +
				                                    "\nHoje é (full): " + formatoDF5.format(tempo.getHoje()),
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
				/* Opcionalmente pode-se definir também a localidade. 
				 * Isto é útil para dados de formatação que dependam de idioma e país, 
				 * como o nome dos dias da semana ou do mês. 
				 * Para fazer isto, basta acrescentar mais um argumento no construtor do SimpleDateFormat,
				 * o objeto Locale, do pacote java.util. 
				 * O locale deve ser construído com as siglas da língua e do país
				 */
				
				Locale localBrasil = new Locale("pt", "BR"); //Português, Brasil
				Locale localEstadosUnidos = new Locale("en", "US"); //Inglês, Estados Unidos
				Locale localFranca = new Locale("fr", "FR"); //Francês, França
				Locale localAlemanha = new Locale("de", "GE"); //Alemão, Alemanha
				
				SimpleDateFormat formato1a = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localBrasil);
				SimpleDateFormat formato1b = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localEstadosUnidos);
				SimpleDateFormat formato1c = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localFranca);
				SimpleDateFormat formato1d = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", localAlemanha);
				
				JOptionPane.showMessageDialog(null, "Hoje (Brasil): " + formato1a.format(tempo.getHoje()) +
						                            "\nHoje (Estados Unidos): " + formato1b.format(tempo.getHoje()) +
						                            "\nHoje (França): " + formato1c.format(tempo.getHoje()) +
				                                    "\nHoje (Alemanha): " + formato1d.format(tempo.getHoje()),
				                                    "SimpleDateFormat + Locale", JOptionPane.INFORMATION_MESSAGE);
				
				break;
				
			case 5:
				tempo.calcularIdade();				
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando a aplicação!", "Sair", JOptionPane.WARNING_MESSAGE);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			
		}while(op != 0);
		
	}

}
