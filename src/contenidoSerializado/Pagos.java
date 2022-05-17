package contenidoSerializado;

public class Pagos {
    private int idPago, idCliente;
    private double valor;
    private String fecha;

    public Pagos(int idPago, int idCliente, double valor, String fecha) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.valor = valor;
        this.fecha = fecha;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
