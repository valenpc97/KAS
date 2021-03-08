package Model;

public class TiposRecibos {
    int idTipoRecibo;
    String descripcion;

    public TiposRecibos(int idTipoRecibo, String descripcion) {
        this.idTipoRecibo = idTipoRecibo;
        this.descripcion = descripcion;
    }

    public int getIdTipoRecibo() {
        return idTipoRecibo;
    }

    public void setIdTipoRecibo(int idTipoRecibo) {
        this.idTipoRecibo = idTipoRecibo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TiposRecibos{" + "idTipoRecibo=" + idTipoRecibo + ", descripcion=" + descripcion + '}';
    }
    
}
