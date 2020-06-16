import javax.swing.JOptionPane;

public class Carro {
	private String modelo;
	private String marca;
	private boolean estado;
	private int marchaAtual;
	private double velocidade;


	public Carro(){
		this("","",false,0,0.0);
	}
	public Carro(String modelo,String marca,boolean estado,int marchaAtual,double velocidade){
		this.modelo=modelo;
		this.marca=marca;
		this.estado = estado;
		this.marchaAtual = marchaAtual;
		this.velocidade = velocidade;
	}

	//Getters e Setters
	public final String getModelo() {
		return modelo;
	}
	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public final String getMarca() {
		return marca;
	}
	public final void setMarca(String marca) {
		this.marca = marca;
	}
	public final int getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	// Metodos 
	public void ligarCarro(boolean ligado){
		if(this.isEstado()){
			this.setEstado(ligado);
		}else{
			this.setEstado(ligado);
		}
	}

	private boolean estadoCarro(boolean b) {
		this.setEstado(b);
		return this.isEstado();
	}


	public void msgCarro(boolean estadoCarro){
		if(estadoCarro){
			JOptionPane.showMessageDialog(null, "Carro Ligado");
		}else{
			JOptionPane.showMessageDialog(null, "Carro Desligado");

		}
	}


	public void subirMarcha(){
		this.setMarchaAtual(this.getMarchaAtual() + 1 );
	}

	public void subirVelocidade(){

		while(this.getVelocidade()<= 100){
			this.setVelocidade(this.getVelocidade() + 0.1);
			System.out.println("A velocidade é: " + this.getVelocidade() );
		}
		JOptionPane.showMessageDialog(null,"A velocidade é: " + (String.valueOf(this.getVelocidade())));
	}


	public void descerMarcha(){
		this.setMarchaAtual(this.getMarchaAtual() - 1 );
	}


}
















