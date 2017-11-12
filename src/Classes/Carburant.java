/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author cleme
 */
public class Carburant extends Cuve{
    
    private int idCarburant;
    private String nomCarburant;
    private double prixCarburant;
    
    

public Carburant() 
{
    
}
public Carburant(int unIdCarburant,String unNomCarburant ,double unPrixCarburant)
{
   this.idCarburant = unIdCarburant;
   this.nomCarburant = unNomCarburant;
   this.prixCarburant = unPrixCarburant;
}

    /**
     * @return the idCarburant
     */
    public int getIdCarburant() {
        return idCarburant;
    }

    /**
     * @param idCarburant the idCarburant to set
     */
    public void setIdCarburant(int idCarburant) {
        this.idCarburant = idCarburant;
    }

    /**
     * @return the nomCarburant
     */
    public String getNomCarburant() {
        return nomCarburant;
    }

    /**
     * @param nomCarburant the nomCarburant to set
     */
    public void setNomCarburant(String nomCarburant) {
        this.nomCarburant = nomCarburant;
    }

    /**
     * @return the prixCarburant
     */
    public double getPrixCarburant() {
        return prixCarburant;
    }

    /**
     * @param prixCarburant the prixCarburant to set
     */
    public void setPrixCarburant(double prixCarburant) {
        this.prixCarburant = prixCarburant;
    }

        }   