package br.com.bg.utilitarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rubens Leme
 */
public abstract class Mensagem {
     public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String exibirPergunta(String pergunta) {
        return JOptionPane.showInputDialog(null, pergunta);
    }
    
}
