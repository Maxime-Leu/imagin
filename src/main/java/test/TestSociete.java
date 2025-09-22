package test;


import model.Societe;
import model.Prestataire;

public class TestSociete {
    public static void main(String[] args) {
        
        
        Societe s = new Societe(1, "Tech Solutions", "123 rue de Paris", "75001", "Paris", 500.0);
        
        
        Prestataire p1 = new Prestataire(true, 400.0, 101, "Dupont", "Jean");
        Prestataire p2 = new Prestataire(true, 400.0, 250, "Walouzz", "Burgouzz");
        
        
        
        System.out.println("Societe : " + s.getRaisonSocial() + " | " + s.getAdresse() + " | " + s.getCopos() + " | " + s.getVille() + " | " + s.getCoutJournalier());
        
        
        System.out.println("Liste des Prestataires :\n" +
            p1.getId() + " | " + p1.getNom() + " | " + p1.getPrenom() + " | " + p1.getCoutJournalier() + "\n" +
            p2.getId() + " | " + p2.getNom() + " | " + p2.getPrenom() + " | " + p2.getCoutJournalier());

                
    }
}