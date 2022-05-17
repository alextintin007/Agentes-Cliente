/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.domain.FIPANames;
import jade.lang.acl.ACLMessage;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Surface
 */
public class Mensajes {

    public static void enviar(int tipo, String receptor, String contenidoMSJ, String codigoConversacionID,
            Agent emisor) {
        ACLMessage acl = new ACLMessage(tipo);

        AID aid = new AID();
        aid.setLocalName(receptor);

        acl.addReceiver(aid);
        acl.setSender(emisor.getAID());
        acl.setLanguage(FIPANames.ContentLanguage.FIPA_SL);
        acl.setContent(contenidoMSJ);
        acl.setConversationId(codigoConversacionID);

        emisor.send(acl);
    }

    public static void enviarS(int tipo, String receptor, Serializable object, String codigoConversacionID,
            Agent emisor) {
        ACLMessage acl = new ACLMessage(tipo);

        AID aid = new AID();
        aid.setLocalName(receptor);

        acl.addReceiver(aid);
        acl.setSender(emisor.getAID());
        acl.setLanguage(FIPANames.ContentLanguage.FIPA_SL);
        try {
            //acl.setContent(contenidoMSJ);
            acl.setContentObject(object);
        } catch (IOException ex) {
            Logger.getLogger(Mensajes.class.getName()).log(Level.SEVERE, null, ex);
        }
        acl.setConversationId(codigoConversacionID);

        emisor.send(acl);
    }
}
