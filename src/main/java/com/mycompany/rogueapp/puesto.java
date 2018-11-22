package com.mycompany.rogueapp;

import java.util.ArrayList;
import org.ektorp.support.CouchDbDocument;

public class puesto extends CouchDbDocument {

    String _rev;
    String _id;
    String idPuesto;
    String username;
    String rangoJerarquico;
    String rangoSalarial;
    String tipoPlaza;
    int cantidadPlazas;
    ArrayList<grados_academicos> gradosAcademicos = new ArrayList();

    public puesto(String _id, String _rev, String idPuesto, String username, String rangoJerarquico, String rangoSalarial, String tipoPlaza, int cantidadPlazas) {
        this._id = _id;
        this._rev = _rev;
        this.idPuesto = idPuesto;
        this.username = username;
        this.rangoJerarquico = rangoJerarquico;
        this.rangoSalarial = rangoSalarial;
        this.tipoPlaza = tipoPlaza;
        this.cantidadPlazas = cantidadPlazas;
    }

    public puesto(String idPuesto, String username, String rangoJerarquico, String rangoSalarial, String tipoPlaza, int cantidadPlazas) {
        this.idPuesto = idPuesto;
        this.username = username;
        this.rangoJerarquico = rangoJerarquico;
        this.rangoSalarial = rangoSalarial;
        this.tipoPlaza = tipoPlaza;
        this.cantidadPlazas = cantidadPlazas;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
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

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }

    public void setCantidadPlazas(int cantidadPlazas) {
        this.cantidadPlazas = cantidadPlazas;
    }

    public ArrayList<grados_academicos> getGradosAcademicos() {
        return gradosAcademicos;
    }

    public void setGradosAcademicos(ArrayList<grados_academicos> gradosAcademicos) {
        this.gradosAcademicos = gradosAcademicos;
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
        return "puesto{" + "idPuesto=" + idPuesto + ", username=" + username + ", rangoJerarquico=" + rangoJerarquico + ", rangoSalarial=" + rangoSalarial + ", tipoPlaza=" + tipoPlaza + ", cantidadPlazas=" + cantidadPlazas + ", datosAcademicos=" + gradosAcademicos + '}';
    }

}
