package br.laramara.ti.sislaraserver.dominio.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.laramara.ti.sislaracommons.Identificavel;
import br.laramara.ti.sislaraserver.dominio.TamanhoMaximoGenerico;

@Entity
@Table(name = "rede_encaminhamento")
public class RedeEncaminhamento implements Identificavel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricao", length = TamanhoMaximoGenerico.DESCRICAO, nullable = false)
	private String descricao;

	public RedeEncaminhamento() {
	}

	public RedeEncaminhamento(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "RedeEncaminhamento [id=" + id + ", descricao=" + descricao + "]";
	}
}
