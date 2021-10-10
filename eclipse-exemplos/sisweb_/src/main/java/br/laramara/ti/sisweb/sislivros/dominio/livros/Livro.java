package br.laramara.ti.sisweb.sislivros.dominio.livros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.laramara.ti.sisweb.sislivros.dominio.TamanhoMaximoLivros;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "titulo", length = TamanhoMaximoLivros.TITULO)
	private String titulo;

	@Column(name = "autor", length = TamanhoMaximoLivros.AUTOR)
	private String autor;

	@Column(name = "assunto", length = TamanhoMaximoLivros.ASSUNTO)
	private String assunto;

	@Column(name = "local_armazenado", length = TamanhoMaximoLivros.LOCAL_ARMAZENADO)
	private String localArmazenado;

	@Column(name = "aaat", length = TamanhoMaximoLivros.AAAT)
	private String aaat;

	@Column(name = "volume", length = TamanhoMaximoLivros.VOLUME)
	private String volume;

	@Column(name = "tipo", length = TamanhoMaximoLivros.TIPO)
	private String tipo;

	@Column(name = "status")
	private boolean status;

	public Livro() {
		inicializarStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getLocalArmazenado() {
		return localArmazenado;
	}

	public void setLocalArmazenado(String localArmazenado) {
		this.localArmazenado = localArmazenado;
	}

	public String getAaat() {
		return aaat;
	}

	public void setAaat(String aAAt) {
		aaat = aAAt;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getStatus() {
		return status;
	}

	public String getAtivo() {
		return status ? "ATIVO" : "DESATIVADO";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean possuiId() {
		return id != null;
	}
	
	private void inicializarStatus() {
		status = true;		
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor
				+ ", assunto=" + assunto + ", localArmazenado="
				+ localArmazenado + ", aaat=" + aaat + ", volume=" + volume
				+ ", tipo=" + tipo + ", status=" + status + "]";
	}

}
