/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.model;

import java.util.Objects;

/**
 *
 * @author Alex
 */

// Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario
public class SportelliCap {

    private String regione;
    private String siglaPv;
    private String provincia;
    private String codComune;
    private String comune;
    private String localita;
    private String cap;
    private String idServizio;
    private String descrizioneServizio;
    private String frazionario;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.regione);
        hash = 83 * hash + Objects.hashCode(this.siglaPv);
        hash = 83 * hash + Objects.hashCode(this.provincia);
        hash = 83 * hash + Objects.hashCode(this.codComune);
        hash = 83 * hash + Objects.hashCode(this.comune);
        hash = 83 * hash + Objects.hashCode(this.localita);
        hash = 83 * hash + Objects.hashCode(this.cap);
        hash = 83 * hash + Objects.hashCode(this.idServizio);
        hash = 83 * hash + Objects.hashCode(this.descrizioneServizio);
        hash = 83 * hash + Objects.hashCode(this.frazionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SportelliCap other = (SportelliCap) obj;
        if (!Objects.equals(this.regione, other.regione)) {
            return false;
        }
        if (!Objects.equals(this.siglaPv, other.siglaPv)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.codComune, other.codComune)) {
            return false;
        }
        if (!Objects.equals(this.comune, other.comune)) {
            return false;
        }
        if (!Objects.equals(this.localita, other.localita)) {
            return false;
        }
        if (!Objects.equals(this.cap, other.cap)) {
            return false;
        }
        if (!Objects.equals(this.idServizio, other.idServizio)) {
            return false;
        }
        if (!Objects.equals(this.descrizioneServizio, other.descrizioneServizio)) {
            return false;
        }
        if (!Objects.equals(this.frazionario, other.frazionario)) {
            return false;
        }
        return true;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getSiglaPv() {
        return siglaPv;
    }

    public void setSiglaPv(String siglaPv) {
        this.siglaPv = siglaPv;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodComune() {
        return codComune;
    }

    public void setCodComune(String codComune) {
        this.codComune = codComune;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getLocalita() {
        return localita;
    }

    public void setLocalita(String localita) {
        this.localita = localita;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(String idServizio) {
        this.idServizio = idServizio;
    }

    public String getDescrizioneServizio() {
        return descrizioneServizio;
    }

    public void setDescrizioneServizio(String descrizioneServizio) {
        this.descrizioneServizio = descrizioneServizio;
    }

    public String getFrazionario() {
        return frazionario;
    }

    public void setFrazionario(String frazionario) {
        this.frazionario = frazionario;
    }
    
}
