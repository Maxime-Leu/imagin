package test;


import model.Salarie;

public class TestSalarie {
    public static void main(String[] args) {
        
        
        Salarie s = new Salarie("2000-05-05", 254, 2, "nani", "zack");
        
        System.out.println("Salarie: " + s.getNom() + " " + s.getPrenom() + "|aa Date embauche: " + s.getDtEmbauche() + "| Echelon :" + s.getEchelon());
        
        
        int nbJours = 10; 
        double coutProjet = s.calculCoutProjet(nbJours);
        
        System.out.println("Cout du projet pour " + nbJours + " jours: " + coutProjet + "€");
    
    
    }
}