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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author blank
 */
@Entity
@Table(name = "Treino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Treino.findAll", query = "SELECT t FROM Treino t")
    , @NamedQuery(name = "Treino.findByIdTreino", query = "SELECT t FROM Treino t WHERE t.idTreino = :idTreino")
    , @NamedQuery(name = "Treino.findByCodigo", query = "SELECT t FROM Treino t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Treino.findByDescricao", query = "SELECT t FROM Treino t WHERE t.descricao = :descricao")
    , @NamedQuery(name = "Treino.findByNome", query = "SELECT t FROM Treino t WHERE t.nome = :nome")
    , @NamedQuery(name = "Treino.findByDiasSemana", query = "SELECT t FROM Treino t WHERE t.diasSemana = :diasSemana")
    , @NamedQuery(name = "Treino.findByQuantidadeSemana", query = "SELECT t FROM Treino t WHERE t.quantidadeSemana = :quantidadeSemana")})
public class Treino implements Serializable {

    @OneToMany(mappedBy = "idTreino")
    private Collection<Mensalidade> mensalidadeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTreino")
    private Integer idTreino;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "diasSemana")
    private String diasSemana;
    @Column(name = "quantidadeSemana")
    private Integer quantidadeSemana;

    public Treino() {
    }

    public Treino(Integer idTreino) {
        this.idTreino = idTreino;
    }

    public Integer getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(Integer idTreino) {
        this.idTreino = idTreino;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Integer getQuantidadeSemana() {
        return quantidadeSemana;
    }

    public void setQuantidadeSemana(Integer quantidadeSemana) {
        this.quantidadeSemana = quantidadeSemana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTreino != null ? idTreino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treino)) {
            return false;
        }
        Treino other = (Treino) object;
        if ((this.idTreino == null && other.idTreino != null) || (this.idTreino != null && !this.idTreino.equals(other.idTreino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Treino[ idTreino=" + idTreino + " ]";
    }

    @XmlTransient
    public Collection<Mensalidade> getMensalidadeCollection() {
        return mensalidadeCollection;
    }

    public void setMensalidadeCollection(Collection<Mensalidade> mensalidadeCollection) {
        this.mensalidadeCollection = mensalidadeCollection;
    }
    
}
