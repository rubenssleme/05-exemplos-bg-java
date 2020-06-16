package br.com.carloskafka.sisprojeto.utilitarios;

import javax.swing.JOptionPane;

public class Mensagem {

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String exibirPergunta(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }
}
