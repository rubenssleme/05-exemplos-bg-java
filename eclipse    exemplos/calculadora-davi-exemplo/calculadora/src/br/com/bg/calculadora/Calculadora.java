package br.com.bg.calculadora;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author 3binfo
 */
public class Calculadora {

    private final String ADICAO = "adicao";
    private final String SUBTRACAO = "subtracao";
    private final String MULTIPLICACAO = "multiplicacao";
    private final String DIVISAO = "divisao";

    private JTextField txtDisplay;
    private Double numero1;
    private Double numero2;
    private Double resultado;

    private String operacao;
    private Boolean trocarNumero = false;

    public Calculadora(JTextField txtDisplay) {
        this.txtDisplay = txtDisplay;
    }

    public void exibir(Object btn) {
        String textoDoBotao = ((JButton) btn).getText();

        if (txtDisplay.getText().equals("0") && !textoDoBotao.equals(",")) {
            txtDisplay.setText(textoDoBotao);
        } else if (textoDoBotao.equals(",")) {
            if (!txtDisplay.getText().contains(".")) {
                txtDisplay.setText(txtDisplay.getText() + ".");
            }
        } else {
            txtDisplay.setText(txtDisplay.getText() + textoDoBotao);
        }
    }

    public void limpar() {
        limparDisplay();
        numero1 = null;
        numero2 = null;
    }

    public void apagar() {
        if (!txtDisplay.getText().equals("0")) {
            txtDisplay.setText(txtDisplay.getText().substring(0, txtDisplay.getText().length() - 1));
        }
        if (txtDisplay.getText().equals("")) {
            limparDisplay();
        }
    }

    private void limparDisplay() {
        txtDisplay.setText("0");
    }

    public void trocarSinal() {
        if (txtDisplay.getText().contains(".")) {
            Double numeroTemporario = Double.parseDouble(txtDisplay.getText()) * -1;
            txtDisplay.setText(numeroTemporario.toString());
        } else {
            Integer numeroTemporario = Integer.parseInt(txtDisplay.getText()) * -1;
            txtDisplay.setText(numeroTemporario.toString());
        }
    }

    public void processarNumero(Object btn) {
        String textoDoBotao = ((JButton) btn).getText();
        guardarOperacao(textoDoBotao);
        guardarNumero();
    }

    private void guardarNumero() {
        try {
            if (!trocarNumero) {
                numero1 = Double.parseDouble(txtDisplay.getText());
                trocarNumero = true;
            } else {
                numero2 = Double.parseDouble(txtDisplay.getText());
                trocarNumero = false;
            }
            limparDisplay();
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    private void guardarOperacao(String textoDoBotao) {
        switch (textoDoBotao) {
            case "+":
                operacao = ADICAO;
                break;
            case "-":
                operacao = SUBTRACAO;
                break;
            case "*":
                operacao = MULTIPLICACAO;
                break;
            case "/":
                operacao = DIVISAO;
                break;
            default:
        }
    }

    public void executar() {
        guardarNumero();
        executarOperacao();
    }

    private void executarOperacao() {
        if (operacao != null) {
            switch (operacao) {
                case ADICAO:
                    adicao();
                    break;
                case SUBTRACAO:
                    subtracao();
                    break;
                case MULTIPLICACAO:
                    multiplicacao();
                    break;
                case DIVISAO:
                    divisao();
                    break;
            }
            exibirResultado();
            operacao = null;
        }
    }

    private void exibirResultado() {
        txtDisplay.setText(resultado.toString());
    }

    private void adicao() {
        resultado = numero1 + numero2;
    }

    private void subtracao() {
        resultado = numero1 - numero2;
    }

    private void multiplicacao() {
        resultado = numero1 * numero2;
    }

    private void divisao() {
        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException e) {
            
        }
    }
}
