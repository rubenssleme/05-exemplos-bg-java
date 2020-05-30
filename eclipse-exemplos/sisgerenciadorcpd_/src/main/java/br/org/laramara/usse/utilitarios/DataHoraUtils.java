/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.utilitarios;

import java.sql.Time;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.apache.log4j.Logger;

/**
 *
 * @author leone.pizzoli
 */
public class DataHoraUtils {

    private static final Logger logger = Logger.getLogger(DataHoraUtils.class);

    private static int LIMITE_HORA_DIA = 13;
    private static int LIMITE_MINUTO_DIA = 59;
    private static String segundos = ":00";
    private static String segundosMili = segundos + ".000";
    private static String formatacaoDataCompacta = "dd/MM/yy";
    private static String formatacaoData = formatacaoDataCompacta + "yy";
    private static String formatacaoDataHora = formatacaoData + " HH:mm:ss";
    private static String formatacaoDataHoraMinuto = formatacaoData + " HH:mm";
    private static String formatacaoDataHoraMinutoSegundoMile = "yyyyMMdd_HHmmssSSS";

    private static SimpleDateFormat obterFormatoData() {
        SimpleDateFormat formatoData = new SimpleDateFormat(formatacaoData);
        formatoData.setLenient(false);
        return formatoData;
    }

    public static String formatarDataHoraMinutosMile(LocalDateTime data) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoDataHoraMinutoSegundoMile);
        return (data != null) ? data.format(formatter) : "";
    }

    public static String formatarData(LocalDateTime data) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoData);

        return (data != null) ? data.format(formatter) : "";
    }

    public static String formatarDataCompacta(LocalDateTime data) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoDataCompacta);

        return (data != null) ? data.format(formatter) : "";
    }

    public static String formatarDataHora(LocalDateTime dataHora) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoDataHora);

        return (dataHora != null) ? dataHora.format(formatter) : "";
    }

    public static LocalDateTime criarDataHora(String dataString) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoDataHora);
        LocalDateTime dataHora = LocalDateTime.parse(dataString, formatter);
        return dataHora;
    }

    public static LocalDateTime criarDataHoraSemHora(String dataString) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoDataHora);
        LocalDateTime dataHora = LocalDateTime.parse(dataString + " 00:00:00", formatter);
        return dataHora;
    }

    public static LocalDateTime criarData(String dataString) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(formatacaoData);
        LocalDateTime data = LocalDateTime.parse(dataString, formatter);
        return data;
    }

    public static LocalDateTime obterData(LocalDateTime data) {
        
        Relogio.mudarDataHoraAtual(data);
        return Relogio.obterDataHoraAtual();
    }

    public static boolean dataValida(String s) {
        return validar(s, obterFormatoData(), 10);
    }

    private static boolean dataHoraValida(String s) {
        return validar(s, obterFormatoDataHora(), 18);
    }

    private static boolean horaMinutoValida(String s) {
        return validar("31/12/2001 " + s, obterFormatoDataHoraMinuto(), 15);
    }

    private static boolean validar(String s, SimpleDateFormat simpleDateFormat,
            int tamanhoTexto) {
        boolean formatoCerto = simpleDateFormat.parse(s, new ParsePosition(0)) != null;
        boolean tamanhoExato = s.replace(" ", "").length() == tamanhoTexto;
        if (tamanhoExato == true && formatoCerto == true) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean dataPreenchida(String data) {
        return data != null ? data.replace("/", "").replace(" ", "").length() > 0
                : false;
    }

    public static boolean dataInvalida(LocalDateTime data) {
        String dataHora = formatarDataHora(data);
        return (validarData(dataHora) == true ? false : data.equals(obterDataInvalida()));
    }

    private static boolean horaInvalida(String hora) {
        if (hora == null) {
            return true;
        } else if (!horaMinutoValida(hora)) {
            return true;
        }

        return false;
    }

    public static boolean horaInvalida(Time hora) {
        return horaInvalida(DataHoraUtils.obterHora(hora));
    }

    public static boolean horaTerminoAnteriorHoraInicio(Time horaInicio,
            Time horaTermino) {
        boolean retorno = false;
        if (!horaInvalida(horaInicio) && !horaInvalida(horaTermino)) {
            retorno = horaTermino.before(horaInicio);
        }
        return retorno;
    }

    public static LocalDateTime obterDataHoraValidaInvalidaOuNulo(String data) {
        LocalDateTime retorno = null;
        if (dataPreenchida(data)) {
            if (validarData(data)) {
                retorno = criarDataHoraSemHora(data);
            }else{
                retorno = obterDataInvalida();
            }
        }
        return retorno;
    }


    public static LocalDateTime obterDataInvalida() {
        return criarDataHoraSemHora("01/01/9999");
    }
    

    private static SimpleDateFormat obterFormatoDataHora() {
        SimpleDateFormat formatoData = new SimpleDateFormat(formatacaoDataHora);
        formatoData.setLenient(false);
        return formatoData;
    }

    
    private static SimpleDateFormat obterFormatoDataHoraMinuto() {
        SimpleDateFormat formatoData = new SimpleDateFormat(
                formatacaoDataHoraMinuto);
        formatoData.setLenient(false);
        return formatoData;
    }

    
    public static String obterHora(String horas) {
        return (String) horas.subSequence(0, horas.length() - 7);
    }

    
    public static String obterHora(Time hora) {
        String retorno = null;
        if (hora != null) {
            retorno = hora.toString().substring(0, 5);
        }
        return retorno;
    }

    public static String retornaTotalHoraOuInvalido(String hora) {
        String horaSemEspaco = TextoUtils.removerCaracteresInvalidos(hora);
        if (horaSemEspaco.length() != 6) {
            return null;
        } else {
            return horaSemEspaco + segundosMili;
        }
    }

    public static Time obterTempo(String horaMinuto) {
        Time retorno = null;
        try {
            if (!horaInvalida(horaMinuto)) {
                retorno = Time.valueOf(horaMinuto + segundos);
            }
        } catch (IllegalArgumentException e) {
            loggarErroParse(e);
        }
        return retorno;
    }

    private static long obterMillisegundos(Time tempoInicio, Time tempoTermino) {
        return (long) (tempoTermino.getTime() - tempoInicio.getTime());
    }

    private static void loggarErroParse(Exception e) {
        logger.fatal("Erro durante obtenção de tempo decorrido. Detalhes: +"
                + e.getMessage());
    }

    public static boolean validarData(String data) {
        try {
            Relogio.mudarDataHoraAtual(data);
            return true;

        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean validarData(LocalDateTime data) {
        try {
            Relogio.mudarDataHoraAtual(data);
            return true;

        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
