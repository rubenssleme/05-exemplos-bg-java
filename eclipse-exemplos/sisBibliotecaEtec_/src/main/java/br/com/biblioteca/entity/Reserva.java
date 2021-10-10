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
@Table(name = "reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "dtreserva")
    @Temporal(TemporalType.DATE)
    private Date dtreserva;
    @JoinColumn(name = "idlivro", referencedColumnName = "id")
    @ManyToOne
    private Livro idlivro;
    @JoinColumn(name = "idaluno", referencedColumnName = "id")
    @ManyToOne
    private Aluno idaluno;

    public Reserva() {
    }

    public Reserva(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtreserva() {
        return dtreserva;
    }

    public void setDtreserva(Date dtreserva) {
        this.dtreserva = dtreserva;
    }

    public Livro getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(Livro idlivro) {
        this.idlivro = idlivro;
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.biblioteca.entity.Reserva[ id=" + id + " ]";
    }
    
}
