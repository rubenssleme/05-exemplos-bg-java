package br.com.carloskafka.sisprojeto.dominio;

import br.com.carloskafka.sisprojeto.utilitarios.Criptografia;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta_acesso")
public class ContaAcesso {

    @Id
    private Long ID;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    private boolean validado;

    public ContaAcesso() {
        this("", "");
    }

    public ContaAcesso(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.validado = true;
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
        if (senha != null && !senha.isEmpty()) {
            this.senha = Criptografia.converterParaMD5(senha);
        }
    }

    public boolean validar() {
        if (this.login.isEmpty() && this.login == null) {
            this.validado = false;
        }
        if (this.senha.isEmpty() && this.senha == null) {
            this.validado = false;
        }
        return validado;
    }

    @Override
    public String toString() {
        return "Usuario [login=" + login + ", senha=" + senha + "]";
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
