/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class DateUtils {
    
    /** 
     * Converte uma String para um objeto Date. Caso a String seja vazia ou nula,  
     * retorna null - para facilitar em casos onde formulários podem ter campos 
     * de datas vazios. 
     * @param data String no formato dd/MM/yyyy a ser formatada 
     * @return Date Objeto Date ou null caso receba uma String vazia ou nula 
     * @throws Exception Caso a String esteja no formato errado 
     */  
    public static Date formataData(String data){   
        
        try {
            if (data == null || data.equals(""))  
                return null;  
              
            Date date = null;  
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                date = (java.util.Date)formatter.parse(data);  
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(DateUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }  
    
    public static Date getPegaDataAtual() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		return calendar.getTime();
	}
}
