/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentesc;

import agentes.*;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Surface
 */
public class Contenedor {

    AgentContainer agentContainer;

    public void contenedor() {
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        Profile p = new ProfileImpl(null, 1099, null);
        agentContainer = runtime.createMainContainer(p);
        agregarAgentes();
    }

    private void agregarAgentes() {
        try {
            agentContainer.createNewAgent("ReceptorInfocLIENTEpagosVentas", Agente3.class.getName(), null).start();
            agentContainer.createNewAgent("ReceptorInfoCleinte", Agente1.class.getName(), new Object[]{this,1}).start();
            agentContainer.createNewAgent("UnirInformacion", Agente2.class.getName(), null).start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearHijos(String alias, Object[] conocimiento) {
        try {
            agentContainer.createNewAgent(alias, Agente1.class.getName(), conocimiento).start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
