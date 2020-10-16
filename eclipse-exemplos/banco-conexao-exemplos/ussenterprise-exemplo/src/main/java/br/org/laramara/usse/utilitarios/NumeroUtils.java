package br.org.laramara.usse.utilitarios;

/**
 *
 * @author rubens.leme
 */
public class NumeroUtils {
    
    public static Integer obterNumeroInteiroInvalido(String valor){
     return   !valor.isEmpty()? Integer.parseInt(valor): new Integer(999999999);
    }
    
    public static Long obterNumeroLongInvalido(String valor){
        if(!valor.isEmpty()){
            return Long.parseLong(valor);
        }
        return new Long(999999999);
    }
    
    public static boolean estaVazio(String texto){
        return texto.isEmpty();
    }
    
    
}
