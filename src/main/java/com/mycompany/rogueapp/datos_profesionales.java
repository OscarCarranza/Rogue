package com.mycompany.rogueapp;

import java.util.ArrayList;
import org.ektorp.support.CouchDbDocument;

public class datos_profesionales extends CouchDbDocument {

    String _rev;
    String _id;
    String username;
    ArrayList<datos_academicos> datosAcademicos = new ArrayList();
    String idiomas;
    String herramientas;
    String habilidades;
    String puesto;
    String anioInicio;
    String anioFinal;
    String refLaboral;
    String telefonoRefLaboral;

    public datos_profesionales(String _id, String _rev, String username, String puesto, String anioInicio, String anioFinal, String refLaboral, String telefonoRefLaboral) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.puesto = puesto;
        this.anioInicio = anioInicio;
        this.anioFinal = anioFinal;
        this.refLaboral = refLaboral;
        this.telefonoRefLaboral = telefonoRefLaboral;
    }

    public datos_profesionales(String username, String puesto, String anioInicio, String anioFinal, String refLaboral, String telefonoRefLaboral) {
        this.username = username;
        this.puesto = puesto;
        this.anioInicio = anioInicio;
        this.anioFinal = anioFinal;
        this.refLaboral = refLaboral;
        this.telefonoRefLaboral = telefonoRefLaboral;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<datos_academicos> getDatosAcademicos() {
        return datosAcademicos;
    }

    public void setDatosAcademicos(ArrayList<datos_academicos> datosAcademicos) {
        this.datosAcademicos = datosAcademicos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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
        return "datos_profesionales{" + "username=" + username + ", datosAcademicos=" + datosAcademicos + ", idiomas=" + idiomas + ", herramientas=" + herramientas + ", habilidades=" + habilidades + ", puesto=" + puesto + ", anioInicio=" + anioInicio + ", anioFinal=" + anioFinal + ", refLaboral=" + refLaboral + ", telefonoRefLaboral=" + telefonoRefLaboral + '}';
    }

}
