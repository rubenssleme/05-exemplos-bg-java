package br.org.laramara.usse.utilitarios;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    public static String criptografar(String senha) {
        MessageDigest md;
        BigInteger hash;
        String retorno = "";
        try {
            md = MessageDigest.getInstance("MD5");
            hash = new BigInteger(1, md.digest(senha.getBytes()));
            retorno = String.format("%32x", hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return retorno;
    }
}
