import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Instanciando uma calculadora - calc
		Calculadora calc = new Calculadora();
		int op;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha agora a op��o desejada:\n\n1 - Somar\n2 - Subtrair"
					+ "\n3 - Multiplicar\n4 - Dividir\n0 - Sair\n\nDigite a op��o desejada:"));
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
						JOptionPane.showMessageDialog(null,"O denominador da divis�o n�o pode possuir valor zero.");
					}
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,"Op��o Inv�lida");
				}

		} while (op != 0);
	}
}
