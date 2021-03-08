package Model;

public class TiposLogins {
    private int idTipoLogin;
    private String descripcion;

    @Override
    public String toString() {
        return "TipoLogin: " + idTipoLogin + "Descripcion: " + descripcion;
    }

    public int getIdTipoLogin() {
        return idTipoLogin;
    }

    public void setIdTipoLogin(int idTipoLogin) {
        this.idTipoLogin = idTipoLogin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TiposLogins(int idTipoLogin, String descripcion) {
        this.idTipoLogin = idTipoLogin;
        this.descripcion = descripcion;
    }
}
