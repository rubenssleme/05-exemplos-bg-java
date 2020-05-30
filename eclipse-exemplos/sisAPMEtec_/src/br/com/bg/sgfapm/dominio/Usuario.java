/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.sgfapm.dominio;

/**
 *
 * @author l
 */
public class Usuario {
    private int id;
    private String nome;
    private String usuario;
    private String senha;
    private String perfil;

    public Usuario(int id, String nome, String perfil){
        this.id = id;
        this.nome = nome;
        this.perfil = perfil;
    }
    
    public Usuario(String nome, String usuario, String senha, String perfil) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public Usuario(int id, String nome, String usuario, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}