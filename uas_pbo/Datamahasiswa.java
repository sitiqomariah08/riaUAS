/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pbo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author IT GRC
 */
@Entity
@Table(name = "datamahasiswa")
@NamedQueries({
    @NamedQuery(name = "Datamahasiswa.findAll", query = "SELECT d FROM Datamahasiswa d"),
    @NamedQuery(name = "Datamahasiswa.findByNim", query = "SELECT d FROM Datamahasiswa d WHERE d.nim = :nim"),
    @NamedQuery(name = "Datamahasiswa.findByNama", query = "SELECT d FROM Datamahasiswa d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datamahasiswa.findByAlamat", query = "SELECT d FROM Datamahasiswa d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Datamahasiswa.findByAsalSma", query = "SELECT d FROM Datamahasiswa d WHERE d.asalSma = :asalSma"),
    @NamedQuery(name = "Datamahasiswa.findByNamaOrangtua", query = "SELECT d FROM Datamahasiswa d WHERE d.namaOrangtua = :namaOrangtua")})
public class Datamahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "asal_sma")
    private String asalSma;
    @Basic(optional = false)
    @Column(name = "nama_orangtua")
    private String namaOrangtua;

    public Datamahasiswa() {
    }

    public Datamahasiswa(String nim) {
        this.nim = nim;
    }

    public Datamahasiswa(String nim, String nama, String alamat, String asalSma, String namaOrangtua) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.asalSma = asalSma;
        this.namaOrangtua = namaOrangtua;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalSma() {
        return asalSma;
    }

    public void setAsalSma(String asalSma) {
        this.asalSma = asalSma;
    }

    public String getNamaOrangtua() {
        return namaOrangtua;
    }

    public void setNamaOrangtua(String namaOrangtua) {
        this.namaOrangtua = namaOrangtua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datamahasiswa)) {
            return false;
        }
        Datamahasiswa other = (Datamahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uas_pbo.Datamahasiswa[ nim=" + nim + " ]";
    }
    
}
