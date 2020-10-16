package br.bg;

import javax.swing.JOptionPane;

public class Mensagem {

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String exibirPergunta(String pergunta) {
        return JOptionPane.showInputDialog(null, pergunta);
    }
}
