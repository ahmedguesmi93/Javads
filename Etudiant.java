package Ds21;

import java.util.*;

class Etudiant extends Personne {
    private String classe;
    private Map<Cours, Double> notes;

    public Etudiant(int id, String nom, String prenom, int age, String classe) {
        super(id, nom, prenom, age);
        this.classe = classe;
        this.notes = new HashMap<>();
    }

    public void attribuerNote(Cours cours, double note) {
        notes.put(cours, note);
    }

    public double obtenirMoyenne() {
        return notes.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Étudiant: " + nom + " " + prenom + ", Classe: " + classe + ", Moyenne: " + obtenirMoyenne());
    }
}