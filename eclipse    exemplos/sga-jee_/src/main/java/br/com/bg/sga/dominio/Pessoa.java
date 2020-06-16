
package br.com.bg.sga.dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
private static final long serialVersionUID = 1L;

private int id ;
private String nome;
private String  pai;
private String mae;
private String  email;
private String tefone;

    public Pessoa() {}

    public Pessoa(int id, String nome, String pai, String mae, String email, String tefone) {
        super();
        this.id = id;
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.email = email;
        this.tefone = tefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTefone() {
        return tefone;
    }

    public void setTefone(String tefone) {
        this.tefone = tefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", pai=" + pai + ", mae=" + mae + ", email=" + email + ", tefone=" + tefone + '}';
    }


     
    

    
}
