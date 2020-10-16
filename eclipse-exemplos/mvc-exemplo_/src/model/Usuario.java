package model;

import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String apelido;
    private String senha;
    private int nivelAcesso;

    public Usuario() {
    }

    public Usuario(String nome, String apelido, String senha, int nivelAcesso) {
        this.nome = nome;
        this.apelido = apelido;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", apelido=" + apelido + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + '}';
    }
    
    
    
    
    public void criarUsuario(){
        this.nome = JOptionPane.showInputDialog("Digite o Nome: ");
        this.apelido = JOptionPane.showInputDialog("Digite a Apelido:");
        this.senha = JOptionPane.showInputDialog("Digite a Senha:");
        this.nivelAcesso = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nome:"));
    }
    
    
    
}
