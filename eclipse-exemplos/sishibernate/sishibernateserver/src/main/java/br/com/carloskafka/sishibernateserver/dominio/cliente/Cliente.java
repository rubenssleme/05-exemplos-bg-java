package br.com.carloskafka.sishibernateserver.dominio.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.carloskafka.sishibernateserver.dominio.Validavel;
import br.com.carloskafka.sishibernateserver.dominio.ValidavelObrigatoriedadeETamanhoMaximo;

@Entity
@Table(name = "cliente")
public class Cliente extends Validavel implements
		ValidavelObrigatoriedadeETamanhoMaximo, Serializable {
	private static final long serialVersionUID = 2343004606153845227L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", length = TamanhoMaximoCliente.NOME)
	private String nome;

	@Column(name = "cnpj", length = TamanhoMaximoCliente.CNPJ)
	private String cnpj;

	@Column(name = "razao_social", length = TamanhoMaximoCliente.RAZAO_SOCIAL)
	private String razaoSocial;

	@Column(name = "email", length = TamanhoMaximoCliente.EMAIL)
	private String email;

	@Column(name = "telefone", length = TamanhoMaximoCliente.TELEFONE)
	private String telefone;

	@Column(name = "versao")
	private String versao;

	public Cliente() {
		versao = "";
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public boolean possuiId() {
		return id != null;
	}

	@Override
	public void validarObrigatoriedadeETamanhoMaximoDeDados() {
		validarObrigatoriedadeDeDados();
		validarTamanhoMaximoDeDados();
	}

	private void validarTamanhoMaximoDeDados() {
		if (tamanhoMaximoViolado(nome, TamanhoMaximoCliente.NOME)) {
			adicionarErro("Insira o Nome contendo até "
					+ TamanhoMaximoCliente.NOME + " caracteres.");
		}
		if (tamanhoMaximoViolado(cnpj, TamanhoMaximoCliente.CNPJ)) {
			adicionarErro("Insira o CNPJ contendo até "
					+ TamanhoMaximoCliente.CNPJ + " caracteres.");
		}
		if (tamanhoMaximoViolado(razaoSocial, TamanhoMaximoCliente.RAZAO_SOCIAL)) {
			adicionarErro("Insira a Razao Social contendo até "
					+ TamanhoMaximoCliente.RAZAO_SOCIAL + " caracteres.");
		}
		if (tamanhoMaximoViolado(email, TamanhoMaximoCliente.EMAIL)) {
			adicionarErro("Insira o Email contendo até "
					+ TamanhoMaximoCliente.EMAIL + " caracteres.");
		}
		if (tamanhoMaximoViolado(telefone, TamanhoMaximoCliente.TELEFONE)) {
			adicionarErro("Insira o Telefone contendo até "
					+ TamanhoMaximoCliente.TELEFONE + " caracteres.");
		}
	}

	private void validarObrigatoriedadeDeDados() {
		if (nome == null || nome.isEmpty()) {
			adicionarErro("Adicione um nome");
		}
		if (cnpj == null || cnpj.isEmpty()) {
			adicionarErro("Adicione um CNPJ");
		}
		if (razaoSocial == null || razaoSocial.isEmpty()) {
			adicionarErro("Adicione uma Razao Social");
		}
		if (email == null || email.isEmpty()) {
			adicionarErro("Adicione um Email");
		}
		if (telefone == null || telefone.isEmpty()) {
			adicionarErro("Adicione um Telefone");
		}
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj
				+ ", razaoSocial=" + razaoSocial + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}

}
