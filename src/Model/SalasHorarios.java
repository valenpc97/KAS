package Model;

public class SalasHorarios {

    private int idSalaHorario;
    private int idSala;
    private String nombreSala;
    private int idHorario;
    private String horario;
    private int idDocente;
    private String docente;
    private int idTipoDocente;
    private String materiaDocente;
    private int diaSemana;
    private String descripcionDia;

    public SalasHorarios(int idSalaHorario, int idSala, String nombreSala, int idHorario, String horario, int idDocente, String docente, int idTipoDocente, String materiaDocente, int diaSemana, String descripcionDia) {
        this.idSalaHorario = idSalaHorario;
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.idHorario = idHorario;
        this.horario = horario;
        this.idDocente = idDocente;
        this.docente = docente;
        this.idTipoDocente = idTipoDocente;
        this.materiaDocente = materiaDocente;
        this.diaSemana = diaSemana;
        this.descripcionDia = descripcionDia;
    }

    public SalasHorarios(int idSalaHorario, int idSala, int idHorario, int idDocente, int diaSemana) {
        this.idSalaHorario = idSalaHorario;
        this.idSala = idSala;
        this.idHorario = idHorario;
        this.idDocente = idDocente;
        this.diaSemana = diaSemana;
    }

    public SalasHorarios(int idSala, int idHorario, int idDocente, int diaSemana) {
        this.idSala = idSala;
        this.idHorario = idHorario;
        this.idDocente = idDocente;
        this.diaSemana = diaSemana;
    }

    public SalasHorarios(int idSalaHorario, int idSala, String nombreSala, String horario, String docente, String materiaDocente, String descripcionDia) {
        this.idSalaHorario = idSalaHorario;
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.horario = horario;
        this.docente = docente;
        this.materiaDocente = materiaDocente;
        this.descripcionDia = descripcionDia;
    }

    public int getIdTipoDocente() {
        return idTipoDocente;
    }

    public void setIdTipoDocente(int idTipoDocente) {
        this.idTipoDocente = idTipoDocente;
    }

    public String getMateriaDocente() {
        return materiaDocente;
    }

    public void setMateriaDocente(String materiaDocente) {
        this.materiaDocente = materiaDocente;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getDescripcionDia() {
        return descripcionDia;
    }

    public void setDescripcionDia(String descripcionDia) {
        this.descripcionDia = descripcionDia;
    }

    public int getIdSalaHorario() {
        return idSalaHorario;
    }

    public void setIdSalaHorario(int idSalaHorario) {
        this.idSalaHorario = idSalaHorario;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "SalasHorarios{" + "idSalaHorario=" + idSalaHorario + ", idSala=" + idSala + ", idHorario=" + idHorario + ", idDocente=" + idDocente + ", diaSemana=" + diaSemana + '}';
    }
}
