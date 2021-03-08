package Model;

public class Barrios {
    private int idBarrio;
    private String descripcion;
    private int idLocalidad;

    @Override
    public String toString() {
        return "Barrio:" + idBarrio + "Descripcion: " + descripcion + "Localidad: " + idLocalidad;
    }

    public int getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Barrios(int idBarrio, String descripcion, int idLocalidad) {
        this.idBarrio = idBarrio;
        this.descripcion = descripcion;
        this.idLocalidad = idLocalidad;
    }
}
