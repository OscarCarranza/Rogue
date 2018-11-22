package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class agencia extends CouchDbDocument {

    String _id;
    String _rev;
    //Clave foranea de users
    String username;
    //Clave de la tabla agencia
    String RTN;
    String nombre;
    String direccion;
    int telefono;
    String director;
    String descripcion;

    public agencia(String _id, String _rev, String username, String RTN, String nombre, String direccion, int telefono, String director, String descripcion) {
        this._id = _id;
        this._rev = _rev;
        this.username = username;
        this.RTN = RTN;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.descripcion = descripcion;
    }

    public agencia(String username, String RTN, String nombre, String direccion, int telefono, String director, String descripcion) {
        this.username = username;
        this.RTN = RTN;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.descripcion = descripcion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "agencia{" + "username=" + username + ", RTN=" + RTN + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono +  ", director=" + director + ", descripcion=" + descripcion + '}';
    }

}