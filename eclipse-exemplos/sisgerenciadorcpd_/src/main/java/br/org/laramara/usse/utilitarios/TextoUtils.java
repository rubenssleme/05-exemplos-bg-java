/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.utilitarios;

import java.text.Normalizer;

/**
 *
 * @author rubens.leme
 */
public class TextoUtils {

    public static String anularVazio(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        } else {
            return texto;
        }
    }

    public static boolean estaVazio(String texto) {
        return (removerCaracteresInvalidos(texto).isEmpty());
    }

    public static String removerCaracteresInvalidosRG(
            String rg) {
        String textoSemFormatacao = removerCaracteresInvalidosEAnularVazio(rg);
        return (textoSemFormatacao != null) ? textoSemFormatacao.replace(".",
                "").replace("-", "") : "";
    }

    public static String removerCaracteresInvalidosEAnularVazio(String texto) {
        if (texto != null) {
            String retorno = removerCaracteresInvalidos(texto);
            return TextoUtils.anularVazio(retorno);
        } else {
            return "";
        }
    }

    public static String substituirCaracteres(String texto) {
        return texto.replace("[", "(").replace("]", ")");
    }

    public static String removerCaracteresInvalidos(String texto) {
        return texto.replace(" ", "").replace(".", "").replace("(", "").replace(")", "");
    }

    public static String removerChaves(String texto) {
        return texto != null ? texto.replace("[", "").replace("]", "") : null;
    }

    public static String removerVirgulaFinal(String texto) {
        String textoSemEspacoInicialFinal = texto.trim();
        return textoSemEspacoInicialFinal.substring(0, textoSemEspacoInicialFinal.length() - 1);
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

}
