



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Triangulo extends JFrame {
	private JButton bIncluir;
	

	
	
	public Triangulo() {
	this.setTitle("Triangulo");	
	this.setResizable(false);
	this.setSize(600, 500);
	this.setLocation(300, 100);
	this.setBackground(Color.lightGray);
	this.setLayout(null);

	}
@Override
public void paint(Graphics g) {
	
	super.paint(g);
	g.drawString("Triangulo Equilatero ",100,215);
	g.drawLine(50,200,250,200);
	g.drawLine(50,200,150,75);
	g.drawLine(250,200,150,75);
}	
	




	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		tri.setVisible(true);
		
	}

}
