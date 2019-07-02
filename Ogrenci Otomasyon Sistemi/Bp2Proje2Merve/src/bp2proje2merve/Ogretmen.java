/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2proje2merve;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Merve
 */
@Entity
@Table(name = "OGRETMEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ogretmen.findAll", query = "SELECT o FROM Ogretmen o")
    , @NamedQuery(name = "Ogretmen.findByKullanici", query = "SELECT o FROM Ogretmen o WHERE o.kullanici = :kullanici")
    , @NamedQuery(name = "Ogretmen.findBySifre", query = "SELECT o FROM Ogretmen o WHERE o.sifre = :sifre")})
public class Ogretmen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KULLANICI")
    private String kullanici;
    @Basic(optional = false)
    @Column(name = "SIFRE")
    private int sifre;

    public Ogretmen() {
    }

    public Ogretmen(String kullanici) {
        this.kullanici = kullanici;
    }

    public Ogretmen(String kullanici, int sifre) {
        this.kullanici = kullanici;
        this.sifre = sifre;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kullanici != null ? kullanici.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ogretmen)) {
            return false;
        }
        Ogretmen other = (Ogretmen) object;
        if ((this.kullanici == null && other.kullanici != null) || (this.kullanici != null && !this.kullanici.equals(other.kullanici))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2proje2merve.Ogretmen[ kullanici=" + kullanici + " ]";
    }
    
}
