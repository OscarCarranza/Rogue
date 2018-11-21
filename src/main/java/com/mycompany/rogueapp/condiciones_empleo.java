package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class condiciones_empleo extends CouchDbDocument {

    String _id;
    String _rev;
    String username;
    String rangoJerarquico;
    String rangoSalarial;
    String tipoPuesto;

    public condiciones_empleo(String _id, String _rev, String username, String rangoJerarquico, String rangoSalarial, String tipoPuesto) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.rangoJerarquico = rangoJerarquico;
        this.rangoSalarial = rangoSalarial;
        this.tipoPuesto = tipoPuesto;
    }

    public condiciones_empleo(String username, String rangoJerarquico, String rangoSalarial, String tipoPuesto) {
        this.username = username;
        this.rangoJerarquico = rangoJerarquico;
        this.rangoSalarial = rangoSalarial;
        this.tipoPuesto = tipoPuesto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRangoJerarquico() {
        return rangoJerarquico;
    }

    public void setRangoJerarquico(String rangoJerarquico) {
        this.rangoJerarquico = rangoJerarquico;
    }

    public String getRangoSalarial() {
        return rangoSalarial;
    }

    public void setRangoSalarial(String rangoSalarial) {
        this.rangoSalarial = rangoSalarial;
    }

    public String getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(String tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
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
        return "condiciones_empleo{" + "username=" + username + ", rangoJerarquico=" + rangoJerarquico + ", rangoSalarial=" + rangoSalarial + ", tipoPuesto=" + tipoPuesto + '}';
    }

}
