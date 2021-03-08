package Model;

import java.sql.Date;

public class Empleados extends Personas{
    private int idEmpleado;
    private Date fechaNac;
    private String email;
    private String telefono;
    private String celular;
    private int idTipoEmpleado;
    private int idEstadoCivil;
    private Date fechaAlta;
    private Date fechaBaja;
    private String descripcion;

    public Empleados(Date fechaNac, String email, String telefono, String celular, int idTipoEmpleado, int idEstadoCivil, Date fechaAlta, Date fechaBaja, String descripcion, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.idTipoEmpleado = idTipoEmpleado;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleados(int idEmpleado, Date fechaNac, String email, String telefono, String celular, String descripcion, int idEstadoCivil, Date fechaAlta, Date fechaBaja, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idEmpleado = idEmpleado;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.descripcion = descripcion;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public Empleados(Date fechaNac, String email, String telefono, String celular, int idTipoEmpleado, int idEstadoCivil, Date fechaAlta, Date fechaBaja, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.idTipoEmpleado = idTipoEmpleado;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleado=" + idEmpleado + ", fechaNac=" + fechaNac + ", email=" + email + ", telefono=" + telefono + ", celular=" + celular + ", idTipoEmpleado=" + idTipoEmpleado + ", idEstadoCivil=" + idEstadoCivil + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
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

    public Empleados(int idEmpleado, Date fechaNac, String email, String telefono, String celular, int idTipoEmpleado, int idEstadoCivil, Date fechaAlta, Date fechaBaja, int idPersona, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(idPersona, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idEmpleado = idEmpleado;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.idTipoEmpleado = idTipoEmpleado;
        this.idEstadoCivil = idEstadoCivil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }
   
}
