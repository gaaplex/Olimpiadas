/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpicos;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author gaaplex
 */

public class JuegosOlimpicos {
    
    private Delegacion ganador;
    
    HashMap<String, Delegacion> paises = new HashMap<String, Delegacion>();
    
    String id;

    public JuegosOlimpicos(Delegacion ganador) {
        this.ganador = ganador;
    }

    public Delegacion getGanador() {
        return ganador;
    }

    public void setGanador(Delegacion ganador) {
        this.ganador = ganador;
    }
    
    Scanner lectura = new Scanner (System.in);
    
    public void ingresoDelegacion(){
        for(int i=0 ; i<10 ; i++){
            System.out.println("Ingrese pais "+ i+1);
            String pais = lectura.next();
            Delegacion a = new Delegacion (pais);
            a.ingresogrupos();
            
            paises.put(a.getPais(), a);
        }
    }   
    
    public void cambiarMedalla(){
        
        System.out.println("Ingrese pais ");
        id = lectura.next();
        Delegacion x = paises.get(id);
        if (x != null) {
            x.setNoro();
            x.setNplata();
            x.setNbronce();
        } else {
            System.out.println("Pais invalido: " + id);
        }
        
        
    }
}
