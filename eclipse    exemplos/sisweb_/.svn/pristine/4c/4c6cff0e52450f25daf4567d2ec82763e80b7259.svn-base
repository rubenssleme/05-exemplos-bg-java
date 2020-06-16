package br.laramara.ti.sisweb.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

import br.laramara.ti.sisweb.utilitarios.Criptografia;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 5966427416068340140L;

	@Id
	private String cpf;

	@Column(name = "senha", length = TamanhoMaximoUsuario.SENHA)
	private String senha;

	@Column(name = "email", length = TamanhoMaximoUsuario.EMAIL)
	private String email;

	@Enumerated(EnumType.STRING)
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "usuario_sistemas", joinColumns = @JoinColumn(name = "cpf"))
	@Column(name = "descricao", length = TamanhoMaximoUsuario.SISTEMA)
	private List<Sistema> sistemas;

	@Column(name = "ativo")
	private boolean ativo;

	@Transient
	private String nome;

	public Usuario() {
		this.sistemas = new ArrayList<Sistema>();
		ativo = true;
	}

	public void atribuirAutorizacaoDeAcessoAoHolerite() {
		this.adicionarPermissao(Sistema.SISRH_ACESSAR_HOLERITE);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return "";
	}

	public void setSenha(String senha) {
		if (senha != null && !senha.isEmpty()) {
			this.senha = Criptografia.converterParaMD5(senha);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdministradorSisRh() {
		return sistemas.contains(Sistema.SISRH_ADMINISTRACAO);
	}

	public String getStatusAdministradorSisRh() {
		return isAdministradorSisRh() ? "SIM" : "NÃO";
	}

	public void setAdministradorSisRh(boolean administradorSisRH) {
		if (administradorSisRH) {
			this.adicionarPermissao(Sistema.SISRH_ADMINISTRACAO);
		} else {
			sistemas.remove(Sistema.SISRH_ADMINISTRACAO);
		}
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sistema> getSistemas() {
		Collections.sort(sistemas, Sistema.obterComparador());
		return sistemas;
	}

	public void setSistemas(List<Sistema> sistemas) {
		this.sistemas = sistemas;
	}

	public boolean possuiPermissaoAdministracao() {
		return possuiSistema(Sistema.SISRH_ADMINISTRACAO)
				|| possuiSistema(Sistema.SISLIVROS_ADMINISTRACAO);
	}

	public boolean possuiSistema(Sistema sistema) {
		return this.sistemas.contains(sistema);
	}

	public boolean possuiCpf() {
		return cpf != null;
	}

	private void adicionarPermissao(Sistema sistema) {
		if (!this.possuiSistema(sistema)) {
			this.sistemas.add(sistema);
		}
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", senha=" + senha + ", email=" + email
				+ ", sistemas=" + sistemas + ", ativo=" + ativo + "]";
	}

}
