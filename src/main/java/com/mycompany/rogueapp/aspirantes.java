package com.mycompany.rogueapp;


import java.util.Date;
import org.ektorp.support.CouchDbDocument;

public class aspirantes extends CouchDbDocument {

    //Llave foranea de users
    String username;
    //Llave tabla aspiratenes
    String identidad;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    Date fechaNacimiento;
    //Para que los usuarios puedan hacer CRUD de los perfiles creados por ellos
    String createdBy;

    public aspirantes(String username, String identidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String createdBy) {
        this.username = username;
        this.identidad = identidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.createdBy = createdBy;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "aspirantes{" + "username=" + username + ", identidad=" + identidad + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", fechaNacimiento=" + fechaNacimiento + ", createdBy=" + createdBy + '}';
    }
    
    
    
}
