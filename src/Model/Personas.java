package Model;

public class Personas {
    private int idPersona;
    private String nombre;
    private String apellido;
    private int idTipoDocumento;
    private int documento;
    private int idBarrio;
    private int idNacionalidad;
    private String genero;
    private String domicilio;

    public Personas(String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
        this.idBarrio = idBarrio;
        this.idNacionalidad = idNacionalidad;
        this.genero = genero;
        this.domicilio = domicilio;
    }

    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Personas(String nombre, String apellido, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "CodPersona: " + idPersona + "Nombre: " + nombre + "Apellido: " + apellido + "Tipo de Documento: " + idTipoDocumento + "Documento: " + documento + "Barrio: " + idBarrio + "Nacionalidad: " + idNacionalidad + "Género: " + genero + "Domicilio: " + domicilio;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Personas(int idPersona, String nombre, String apellido, int idTipoDocumento, int documento, int idBarrio, int idNacionalidad, String genero, String domicilio) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
        this.idBarrio = idBarrio;
        this.idNacionalidad = idNacionalidad;
        this.genero = genero;
        this.domicilio = domicilio;
    }
    
}
