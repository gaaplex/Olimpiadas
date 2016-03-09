/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpicos;

import java.util.HashMap;

/**
 *
 * @author gaaplex
 */
public class Delegacion {
   
    private String pais;
    private int ndeportistas; 
    private int noro=0;
    private int nplata=0;
    private int nbronce=0;
    private int totalm;
    
    HashMap<String, Grupo> grupos = new HashMap<String, Grupo>();
    
    String id;

    
    java.util.Scanner lectura = new java.util.Scanner (System.in);

    public Delegacion(String pais ) {
      
        this.pais = pais;
        this.ndeportistas = 0;
         
     }

    public String getPais() {
        return pais;
    }

    public int getNdeportistas() {
        return ndeportistas;
    }

    public int getNoro() {
        return noro;
    }

    public int getNplata() {
        return nplata;
    }

    public int getNbronce() {
        return nbronce;
    }

    public int getTotalm() {
        return totalm;
    }

    public HashMap<String, Grupo> getGrupos() {
        return grupos;
    }
    

 
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNdeportistas(int ndeportistas) {
        this.ndeportistas = ndeportistas;
    }

    public void setNoro() {
        System.out.println("Cuantas medallas de oro gano? ");
        noro = lectura.nextInt();
        }

    public void setNplata() {
        System.out.println("Cuantas medallas de plata gano? ");
        nplata = lectura.nextInt();
        
    }

    public void setNbronce() {
        System.out.println("Cuantas medallas de bronce gano? ");
        nbronce = lectura.nextInt();
    }

    public void setTotalm(int totalm) {
        this.totalm = totalm;
    }

    public void setGrupos(HashMap<String, Grupo> grupos) {
        this.grupos = grupos;
    }

     
    Grupo[] a = new Grupo [5];
    
    public void ingresogrupos(){
        for(int i=0 ; i<5 ; i++){
            System.out.println("Ingrese deporte "+ i+1);
            String dep = lectura.next();
            Grupo a = new Grupo (dep);
            a.ingresointegrantes();
            
            grupos.put(a.getDeporte(), a);
        }
    }
    
    

    public void buscarDeporte(){
        
        System.out.println("Ingrese deporte ");
        id = lectura.next();
        Grupo xg = grupos.get(id);
        if (xg != null) {

        } else {
            System.out.println(" invalido: " + id);
        }
        
        
    }
     
    
    
}
