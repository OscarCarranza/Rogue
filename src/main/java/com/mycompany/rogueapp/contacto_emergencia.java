package com.mycompany.rogueapp;

import org.ektorp.support.CouchDbDocument;

public class contacto_emergencia extends CouchDbDocument {

    //Llave fornea y llave de la tabla
    String username;
    String nombre;
    String telefono;
    String parentezco;

    public contacto_emergencia(String username, String nombre, String telefono, String parentezco) {
        this.username = username;
        this.nombre = nombre;
        this.telefono = telefono;
        this.parentezco = parentezco;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    @Override
    public String toString() {
        return "contacto_emergencia{" + "username=" + username + ", nombre=" + nombre + ", telefono=" + telefono + ", parentezco=" + parentezco + '}';
    }
    
}
