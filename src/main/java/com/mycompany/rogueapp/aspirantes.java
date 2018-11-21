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
    
    //DATOS FAMILIARES Y CONTANDO EMERGENCIA
    String estadoCivil;
    int dependientes;
    String nombreContactoEmergencia;
    String telefonoContactoEmergencia;
    String parentezcoContactoEmergencia;
    
    //DATOS LEGALES
    int codigoAntecedentesPenales;
    boolean servicioMilitar;    
    
    //DATOS SANITARIOS
    String alergias;
    String enfermedades;
    String medicamentos;
    String necesidadesEspeciales;
    
    //DATOS SEMI PROFESIONALES
    String idiomas;
    String herramientas;
    String habilidades;

    //CONSTRUCTOR PARA OBTENER DATA DE LA DB
    public aspirantes(String _id, String _rev, String username, String identidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String createdBy, String estadoCivil, int dependientes, String nombreContactoEmergencia, String telefonoContactoEmergencia, String parentezcoContactoEmergencia, int codigoAntecedentesPenales, boolean servicioMilitar, String alergias, String enfermedades, String medicamentos, String necesidadesEspeciales, String idiomas, String herramientas, String habilidades) {
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
        this.estadoCivil = estadoCivil;
        this.dependientes = dependientes;
        this.nombreContactoEmergencia = nombreContactoEmergencia;
        this.telefonoContactoEmergencia = telefonoContactoEmergencia;
        this.parentezcoContactoEmergencia = parentezcoContactoEmergencia;
        this.codigoAntecedentesPenales = codigoAntecedentesPenales;
        this.servicioMilitar = servicioMilitar;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.necesidadesEspeciales = necesidadesEspeciales;
        this.idiomas = idiomas;
        this.herramientas = herramientas;
        this.habilidades = habilidades;
    }

    
  
    //CONSTRUCTOR PARA QUE EL ADMIN CREE EL USUARIO
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

    
    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String _id) {
        this._id = _id;
    }
    
    @Override
    public String getRevision() {
        return _rev;
    }

    @Override
    public void setRevision(String _rev) {
        this._rev = _rev;
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

    public String getNombreContactoEmergencia() {
        return nombreContactoEmergencia;
    }

    public void setNombreContactoEmergencia(String nombreContactoEmergencia) {
        this.nombreContactoEmergencia = nombreContactoEmergencia;
    }

    public String getTelefonoContactoEmergencia() {
        return telefonoContactoEmergencia;
    }

    public void setTelefonoContactoEmergencia(String telefonoContactoEmergencia) {
        this.telefonoContactoEmergencia = telefonoContactoEmergencia;
    }

    public String getParentezcoContactoEmergencia() {
        return parentezcoContactoEmergencia;
    }

    public void setParentezcoContactoEmergencia(String parentezcoContactoEmergencia) {
        this.parentezcoContactoEmergencia = parentezcoContactoEmergencia;
    }

    public int getCodigoAntecedentesPenales() {
        return codigoAntecedentesPenales;
    }

    public void setCodigoAntecedentesPenales(int codigoAntecedentesPenales) {
        this.codigoAntecedentesPenales = codigoAntecedentesPenales;
    }

    public boolean isServicioMilitar() {
        return servicioMilitar;
    }

    public void setServicioMilitar(boolean servicioMilitar) {
        this.servicioMilitar = servicioMilitar;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getNecesidadesEspeciales() {
        return necesidadesEspeciales;
    }

    public void setNecesidadesEspeciales(String necesidadesEspeciales) {
        this.necesidadesEspeciales = necesidadesEspeciales;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    
    @Override
    public String toString() {
        return "aspirantes{" + "_id=" + _id + ", _rev=" + _rev + ", username=" + username + ", identidad=" + identidad + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", fechaNacimiento=" + fechaNacimiento + ", createdBy=" + createdBy + ", estadoCivil=" + estadoCivil + ", dependientes=" + dependientes + ", nombreContactoEmergencia=" + nombreContactoEmergencia + ", telefonoContactoEmergencia=" + telefonoContactoEmergencia + ", parentezcoContactoEmergencia=" + parentezcoContactoEmergencia + ", codigoAntecedentesPenales=" + codigoAntecedentesPenales + ", servicioMilitar=" + servicioMilitar + ", alergias=" + alergias + ", enfermedades=" + enfermedades + ", medicamentos=" + medicamentos + ", necesidadesEspeciales=" + necesidadesEspeciales + ", idiomas=" + idiomas + ", herramientas=" + herramientas + ", habilidades=" + habilidades + '}';
    }

    
}
