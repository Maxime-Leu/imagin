package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Salarie extends Intervenant {
    
    private String dtEmbauche;
    private int echelon;
    private float coutSalarie = 500f;
    
    // Liste des projets (nommage compatible avec les tests et Intervenant)
    private ArrayList<Projet> projetsResponsable;

    public Salarie() {
        super();
        this.projetsResponsable = new ArrayList<>();
    }

    /**
     * Constructeur utilisé par tes tests : new Salarie("1", 3)
     * si le premier paramètre peut être parsé en int -> on le met en id,
     * sinon on le stocke dans dtEmbauche.
     */
    public Salarie(String s, int echelon) {
        super();
        this.echelon = echelon;
        this.projetsResponsable = new ArrayList<>();
        if (s != null) {
            try {
                int id = Integer.parseInt(s);
                setId(id);
            } catch (NumberFormatException ex) {
                // si ce n'est pas un id numérique, on le prend comme date d'embauche
                this.dtEmbauche = s;
            }
        }
    }

    public Salarie(String dtEmbauche, int echelon, int id, String nom, String prenom) {
        super(id, nom, prenom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
        this.projetsResponsable = new ArrayList<>();
    }

    public String getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(String dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public float getCoutSalarie() {
        return coutSalarie;
    }

    public void setCoutSalarie(float coutSalarie) {
        this.coutSalarie = coutSalarie;
    }

    // ---- Méthodes pour gérer la liste des projets (compatibles avec les tests) ----
    public ArrayList<Projet> getProjetsResponsable() {
        return projetsResponsable;
    }

    public void setProjetsResponsable(ArrayList<Projet> projetsResponsable) {
        this.projetsResponsable = projetsResponsable;
    }

    public void addProjetResponsable(Projet projet) {
        if (this.projetsResponsable == null) {
            this.projetsResponsable = new ArrayList<>();
        }
        this.projetsResponsable.add(projet);
    }

    public int getNombreProjetsResponsable() {
        if (this.projetsResponsable == null) {
            return 0;
        }
        return this.projetsResponsable.size();
    }

    // ---- Calcul du coût du projet ----
    @Override
    public double calculCoutProjet(int nbJours) {
        return coutSalarie * nbJours;
    }
}

