//importa�ao necessaria para cria�ao de formularios Swing ou AWT
import javax.swing.*;
import java.awt.*;

public class CorDeFundoTela extends JFrame{
 //M�todo  que altera a cor de fundo do formulario Java
	public CorDeFundoTela(){// Usando contrutor 
		super("Definindo a cor de fundo do formulario"); //Usando Heran�a para definir o titulo do
		Container tela = getContentPane();//intanciando a tela               // do formulario 
		tela.setBackground(Color.magenta);// Alterando a cor de fundo
		setSize(600, 300);//definindo Largura e Altura
		setVisible(true);//deixando o formulario Visivel
	}

	public static void main(String args[]){// Metodo de execu��o da Classe
		CorDeFundoTela app = new CorDeFundoTela();//Instanciando objeto app
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defininso opera�ao default do form
		                                                   // Fechar no X

	}
}