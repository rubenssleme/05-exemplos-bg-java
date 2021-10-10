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

		try {
			this.setSaldo(this.saldo + Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: ")));

		} catch (NumberFormatException erro){
			// Apresenta mensagem personalizada
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
			// Apresenta a mensagem gerada pela exception NumberFormatException armazenada em erro 
			JOptionPane.showMessageDialog(null, erro.getMessage());
			// Recupera a listagem da pilha de erro gerada
			JOptionPane.showMessageDialog(null,erro.getStackTrace());
			// Apresenta em console a listagem da pilha de erro gerada
			erro.printStackTrace();
			
			
		}finally{
			JOptionPane.showMessageDialog(null, "Mensagem no finally do metodo entrada", "Finally - por aqui sempre passa", 0);			
		}

	}

	public void retirada(){			

		try {
			this.setSaldo(this.saldo - Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: ")));

		} catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
			JOptionPane.showMessageDialog(null, erro.getMessage());
			erro.printStackTrace();
			
		}finally{
			JOptionPane.showMessageDialog(null, "Mensagem no finally do metodo entrada", "Finally - por aqui sempre passa", 0);			
		}
	
	
	}

	
}
