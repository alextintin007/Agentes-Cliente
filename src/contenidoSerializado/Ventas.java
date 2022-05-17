package contenidoSerializado;

import java.io.Serializable;

public class Ventas implements Serializable {
    private int idCliente, idVenta, numerofactura;
    private double valor;
    private boolean isIval; //1.12
    private String fecha, description;

    public Ventas(){
    }

    public Ventas(int idVenta, int idCliente, int numerofactura, double valor, boolean isIval, String fecha, String description) {
        this.idCliente = idCliente;
        this.idVenta = idVenta;
        this.numerofactura = numerofactura;
        this.valor = valor;
        this.isIval = isIval;
        this.fecha = fecha;
        this.description = description;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isIval() {
        return isIval;
    }

    public void setIval(boolean ival) {
        isIval = ival;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
