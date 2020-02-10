/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Igor Corona
 */
@Entity
@Table(name = "mensalidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensalidade.findAll", query = "SELECT m FROM Mensalidade m")
    , @NamedQuery(name = "Mensalidade.findByIdMensalidade", query = "SELECT m FROM Mensalidade m WHERE m.idMensalidade = :idMensalidade")
    , @NamedQuery(name = "Mensalidade.findByValor", query = "SELECT m FROM Mensalidade m WHERE m.valor = :valor")})
public class Mensalidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMensalidade")
    private Integer idMensalidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @OneToMany(mappedBy = "idMensalidade")
    private Collection<Aluno> alunoCollection;
    @JoinColumn(name = "idTreino", referencedColumnName = "idTreino")
    @ManyToOne
    private Treino idTreino;

    public Mensalidade() {
    }

    public Mensalidade(Integer idMensalidade) {
        this.idMensalidade = idMensalidade;
    }

    public Integer getIdMensalidade() {
        return idMensalidade;
    }

    public void setIdMensalidade(Integer idMensalidade) {
        this.idMensalidade = idMensalidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    public Treino getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(Treino idTreino) {
        this.idTreino = idTreino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensalidade != null ? idMensalidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensalidade)) {
            return false;
        }
        Mensalidade other = (Mensalidade) object;
        if ((this.idMensalidade == null && other.idMensalidade != null) || (this.idMensalidade != null && !this.idMensalidade.equals(other.idMensalidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Mensalidade[ idMensalidade=" + idMensalidade + " ]";
    }
    
}
