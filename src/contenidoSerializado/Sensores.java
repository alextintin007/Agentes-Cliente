/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenidoSerializado;

import java.io.Serializable;

/**
 *
 * @author Surface
 */
public class Sensores implements Serializable{
    private String riego;
    private int temperatura;

    public Sensores(String riego, int temperatura) {
        this.riego = riego;
        this.temperatura = temperatura;
    }
    
    public Sensores() {
    }

    public String getRiego() {
        return riego;
    }

    public void setRiego(String riego) {
        this.riego = riego;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
