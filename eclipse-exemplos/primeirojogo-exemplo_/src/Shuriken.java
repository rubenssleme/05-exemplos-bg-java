import java.awt.Image;

import javax.swing.ImageIcon;


public class Shuriken {
	private Image imagem;
	private int x,y;
	private boolean isVisible;
	
	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 2;
	
	public Shuriken(int x, int y){
		this.x = x;
		this.y = y;
		
		ImageIcon referencia = new ImageIcon("rsc\\shuriken.gif");
		imagem = referencia.getImage();
		
		isVisible = true;
		
	}
	
	public void mexer(){
		this.x += VELOCIDADE;
		if (this.x > LARGURA_TELA)
			isVisible = false;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
