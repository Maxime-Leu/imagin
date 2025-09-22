package model;

import java.util.ArrayList;

public class Categorie {
    private int id;
    private String nom;
    
    
    private ArrayList<Intervenant> lesIntervenants;

    public void setId(int id) {
        this.id = id;
    }

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

   

    public String getNom() {
        return nom;
    }

   

    public int getId() {
        return id;
    }

    public Categorie() {
    }
  
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Intervenant> getLesIntervenants() {
        return lesIntervenants;
    }
    
    public void setLesIntervenants(ArrayList<Intervenant> lesIntervenants) {
        this.lesIntervenants = lesIntervenants;
    }

    public void addUnIntervenant(Intervenant unIntervenant){
        if (lesIntervenants == null){
            lesIntervenants = new ArrayList<Intervenant>();
        }
        lesIntervenants.add(unIntervenant);
    }
    
    public int getNombreIntervenants(){
        if (lesIntervenants == null) {
            return 0; 
        }
        return lesIntervenants.size();
    }
}

