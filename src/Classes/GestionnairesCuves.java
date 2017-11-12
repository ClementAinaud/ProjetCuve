/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class GestionnairesCuves {
 
    private ArrayList <Cuve> lesCuves;
    
    
    // controlleur
    
     
    public GestionnairesCuves() {
        lesCuves = new ArrayList<Cuve>();
       
    }
    //2 eme controlleur vide
   public void ajouterCuves(Cuve uneCuve)
   {
     this.getLesCuves().add(uneCuve);  
   }
   public ArrayList<Cuve> getLesCuves(){
       return lesCuves;
   
}
}