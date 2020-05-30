
public class Carro {
	private String modelo;
	private String marca;
	private int nroPortas;
	private int marchaAtual;
	
	public Carro(){
		this("","",0,0);
	}
	public Carro(String modelo,String marca,int nroPortas,int marchaAtual){
		this.modelo=modelo;
		this.marca=marca;
		this.nroPortas = nroPortas;
		this.marchaAtual = marchaAtual;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNroPortas() {
		return nroPortas;
	}
	public void setNroPortas(int nroPortas) {
		this.nroPortas = nroPortas;
	}
	public int getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	public void ligar(){
		System.out.println("Carro Ligado.");
	}
	public void desligar(){
		System.out.println("Carro Desligado.");
	}
	public void subirMarcha(){
		this.setMarchaAtual(this.getMarchaAtual() + 1 );
	}
	public void descerMarcha(){
		this.setMarchaAtual(this.getMarchaAtual() - 1 );
	}
}
