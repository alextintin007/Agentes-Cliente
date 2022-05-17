/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentes;

import agentesc.Contenedor;
import contenidoSerializado.Cliente;
import contenidoSerializado.Sensores;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Surface
 */
public class Agente1 extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
    } 

    @Override
    protected void takeDown() {
        Contenedor c = (Contenedor)getArguments()[0];
        int i = Integer.parseInt(getArguments()[1].toString());
        i++;
        c.crearHijos("AgenteHijo"+i, new Object[]{c,i});
        System.out.println("Morir");
    }
    
    class Comportamiento extends Behaviour{
        boolean terminado = false;
        @Override
        public void action() {
            System.out.println(getName());
            //terminado = true;//depende lo q necesites
            //doDelete();
            //sensor de temperatura ...........
            //Mensajes.enviar(ACLMessage.INFORM,"BuscarDatos", "40","COD0102",getAgent());
            Cliente c1 = new Cliente("Xavier", "Tintin", "Ladron de Guevarra","0999345241",
                    "xavier.tintin@epn.edu.ec","Quito","Ecuador", 1,2,170170,15,500);
            Mensajes.enviarS(ACLMessage.INFORM,"BuscarDatos", new Sensores("alto",40),"COD0102",getAgent());
            
            ACLMessage acl = blockingReceive();
            System.out.println(acl.getContent());
        }

        @Override
        public boolean done() {
            return terminado;
        }
        
    }
}
