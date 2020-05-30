import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtividadeSemanaOito atv = new AtividadeSemanaOito();
					
		int op=0;
		while (op!=6)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Menu de Opções\n---------------------------------\n" +
					"\n1 - Caracter por Caracter\n2 - De Tras para Frente\n3 - De Substring\n4 - Concatena duas String\n5 - A Por Java\n6 - Sai do Programa"));
			switch (op)
			{
				case 1:
					atv.caracterPorCaracter();
					break;
				case 2:
					atv.deTrasParaFrente();
					break;
				case 3:
					atv.deSubstring();
					break;
				case 4:
					atv.duasString();
					break;
				case 5:
					atv.aPorJava();
					break;
				case 6:
					break;
				default:
			}
		}
		
		
		
		
	}

}
