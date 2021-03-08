package Model;

public class TiposDocumentos {
    private int idTipoDocumento;
    private String descripcion;

    @Override
    public String toString() {
        return "TipoDocumento:" + idTipoDocumento + "Descripcion: " + descripcion;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TiposDocumentos(int idTipoDocumento, String descripcion) {
        this.idTipoDocumento = idTipoDocumento;
        this.descripcion = descripcion;
    }
    
}
