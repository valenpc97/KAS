package Model;

public class Familias {

    private int idFamilia;
    private String apellidoFamilia;
    private String apellidoFamiliaDos;

    public Familias(int idFamilia, String apellidoFamilia, String apellidoFamiliaDos) {
        this.idFamilia = idFamilia;
        this.apellidoFamilia = apellidoFamilia;
        this.apellidoFamiliaDos = apellidoFamiliaDos;
    }

    public Familias(int idFamilia, String apellidoFamilia, String apellidoFamiliaDos, int idFamiliaMod) {
        this.idFamilia = idFamilia;
        this.apellidoFamilia = apellidoFamilia;
        this.apellidoFamiliaDos = apellidoFamiliaDos;
        this.idFamilia = idFamiliaMod;
    }

    @Override
    public String toString() {
        return "Familias{" + "idFamilia=" + idFamilia + ", apellidoFamilia=" + apellidoFamilia + ", apellidoFamiliaDos=" + apellidoFamiliaDos + '}';
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getApellidoFamilia() {
        return apellidoFamilia;
    }

    public void setApellidoFamilia(String apellidoFamilia) {
        this.apellidoFamilia = apellidoFamilia;
    }

    public String getApellidoFamiliaDos() {
        return apellidoFamiliaDos;
    }

    public void setApellidoFamiliaDos(String apellidoFamiliaDos) {
        this.apellidoFamiliaDos = apellidoFamiliaDos;
    }

}
