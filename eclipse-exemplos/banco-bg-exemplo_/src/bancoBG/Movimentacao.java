package bancoBG;

import javax.swing.JOptionPane;

public class Movimentacao  {

	public static void main(String[] args) {
		//Instancia da classe ContaCorrente e ContaPoupanca 
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();

		int opPro = 0, opOperacao = 0;

		do{
			opPro = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1-Conta Corrente \n2-Conta Poupança \n0-Sair"));
			if(opPro != 0 )
				do{
					opOperacao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1-Depositar \n2-Sacar "
							+ "\n3-Consultar \n4 - Atualizar \n0 - Sair"));
					switch (opOperacao) {
					case 1:
						if(opOperacao == 1){
							cc1.creditar(50.00)	;
							System.out.println(cc1.getSaldo());
						}
						break;

					default:
						break;
					}

				}while(opOperacao != 0);
		}while(opPro != 0);
	}

}
