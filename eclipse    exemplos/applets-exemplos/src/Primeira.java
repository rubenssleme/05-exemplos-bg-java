import java.applet.*;
import java.awt.*; 

public class Primeira extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawString("Triangulo Equilatero", 125, 215);
		g.drawLine(50,200,250,200);
		g.drawLine(50,200,150,27);
		g.drawLine(250,200,150,27);
		
	} 
}
