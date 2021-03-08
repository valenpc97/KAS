package Model;

public class Salas {
    private int idSala;
    private String descripcion;
    private String turno;
    private String horaEntrada;
    private String horaSalida;

    public Salas(int idSala, String descripcion, String turno, String horaEntrada, String horaSalida) {
        this.idSala = idSala;
        this.descripcion = descripcion;
        this.turno = turno;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public Salas(String descripcion, String turno, String horaEntrada, String horaSalida) {
        this.descripcion = descripcion;
        this.turno = turno;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Salas{" + "idSala=" + idSala + ", descripcion=" + descripcion + ", turno=" + turno + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Salas(int idSala, String descripcion, int idGrupo, String turno, String horaEntrada, String horaSalida) {
        this.idSala = idSala;
        this.descripcion = descripcion;
        this.turno = turno;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

}