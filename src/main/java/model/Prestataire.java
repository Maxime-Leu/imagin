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
public class Prestataire extends Intervenant{
    
    private boolean forfait;
    private Double coutJournalier;
    
    private Societe societe;
    
   
    public Prestataire(){
        super();
    }

    public Prestataire(boolean forfait, Double coutJournalier, int id, String nom, String prenom) {
        super(id, nom, prenom);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
    }

    public boolean isForfait() {
        return forfait;
    }

    public Double getCoutJournalier() {
        return coutJournalier;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public void setCoutJournalier(Double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    
    public Prestataire(boolean forfait, Double coutJournalier){
        super(); 
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public double calculCoutProjet(int nbJours){
        
        if(forfait){
            return nbJours * societe.getCoutJournalier();
        } else {
            return nbJours * coutJournalier;
        }
            
    }
}

