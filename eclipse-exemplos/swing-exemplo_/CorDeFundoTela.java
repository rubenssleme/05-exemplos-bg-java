//importaçao necessaria para criaçao de formularios Swing ou AWT
import javax.swing.*;
import java.awt.*;

public class CorDeFundoTela extends JFrame{
 //Método  que altera a cor de fundo do formulario Java
	public CorDeFundoTela(){// Usando contrutor 
		super("Definindo a cor de fundo do formulario"); //Usando Herança para definir o titulo do
		Container tela = getContentPane();//intanciando a tela               // do formulario 
		tela.setBackground(Color.magenta);// Alterando a cor de fundo
		setSize(600, 300);//definindo Largura e Altura
		setVisible(true);//deixando o formulario Visivel
	}

	public static void main(String args[]){// Metodo de execução da Classe
		CorDeFundoTela app = new CorDeFundoTela();//Instanciando objeto app
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defininso operaçao default do form
		                                                   // Fechar no X

	}
}