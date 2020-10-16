import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// 1º - Valor Saldo 2º Valor Limite
		ContaCorrente cc1 = new ContaCorrente(00.00, 1000.00);
		ContaPoupanca cp1 = new ContaPoupanca(1000.00, 50.00);

		int opConta = 0; // variavel que indica a conta a ser usada
		int opOperacao = 0;

		do {
			opConta = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha a Opção:\n1 - Conta Corrente \n2 - Conta Poupança \n0 - Sair"));
			if (opConta != 0)

				do {

					opOperacao = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha a Opção  do CC ou CP :\n1 - Depositar \n2 - Sacar \n3 - Consultar \n4 - Atualizar \n0 - Sair"));

					switch (opConta) { // Abertura da estrutura de switch-case

					case 1: // Conta Corrente

						if (opOperacao == 1) {// depositar
							double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor a Creditar:"));
							cc1.depositar(valor);
						}
						if (opOperacao == 2) {// debitar
							double valor = Double
									.parseDouble(JOptionPane.showInputDialog("Digite Valor a Debitar, \npor favor:"));
							cc1.sacar(valor);
						}						
						if (opOperacao == 3) {// consultar
							JOptionPane.showMessageDialog(null, "O seu saldo é: " + String.valueOf(cc1.getSaldo()));
						}

						break;

					
					
					
					
					
					
					case 2: // Conta Poupanca

						if (opOperacao == 1) {// depositar
							double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor a Creditar:"));
							cp1.depositar(valor);
						}
						if (opOperacao == 2) {// debitar
							double limiteEspecial = Double
									.parseDouble(JOptionPane.showInputDialog("Digite Valor a Debitar:"));
							cp1.sacar(limiteEspecial);
						}
						if (opOperacao == 3) {// Consultar
							JOptionPane.showMessageDialog(null, "Consulta saldo: " + cp1.getSaldo());
						}

						break;

					case 0:// Sair do Menu
						JOptionPane.showMessageDialog(null, "Obrigado por usar a nossa agencia");
						break;
					}

				} while (opOperacao != 0);

		} while (opConta != 0);
	}
}
