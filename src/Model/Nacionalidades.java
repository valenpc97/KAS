package Model;

public class Nacionalidades {
    private int idNacionalidad;
    private String descripcion;

    @Override
    public String toString() {
        return "Nacionalidad: " + idNacionalidad + "Descripcion: " + descripcion;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Nacionalidades(int idNacionalidad, String descripcion) {
        this.idNacionalidad = idNacionalidad;
        this.descripcion = descripcion;
    }
}
