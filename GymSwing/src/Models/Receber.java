/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

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
 * @author Igor Corona
 */
@Entity
@Table(name = "receber")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receber.findAll", query = "SELECT r FROM Receber r")
    , @NamedQuery(name = "Receber.findByIdReceber", query = "SELECT r FROM Receber r WHERE r.idReceber = :idReceber")
    , @NamedQuery(name = "Receber.findByPago", query = "SELECT r FROM Receber r WHERE r.pago = :pago")
    , @NamedQuery(name = "Receber.findByDataPagamento", query = "SELECT r FROM Receber r WHERE r.dataPagamento = :dataPagamento")})
public class Receber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReceber")
    private Integer idReceber;
    @Column(name = "pago")
    private Boolean pago;
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @JoinColumn(name = "idAluno", referencedColumnName = "idAluno")
    @ManyToOne(optional = false)
    private Aluno idAluno;

    public Receber() {
    }

    public Receber(Integer idReceber) {
        this.idReceber = idReceber;
    }

    public Integer getIdReceber() {
        return idReceber;
    }

    public void setIdReceber(Integer idReceber) {
        this.idReceber = idReceber;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReceber != null ? idReceber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receber)) {
            return false;
        }
        Receber other = (Receber) object;
        if ((this.idReceber == null && other.idReceber != null) || (this.idReceber != null && !this.idReceber.equals(other.idReceber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Receber[ idReceber=" + idReceber + " ]";
    }
    
}
