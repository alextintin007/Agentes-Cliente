/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenidoSerializado;

import java.io.Serializable;

public class Sensores implements Serializable{
    private int temperatura;
    private String humedad;

    public Sensores(int temperatura, String humedad){
        this.temperatura=temperatura;
        this.humedad=humedad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getHumedad() {
        return humedad;
    }
    
}
