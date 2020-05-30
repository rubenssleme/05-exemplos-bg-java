import javax.swing.JOptionPane;


public class Movimentacao {

	public static void main(String[] args)
	{
		ContaCorrente cc = new ContaCorrente(500,1000);
		ContaPoupanca cp = new ContaPoupanca(5000,0.01);

		int op, op2=0;
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Opções\n\n" +
					"\n1 - Conta Corrente \n2 - Conta Poupança \n0" +
			" - Sair"));
			if (op!=0)
			{
				do{
					String k = "Conta Corrente";
					if (op==2)
					{
						k="Conta Poupança";	
					}
					op2=Integer.parseInt(JOptionPane.showInputDialog(null, "Opções "+k+ "\n\n" +
							"\n1 - Depositar \n2 - Sacar \n3 - Consultar Saldo \n" +
							"4 - Reajustar Saldo \n0 - Sair"));
					switch(op)
					{
					case 1://CC
						switch(op2)
						{
						case 1://depositar
							cc.creditar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar")));
							break;
						case 2:
							cc.debitar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar!")));
							break;
						case 3:
							JOptionPane.showMessageDialog(null, "Saldo Atual: "+cc.getSaldo());
							break;
						}
						break;
					case 2://CP
						switch(op2)
						{
						case 1://depositar
							cp.creditar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar")));
							break;
						case 2:
							cp.debitar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar!")));
							break;
						case 3:
							JOptionPane.showMessageDialog(null, "Saldo Atual: "+cp.getSaldo());
							break;
						case 4:
							cp.atualizarSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Reajuste do Saldo")));
							break;
						}
						break;
						
						
					}
				}while(op2!=0);	
			}
		}while(op!=0);
	}
}
