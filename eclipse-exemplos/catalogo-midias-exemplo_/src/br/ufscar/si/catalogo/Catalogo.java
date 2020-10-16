package br.ufscar.si.catalogo;
/**
*
* @author Ana Paula
*/
public class Catalogo implements IColecaoMidia {
	private int tamMax;

	Midia[] midias;
	public Catalogo(int tamMax) {
		
		
		
		
		this.tamMax = tamMax;
		midias =  new Midia[tamMax] ;

	}


	@Override
	public Midia[] colecao() {

		return colecao();
	}

	@Override
	public Midia[] colecaoPorTipo(int tipo) {
		
		return colecaoPorTipo(tipo);
	}
	
	public boolean adicionaMidia(Midia midia){
		
		return midia != null ;

	}

	public Midia obtemMidia(String titulo){
		
		
		
		return null ;

	}
	public int quantidadeMaximaDeMidias(){
		return tamMax;

	}
	public int quantidadeDeMidias(){
		return tamMax;

	}
	public int quantidadeDeCDs(){
		return tamMax;

	}
	public int quantidadeDeDVDs(){
		return tamMax;

	}


	public int quantidadeDeJogos(){
		return tamMax;

	}
	public void imprimeColecao(){

	}
	public void imprimeColecaoPorTipo(){

	}


}
