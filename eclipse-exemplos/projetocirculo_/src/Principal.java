import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Circulo circ1 = new Circulo(); // Instanciação do objeto 
		int op; //declaração da variável de opções
		do{ // Início do looping do-while
			// Apresentação e leitura do menu de opções
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastra Circulo \n2 - Exibe Diâmetro do Circulo \n3 - Exibe Perímetro do Circulo  \n4 - Exibe Perímetro do Área \n0 - Sair"));
			switch(op){ // Abertura da estrutura de switch-case
			case 1:
				circ1.cadastraCirculo(); //Chamada ao método cadastra
				break;
			case 2:
				circ1.calculaDiametro(); //Chamada ao método diametro
				break;
			case 3:
				circ1.calculaPerimetro(); //Chamada ao método perímetro
				break;
			case 4:
				circ1.calculaArea(); //Chamada ao método area
				break;	
			case 0:
				JOptionPane.showMessageDialog(null,"Finalizando programa!");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção Inválida.");
				break;
			}
		} while (op != 0); // Repetirá as operações enquanto a opção for diferente de zero
	}

}
