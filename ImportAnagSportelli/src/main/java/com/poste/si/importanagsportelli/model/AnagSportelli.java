/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importanagsportelli.model;

//  IdSportello|

import java.util.Objects;


/**
 *
 * @author Alex
 */
public class AnagSportelli {

    
    private String idSportello;
    private String tipologiaFamiglia;
    private String alCountry;
    private String ramFiliale;
    private String frazionario;
    private String denominazione;
    private String caso;
    private String ubicazione;
    private String indirizzoServizio;
    private String noteIndirizzo;
    private Integer idCivico;
    private Integer idToponimo;
    private String cap;
    private String comune;
    private String localita;
    private String siglaProvincia;
    private String descrProvincia;
    private String coordXGradi;
    private String coordYGradi;
    private String coordXMetri;
    private String corodYMetri;    
    private String stato;
    private String dataAttivazione;
    private String dataChiusuraDefinitiva;
    private String chiusuraPianificata;
    private String orarioConsegnaInesitate;
    private String predisposti;
    private String attivi1;
    private String attivi2;
    private String backOffice;
    private String note;
    private String telefono;
    private String isCancellato;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idSportello);
        hash = 53 * hash + Objects.hashCode(this.tipologiaFamiglia);
        hash = 53 * hash + Objects.hashCode(this.alCountry);
        hash = 53 * hash + Objects.hashCode(this.ramFiliale);
        hash = 53 * hash + Objects.hashCode(this.frazionario);
        hash = 53 * hash + Objects.hashCode(this.denominazione);
        hash = 53 * hash + Objects.hashCode(this.caso);
        hash = 53 * hash + Objects.hashCode(this.ubicazione);
        hash = 53 * hash + Objects.hashCode(this.indirizzoServizio);
        hash = 53 * hash + Objects.hashCode(this.noteIndirizzo);
        hash = 53 * hash + Objects.hashCode(this.idCivico);
        hash = 53 * hash + Objects.hashCode(this.idToponimo);
        hash = 53 * hash + Objects.hashCode(this.cap);
        hash = 53 * hash + Objects.hashCode(this.comune);
        hash = 53 * hash + Objects.hashCode(this.localita);
        hash = 53 * hash + Objects.hashCode(this.siglaProvincia);
        hash = 53 * hash + Objects.hashCode(this.descrProvincia);
        hash = 53 * hash + Objects.hashCode(this.coordXGradi);
        hash = 53 * hash + Objects.hashCode(this.coordYGradi);
        hash = 53 * hash + Objects.hashCode(this.coordXMetri);
        hash = 53 * hash + Objects.hashCode(this.corodYMetri);
        hash = 53 * hash + Objects.hashCode(this.stato);
        hash = 53 * hash + Objects.hashCode(this.dataAttivazione);
        hash = 53 * hash + Objects.hashCode(this.dataChiusuraDefinitiva);
        hash = 53 * hash + Objects.hashCode(this.chiusuraPianificata);
        hash = 53 * hash + Objects.hashCode(this.orarioConsegnaInesitate);
        hash = 53 * hash + Objects.hashCode(this.predisposti);
        hash = 53 * hash + Objects.hashCode(this.attivi1);
        hash = 53 * hash + Objects.hashCode(this.attivi2);
        hash = 53 * hash + Objects.hashCode(this.backOffice);
        hash = 53 * hash + Objects.hashCode(this.note);
        hash = 53 * hash + Objects.hashCode(this.telefono);
        hash = 53 * hash + Objects.hashCode(this.isCancellato);
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
        final AnagSportelli other = (AnagSportelli) obj;
        if (!Objects.equals(this.idSportello, other.idSportello)) {
            return false;
        }
        if (!Objects.equals(this.tipologiaFamiglia, other.tipologiaFamiglia)) {
            return false;
        }
        if (!Objects.equals(this.alCountry, other.alCountry)) {
            return false;
        }
        if (!Objects.equals(this.ramFiliale, other.ramFiliale)) {
            return false;
        }
        if (!Objects.equals(this.frazionario, other.frazionario)) {
            return false;
        }
        if (!Objects.equals(this.denominazione, other.denominazione)) {
            return false;
        }
        if (!Objects.equals(this.caso, other.caso)) {
            return false;
        }
        if (!Objects.equals(this.ubicazione, other.ubicazione)) {
            return false;
        }
        if (!Objects.equals(this.indirizzoServizio, other.indirizzoServizio)) {
            return false;
        }
        if (!Objects.equals(this.noteIndirizzo, other.noteIndirizzo)) {
            return false;
        }
        if (!Objects.equals(this.cap, other.cap)) {
            return false;
        }
        if (!Objects.equals(this.comune, other.comune)) {
            return false;
        }
        if (!Objects.equals(this.localita, other.localita)) {
            return false;
        }
        if (!Objects.equals(this.siglaProvincia, other.siglaProvincia)) {
            return false;
        }
        if (!Objects.equals(this.descrProvincia, other.descrProvincia)) {
            return false;
        }
        if (!Objects.equals(this.coordXGradi, other.coordXGradi)) {
            return false;
        }
        if (!Objects.equals(this.coordYGradi, other.coordYGradi)) {
            return false;
        }
        if (!Objects.equals(this.coordXMetri, other.coordXMetri)) {
            return false;
        }
        if (!Objects.equals(this.corodYMetri, other.corodYMetri)) {
            return false;
        }
        if (!Objects.equals(this.stato, other.stato)) {
            return false;
        }
        if (!Objects.equals(this.dataAttivazione, other.dataAttivazione)) {
            return false;
        }
        if (!Objects.equals(this.dataChiusuraDefinitiva, other.dataChiusuraDefinitiva)) {
            return false;
        }
        if (!Objects.equals(this.chiusuraPianificata, other.chiusuraPianificata)) {
            return false;
        }
        if (!Objects.equals(this.orarioConsegnaInesitate, other.orarioConsegnaInesitate)) {
            return false;
        }
        if (!Objects.equals(this.predisposti, other.predisposti)) {
            return false;
        }
        if (!Objects.equals(this.attivi1, other.attivi1)) {
            return false;
        }
        if (!Objects.equals(this.attivi2, other.attivi2)) {
            return false;
        }
        if (!Objects.equals(this.backOffice, other.backOffice)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.isCancellato, other.isCancellato)) {
            return false;
        }
        if (!Objects.equals(this.idCivico, other.idCivico)) {
            return false;
        }
        if (!Objects.equals(this.idToponimo, other.idToponimo)) {
            return false;
        }
        return true;
    }

    public String getIdSportello() {
        return idSportello;
    }

    public void setIdSportello(String idSportello) {
        this.idSportello = idSportello;
    }

    public String getTipologiaFamiglia() {
        return tipologiaFamiglia;
    }

    public void setTipologiaFamiglia(String tipologiaFamiglia) {
        this.tipologiaFamiglia = tipologiaFamiglia;
    }

    public String getAlCountry() {
        return alCountry;
    }

    public void setAlCountry(String alCountry) {
        this.alCountry = alCountry;
    }

    public String getRamFiliale() {
        return ramFiliale;
    }

    public void setRamFiliale(String ramFiliale) {
        this.ramFiliale = ramFiliale;
    }

    public String getFrazionario() {
        return frazionario;
    }

    public void setFrazionario(String frazionario) {
        this.frazionario = frazionario;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getUbicazione() {
        return ubicazione;
    }

    public void setUbicazione(String ubicazione) {
        this.ubicazione = ubicazione;
    }

    public String getIndirizzoServizio() {
        return indirizzoServizio;
    }

    public void setIndirizzoServizio(String indirizzoServizio) {
        this.indirizzoServizio = indirizzoServizio;
    }

    public String getNoteIndirizzo() {
        return noteIndirizzo;
    }

    public void setNoteIndirizzo(String noteIndirizzo) {
        this.noteIndirizzo = noteIndirizzo;
    }

    public Integer getIdCivico() {
        return idCivico;
    }

    public void setIdCivico(Integer idCivico) {
        this.idCivico = idCivico;
    }

    public Integer getIdToponimo() {
        return idToponimo;
    }

    public void setIdToponimo(Integer idToponimo) {
        this.idToponimo = idToponimo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
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

    public String getSiglaProvincia() {
        return siglaProvincia;
    }

    public void setSiglaProvincia(String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }

    public String getDescrProvincia() {
        return descrProvincia;
    }

    public void setDescrProvincia(String descrProvincia) {
        this.descrProvincia = descrProvincia;
    }

    public String getCoordXGradi() {
        return coordXGradi;
    }

    public void setCoordXGradi(String coordXGradi) {
        this.coordXGradi = coordXGradi;
    }

    public String getCoordYGradi() {
        return coordYGradi;
    }

    public void setCoordYGradi(String coordYGradi) {
        this.coordYGradi = coordYGradi;
    }

    public String getCoordXMetri() {
        return coordXMetri;
    }

    public void setCoordXMetri(String coordXMetri) {
        this.coordXMetri = coordXMetri;
    }

    public String getCorodYMetri() {
        return corodYMetri;
    }

    public void setCorodYMetri(String corodYMetri) {
        this.corodYMetri = corodYMetri;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getDataAttivazione() {
        return dataAttivazione;
    }

    public void setDataAttivazione(String dataAttivazione) {
        this.dataAttivazione = dataAttivazione;
    }

    public String getDataChiusuraDefinitiva() {
        return dataChiusuraDefinitiva;
    }

    public void setDataChiusuraDefinitiva(String dataChiusuraDefinitiva) {
        this.dataChiusuraDefinitiva = dataChiusuraDefinitiva;
    }

    public String getChiusuraPianificata() {
        return chiusuraPianificata;
    }

    public void setChiusuraPianificata(String chiusuraPianificata) {
        this.chiusuraPianificata = chiusuraPianificata;
    }

    public String getOrarioConsegnaInesitate() {
        return orarioConsegnaInesitate;
    }

    public void setOrarioConsegnaInesitate(String orarioConsegnaInesitate) {
        this.orarioConsegnaInesitate = orarioConsegnaInesitate;
    }

    public String getPredisposti() {
        return predisposti;
    }

    public void setPredisposti(String predisposti) {
        this.predisposti = predisposti;
    }

    public String getAttivi1() {
        return attivi1;
    }

    public void setAttivi1(String attivi1) {
        this.attivi1 = attivi1;
    }

    public String getAttivi2() {
        return attivi2;
    }

    public void setAttivi2(String attivi2) {
        this.attivi2 = attivi2;
    }

    public String getBackOffice() {
        return backOffice;
    }

    public void setBackOffice(String backOffice) {
        this.backOffice = backOffice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIsCancellato() {
        return isCancellato;
    }

    public void setIsCancellato(String isCancellato) {
        this.isCancellato = isCancellato;
    }
    
}
