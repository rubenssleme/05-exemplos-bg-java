import javax.swing.*;
import java.awt.*;

public class JLabelcomImagem extends JFrame{
	JLabel imagem;
	public JLabelcomImagem(){
		super("Uso da classe JLabel do Swing com Imagem");
		Container tela = getContentPane();
		ImageIcon icone = new ImageIcon("Duke.jpg");
		imagem = new JLabel(icone);
		tela.add(imagem);
		setSize(500, 460);
		setVisible(true);
	}
	
	public static void main(String args[]){
		JLabelcomImagem app = new JLabelcomImagem();
		//app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}