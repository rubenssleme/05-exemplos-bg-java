/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Caio
 */
@Entity
@Table(name = "locacoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locacao.findAll", query = "SELECT l FROM Locacao l")})
public class Locacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "dtlocacao")
    @Temporal(TemporalType.DATE)
    private Date dtlocacao;
    @Column(name = "dtentrega")
    @Temporal(TemporalType.DATE)
    private Date dtentrega;
    @Column(name = "dtdevolucao")
    @Temporal(TemporalType.DATE)
    private Date dtdevolucao;
    @JoinColumn(name = "idlivro", referencedColumnName = "id")
    @ManyToOne
    private Livro idlivro;
    @JoinColumn(name = "idfuncionario", referencedColumnName = "id")
    @ManyToOne
    private Funcionario idfuncionario;
    @JoinColumn(name = "idaluno", referencedColumnName = "id")
    @ManyToOne
    private Aluno idaluno;

    public Locacao() {
    }

    public Locacao(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtlocacao() {
        return dtlocacao;
    }

    public void setDtlocacao(Date dtlocacao) {
        this.dtlocacao = dtlocacao;
    }

    public Date getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(Date dtentrega) {
        this.dtentrega = dtentrega;
    }

    public Date getDtdevolucao() {
        return dtdevolucao;
    }

    public void setDtdevolucao(Date dtdevolucao) {
        this.dtdevolucao = dtdevolucao;
    }

    public Livro getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(Livro idlivro) {
        this.idlivro = idlivro;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Aluno getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(Aluno idaluno) {
        this.idaluno = idaluno;
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
        if (!(object instanceof Locacao)) {
            return false;
        }
        Locacao other = (Locacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.biblioteca.entity.Locacao[ id=" + id + " ]";
    }
    
}
