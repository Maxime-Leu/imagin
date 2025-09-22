package model;

public abstract class Intervenant {
    
    private int id ;
    private String nom ;
    private String prenom;

    public Intervenant() {
    }
    
    public Intervenant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public abstract double calculCoutProjet(int nbJours);

    public int nbProjetsSuperieurs(double montant) {
        if (this instanceof Salarie) {
            Salarie s = (Salarie) this;
            int count = 0;
            if (s.getProjetsResponsable() != null) {
                for (Projet p : s.getProjetsResponsable()) {
                    if (p != null && p.getMontant() > montant) {
                        count++;
                    }
                }
            }
            return count;
        }
        return 0;
    }
}
