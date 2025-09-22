/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Societe {
    
    private int id;
    private String raisonSocial;
    private String adresse;
    private String copos;
    private String ville;
    private Double coutJournalier;

    
    private ArrayList<Prestataire> lesPrestataires;
    
    public Societe(int id, String raisonSocial, String adresse, String copos, String ville, Double coutJournalier) {
        this.id = id;
        this.raisonSocial = raisonSocial;
        this.adresse = adresse;
        this.copos = copos;
        this.ville = ville;
        this.coutJournalier = coutJournalier;
    }

    public int getId() {
        return id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCopos() {
        return copos;
    }

    public String getVille() {
        return ville;
    }

    public Double getCoutJournalier() {
        return coutJournalier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCopos(String copos) {
        this.copos = copos;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCoutJournalier(Double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }
    public ArrayList<Prestataire> getLesPrestataires() {
        return lesPrestataires;
    }

    public void setLesPrestataires(ArrayList<Prestataire> lesPrestataires) {
        this.lesPrestataires = lesPrestataires;
    }

    public void addUnPrestataire(Prestataire unPrestataire){
        if (lesPrestataires == null){
            lesPrestataires = new ArrayList<Prestataire>();
        }
        lesPrestataires.add(unPrestataire);
    }
    

}
