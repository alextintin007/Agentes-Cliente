/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentesc;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import agentes.*;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor {
    
    AgentContainer agentContainer;
    
    public void contenedor(){
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        Profile P = new ProfileImpl(null, 1099, null);
        agentContainer=runtime.createMainContainer(P);
        agregarAgentes();
    }
    
    private void agregarAgentes(){
        try{
            /*agentContainer.createNewAgent("Ag4", Agente4.class.getName(), new Object[]{this,1}).start();
            agentContainer.createNewAgent("BuscarDatos", Agente2.class.getName(), null).start();
            agentContainer.createNewAgent("ReceptorInfo", Agente1.class.getName(), new Object[]{this,1}).start();
            agentContainer.createNewAgent("Ag3", Agente3.class.getName(), new Object[]{this,1}).start();
            */
            agentContainer.createNewAgent("ReceptorInfoClientePagosVentas", Agente3.class.getName(), null).start();
            agentContainer.createNewAgent("ReceptorInfoCliente", Agente1.class.getName(), new Object[]{this,1}).start();
            agentContainer.createNewAgent("UnirInfo", Agente2.class.getName(), new Object[]{this,1}).start();
        } catch(StaleProxyException ex){
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearHijos(String alias, Object[] conocimiento){
        try{
            agentContainer.createNewAgent(alias, Agente1.class.getName(), conocimiento).start();
        } catch(StaleProxyException ex){
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
