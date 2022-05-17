/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import agentesc.*;
public class Agente4 extends Agent{
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
            //Mensajes.enviar(ACLMessage.INFORM, "BuscarDatos", "Ata", "COD0302", getAgent());
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
