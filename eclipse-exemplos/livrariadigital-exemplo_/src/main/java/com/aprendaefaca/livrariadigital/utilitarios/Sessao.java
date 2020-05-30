
package com.aprendaefaca.livrariadigital.utilitarios;

/**
 *
 * @author rubens.leme
 */
public abstract class Sessao {
    private static String nome;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Sessao.nome = nome;
    }
    
    
}
