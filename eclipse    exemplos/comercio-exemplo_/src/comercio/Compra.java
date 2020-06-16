package comercio;

import javax.swing.JOptionPane;

public class Compra {

	private int valorTotal;
	private int numerosParcelas;

	//A vista
	public Compra(int valor){
		valorTotal = valor;
		numerosParcelas = Integer.parseInt((JOptionPane.showInputDialog("Digite o numero de parcelas: ")));
	}
	//parcelado
	public Compra(int qtdeParcelas,int valorParcelas){
		numerosParcelas = qtdeParcelas;
		valorTotal = valorParcelas * qtdeParcelas;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public int getNumerosParcelas() {
		return numerosParcelas;
	}
	public int getValorParcelas() {
		return valorTotal/numerosParcelas;
	}
	

}

