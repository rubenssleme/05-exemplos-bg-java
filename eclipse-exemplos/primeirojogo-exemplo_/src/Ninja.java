import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Ninja {
	private int x,y,dx,dy,altura,largura;
	private Image imagem;
	private List <Shuriken> shurikens;
	
	public Ninja(){
		ImageIcon referencia = new ImageIcon("rsc\\ninja.gif");
		imagem = referencia.getImage();
		shurikens = new ArrayList<Shuriken>();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
		this.x = 100;
		this.y = 100;
	}
	
	public void mexer(){
		
		System.out.println(x +","+ y);
		x += dx;
		y += dy;
		
		if(this.x < 1)
			x = 1;
		if(this.x > 452)
			x = 452;
		if(this.y < 1)
			y = 1;
		if(this.y > 323)
			y = 323;
	}
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	public List<Shuriken> getShurikens() {
		return shurikens;
	}
	
	public void atira(){
		this.shurikens.add(new Shuriken(x + largura, y + altura/2));
	}

	public void keyPressed(KeyEvent tecla){
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_SPACE)
			atira();
		if (codigo == KeyEvent.VK_UP)
			dy = -1;		
		if (codigo == KeyEvent.VK_DOWN)
			dy = 1;
		if (codigo == KeyEvent.VK_RIGHT)
			dx = 1;
		if (codigo == KeyEvent.VK_LEFT)
			dx = -1;
	}
	
	public void keyReleased(KeyEvent tecla){
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP)
			dy = 0;
		if (codigo == KeyEvent.VK_DOWN)
			dy = 0;
		if (codigo == KeyEvent.VK_RIGHT)
			dx = 0;
		if (codigo == KeyEvent.VK_LEFT)
			dx = 0;
	}
}
