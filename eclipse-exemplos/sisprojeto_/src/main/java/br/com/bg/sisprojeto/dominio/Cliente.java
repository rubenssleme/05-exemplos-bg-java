package br.com.bg.sisprojeto.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Cliente extends Pessoa {

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(nullable = false)
    private Boolean liberado;
    @OneToOne()
    @JoinColumn(nullable = false)
    private Pessoa pessoa;

    @Column(length = 15, nullable = false)
    private String cpf;
    @Column(length = 15, nullable = false)
    private String razaoSocial;
    @Column(length = 35, nullable = false)
    private String email;
    @Column(length = 15, nullable = false)
    private String telefone;
    @Column(nullable = false)
    private boolean validado;

    public Cliente() {
        super();
    }
    
    
    

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getLiberado() {
        return liberado;
    }

    public void setLiberado(Boolean liberado) {
        this.liberado = liberado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
