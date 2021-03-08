package Model;

public class EstadosCiviles {
    private int idEstadoCivil;
    private String descripcion;

    @Override
    public String toString() {
        return "EstadoCivil: " + idEstadoCivil + "Descripcion: " + descripcion;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadosCiviles(int idEstadoCivil, String descripcion) {
        this.idEstadoCivil = idEstadoCivil;
        this.descripcion = descripcion;
    }
}
