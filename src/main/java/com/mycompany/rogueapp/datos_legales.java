package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class datos_legales extends CouchDbDocument {

    String _rev;
    String _id;
    String username;
    int codigoAntecedentesPenales;
    boolean servicioMilitar;

    public datos_legales(String _id, String _rev, String username, int codigoAntecedentesPenales, boolean servicioMilitar) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.codigoAntecedentesPenales = codigoAntecedentesPenales;
        this.servicioMilitar = servicioMilitar;
    }

    public datos_legales(String username, int codigoAntecedentesPenales, boolean servicioMilitar) {
        this.username = username;
        this.codigoAntecedentesPenales = codigoAntecedentesPenales;
        this.servicioMilitar = servicioMilitar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCodigoAntecedentesPenales() {
        return codigoAntecedentesPenales;
    }

    public void setCodigoAntecedentesPenales(int codigoAntecedentesPenales) {
        this.codigoAntecedentesPenales = codigoAntecedentesPenales;
    }

    public boolean isServicioMilitar() {
        return servicioMilitar;
    }

    public void setServicioMilitar(boolean servicioMilitar) {
        this.servicioMilitar = servicioMilitar;
    }

    @Override
    public String getRevision() {
        return _rev;
    }

    @Override
    public void setRevision(String _rev) {
        this._rev = _rev;
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "datos_legales{" + "username=" + username + ", codigoAntecedentesPenales=" + codigoAntecedentesPenales + ", servicioMilitar=" + servicioMilitar + '}';
    }
}
