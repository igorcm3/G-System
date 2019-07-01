/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

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
 * @author blank
 */
@Entity
@Table(name = "Aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")
    , @NamedQuery(name = "Aluno.findByIdAluno", query = "SELECT a FROM Aluno a WHERE a.idAluno = :idAluno")
    , @NamedQuery(name = "Aluno.findByCodigo", query = "SELECT a FROM Aluno a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome")
    , @NamedQuery(name = "Aluno.findByCelular", query = "SELECT a FROM Aluno a WHERE a.celular = :celular")
    , @NamedQuery(name = "Aluno.findBySexo", query = "SELECT a FROM Aluno a WHERE a.sexo = :sexo")
    , @NamedQuery(name = "Aluno.findByRgcpf", query = "SELECT a FROM Aluno a WHERE a.rgcpf = :rgcpf")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAluno")
    private Integer idAluno;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "celular")
    private String celular;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "rgcpf")
    private String rgcpf;
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    @ManyToOne(optional = false)
    private Enderecos idEndereco;
    @JoinColumn(name = "idPersonal", referencedColumnName = "idPersonal")
    @ManyToOne
    private Personal idPersonal;
    @JoinColumn(name = "idMensalidade", referencedColumnName = "idMensalidade")
    @ManyToOne(optional = false)
    private Mensalidade idMensalidade;
    @JoinColumn(name = "idMedidas", referencedColumnName = "idMedidas")
    @ManyToOne
    private Medidas idMedidas;

    public Aluno() {
    }

    public Aluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getRgcpf() {
        return rgcpf;
    }

    public void setRgcpf(String rgcpf) {
        this.rgcpf = rgcpf;
    }

    public Enderecos getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Enderecos idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Personal getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Personal idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Mensalidade getIdMensalidade() {
        return idMensalidade;
    }

    public void setIdMensalidade(Mensalidade idMensalidade) {
        this.idMensalidade = idMensalidade;
    }

    public Medidas getIdMedidas() {
        return idMedidas;
    }

    public void setIdMedidas(Medidas idMedidas) {
        this.idMedidas = idMedidas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAluno != null ? idAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.idAluno == null && other.idAluno != null) || (this.idAluno != null && !this.idAluno.equals(other.idAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Aluno[ idAluno=" + idAluno + " ]";
    }
    
}
