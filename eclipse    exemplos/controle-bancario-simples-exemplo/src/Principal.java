import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contaCorrente cc1 = new contaCorrente(100.00, 000.00);
		contaPoupanca cp1 = new contaPoupanca(200.00, 000.00); 

		int opTipoConta, opOperacao = 0;

		do{ 
			opTipoConta =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:\n1 - Conta Corrente \n2 - Conta Poupança \n0 - Sair"));
			if (opTipoConta != 0)

				do{

					opOperacao =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:\n1 - Depositar \n2 - Sacar \n3 - Consultar \n4 - Atualizar \n0 - Sair"));

					switch(opTipoConta){ // Abertura da estrutura de switch-case

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
							JOptionPane.showMessageDialog(null, "O seu saldo na conta corrente é : " + String.valueOf(cc1.getSaldo()));
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
						if (opOperacao == 3){//Consultar
							JOptionPane.showMessageDialog(null, "O seu saldo na poupança é : " + String.valueOf(cp1.getSaldo()));
						}

						break;

					case 0:
						JOptionPane.showMessageDialog(null,"Obrigado por usar a livraria");
						break;
					} 

				}while(opOperacao != 0);

		}while(opTipoConta != 0);
	}
}
