package br.com.bg.zsistemabghibernate.dominio;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends DominioBase{
    
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 11, nullable = false)
    private String cpf;
    @Column(length = 14, nullable = false)
    private String rg;
    @Column(length = 11, nullable = true)
    private String telefone;
    @Column(length = 50, nullable = false)
    private String eMail;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", eMail=" + eMail + '}';
    }
            
    
}
