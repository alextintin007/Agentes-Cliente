/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import contenidoSerializado.*;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import agentesc.*;
public class Agente1 extends Agent{
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }
    
    @Override
    protected void takeDown(){
        Contenedor c = (Contenedor)getArguments()[0];
        int i = Integer.parseInt(getArguments()[1].toString());
        i++;
        c.crearHijos("AgenteHijo"+i, new Object[]{c,i});
        System.out.println("Morir");
    }
    class Comportamiento extends Behaviour{
        boolean terminado=true;
        @Override
        public void action() {
            System.out.println(getName());
            //terminado=true;
            //Mensajes.enviar(ACLMessage.INFORM, "BuscarDatos", "56", "COD0102", getAgent());
            Cliente c1iente = new Cliente("Henry","Paz","Ladron de Guevara", "099999999", "henry.paz@epn.edu.ec", "Quito"
            , "Ecuador", 1, 2, 170170, 15, 5000, 25);
            
            Mensajes.enviarS(ACLMessage.INFORM, "UnirInfo", c1iente, "COD0102", getAgent());
            ACLMessage msj = blockingReceive();
            System.out.println(msj.getContent());
            //doDelete();
            
        }
        @Override
        public boolean done() {
            return terminado;
        }
    }
}
