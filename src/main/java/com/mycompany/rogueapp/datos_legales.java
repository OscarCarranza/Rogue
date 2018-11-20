package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class datos_legales extends CouchDbDocument {

    String username;
    int codigoAntecedentesPenales;
    boolean servicioMilitar;

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
    public String toString() {
        return "datos_legales{" + "username=" + username + ", codigoAntecedentesPenales=" + codigoAntecedentesPenales + ", servicioMilitar=" + servicioMilitar + '}';
    }   
}
