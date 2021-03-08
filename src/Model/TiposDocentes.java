package Model;

public class TiposDocentes {
    private int idTipoDocente;
    private String descripcion;

    @Override
    public String toString() {
        return "TipoDocente: " + idTipoDocente + "Descripcion: " + descripcion;
    }

    public int getIdTipoDocente() {
        return idTipoDocente;
    }

    public void setIdTipoDocente(int idTipoDocente) {
        this.idTipoDocente = idTipoDocente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TiposDocentes(int idTipoDocente, String descripcion) {
        this.idTipoDocente = idTipoDocente;
        this.descripcion = descripcion;
    }
}
