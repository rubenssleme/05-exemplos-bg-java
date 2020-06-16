package br.com.bg.modelo;

public class Usuario {
    private int codigo;
    private String nome;
    private String eMail;
    private String tipo;
    private String login;
    private String senha;

    public Usuario() {
    }
    
    public Usuario(int codigo, String nome, String eMail, String tipo, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.eMail = eMail;
        this.tipo = tipo;
        this.login = login;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", eMail=" + eMail + ", tipo=" + tipo + ", login=" + login + ", senha=" + senha + '}';
    }
    
}
