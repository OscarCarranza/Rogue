package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class grados_academicos extends CouchDbDocument {

    String gradoAcademico;
    String nivel;

    public grados_academicos() {
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
    public String toString() {
        return "grados_academicos{" + "gradoAcademico=" + gradoAcademico + ", nivel=" + nivel + '}';
    }
    
}

