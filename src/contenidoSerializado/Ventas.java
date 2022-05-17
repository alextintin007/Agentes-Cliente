/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenidoSerializado;
import java.io.Serializable;

public class Ventas implements Serializable{
    private int idVenta, idCliente;
    private double valor;
    private boolean isIva;//1.12
    private String fecha, descripcionProducto;

    public Ventas(int idVenta, int idCliente, double valor, boolean isIva, String fecha, String descripcionProducto) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.valor = valor;
        this.isIva = isIva;
        this.fecha = fecha;
        this.descripcionProducto = descripcionProducto;
    }

    public Ventas() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public boolean isIsIva() {
        return isIva;
    }

    public void setIsIva(boolean isIva) {
        this.isIva = isIva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idVenta=" + idVenta + ", idCliente=" + idCliente + ", valor=" + valor + ", isIva=" + isIva + ", fecha=" + fecha + ", descripcionProducto=" + descripcionProducto + '}';
    }
    
    
}
