import javax.swing.*;

public class Caixa {

	private double saldo;

	public Caixa() {
		this(0);
	}
	public Caixa(double saldo) {
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Trata o erro caso o usuario digite algo diferente de números 
	public void entrada(){

		try {
			this.setSaldo(this.saldo + Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: ")));

		// Se o usuario digitar uma letra ou um caractere especial o Java irá gerar um erro de tipo de dado inválido.
		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Ocorreu o erro: "+e.getMessage());
		}finally{
			JOptionPane.showMessageDialog(null, "Mensagem no finally do metodo entrada", "Finally - por aqui sempre passa", 0);
		}
	}

	// Se o usuario digitar algo diferente de zero gerará um erro
	public void retirada(){
		this.setSaldo(this.saldo - Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: ")));	
	}
}
