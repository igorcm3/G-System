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
@Table(name = "Medidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medidas.findAll", query = "SELECT m FROM Medidas m")
    , @NamedQuery(name = "Medidas.findByIdMedidas", query = "SELECT m FROM Medidas m WHERE m.idMedidas = :idMedidas")
    , @NamedQuery(name = "Medidas.findByCintura", query = "SELECT m FROM Medidas m WHERE m.cintura = :cintura")
    , @NamedQuery(name = "Medidas.findByQuadril", query = "SELECT m FROM Medidas m WHERE m.quadril = :quadril")
    , @NamedQuery(name = "Medidas.findByBusto", query = "SELECT m FROM Medidas m WHERE m.busto = :busto")
    , @NamedQuery(name = "Medidas.findByCoxa", query = "SELECT m FROM Medidas m WHERE m.coxa = :coxa")
    , @NamedQuery(name = "Medidas.findByPanturrilha", query = "SELECT m FROM Medidas m WHERE m.panturrilha = :panturrilha")
    , @NamedQuery(name = "Medidas.findByPeitoral", query = "SELECT m FROM Medidas m WHERE m.peitoral = :peitoral")
    , @NamedQuery(name = "Medidas.findByBraco", query = "SELECT m FROM Medidas m WHERE m.braco = :braco")
    , @NamedQuery(name = "Medidas.findByPeso", query = "SELECT m FROM Medidas m WHERE m.peso = :peso")
    , @NamedQuery(name = "Medidas.findByAltura", query = "SELECT m FROM Medidas m WHERE m.altura = :altura")
    , @NamedQuery(name = "Medidas.findByPctGordura", query = "SELECT m FROM Medidas m WHERE m.pctGordura = :pctGordura")})
public class Medidas implements Serializable {

    @OneToMany(mappedBy = "idMedidas")
    private Collection<Aluno> alunoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMedidas")
    private Integer idMedidas;
    @Column(name = "cintura")
    private String cintura;
    @Column(name = "quadril")
    private String quadril;
    @Column(name = "busto")
    private String busto;
    @Column(name = "coxa")
    private String coxa;
    @Column(name = "panturrilha")
    private String panturrilha;
    @Column(name = "peitoral")
    private String peitoral;
    @Column(name = "braco")
    private String braco;
    @Column(name = "peso")
    private String peso;
    @Column(name = "altura")
    private String altura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pctGordura")
    private Float pctGordura;

    public Medidas() {
    }

    public Medidas(Integer idMedidas) {
        this.idMedidas = idMedidas;
    }

    public Integer getIdMedidas() {
        return idMedidas;
    }

    public void setIdMedidas(Integer idMedidas) {
        this.idMedidas = idMedidas;
    }

    public String getCintura() {
        return cintura;
    }

    public void setCintura(String cintura) {
        this.cintura = cintura;
    }

    public String getQuadril() {
        return quadril;
    }

    public void setQuadril(String quadril) {
        this.quadril = quadril;
    }

    public String getBusto() {
        return busto;
    }

    public void setBusto(String busto) {
        this.busto = busto;
    }

    public String getCoxa() {
        return coxa;
    }

    public void setCoxa(String coxa) {
        this.coxa = coxa;
    }

    public String getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(String panturrilha) {
        this.panturrilha = panturrilha;
    }

    public String getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(String peitoral) {
        this.peitoral = peitoral;
    }

    public String getBraco() {
        return braco;
    }

    public void setBraco(String braco) {
        this.braco = braco;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Float getPctGordura() {
        return pctGordura;
    }

    public void setPctGordura(Float pctGordura) {
        this.pctGordura = pctGordura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedidas != null ? idMedidas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medidas)) {
            return false;
        }
        Medidas other = (Medidas) object;
        if ((this.idMedidas == null && other.idMedidas != null) || (this.idMedidas != null && !this.idMedidas.equals(other.idMedidas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Medidas[ idMedidas=" + idMedidas + " ]";
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }
    
}
