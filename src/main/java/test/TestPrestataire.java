package test;

import model.Prestataire;
import model.Societe;

public class TestPrestataire {
    public static void main(String[] args) {
        
        
        Societe societe = new Societe(1, "Tech Solutions", "123 rue de Paris", "75001", "Paris", 500.0);
        
       
        Prestataire p = new Prestataire(true, 400.0, 101, "Dupont", "Jean");
        
        
       
        p.setSociete(societe);
    
        int nbJours = 10; 
        double coutProjet = p.calculCoutProjet(nbJours);
        
        
        System.out.println("Prestataire 1: " + p.getNom() + " " + p.getPrenom() + ", Societe: " + p.getSociete().getRaisonSocial() + "");
        
        
        System.out.println("Cout du projet pour " + nbJours + " jours: " + coutProjet + "€");
    
    }
}