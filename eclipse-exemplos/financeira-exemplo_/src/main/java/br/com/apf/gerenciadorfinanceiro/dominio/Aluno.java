/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apf.gerenciadorfinanceiro.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author rubens.leme
 */
@SuppressWarnings("serial")
@Entity
public class Aluno extends GenericDomain {
    //private int  id;

    @Column(length = TamanhoMaximoGenerico.NOME, nullable = true)
    private String nome;
    @Column(length = TamanhoMaximoGenerico.CPF, nullable = true)
    private Integer cpf;
    @Column(length = TamanhoMaximoGenerico.RG, nullable = true)
    private Integer rg;
    @Column(length = TamanhoMaximoGenerico.SEXO, nullable = true)
    private String sexo;

    public Aluno() {
    }

    
    public Aluno(String nome, Integer cpf, Integer rg, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + '}';
    }
    
    
    

}
