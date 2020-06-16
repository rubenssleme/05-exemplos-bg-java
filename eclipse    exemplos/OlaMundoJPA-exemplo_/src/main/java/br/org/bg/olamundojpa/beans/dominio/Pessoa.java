package br.org.bg.olamundojpa.beans.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false, length = 45)
    private String nome;
    @Column(nullable = false, length = 45)
    private String pai;
    @Column(nullable = false, length = 45)
    private String mae;
    @Column(nullable = false, length = 45)
    private String email;
    @Column( length = 45)
    private String telefone;

    public Pessoa() {
    }

    
    public Pessoa(String nome, String pai, String mae, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.email = email;
        this.telefone = telefone;
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

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
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

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", pai=" + pai + ", mae=" + mae + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
}
