package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class datos_sanitarios extends CouchDbDocument {

    String _rev;
    String _id;
    String username;
    String alergias;
    String enfermedades;
    String medicamentos;
    String necesidadesEspeciales;

    public datos_sanitarios(String _id, String _rev, String username, String alergias, String enfermedades, String medicamentos, String necesidadesEspeciales) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.necesidadesEspeciales = necesidadesEspeciales;
    }

    public datos_sanitarios(String username, String alergias, String enfermedades, String medicamentos, String necesidadesEspeciales) {
        this.username = username;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.necesidadesEspeciales = necesidadesEspeciales;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getNecesidadesEspeciales() {
        return necesidadesEspeciales;
    }

    public void setNecesidadesEspeciales(String necesidadesEspeciales) {
        this.necesidadesEspeciales = necesidadesEspeciales;
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
        return "datos_sanitarios{" + "username=" + username + ", alergias=" + alergias + ", enfermedades=" + enfermedades + ", medicamentos=" + medicamentos + ", necesidadesEspeciales=" + necesidadesEspeciales + '}';
    }

}
