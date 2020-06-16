import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Instanciando uma calculadora - calc
		Calculadora calc = new Calculadora();
		int op;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha agora a opção desejada:\n\n1 - Somar\n2 - Subtrair"
					+ "\n3 - Multiplicar\n4 - Dividir\n0 - Sair\n\nDigite a opção desejada:"));
			if (op > 0 && op <=4)
				switch (op) {
				case 1:
					calc.leDados();
					calc.somar();
					calc.exibirResultado();
					break;
				case 2:
					calc.leDados();
					calc.subtrair(calc.getN1(),calc.getN2());
					calc.exibirResultado();
					break;
				case 3:
					calc.leDados();
					calc.multiplicar();
					calc.exibirResultado();
					break;
				case 4:
					calc.leDados();
					if (calc.dividir(calc.getN1(),calc.getN2())){
						calc.exibirResultado();
					}else{
						JOptionPane.showMessageDialog(null,"O denominador da divisão não pode possuir valor zero.");
					}
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opção Inválida");
				}

		} while (op != 0);
	}
}
