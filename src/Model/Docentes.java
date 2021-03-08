package Model;

import java.sql.Date;

public class Docentes extends Personas {
    private int idDocente;
    private Date fechaNac;
    private String email;
    private String telefono;
    private String celular;
    private int idTipoDocente;
    private int idEstadoCivil;
    private Date fechaAlta;
    private Date fechaBaja;
    private String descripcion;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Docentes(int idDocente, Date fechaNac, String email, String telefono, String celular, String descripcion, int idEstadoCivil, Date fechaAlta, Date fechaBaja, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idDocente = idDocente;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.descripcion = descripcion;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public Docentes(Date fechaNac, String email, String telefono, String celular, int idTipoDocente, int idEstadoCivil, Date fechaAlta, Date fechaBaja, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.idTipoDocente = idTipoDocente;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Docentes{" + "idDocente=" + idDocente + ", fechaNac=" + fechaNac + ", email=" + email + ", telefono=" + telefono + ", celular=" + celular + ", idTipoDocente=" + idTipoDocente + ", idEstadoCivil=" + idEstadoCivil + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdTipoDocente() {
        return idTipoDocente;
    }

    public void setIdTipoDocente(int idTipoDocente) {
        this.idTipoDocente = idTipoDocente;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Docentes(int idDocente, Date fechaNac, String email, String telefono, String celular, int idTipoDocente, int idEstadoCivil, Date fechaAlta, Date fechaBaja, int idPersona, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(idPersona, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idDocente = idDocente;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.idTipoDocente = idTipoDocente;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }
    
}

