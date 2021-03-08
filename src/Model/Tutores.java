package Model;

public class Tutores extends Personas{
    private int idTutor;
    private String parentesco;
    private int idEstadoCivil;
    private String celular;
    private String telefono;
    private String email;
    private int idFamilia;

    public Tutores(int idTutor, String parentesco, int idEstadoCivil, String celular, String telefono, String email, int idFamilia, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idTutor = idTutor;
        this.parentesco = parentesco;
        this.idEstadoCivil = idEstadoCivil;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.idFamilia = idFamilia;
    }

    public Tutores(String parentesco, int idEstadoCivil, String celular, String telefono, String email, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio, int idTutor){
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.parentesco = parentesco;
        this.idEstadoCivil = idEstadoCivil;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.idTutor = idTutor;
    }

    public Tutores(int idTutor, String parentesco, int idEstadoCivil, String celular, String telefono, String email, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idTutor = idTutor;
        this.parentesco = parentesco;
        this.idEstadoCivil = idEstadoCivil;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
    }

    public Tutores(int idTutor, String parentesco, String celular, String nombre, String apellido, String domicilio) {
        super(nombre, apellido, domicilio);
        this.idTutor = idTutor;
        this.parentesco = parentesco;
        this.celular = celular;        
    }

    

    @Override
    public String toString() {
        return "Tutores{" + "idTutor=" + idTutor + ", parentesco=" + parentesco + ", idEstadoCivil=" + idEstadoCivil + ", celular=" + celular + ", telefono=" + telefono + ", email=" + email + ", idFamilia=" + idFamilia + '}';
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Tutores(int idTutor, String parentesco, int idEstadoCivil, String celular, String telefono, String email, int idFamilia, int idPersona, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        super(idPersona, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        this.idTutor = idTutor;
        this.parentesco = parentesco;
        this.idEstadoCivil = idEstadoCivil;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.idFamilia = idFamilia;
    }
}