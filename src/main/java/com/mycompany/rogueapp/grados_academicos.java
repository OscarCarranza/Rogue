package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class grados_academicos extends CouchDbDocument {

    String _rev;
    String _id;
    String gradoAcademico;
    String nivel;

    public grados_academicos(String _id, String _rev, String gradoAcademico, String nivel) {
        this._id = _id;
        this._rev = _rev;
        this.gradoAcademico = gradoAcademico;
        this.nivel = nivel;
    }

    public grados_academicos(String gradoAcademico, String nivel) {
        this.gradoAcademico = gradoAcademico;
        this.nivel = nivel;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
        return "grados_academicos{" + "gradoAcademico=" + gradoAcademico + ", nivel=" + nivel + '}';
    }

}
