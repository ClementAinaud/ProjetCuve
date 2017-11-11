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
public class Cuve {
   
  private  int idCuve;
  private  String nomCuve;
   
  private ArrayList<Carburant> lesCarburants;
  
 
  public  Cuve()
  {
      
  }
  public Cuve (int unIdCuve,String unNomCuve){
   this.idCuve = unIdCuve;
    this.nomCuve = unNomCuve;
    this.lesCarburants = new ArrayList<Carburant>();
     
  }

    /**
     * @return the idCuve
     */
    public int getIdCuve() {
        return idCuve;
    }

    /**
     * @param idCuve the idCuve to set
     */
    public void setIdCuve(int idCuve) {
        this.idCuve = idCuve;
    }

    /**
     * @return the nomCuve
     */
    public String getNomCuve() {
        return nomCuve;
    }

    /**
     * @param nomCuve the nomCuve to set
     */
    public void setNomCuve(String nomCuve) {
        this.nomCuve = nomCuve;
    }
   
    public void ajouterCarburant(Carburant unCarburant)
    {
    
    this.getLesCarburants().add(unCarburant);
            }       
            
            
    public ArrayList<Carburant> getLesCarburants(){
        return lesCarburants;
    }
   
}

