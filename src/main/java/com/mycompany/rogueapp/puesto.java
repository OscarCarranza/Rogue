package com.mycompany.rogueapp;

import java.util.ArrayList;
import org.ektorp.support.CouchDbDocument;

public class puesto extends CouchDbDocument {
    String idPuesto;
    String RTNagencia;
    String rangoJerarquico;
    String rangoSalarial;
    String tipoPlaza;
    int cantidadPlazas;
    ArrayList<datos_academicos> datosAcademicos = new ArrayList();

    public puesto(String idPuesto, String RTNagencia, String rangoJerarquico, String rangoSalarial, String tipoPlaza, int cantidadPlazas) {
        this.idPuesto = idPuesto;
        this.RTNagencia = RTNagencia;
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

    public String getRTNagencia() {
        return RTNagencia;
    }

    public void setRTNagencia(String RTNagencia) {
        this.RTNagencia = RTNagencia;
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

    public ArrayList<datos_academicos> getDatosAcademicos() {
        return datosAcademicos;
    }

    public void setDatosAcademicos(ArrayList<datos_academicos> datosAcademicos) {
        this.datosAcademicos = datosAcademicos;
    }

    @Override
    public String toString() {
        return "puesto{" + "idPuesto=" + idPuesto + ", RTNagencia=" + RTNagencia + ", rangoJerarquico=" + rangoJerarquico + ", rangoSalarial=" + rangoSalarial + ", tipoPlaza=" + tipoPlaza + ", cantidadPlazas=" + cantidadPlazas + ", datosAcademicos=" + datosAcademicos + '}';
    }
    
}
