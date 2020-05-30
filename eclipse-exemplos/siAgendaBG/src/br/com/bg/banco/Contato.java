package br.com.bg.banco;

import java.util.Date;

public class Contato {
	
	private Integer id;
	private String nomeContato;
	private Date dataAbertura = new Date();
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nomeContato=" + nomeContato + ", dataAbertura=" + dataAbertura + "]\n";
	}
	
	
	
	

}
