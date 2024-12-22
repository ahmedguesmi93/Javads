package Ds21;

import java.util.*;

class Professeur extends Personne {
    private String matiere;
    private double salaire;
    private List<Cours> coursAttribues;

    public Professeur(int id, String nom, String prenom, int age, String matiere, double salaire) {
        super(id, nom, prenom, age);
        this.matiere = matiere;
        this.salaire = salaire;
        this.coursAttribues = new ArrayList<>();
    }

    public void attribuerCours(Cours cours) {
        coursAttribues.add(cours);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Professeur: " + nom + " " + prenom + ", Matière: " + matiere + ", Salaire: " + salaire);
    }
}