package com.mycompany.rogueapp;

import java.util.Date;
import org.ektorp.support.CouchDbDocument;

public class aspirantes extends CouchDbDocument {

    String _id;
    String _rev;
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

    public aspirantes(String _id, String _rev, String username, String identidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String createdBy) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.identidad = identidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.createdBy = createdBy;
    }

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
        return "aspirantes{" + "username=" + username + ", identidad=" + identidad + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", fechaNacimiento=" + fechaNacimiento + ", createdBy=" + createdBy + '}';
    }

}
