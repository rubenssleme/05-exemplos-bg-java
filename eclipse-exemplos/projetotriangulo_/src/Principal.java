import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		int op=0;
		while (op!=4)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Menu de Op��es\n--------------\n\n"
					+ "1 - Cadastra Tri�ngulo\n2 - Calcula Per�metro\n3 - Exibe o nome do tri�ngulo"
					+ "\n4 - Sai do Programa"));
			switch (op)
			{
				case 1:
					tri.leLados();
					break;
				case 2:
					tri.calculaPerimetro();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "O tri�ngulo � "+tri.nomeTriangulo()+".");
					break;
				case 4:
					break;
				default:
			}
		}
	}
}
