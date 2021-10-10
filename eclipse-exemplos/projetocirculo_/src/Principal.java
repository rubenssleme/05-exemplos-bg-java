import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Circulo circ1 = new Circulo(); // Instancia��o do objeto 
		int op; //declara��o da vari�vel de op��es
		do{ // In�cio do looping do-while
			// Apresenta��o e leitura do menu de op��es
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastra Circulo \n2 - Exibe Di�metro do Circulo \n3 - Exibe Per�metro do Circulo  \n4 - Exibe Per�metro do �rea \n0 - Sair"));
			switch(op){ // Abertura da estrutura de switch-case
			case 1:
				circ1.cadastraCirculo(); //Chamada ao m�todo cadastra
				break;
			case 2:
				circ1.calculaDiametro(); //Chamada ao m�todo diametro
				break;
			case 3:
				circ1.calculaPerimetro(); //Chamada ao m�todo per�metro
				break;
			case 4:
				circ1.calculaArea(); //Chamada ao m�todo area
				break;	
			case 0:
				JOptionPane.showMessageDialog(null,"Finalizando programa!");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o Inv�lida.");
				break;
			}
		} while (op != 0); // Repetir� as opera��es enquanto a op��o for diferente de zero
	}

}
