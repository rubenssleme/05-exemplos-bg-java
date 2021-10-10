//importaçao necessaria para criaçao de formularios Swing ou AWT
import javax.swing.*;
import java.awt.*;

public class CorDeFundoJanelaJava extends JFrame{
 //Método  que altera a cor de fundo do formulario Java
	public CorDeFundoJanelaJava(){// Usando contrutor 
		super("Definindo a cor de fundo da Janela"); //Usando Herança para definir o titulo do
		Container tela = getContentPane();//intanciando a tela          // do formulario 
		tela.setBackground(Color.cyan);// Alterando a cor de fundo
		setSize(800, 600);//definindo Largura e Altura
		setVisible(true);//deixando o formulario Visivel
	}
	
}