package br.org.lm.javaee7crud.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="tb_servidor")
@Entity
public class Servidor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column(name="nome_servidor")
	private String nomeServidor;
	@Column
	private String marca;
	@Column
	private String modelo;
	@Column(name="data_compra")
	private Date dataCompra;
	@Column(name="sistema_operacional")
	private String sistemaOperacional;
	@Column(name="endereco_ip")
	private String enderecoIP;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeServidor() {
		return nomeServidor;
	}
	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public String getEnderecoIP() {
		return enderecoIP;
	}
	public void setEnderecoIP(String enderecoIP) {
		this.enderecoIP = enderecoIP;
	}
	
	public boolean posuiId(){
		return id != null;
	}
	
	
	@Override
	public String toString() {
		return "Servidor [id=" + id + ", nomeServidor=" + nomeServidor + ", marca=" + marca + ", modelo=" + modelo
				+ ", dataCompra=" + dataCompra + ", sistemaOperacional=" + sistemaOperacional + ", enderecoIP="
				+ enderecoIP + "]";
	}
	
	
	
	
}
