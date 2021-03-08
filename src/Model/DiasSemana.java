package Model;

public class DiasSemana {
    private int idDiaSemana;
    private String descripcionDia;

    @Override
    public String toString() {
        return "DiasSemana{" + "idDiaSemana=" + idDiaSemana + ", descripcion=" + descripcionDia + '}';
    }

    public int getIdDiaSemana() {
        return idDiaSemana;
    }

    public void setIdDiaSemana(int idDiaSemana) {
        this.idDiaSemana = idDiaSemana;
    }

    public String getDescripcionDia() {
        return descripcionDia;
    }

    public void setDescripcionDia(String descripcionDia) {
        this.descripcionDia = descripcionDia;
    }

    public DiasSemana(int idDiaSemana, String descripcion) {
        this.idDiaSemana = idDiaSemana;
        this.descripcionDia = descripcion;
    }
}
