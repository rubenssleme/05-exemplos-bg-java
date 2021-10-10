import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Utilitario.formatarData(Utilitario.retornaCalendar("01/01/0001")));
		Hospedagem ho = new Hospedagem();
		Hospede h = new Hospede();
		Funcionario f = new Funcionario();
		int op = 0;
		while (op != 4) {
			op = Integer
					.parseInt(JOptionPane
							.showInputDialog("Menu de Opções\n--------------\n\n1 - Hospedar hospede\n2 - Visualizar hospedagem\n3 - Cadastar funcionário\n4 - Sai do Programa"));

			switch (op) {
			case 1:
				int codigo = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o codigo: "));
				String nome = JOptionPane.showInputDialog("Digite o nome: ");
				String rg = JOptionPane.showInputDialog("Digite o RG: ");
				String telefone = JOptionPane
						.showInputDialog("Digite o Telefone: ");
				String cidade = JOptionPane
						.showInputDialog("Digite o Cidade: ");
				h.cadastrar(codigo, nome, rg, telefone, cidade);
				
				int codigo1 = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o codigo: "));
				String checkin = (JOptionPane
						.showInputDialog("Digite o Checkin: "));
				int numQuarto = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o Numero: "));
				String checkout = (JOptionPane
						.showInputDialog("Digite o Checkout: "));

				ho.hospedar(codigo1, Utilitario.retornaCalendar(checkin),
						numQuarto, Utilitario.retornaCalendar(checkout), h);

				break;
			case 2:
				JOptionPane.showMessageDialog(null, ho);
				break;
			case 3:
				int codigo2 = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o codigo: "));
				String nome1 = JOptionPane.showInputDialog("Digite o nome: ");
				String rg1 = JOptionPane.showInputDialog("Digite o RG: ");
				String telefone1 = JOptionPane
						.showInputDialog("Digite o Telefone: ");
				Double salario = Double.parseDouble(JOptionPane
						.showInputDialog("Digite o Salario: "));
				String cargo = JOptionPane
						.showInputDialog("Digite o Cargo: ");
				
				 f.cadastrar(codigo2, nome1, rg1, telefone1, salario, cargo);
				break;
			case 4:
				break;
			default:
			}
		}
	}
}
