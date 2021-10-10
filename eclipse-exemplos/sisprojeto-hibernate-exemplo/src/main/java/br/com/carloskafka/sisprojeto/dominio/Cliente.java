package br.com.carloskafka.sisprojeto.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "enderecao")
    private String endereco;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    private boolean validado;

    public Cliente() {
        this(0L, "", "", "", "", "");
    }

    public Cliente(Long id, String nome, String cpf, String endereco,
            String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.validado = true;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String Cpf) {
        this.cpf = Cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public boolean validar() {

        if ((this.nome != null) && (this.nome.isEmpty())) {
            this.validado = false;
        }
        return validado;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf
                + ", endereco=" + endereco + ", email=" + email
                + ", telefone=" + telefone + "]";
    }

}
