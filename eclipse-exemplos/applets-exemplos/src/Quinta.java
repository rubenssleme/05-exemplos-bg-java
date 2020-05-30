import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class Quinta extends Applet {
	private int lado1, lado2, lado3;
	public void start() {
		lado1 = leiaLado(1);
		lado2 = leiaLado(2);
		lado3 = leiaLado(3);
	}
	public void paint(Graphics g) {
		int r = ehTriangulo(lado1, lado2, lado3);
		String m = "Os lados " + lado1 + ", " + lado2 +
		" e " + lado3 + " ";
		String t = "";
		switch(r) {
		case 0: t = "não formam um Triângulo.";
		break;
		case 1: t = "formam um Triângulo Equilátero.";
		g.drawLine(50,200,250,200);
		g.drawLine(50,200,150,27);
		g.drawLine(250,200,150,27);
		break;
		case 2: t = "formam um Triângulo Isósceles.";
		g.drawLine(100,200,200,200);
		g.drawLine(100,200,150,50);
		g.drawLine(200,200,150,50);
		break;
		case 3: t = "formam um Triângulo Escaleno.";
		g.drawLine(50,200,200,200);
		g.drawLine(50,200,100,100);
		g.drawLine(200,200,100,100);
		break;
		}
		g.drawString(m, 20,260);
		g.drawString(t, 20,280);
	}
	private int leiaLado(int i) {
		String msg = "Digite o valor do Lado " + i;
		String s = JOptionPane.showInputDialog(this, msg);
		return Integer.parseInt(s);
	}
	private int ehTriangulo(int l1, int l2, int l3) {
		if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
			if (l1 == l2) {
				if (l1 == l3) return 1;
				else return 2;
			} else if (l1 == l3 || l2 == l3) return 2;
			else return 3;
		} else return 0;
	}
}