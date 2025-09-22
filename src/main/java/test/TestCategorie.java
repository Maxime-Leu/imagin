package test;

import model.Categorie;
import model.Salarie;


public class TestCategorie {
    public static void main(String[] args) {
        
        
        Categorie categorie = new Categorie();
        categorie.setNom("Développement Web");

        // Création des salariés
        Salarie s1 = new Salarie("2000-05-05", 300, 2, "nani", "zack");
        Salarie s2 = new Salarie("2000-05-12", 301, 1, "bassem", "allosalem");
       
        categorie.addUnPrestataire(s1);
        categorie.addUnPrestataire(s2);

       
        System.out.println("Categorie : " + categorie.getNom());
        System.out.println("Liste des salaries dans la categorie :");
        
     
        System.out.println(s1.getNom() + " | " + s1.getPrenom());
        System.out.println(s2.getNom() + " | " + s2.getPrenom());

        
        
    }
}

