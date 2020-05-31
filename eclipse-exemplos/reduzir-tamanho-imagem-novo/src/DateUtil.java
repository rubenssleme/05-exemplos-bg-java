
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtil {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final SimpleDateFormat DATE_FORMAT_DDMMYYYY = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateTimeFormatter LOCAL_DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
	private static final DateTimeFormatter LOCAL_DATE_FORMAT_DDMMYYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final SimpleDateFormat DATE_MM_YYYY = new SimpleDateFormat("MM/yyyy");
	private static final DateTimeFormatter DATE_FORMAT_YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static String getDateFormatted(Date data) {
		return DATE_FORMAT.format(data);
	}

	public static String getDateFormattedDDMMYYYY(Date data) {
		return DATE_FORMAT_DDMMYYYY.format(data);
	}

	public static String getDataFormattedMMYYYY(Date data) {
		return DATE_MM_YYYY.format(data);
	}

	public static String getLocalDateTimeFormatted(LocalDateTime dateTime) {
		return dateTime.format(LOCAL_DATE_FORMAT);
	}

	public static String getLocalDateTimeFormattedDDMMYYYY(LocalDateTime dateTime) {
		return dateTime.format(LOCAL_DATE_FORMAT_DDMMYYYY);
	}

	public String getStringToLocalDateFormatted(String data) {
		if (data != null) {
			int index = data.lastIndexOf(".");
			String parse = data.substring(0, index);
			LocalDateTime date = LocalDateTime.parse(parse, DATE_FORMAT_YYYY_MM_DD);
			String formatDateTime = date.format(LOCAL_DATE_FORMAT);
			return formatDateTime;
		} else {
			return null;
		}
	}

	public static String getLocalDateFormattedWithValidationNotNull(LocalDateTime localDateTime) {
		if (localDateTime != null) {
			return localDateTime.format(LOCAL_DATE_FORMAT.withLocale(new Locale("pt", "BR")));
		} else {
			return null;
		}
	}

	public Integer getMes() {
		Calendar c = Calendar.getInstance();
		int mesInt = c.get(Calendar.MONTH) + 1;
		return mesInt;
	}

	public Integer getAno() {
		Calendar c = Calendar.getInstance();
		int anoInt = c.get(Calendar.YEAR);
		return anoInt;
	}

	public Integer getDia() {
		Calendar c = Calendar.getInstance();
		int diaInt = c.get(Calendar.DATE);
		return diaInt;
	}

	public LocalDate firstDayNextMonth(Integer mes, Integer ano) {
		String retorno = "";
		String mesNovo = "";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		if (mes >= 12) {
			int anoNovo = ano + 1;
			mesNovo = "01";
			retorno = anoNovo + "-" + mesNovo + "-01";
			LocalDate dataFinal = LocalDate.parse(retorno, formato);
			return dataFinal;
		}
		if (mes == 1) {
			mesNovo = "02";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 2) {
			mesNovo = "03";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 3) {
			mesNovo = "04";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 4) {
			mesNovo = "05";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 5) {
			mesNovo = "06";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 6) {
			mesNovo = "07";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 7) {
			mesNovo = "08";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 8) {
			mesNovo = "09";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 9) {
			mesNovo = "10";
			retorno = ano + "-" + mesNovo + "-01";
		} else if (mes == 10) {
			mesNovo = "11";
		} else if (mes == 11) {
			mesNovo = "12";
		}
		retorno = ano + "-" + mesNovo + "-01";
		LocalDate dataFinal = LocalDate.parse(retorno, formato);
		return dataFinal;
	}

	public Date firstDayMonth() {
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataPrimeiroDia = new GregorianCalendar(dataAtual.get(Calendar.YEAR), dataAtual.get(Calendar.MONTH),
				1);
		Calendar retorno = Calendar.getInstance();
		retorno.set(dataPrimeiroDia.get(Calendar.YEAR), dataPrimeiroDia.get(Calendar.MONTH),
				dataPrimeiroDia.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		return retorno.getTime();
	}


	public Date lastDayMonth() {
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.MONTH, this.getMes());
		instance.set(Calendar.DAY_OF_MONTH, instance.getActualMaximum(Calendar.DAY_OF_MONTH));
		return instance.getTime();
	}
}
