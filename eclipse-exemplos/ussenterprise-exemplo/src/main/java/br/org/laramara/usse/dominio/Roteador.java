/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author rubens.leme
 */
@Entity
public class Roteador extends Equipamento{
    
    @Column(length = 20, nullable = true)
    private String usuario;
    @Column(length = 8, nullable = true)
    private String senha;
    @Column(length = 5, nullable = true)
    private int portaAcesso;
    @Column(length = 35, nullable = true)
    private String deptoInstalacao;

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

    public int getPortaAcesso() {
        return portaAcesso;
    }

    public void setPortaAcesso(int portaAcesso) {
        this.portaAcesso = portaAcesso;
    }

    public String getDeptoInstalacao() {
        return deptoInstalacao;
    }

    public void setDeptoInstalacao(String deptoInstalacao) {
        this.deptoInstalacao = deptoInstalacao;
    }

    @Override
    public String toString() {
        return "Roteador";
    }
   
}
