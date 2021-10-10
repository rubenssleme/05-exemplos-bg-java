import java.applet.Applet;
import java.awt.*;

public class Feliz extends  Applet {

	
	public void paint(Graphics g){
		g.setColor(Color.orange);
		g.fillOval(30, 30, 150, 150);
		g.setColor(Color.black);
		g.drawArc(80, 100, 50, 50, 180, 180);
		
	}	
	
	
}
