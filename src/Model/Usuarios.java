package Model;

public class Usuarios {
    private int idLogin;
    private String usuario;
    private String clave;
    private int idTipoLogin;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuarios(int idLogin, String usuario, String clave, String descripcion, int idTipoLogin) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.clave = clave;
        this.descripcion = descripcion;
        this.idTipoLogin = idTipoLogin;
    }

    public Usuarios(String usuario, String clave, int idTipoLogin) {
        this.usuario = usuario;
        this.clave = clave;
        this.idTipoLogin = idTipoLogin;
    }
    
    public Usuarios(String usuario, String clave, int idTipoLogin, int idLogin) {
        this.usuario = usuario;
        this.clave = clave;
        this.idTipoLogin = idTipoLogin;
        this.idLogin = idLogin;
    }

    @Override
    public String toString() {
        return "Login: " + idLogin + "Usuario: " + usuario + "Clave: " + clave + "TipoLogin: " + idTipoLogin;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdTipoLogin() {
        return idTipoLogin;
    }

    public void setIdTipoLogin(int idTipoLogin) {
        this.idTipoLogin = idTipoLogin;
    }

    public Usuarios(int idLogin, String usuario, String clave, int idTipoLogin) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.clave = clave;
        this.idTipoLogin = idTipoLogin;
    }
}
