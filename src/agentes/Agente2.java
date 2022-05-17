/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentes;

import contenidoSerializado.Cliente;
import contenidoSerializado.Sensores;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Surface
 */
public class Agente2 extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
    }

    class Comportamiento extends CyclicBehaviour {

        @Override
        public void action() {
            System.out.println(getName());
            ACLMessage msj = blockingReceive();

            String idC = msj.getConversationId();

            if (idC.equalsIgnoreCase("COD0102")) {
                try {
                    System.out.println(msj);
                    Cliente cliente = (Cliente) msj.getContentObject();
                    System.out.println(cliente);
                    //String temperatura = msj.getContent();
                    //if (Integer.parseInt(temperatura) > 35) {
                    //   System.out.println("Prendiendo ventiladores");
                    //    //.............
                    //    Mensajes.enviar(ACLMessage.INFORM, "ReceptorInfo", "Ventilador prendido", "COD0201", getAgent());
                    //}
                } catch (UnreadableException ex) {
                    Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (idC.equalsIgnoreCase("COD0302")) {
                    String humedadHoja = msj.getContent();
                    if (humedadHoja.equalsIgnoreCase("alta")) {
                        System.out.println("No regar");

                    } else {
                        System.out.println("Regar");

                    }
                    Mensajes.enviar(ACLMessage.INFORM, "Ag3", "Estado de riego", "COD0203", getAgent());
                }
            }

            //System.out.println(msj.getConversationId());
        }

    }

}
