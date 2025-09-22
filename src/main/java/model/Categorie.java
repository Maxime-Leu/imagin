package model;

import java.util.ArrayList;

public class Categorie {
    private String nom;
    private ArrayList<Salarie> lesSalaries;

    public Categorie(String nom, ArrayList<Salarie> lesSalaries) {
        this.nom = nom;
        this.lesSalaries = lesSalaries;
    }

    public String getNom() {
        return nom;
    }

    public Categorie() {
    }
  
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Salarie> getLesSalaries() {
        return lesSalaries;
    }
    
    public void setLesSalaries(ArrayList<Salarie> lesSalaries) {
        this.lesSalaries = lesSalaries;
    }

    public void addUnPrestataire(Salarie unSalarie){
        if (lesSalaries == null){
            lesSalaries = new ArrayList<Salarie>();
        }
        lesSalaries.add(unSalarie);
    }
    
    public int getNombreSalaries(){
        return 0;
    }
}

