/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenidoSerializado;

import java.io.Serializable;
public class Pagos implements Serializable{
    private int idPago, idCliente;
    private double valorPago;
    private String fecha;

    public Pagos(int idPago, int idCliente, double valorPago, String fecha) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.valorPago = valorPago;
        this.fecha = fecha;
    }

    public Pagos() {
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

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pagos{" + "idPago=" + idPago + ", idCliente=" + idCliente + ", valorPago=" + valorPago + ", fecha=" + fecha + '}';
    }
    
    
}
