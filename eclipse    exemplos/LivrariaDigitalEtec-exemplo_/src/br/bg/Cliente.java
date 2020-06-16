/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bg;

/**
 *
 * @author rubens Leme
 */
public class Cliente {
    private String login_id_cli;
    private String senha_cli;
    private String nome_cli;
    private String cpf_cli;
    private String telefone_cli;
    private String endereco_cli;
    private String bairro_cli;
    private String cidade_cli;
    private String uf_id_est;
    private String email_cli;

    public Cliente() {
    }
    

    public Cliente(String login_id_cli, String senha_cli, String nome_cli, String cpf_cli, String telefone_cli, String endereco_cli, String bairro_cli, String cidade_cli, String uf_id_est, String email_cli) {
        this.login_id_cli = login_id_cli;
        this.senha_cli = senha_cli;
        this.nome_cli = nome_cli;
        this.cpf_cli = cpf_cli;
        this.telefone_cli = telefone_cli;
        this.endereco_cli = endereco_cli;
        this.bairro_cli = bairro_cli;
        this.cidade_cli = cidade_cli;
        this.uf_id_est = uf_id_est;
        this.email_cli = email_cli;
    }

    public String getLogin_id_cli() {
        return login_id_cli;
    }

    public void setLogin_id_cli(String login_id_cli) {
        this.login_id_cli = login_id_cli;
    }

    public String getSenha_cli() {
        return senha_cli;
    }

    public void setSenha_cli(String senha_cli) {
        this.senha_cli = senha_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getTelefone_cli() {
        return telefone_cli;
    }

    public void setTelefone_cli(String telefone_cli) {
        this.telefone_cli = telefone_cli;
    }

    public String getEndereco_cli() {
        return endereco_cli;
    }

    public void setEndereco_cli(String endereco_cli) {
        this.endereco_cli = endereco_cli;
    }

    public String getBairro_cli() {
        return bairro_cli;
    }

    public void setBairro_cli(String bairro_cli) {
        this.bairro_cli = bairro_cli;
    }

    public String getCidade_cli() {
        return cidade_cli;
    }

    public void setCidade_cli(String cidade_cli) {
        this.cidade_cli = cidade_cli;
    }

    public String getUf_id_est() {
        return uf_id_est;
    }

    public void setUf_id_est(String uf_id_est) {
        this.uf_id_est = uf_id_est;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }
    
    
    
    
}
