/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Intervenant;
/**
 *
 * @author sio2
 */
public class Salarie extends Intervenant{
    
    private String dtEmbauche;
    private int echelon;
    
    private float coutSalarie = 500;
    
    public Salarie(){
        super();
    }

    public Salarie(String dtEmbauche, int echelon, int id, String nom, String prenom) {
        super(id, nom, prenom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public String getDtEmbauche() {
        return dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setDtEmbauche(String dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }
    public Salarie(String dtEmbauche, int echelon){
        super(); 
    }

    public float getCoutSalarie() {
        return coutSalarie;
    }

    public void setCoutSalarie(float coutSalarie) {
        this.coutSalarie = coutSalarie;
    }
    
    
    
    public double calculCoutProjet(int nbJours){
        
        return coutSalarie * nbJours;
    }
}

