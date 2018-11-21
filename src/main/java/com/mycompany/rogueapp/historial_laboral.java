package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class historial_laboral extends CouchDbDocument {

    String _id;
    String _rev;
    String username;
    String cargoOcupado;
    String anioInicio;
    String anioFinal;
    String refLaboral;
    String telefonoRefLaboral;

    public historial_laboral(String _id, String _rev, String username, String cargoOcupado, String anioInicio, String anioFinal, String refLaboral, String telefonoRefLaboral) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.cargoOcupado = cargoOcupado;
        this.anioInicio = anioInicio;
        this.anioFinal = anioFinal;
        this.refLaboral = refLaboral;
        this.telefonoRefLaboral = telefonoRefLaboral;
    }

    public historial_laboral(String username, String cargoOcupado, String anioInicio, String anioFinal, String refLaboral, String telefonoRefLaboral) {
        this.username = username;
        this.cargoOcupado = cargoOcupado;
        this.anioInicio = anioInicio;
        this.anioFinal = anioFinal;
        this.refLaboral = refLaboral;
        this.telefonoRefLaboral = telefonoRefLaboral;
    }

    public String getRev() {
        return _rev;
    }

    public void setRev(String _rev) {
        this._rev = _rev;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCargoOcupado() {
        return cargoOcupado;
    }

    public void setCargoOcupado(String cargoOcupado) {
        this.cargoOcupado = cargoOcupado;
    }

    public String getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getAnioFinal() {
        return anioFinal;
    }

    public void setAnioFinal(String anioFinal) {
        this.anioFinal = anioFinal;
    }

    public String getRefLaboral() {
        return refLaboral;
    }

    public void setRefLaboral(String refLaboral) {
        this.refLaboral = refLaboral;
    }

    public String getTelefonoRefLaboral() {
        return telefonoRefLaboral;
    }

    public void setTelefonoRefLaboral(String telefonoRefLaboral) {
        this.telefonoRefLaboral = telefonoRefLaboral;
    }

    @Override
    public String toString() {
        return "historial_laboral{" + "_rev=" + _rev + ", _id=" + _id + ", username=" + username + ", cargoOcupado=" + cargoOcupado + ", anioInicio=" + anioInicio + ", anioFinal=" + anioFinal + ", refLaboral=" + refLaboral + ", telefonoRefLaboral=" + telefonoRefLaboral + '}';
    }

    
}

