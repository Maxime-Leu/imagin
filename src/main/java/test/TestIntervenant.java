package test;

import model.*;


public class TestIntervenant {
    public static void main(String[] args) {

     
        Societe societe = new Societe(1, "Tech Solutions", "12 rue des Lilas", "75001", "Paris", 600.0);

        
        Prestataire p = new Prestataire(true, 450.0, 101, "Durand", "Lucie");
        Prestataire p1 = new Prestataire(false, 500.0, 150, "Jack", "Uzi");
        Salarie salarie = new Salarie("2025-05-05", 254, 2, "Amar", "Oussama");
        
        
        
        p.setSociete(societe);
        p1.setSociete(societe);
        
        
        int nbJours = 100; 
        double coutProjet1 = salarie.calculCoutProjet(nbJours);
        double coutProjet3 = p.calculCoutProjet(nbJours);
        double coutProjet2 = p1.calculCoutProjet(nbJours);
        
                                        
        
        System.out.println("Nom : " + salarie.getNom());
        System.out.println("Prenom : " + salarie.getPrenom());
        System.out.println("Cout du projet pour " + nbJours + " jours: " + coutProjet1 + "€");
        
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Prenom : " + p1.getPrenom());
        System.out.println("Cout du projet pour " + nbJours + " jours: " + coutProjet2 + "€");
        
        System.out.println("Nom : " + p.getNom());
        System.out.println("Prenom : " + p.getPrenom());
        System.out.println("Cout du projet pour " + nbJours + " jours: " + coutProjet3 + "€");
        
        
        
    }
}

