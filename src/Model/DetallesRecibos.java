package Model;

public class DetallesRecibos {
    private int idDetalleRecibo;
    private int nroRecibo;
    private int mes;
    private int anio;
    private int monto;

    @Override
    public String toString() {
        return "DetalleRecibo: " + idDetalleRecibo + "NroRecibo: " + nroRecibo + "Mes: " + mes + "Anio: " + anio + "Monto: " + monto;
    }

    public int getIdDetalleRecibo() {
        return idDetalleRecibo;
    }

    public void setIdDetalleRecibo(int idDetalleRecibo) {
        this.idDetalleRecibo = idDetalleRecibo;
    }

    public int getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public DetallesRecibos(int idDetalleRecibo, int nroRecibo, int mes, int anio, int monto) {
        this.idDetalleRecibo = idDetalleRecibo;
        this.nroRecibo = nroRecibo;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
    }
    
}
