/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apf.gerenciadorfinanceiro.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Usuario extends GenericDomain {

   // private int id;

    @Column(length = TamanhoMaximoGenerico.NOME, nullable = false)
    private String nome;
    @Column(length = TamanhoMaximoGenerico.USUARIO, nullable = false)
    private String usuario;
    @Column(length = TamanhoMaximoGenerico.SENHA, nullable = false)
    private String senha;
    @Column(length = TamanhoMaximoGenerico.PERFIL, nullable = false)
    private String perfil;

   public Usuario(){
        
    }
    public Usuario( String nome, String perfil) {
      //  this.id = id;
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
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
    }

    //Getters e Setters
   
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

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", perfil=" + perfil + '}';
    }
    
}
