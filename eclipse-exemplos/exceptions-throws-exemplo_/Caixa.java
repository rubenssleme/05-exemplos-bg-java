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

	// Implementa as classes de tratamento de erros "personalizados" 
	// MovimentoZero e MovimentoNegativo através do comando throws
	// Se um dos erros for instanciado, a responsabilidade de trata-lo será do método chamador (main)
	public void entrada() throws MovimentoZero,MovimentoNegativo{

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
		
		// Verifica o valor lido
		// se for zero instancia o erro MovimentoZero
		if(valor==0) throw new MovimentoZero();
		// se for negativo instancia o erro MovimentoNegativo		
		if(valor<0) throw new MovimentoNegativo();
		
		
		try {
			this.setSaldo(this.saldo + valor);
		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
		}

	}

	public void retirada() throws MovimentoZero,MovimentoNegativo{

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: "));
		
		if(valor==0) throw new MovimentoZero();
		if(valor<0) throw new MovimentoNegativo();
		
		try {
			this.setSaldo(this.saldo - valor);
		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
		}
	
	}

}
