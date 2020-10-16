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

	public void entrada(){

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));

		try {
			// Testa se o valor lido foi zero ou negativo
			if(valor==0 || valor<0){
				// se foi, chama (força) o erro desejado (apesar dele não ter ocorrido)
				throw new IllegalArgumentException();
			}		

			this.setSaldo(this.saldo + valor);

		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);

		} catch (IllegalArgumentException erro){
			JOptionPane.showMessageDialog(null, "A movimentacao nao pode ser zero nem negativo!",
					"Tipo invalido!", 0);

		}finally{
			JOptionPane.showMessageDialog(null, "Mensagem no finally do metodo entrada", 
					"Finally - por aqui sempre passa", 0);	
		}
	}


	public void retirada(){	

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: "));

		try {

			if(valor==0 || valor<0){
				throw new IllegalArgumentException();
			}		

			this.setSaldo(this.saldo - valor);

		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);

		} catch (IllegalArgumentException erro){
			JOptionPane.showMessageDialog(null, "A movimentacao nao pode ser zero nem negativo!", "Tipo invalido!", 0);

		}finally{
			JOptionPane.showMessageDialog(null, "Mensagem no finally do metodo retirada", "Finally - por aqui sempre passa", 0);

		}

	}
}
