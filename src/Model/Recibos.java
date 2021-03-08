package Model;

import java.sql.Date;

public class Recibos {
    private int nroRecibo;
    private Date fecha;
    private int idEstudiante;
    private int idTutor;

    @Override
    public String toString() {
        return "NroRecibo: " + nroRecibo + "Fecha=" + fecha + "Estudiante: " + idEstudiante + "Tutor: " + idTutor;
    }

    public int getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public Recibos(int nroRecibo, Date fecha, int idEstudiante, int idTutor) {
        this.nroRecibo = nroRecibo;
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
        this.idTutor = idTutor;
    }
}
