package com.aprendaefaca.livrariadigital.dominio;
/**
 * @author Rubens Leme
 */
public class Cliente {
    
    private String login;
    private String senha;
    private String nome ;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;

    public Cliente() {
    }

    public Cliente(String login, String senha, String nome, String email, String cpf, String telefone, String endereco, String bairro, String cidade, String uf) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    @Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf
				+ ", endereço=" + endereco  + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
   /**
    * 
    * Teste de uso de  
    */ 
    
   /* public static void main(String args[]) {
        UF.SP.getEstado();
        UF[] teste = UF.values();
        System.out.println("Teste "+ teste);
                
        
    }*/
}
