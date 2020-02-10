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
 * @author Igor Corona
 */
@Entity
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByIdPersonal", query = "SELECT p FROM Personal p WHERE p.idPersonal = :idPersonal")
    , @NamedQuery(name = "Personal.findByNome", query = "SELECT p FROM Personal p WHERE p.nome = :nome")
    , @NamedQuery(name = "Personal.findByRgcpf", query = "SELECT p FROM Personal p WHERE p.rgcpf = :rgcpf")
    , @NamedQuery(name = "Personal.findByDescricao", query = "SELECT p FROM Personal p WHERE p.descricao = :descricao")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPersonal")
    private Integer idPersonal;
    @Column(name = "nome")
    private String nome;
    @Column(name = "rgcpf")
    private String rgcpf;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "idPersonal")
    private Collection<Aluno> alunoCollection;

    public Personal() {
    }

    public Personal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRgcpf() {
        return rgcpf;
    }

    public void setRgcpf(String rgcpf) {
        this.rgcpf = rgcpf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Personal[ idPersonal=" + idPersonal + " ]";
    }
    
}
