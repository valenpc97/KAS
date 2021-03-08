package Model;

public class Localidades {
    private int idLocalidad;
    private String descripcion;

    @Override
    public String toString() {
        return "Localidad: " + idLocalidad + "Descripcion: " + descripcion;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Localidades(int idLocalidad, String descripcion) {
        this.idLocalidad = idLocalidad;
        this.descripcion = descripcion;
    }
}
