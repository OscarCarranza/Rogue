package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class datos_academicos extends CouchDbDocument {
    String username;
    grados_academicos titulo;
    String institucion;
    String anioGrad;
    String promedioGrad;  

    public datos_academicos(String username, grados_academicos titulo, String institucion, String anioGrad, String promedioGrad) {
        this.username = username;
        this.titulo = titulo;
        this.institucion = institucion;
        this.anioGrad = anioGrad;
        this.promedioGrad = promedioGrad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public grados_academicos getTitulo() {
        return titulo;
    }

    public void setTitulo(grados_academicos titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getAnioGrad() {
        return anioGrad;
    }

    public void setAnioGrad(String anioGrad) {
        this.anioGrad = anioGrad;
    }

    public String getPromedioGrad() {
        return promedioGrad;
    }

    public void setPromedioGrad(String promedioGrad) {
        this.promedioGrad = promedioGrad;
    }

    @Override
    public String toString() {
        return "datos_academicos{" + "username=" + username + ", titulo=" + titulo + ", institucion=" + institucion + ", anioGrad=" + anioGrad + ", promedioGrad=" + promedioGrad + '}';
    }
    
}
