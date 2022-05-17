package agentes;

import agentesc.Contenedor;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class Agente4 extends Agent {
    @Override
    protected void setup() {                //crea el primer hilo en la creacion del agente
        addBehaviour(new Comportamiento());
    }
    @Override
    protected void takeDown(){
        Contenedor c = (Contenedor)getArguments()[0];
        int i = Integer.parseInt(getArguments()[1].toString());
        i++;
        c.crearHijos("AgenteHijo"+i, new Object[]{c, i});
        System.out.println("Morir");
    }

    class Comportamiento extends Behaviour {
        boolean terminado = false;
        @Override
        public void action(){
            //todo lo que necesite hacer el agente
            //ANN, AG, Bayes, if else
            System.out.print("Nombre Agente 4: ");
            System.out.println(getName());
            //terminado = true; //depende de lo que se necesite
            //doDelete(); //matar el agente
            //antes hacer algo entonces usar un comportamiento del agente
            //2 AL 3
            //humedad alto o bajo
            Mensajes.enviar(ACLMessage.INFORM, "BuscarDatos",  "Recibido", "COD0402", getAgent());
            ACLMessage acl = blockingReceive();
            System.out.println(acl.getContent());
        }
        @Override
        public boolean done() {
            //control de acciones al agente
            return terminado;
        }
    }
}
