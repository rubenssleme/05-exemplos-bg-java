package br.com.example.conexadocker.model;

public class Autor {
	private int id;
	private String nome;

	public Autor() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Autor{" +
				"nome='" + nome + '\'' +
				"uf='" + UF.BA + '\'' +
				"Genero='" + Genero.MASCULINO + '\'' +
				'}';
	}


}
