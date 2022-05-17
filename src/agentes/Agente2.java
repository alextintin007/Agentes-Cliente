/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import contenidoSerializado.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Agente2 extends Agent{
    private String h[]={"",""};
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }
    class Comportamiento extends CyclicBehaviour{
        @Override
        public void action() {
            
            
                System.out.println(getName());
                ACLMessage msj = blockingReceive();
                String idC = msj.getConversationId();
                if(idC.equalsIgnoreCase("COD0102")){
                try {
                    Cliente cliente = (Cliente)msj.getContentObject();
                    System.out.println(cliente);
                    } catch (UnreadableException ex) {
                Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                /*
                    int temperatura = s.getTemperatura();
                    if(temperatura>35){
                        Mensajes.enviar(ACLMessage.INFORM, "ReceptorInfo", "Encendiendo ventiladores", "COD0102", getAgent());
                    }
                    if(h[1]=="")h[0]=""+temperatura;
                }*/
                if(idC.equalsIgnoreCase("COD0302")){
                    try{
                        Object[] pagosVentas = (Object[])msj.getContentObject();
                        System.out.println(pagosVentas.length);
                        Pagos pago = (Pagos)pagosVentas[0];
                        Ventas venta = (Ventas)pagosVentas[1];
                        System.out.println(venta);
                        System.out.println(pago);
                    }catch (UnreadableException ex) {
                        Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /*String humedad = msj.getContent();
                    if(msj.getContent().equalsIgnoreCase("alta")){
                        Mensajes.enviar(ACLMessage.INFORM, "Ag3", "Regar", "COD0302", getAgent());
                    }else{
                        Mensajes.enviar(ACLMessage.INFORM, "Ag3", "No regar", "COD0302", getAgent());
                    }
                    if(h[1]=="") h[1]=humedad;
                }
                if(h[0]!="" & h[1]!=""){
                    Mensajes.enviar(ACLMessage.INFORM, "Ag4", "Temperatura: "+h[0]+" Humedad: "+h[1], "COD0402", getAgent());
                    //h[0]=h[1]="";
*/
                }

            
        }
    }
}
