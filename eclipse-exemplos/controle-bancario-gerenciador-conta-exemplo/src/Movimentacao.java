import javax.swing.JOptionPane;


public class Movimentacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contaCorrente cc1 = new contaCorrente(000.00, 5000.00);
		contaPoupanca cp1 = new contaPoupanca(000.00, 0.00); 
		GerenciadorContas cont = new GerenciadorContas();

		int opPro, opOperacao = 0;

		do{ 
			opPro =Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Conta Corrente \n2 - Conta Poupança \n3 - Consultar Saldo Total \n0 - Sair"));
			if ((opPro == 1)||(opPro == 2)){ 

				do{

					opOperacao =Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Depositar \n2 - Sacar \n3 - Consultar \n4 - Atualizar \n0 - Sair"));

					switch(opPro){ // Abertura da estrutura de switch-case

					case 1: // Conta Corrente

						if (opOperacao == 1){//depositar
							double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor a Creditar:"));
							cc1.creditar(valor);	 
						}
						if (opOperacao == 2){//debitar
							double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor a Debitar:"));
							cc1.debitar(valor);
						}
						if (opOperacao == 3){//Consultar
							JOptionPane.showMessageDialog(null, "O seu saldo é: " + String.valueOf(cc1.getSaldo()));
						}
						if (opOperacao == 4){//atualizar valor
							//JOptionPane.showMessageDialog(null, "O seu saldo é: " + String.valueOf(cc1.getSaldo()));
							cc1.atualizarSaldo();
						}

						break;

					case 2: // Conta Poupanca

						if (opOperacao == 1){//depositar
							double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor a Creditar:"));
							cp1.creditar(valor);	 
						}
						if (opOperacao == 2){//debitar
							double limiteEspecial = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor a Debitar:"));
							cp1.debitar(limiteEspecial);
						}
						if (opOperacao == 3){//atualizar valor
							JOptionPane.showMessageDialog(null, "O seu saldo na poupança é : " + String.valueOf(cp1.getSaldo()));
							cp1.atualizarSaldo();
						}

						break;
					case 0:
						JOptionPane.showMessageDialog(null,"Obrigado por usar a livraria");
						break;
					} 

				}while(opOperacao != 0);
			} else{
				if (opPro == 3){ // Totaliza Contas
					cont.setSaldoTotal(0.0);
					cont.totalizarSaldo(cp1);
					cont.totalizarSaldo(cc1);
					JOptionPane.showMessageDialog(null , "Total dos Saldos:" + String.valueOf(cont.getSaldoTotal()));
				}

			}

		}while(opPro != 0);
		JOptionPane.showMessageDialog(null,"Obrigado por usar a livraria 1");
	}
}
