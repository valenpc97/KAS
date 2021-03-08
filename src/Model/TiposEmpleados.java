package Model;

public class TiposEmpleados {
    private int idTipoEmpleado;
    private String descripcion;

    @Override
    public String toString() {
        return "TipoEmpleado: " + idTipoEmpleado + "Descripcion: " + descripcion;
    }

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TiposEmpleados(int idTipoEmpleado, String descripcion) {
        this.idTipoEmpleado = idTipoEmpleado;
        this.descripcion = descripcion;
    }
}
