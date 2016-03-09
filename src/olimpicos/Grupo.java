/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpicos;
import java.util.*;

/**
 *
 * @author gaaplex
 */
public class Grupo {
    
    
    private String deporte;
   
    private Integrantes[] deportista = new Integrantes [10];

    public Grupo(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public Integrantes[] getDeportista() {
        return deportista;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
 
    public void setDeportista(Integrantes[] deportista) {
        this.deportista = deportista;
    }
    
    java.util.Scanner lectura = new java.util.Scanner (System.in);
    
    public void ingresointegrantes(){
        for(int i=0 ; i<10 ; i++){
            System.out.println("Ingrese nombre "+ i+1);
            String nom = lectura.next();
            System.out.println("Ingrese apellido "+ i+1);
            String ape = lectura.next();
            Integrantes a = new Integrantes (nom,ape);
            deportista [i] = a;
        }
    }
    
    
    
  
}
    
    
            

