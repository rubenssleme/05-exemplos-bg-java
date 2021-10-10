package br.org.laramara.usse.utilitarios;

import javax.swing.JOptionPane;

/**
 * @author rubens leme
 * @data 19/03/2016
 * @version 1.0
 *
 */

public class Mensagem {

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String exibirPergunta(String pergunta) {
        return JOptionPane.showInputDialog(null, pergunta);
    }
}
