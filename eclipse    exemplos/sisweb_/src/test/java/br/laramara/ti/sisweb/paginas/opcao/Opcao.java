package br.laramara.ti.sisweb.paginas.opcao;

public enum Opcao {
	ID(2), 
	CONTEM_TITULO(3), 
	CONTEM_AUTOR(4), 
	CONTEM_ASSUNTO(5),
	CONTEM_LOCAL_ARMAZENADO(6),
	CONTEM_AAAT(7), 
	CONTEM_VOLUME(8), 
	CONTEM_TIPO(9); 

	private int coluna;

	Opcao(int coluna) {
		this.coluna = coluna;
	}
	public int obterColuna() {
		return coluna;
	}

}
