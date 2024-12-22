package Ds21;

abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ".");
    }

    public String calculerCategorie() {
        return (age < 25) ? "Jeune" : "Adulte";
    }

    public abstract void afficherDetails();
}