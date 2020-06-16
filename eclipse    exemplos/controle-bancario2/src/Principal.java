import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();

		int opPro = 0;

		do {
			opPro = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite:\n1 - Conta Corrente \n2 - Conta Poupança \n3 - Consultar Saldo \n0 - Sair"));

			if ((opPro == 1) || (opPro == 2)) {// Vendo se é conta corrente ou conta poupança.
				System.out.println("opção :" + opPro);
				

			} else {
				if (opPro == 3) { // Totaliza Contas
					System.out.println("opção :" + opPro);

				}
			}

		} while (true);

	}

}
