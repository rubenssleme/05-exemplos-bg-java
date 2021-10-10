/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Caio
 */
@Entity
@Table(name = "alunos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")})
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dtnasc")
    @Temporal(TemporalType.DATE)
    private Date dtnasc;
    @Column(name = "rg")
    private String rg;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private String cep;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "celular")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "ativo")
    private Boolean ativo;
    @Column(name = "dtcadastro")
    @Temporal(TemporalType.DATE)
    private Date dtcadastro;
    @OneToMany(mappedBy = "idaluno")
    private List<Reserva> reservaList;
    @JoinColumn(name = "idusuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idusuario;
    @JoinColumn(name = "idmodulo", referencedColumnName = "id")
    @ManyToOne
    private Modulo idmodulo;
    @JoinColumn(name = "idcidade", referencedColumnName = "id")
    @ManyToOne
    private Cidade idcidade;
    @JoinColumn(name = "idcurso", referencedColumnName = "id")
    @ManyToOne
    private Curso idcurso;
    @OneToMany(mappedBy = "idaluno")
    private List<Locacao> locacaoList;
    @OneToMany(mappedBy = "idaluno")
    private List<Ocorrencia> ocorrenciaList;

    public Aluno() {
    }

    public Aluno(String nome, Date dtnasc, String rg, String cpf, String endereco, String bairro, String cep, String telefone, String celular, String email, Boolean ativo, Date dtcadastro, Usuario idusuario, Modulo idmodulo, Cidade idcidade, Curso idcurso) {
        this.nome = nome;
        this.dtnasc = dtnasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.ativo = ativo;
        this.dtcadastro = dtcadastro;
        this.idusuario = idusuario;
        this.idmodulo = idmodulo;
        this.idcidade = idcidade;
        this.idcurso = idcurso;
    }
    
    public Aluno(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(Cidade idcidade) {
        this.idcidade = idcidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    public Modulo getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(Modulo idmodulo) {
        this.idmodulo = idmodulo;
    }

    public Curso getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Curso idcurso) {
        this.idcurso = idcurso;
    }

    @XmlTransient
    public List<Locacao> getLocacaoList() {
        return locacaoList;
    }

    public void setLocacaoList(List<Locacao> locacaoList) {
        this.locacaoList = locacaoList;
    }

    @XmlTransient
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaList;
    }

    public void setOcorrenciaList(List<Ocorrencia> ocorrenciaList) {
        this.ocorrenciaList = ocorrenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.biblioteca.entity.Aluno[ id=" + id + " ]";
    }
    
}
