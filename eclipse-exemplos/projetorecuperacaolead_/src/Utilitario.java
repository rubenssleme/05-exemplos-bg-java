import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utilitario {

	public static Calendar retornaCalendar(String data) {
		String[] dataQuebrada = data.split("/");
		Calendar dataRetorno = Calendar.getInstance();
		dataRetorno
				.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataQuebrada[0]));
		dataRetorno.set(Calendar.MONTH, Integer.parseInt(dataQuebrada[1])-1);
		dataRetorno.set(Calendar.YEAR, Integer.parseInt(dataQuebrada[2]));
		return dataRetorno;
	}

	public static synchronized String formatarData(Calendar data) {
		return (data != null) ? obterFormatoData().format(data.getTime()) : "";
	}

	private static synchronized SimpleDateFormat obterFormatoData() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		formatoData.setLenient(false);
		return formatoData;
	}

}
