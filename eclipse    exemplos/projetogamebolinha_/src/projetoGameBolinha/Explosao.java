package projetoGameBolinha;

import java.awt.Color;
import java.awt.Graphics2D;

public class Explosao {
	private double posicaoX;
	private double posicaoY;
	private int raio;
	private int raioMaximo;


	public Explosao(double posicaoX, double posicaoY, int raio, int raioMaximo){

		this.posicaoX = posicaoX;
		this.posicaoY =  posicaoY;
		this.raio = raio;
		this.raioMaximo = raioMaximo;
	}
	
	
	public boolean atualizarExplosao(){
		raio += 2;
		if(raio >= raioMaximo){
			return true;
		}
		return false;
	}
	
	public void desenhaForma2D(Graphics2D forma){
		forma.setColor(new Color(255, 255, 255,128));
		
	}


}
