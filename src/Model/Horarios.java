package Model;

public class Horarios {

    private int idHorario;
    private String horarioComienzo;
    private String horarioFinaliza;

    public Horarios(int idHorario, String horarioComienzo, String horarioFinaliza) {
        this.idHorario = idHorario;
        this.horarioComienzo = horarioComienzo;
        this.horarioFinaliza = horarioFinaliza;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioComienzo() {
        return horarioComienzo;
    }

    public void setHorarioComienzo(String horarioComienzo) {
        this.horarioComienzo = horarioComienzo;
    }

    public String getHorarioFinaliza() {
        return horarioFinaliza;
    }

    public void setHorarioFinaliza(String horarioFinaliza) {
        this.horarioFinaliza = horarioFinaliza;
    }

    @Override
    public String toString() {
        return "Horarios{" + "idHorario=" + idHorario + ", horarioComienzo=" + horarioComienzo + ", horarioFinaliza=" + horarioFinaliza + '}';
    }
    
}
