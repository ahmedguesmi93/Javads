package Ds21;

import java.util.*;

class Ecole {
	
    private List<Personne> listePersonnes;
    private List<Cours> listeCours;

    public Ecole() {
        this.listePersonnes = new ArrayList<>();
        this.listeCours = new ArrayList<>();
    }

    public void ajouterPersonne(Personne personne) {
        listePersonnes.add(personne);
    }

    public void ajouterCours(Cours cours) {
        listeCours.add(cours);
    }

    public Personne rechercherParNom(String nom) {
        return listePersonnes.stream().filter(p -> p.nom.equals(nom)).findFirst().orElse(null);
    }

    public void afficherToutesLesPersonnes() {
        System.out.println("Liste des personnes:");
        for (Personne p : listePersonnes) {
            p.afficherDetails();
        }
    }

    public void afficherTousLesCours() {
        System.out.println("Liste des cours:");
        for (Cours c : listeCours) {
            System.out.println("- " + c.getTitre());
        }
    }
    
    public static void main(String[] args) {
        Ecole ecole = new Ecole();

        Professeur prof1 = new Professeur(1, "test", "test1", 40, "Java", 2500);
        Professeur prof2 = new Professeur(2, "test2", "test3", 35, "Unix", 2700);
        
        ecole.ajouterPersonne(prof1);
        ecole.ajouterPersonne(prof2);

        Etudiant etu1 = new Etudiant(1, "test4", "test5", 20, "1ère année");
        Etudiant etu2 = new Etudiant(2, "test6", "test7", 22, "2ème année");
        
        ecole.ajouterPersonne(etu1);
        ecole.ajouterPersonne(etu2);

        Cours cours1 = new Cours(1, "C", prof1);
        Cours cours2 = new Cours(2, "C++", prof2);
        
        ecole.ajouterCours(cours1);
        ecole.ajouterCours(cours2);

        cours1.inscrireEtudiant(etu1);
        cours1.inscrireEtudiant(etu2);
        cours2.inscrireEtudiant(etu2);

        cours1.attribuerNotePourEtudiant(etu1, 15.5);
        cours1.attribuerNotePourEtudiant(etu2, 12.0);
        cours2.attribuerNotePourEtudiant(etu2, 14.0);

        cours1.afficherParticipants();

        ecole.afficherToutesLesPersonnes();
        ecole.afficherTousLesCours();
    }
}