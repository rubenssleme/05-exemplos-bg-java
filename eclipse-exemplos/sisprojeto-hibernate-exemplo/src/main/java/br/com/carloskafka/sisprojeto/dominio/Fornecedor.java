package br.com.carloskafka.sisprojeto.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
        @Column(name = "nome")
	private String nome;
        @Column(name = "nomeFantasia")
	private String nomeFantasia;
        
	private String cnpj;

	public Fornecedor() {
		this(0L, "", "", "");
	}

	public Fornecedor(Long id, String nome, String nomeFantasia, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", nomeFantasia="
				+ nomeFantasia + ", cnpj=" + cnpj + "]";
	}

}
