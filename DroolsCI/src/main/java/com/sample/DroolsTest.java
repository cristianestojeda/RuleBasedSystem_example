package com.sample;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import criterios.CriteriosAplicables;
import criterios.CriteriosAplicables.Capacidad;
import criterios.PropuestaRestaurante;
import model.Restaurante;
import model.Gustos;
import model.Gustos.Comida;
import model.Cliente;
import model.InfoAbstractaCliente;
import model.InfoPersonal;
import model.InfoPersonal.EstadoCivil;

public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");

        	
        	Cliente cl = new Cliente (
        			new InfoPersonal(
        					68,
        					EstadoCivil.Viudo,
        					3,
        					false,
        					50),
        			new Gustos(Arrays.asList(
        					Comida.Espanola,
        					Comida.Moderna,
        					Comida.Occidental)),
        			new InfoAbstractaCliente()
        			);
        	kSession.insert(cl);
        	
        	System.out.println(cl.toString());
        	
        	Restaurante laBolera = new Restaurante(
        			new HashSet<Comida>(Arrays.asList(Comida.Espanola, Comida.Tradicional, Comida.Francesa)),
        			15,
        			false,
        			"LaBolera");
        	
        	Restaurante elPaseo = new Restaurante(
        			new HashSet<Comida>(Arrays.asList(Comida.Italiano, Comida.Moderna, Comida.Occidental)),
        			55,
        			true,
        			"ElPaseo");
        	
        	Restaurante chano = new Restaurante(
        			new HashSet<Comida>(Arrays.asList(Comida.Espanola, Comida.Occidental, Comida.Tradicional)),
        			15,
        			false,
        			"Chano");
        	
        	
        	// Ejemplos
        	//kSession.insert(laBolera);
        	//PropuestaRestaurante decision = new PropuestaRestaurante(laBolera, cl, new Date());
        	kSession.insert(elPaseo);
        	PropuestaRestaurante decision = new PropuestaRestaurante(elPaseo, cl, new Date());
        	//kSession.insert(chano);
        	//PropuestaRestaurante decision = new PropuestaRestaurante(chano, cl, new Date());
        	kSession.insert(decision);
        	
        	kSession.insert(new CriteriosAplicables(Capacidad.Movilidad));
        	kSession.insert(new CriteriosAplicables(Capacidad.Comidas));
        	kSession.insert(new CriteriosAplicables(Capacidad.Pago));
        	
            kSession.startProcess("com.sample.bpmn.hello");
            //kSession.fireAllRules();
            
            if(decision.isDecision()) {
            	System.out.println("Se decide recomendar el restaurante " + decision.getRestaurante().getNombre());
            }else {
            	System.out.println("Se decide NO recomendar el restaurante " + decision.getRestaurante().getNombre());
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
