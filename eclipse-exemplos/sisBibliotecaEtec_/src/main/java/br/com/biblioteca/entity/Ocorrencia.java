/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Caio
 */
@Entity
@Table(name = "ocorrencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencia.findAll", query = "SELECT o FROM Ocorrencia o")})
public class Ocorrencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @JoinColumn(name = "idtipoocorrencia", referencedColumnName = "id")
    @ManyToOne
    private TipoOcorrencia idtipoocorrencia;
    @JoinColumn(name = "idaluno", referencedColumnName = "id")
    @ManyToOne
    private Aluno idaluno;

    public Ocorrencia() {
    }

    public Ocorrencia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoOcorrencia getIdtipoocorrencia() {
        return idtipoocorrencia;
    }

    public void setIdtipoocorrencia(TipoOcorrencia idtipoocorrencia) {
        this.idtipoocorrencia = idtipoocorrencia;
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
        if (!(object instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.biblioteca.entity.Ocorrencia[ id=" + id + " ]";
    }
    
}
