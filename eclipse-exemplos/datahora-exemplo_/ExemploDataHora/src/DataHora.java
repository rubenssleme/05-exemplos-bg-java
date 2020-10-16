import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;


// A classe Date (java.util.Date) é a mais comum (e simples) responsável por tratar data e hora em java
 
public class DataHora {

	private Date hoje;

	public DataHora() {
		this.hoje = new Date();
	}
	
	public DataHora(Date hoje) {
		this.hoje = hoje;
	}

	public Date getHoje() {
		return hoje;
	}

	public void setHoje(Date hoje) {
		this.hoje = hoje;
	}
	
	
	public void calcularIdade(){
		
		// Define formato para leitura da data de nascimento dd/mm/yyyy
		DateFormat formatoDataDF = DateFormat.getDateInstance(DateFormat.MEDIUM);
		// Define formato para leitura da hora de nascimento hh:mm:ss
		DateFormat formatoHoraDF = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		
		// Instacia objeto com a data de hoje 
		GregorianCalendar agora = new GregorianCalendar();
		// Desmembra a data de hoje em ano, mês, dia, hora, minuto e segundo
		int ano = agora.get(Calendar.YEAR);
		int mes = agora.get(Calendar.MONTH) + 1;
		int dia = agora.get(Calendar.DAY_OF_MONTH);			
		int hora = agora.get(Calendar.HOUR);
		int minuto = agora.get(Calendar.MINUTE);
		int segundo = agora.get(Calendar.SECOND);
		
		// Instacia objeto para manipulação da data de nascimento 
		GregorianCalendar nascimento = new GregorianCalendar();
		// inicializa as variaveis para dismembramento da data de nascimento
		int anoNasc = 0, mesNasc = 0, diaNasc = 0;
		
		// Instacia objeto para manipulação da hora de nascimento
		GregorianCalendar horaNascimento = new GregorianCalendar();
		// inicializa as variaveis para dismembramento da hora de nascimento
		int horaNasc = 0, minutoNasc = 0, segundoNasc = 0;
		
		// Inicializa variaveis para a idade dismembrada
		int idadeAnos = 0, idadeMeses = 0, idadeDias = 0;
		int idadeHoras = 0, idadeMinutos = 0, idadeSegundos = 0;
		
		// Lê a data de nascimento como String
		String StringNasc = JOptionPane.showInputDialog(null, "Digite sua data de nascimento (dd/mm/yyyy): ", "Calculo de idade", JOptionPane.QUESTION_MESSAGE);
		// Lê a hora de nascimento como String
		String StringHoraNasc = JOptionPane.showInputDialog(null, "Digite a hora do nascimento (hh:mm:ss): ", "Calculo de idade", JOptionPane.QUESTION_MESSAGE);
		
		try {
			
			/* A conversão da data/hora de String para Date pode gerar uma exceção e o 
			   eclipse exige um tratamento desse possivel erro */
			
			// Converte a data de nascimento de String para Date
			Date dataNascDate = formatoDataDF.parse(StringNasc);
			
			// Converte a hora de nascimento de String para Date
			Date horaNascDate = formatoHoraDF.parse(StringHoraNasc);

			// Converte a data de nascimento de Date para GregorianCalendar
			nascimento.setTime(dataNascDate); 

			// Converte a hora de nascimento de Date para GregorianCalendar
			horaNascimento.setTime(horaNascDate);
			
			// Dismenbra a data de nascimento em ano, mês e dia
			anoNasc = nascimento.get(Calendar.YEAR);
			mesNasc = nascimento.get(Calendar.MONTH) + 1;
			diaNasc = nascimento.get(Calendar.DAY_OF_MONTH);

			// Dismenbra a hora de nascimento em hora, minuto e segundo
			horaNasc = horaNascimento.get(Calendar.HOUR);
			minutoNasc = horaNascimento.get(Calendar.MINUTE);
			segundoNasc = horaNascimento.get(Calendar.SECOND);
			
			// Calcula a diferença entre as datas
			idadeAnos = ano - anoNasc;
			idadeMeses = mes - mesNasc;
			idadeDias = dia - diaNasc;

			// Calcula a diferença entre as horas
			idadeHoras = hora - horaNasc;
			idadeMinutos = minuto - minutoNasc;
			idadeSegundos = segundo - segundoNasc;
			
			// Verifica diferenças entre mês e dias
			if(mes < mesNasc){
				idadeAnos--;
			}else{
				if(dia < diaNasc){
					idadeAnos--;
				}
			}
			
			// Verifica se idade ficou negativa
			if(idadeAnos < 0){
				idadeAnos = 0;
			}
			
			// Se o mes atual for menor que o mes de nascimento a diferença entre eles ficará negativa
			if(idadeMeses < 0){
				// Extrai o numero absoluto
				idadeMeses = Math.abs(idadeMeses);
			}
			
			// Se o dia atual for menor que o dia de nascimento a diferença entre eles ficará negativa
			if(idadeDias < 0){
				// Extrai o numero absoluto
				idadeDias = Math.abs(idadeDias);
			}

			// Se a hora atual for menor que a hora de nascimento a diferença entre elas ficará negativa
			if(idadeHoras < 0){
				// Extrai o numero absoluto
				idadeHoras = Math.abs(idadeHoras);
			}
			
			// Se o minuto atual for menor que o minuto de nascimento a diferença entre eles ficará negativa
			if(idadeMinutos < 0){
				// Extrai o numero absoluto
				idadeMinutos = Math.abs(idadeMinutos);
			}
			
			// Se o segundo atual for menor que o segundo de nascimento a diferença entre eles ficará negativa
			if(idadeSegundos < 0){
				// Extrai o numero absoluto
				idadeSegundos = Math.abs(idadeSegundos);
			}
			
			JOptionPane.showMessageDialog(null, "Anos: " + idadeAnos + 
					                            "\nMeses: " + idadeMeses + 
					                            "\nDias: " + idadeDias +
					                            "\nHoras: " + idadeHoras +
					                            "\nMinutos: " + idadeMinutos +
					                            "\nSegundos: " + idadeSegundos,
					                            "Sua idade é", JOptionPane.INFORMATION_MESSAGE);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu o erro: "+e.getMessage());
		}
		
	}
	
	
}
