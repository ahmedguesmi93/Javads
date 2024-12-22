package Ds21;

import java.util.*;

class Cours {

    private int id;
    private String titre;
    private Professeur professeur;
    private List<Etudiant> etudiantsInscrits;

    public Cours(int id, String titre, Professeur professeur) {
        this.id = id;
        this.titre = titre;
        this.professeur = professeur;
        this.etudiantsInscrits = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public List<Etudiant> getEtudiantsInscrits() {
        return etudiantsInscrits;
    }

    public void inscrireEtudiant(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    public void afficherParticipants() {
        System.out.println("Liste des participants au cours " + titre + ":");
        for (Etudiant e : etudiantsInscrits) {
            System.out.println("- " + e.prenom + " " + e.nom);
        }
    }

    public void attribuerNotePourEtudiant(Etudiant etudiant, double note) {
        if (etudiantsInscrits.contains(etudiant)) {
            etudiant.attribuerNote(this, note);
        } else {
            System.out.println("Erreur : L'étudiant n'est pas inscrit à ce cours.");
        }
    }
}