package Model;

import java.sql.Date;

public class Estudiantes extends Personas{
    private int idEstudiante;
    private Date fechaNac;
    private int idFamilia;
    private int idSala;

    public Estudiantes(int idEstudiante, Date fechaNac, int idFamilia, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idEstudiante = idEstudiante;
        this.fechaNac = fechaNac;
        this.idFamilia = idFamilia;
    }

    public Estudiantes(Date fechaNac, int idSala, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.fechaNac = fechaNac;
        this.idSala = idSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public Estudiantes(Date fechaNac, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio, int idSala) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.fechaNac = fechaNac;
    }
    
    

    public Estudiantes(int idEstudiante, Date fechaNac, String nombre, String apellido) {
        super(nombre, apellido);
        this.idEstudiante = idEstudiante;
        this.fechaNac = fechaNac;
    }

    public Estudiantes(int idEstudiante, String nombre, String apellido, Date fechaNac, int idTipoDocumento, int documento, int idNacionalidad, String genero, int idBarrio, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idEstudiante = idEstudiante;
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "idEstudiante=" + idEstudiante + ", fechaNac=" + fechaNac + ", idFamilia=" + idFamilia + '}';
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }


    public Estudiantes(int idEstudiante, Date fechaNac, int idFamilia, int idPersona, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(idPersona, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idEstudiante = idEstudiante;
        this.fechaNac = fechaNac;
        this.idFamilia = idFamilia;
    }
}    