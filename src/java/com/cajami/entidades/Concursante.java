/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajami.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "concursante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Concursante.findAll", query = "SELECT c FROM Concursante c")
    , @NamedQuery(name = "Concursante.findByIdRegistro", query = "SELECT c FROM Concursante c WHERE c.idRegistro = :idRegistro")
    , @NamedQuery(name = "Concursante.findByConcursante", query = "SELECT c FROM Concursante c WHERE c.concursante = :concursante")
    , @NamedQuery(name = "Concursante.findByEdad", query = "SELECT c FROM Concursante c WHERE c.edad = :edad")
    , @NamedQuery(name = "Concursante.findByPais", query = "SELECT c FROM Concursante c WHERE c.pais = :pais")
    , @NamedQuery(name = "Concursante.findByPuntuacion", query = "SELECT c FROM Concursante c WHERE c.puntuacion = :puntuacion")})
public class Concursante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRegistro")
    private Integer idRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Concursante")
    private String concursante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Puntuacion")
    private float puntuacion;

    public Concursante() {
    }

    public Concursante(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Concursante(Integer idRegistro, String concursante, int edad, String pais, float puntuacion) {
        this.idRegistro = idRegistro;
        this.concursante = concursante;
        this.edad = edad;
        this.pais = pais;
        this.puntuacion = puntuacion;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getConcursante() {
        return concursante;
    }

    public void setConcursante(String concursante) {
        this.concursante = concursante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concursante)) {
            return false;
        }
        Concursante other = (Concursante) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cajami.entidades.Concursante[ idRegistro=" + idRegistro + " ]";
    }
    
}
