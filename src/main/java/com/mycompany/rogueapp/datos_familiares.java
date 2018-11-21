package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class datos_familiares extends CouchDbDocument {

    String _rev;
    String _id;
    String username;
    String estadoCivil;
    int dependientes;

    public datos_familiares(String _id, String _rev, String username, String estadoCivil, int dependientes) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.estadoCivil = estadoCivil;
        this.dependientes = dependientes;
    }

    public datos_familiares(String username, String estadoCivil, int dependientes) {
        this.username = username;
        this.estadoCivil = estadoCivil;
        this.dependientes = dependientes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getDependientes() {
        return dependientes;
    }

    public void setDependientes(int dependientes) {
        this.dependientes = dependientes;
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
        return "datos_familiares{" + "username=" + username + ", estadoCivil=" + estadoCivil + ", dependientes=" + dependientes + '}';
    }

}
