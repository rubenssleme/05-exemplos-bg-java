package dominio;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: tb_produto
 *
 */
@Entity
@Table(name="tb_produto")
public class Produto implements Serializable {
	   
	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	private Double preco;
	private static final long serialVersionUID = 1L;

	public Produto() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}   
	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
   
}
