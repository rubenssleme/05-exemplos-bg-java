package br.laramara.ti.sislaracommons.dtos.usuario;

import br.laramara.ti.sislaracommons.dtos.ModeloDTO;

public class RedeEncaminhamentoDTO extends ModeloDTO {

	private static final long serialVersionUID = -6619194507291271553L;

	private Long id;
	private String descricao;

	public RedeEncaminhamentoDTO(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public String toString() {
		return this.descricao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedeEncaminhamentoDTO other = (RedeEncaminhamentoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
