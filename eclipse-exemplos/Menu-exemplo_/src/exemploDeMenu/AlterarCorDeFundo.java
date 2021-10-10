package exemploDeMenu;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class AlterarCorDeFundo extends JFrame{

	private Color verificaCor(String cor){
		//String cor = solicitarCor();
		Color c = null;
		if (cor.equals("Azul")){
			c = Color.blue;
		}else if(cor.equals("Verde")){
			c = Color.green;
		}else if(cor.equals("vermelho")){
			c = Color.red;
		}else if(cor.equals("Amarelo")){
			c = Color.yellow;
		}else if(cor.equals("Preto")){
			c = Color.black;
		}

		return c;
	}

	public Container mudarCorDeFundo(Container c,String cor){
		// Processamento do metodo.
		c.setBackground(verificaCor(cor));
		return c;
	}

}
