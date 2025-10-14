import java.util.ArrayList;

public class Joueur {
    private final String nom;               // nom du joueur
    private final ArrayList<Carte> main;    // cartes du joueur
    private int points;                     // score

    public Joueur(String nom) {
        this.nom = nom;
        this.main = new ArrayList<>();
        this.points = 0;
    }

    public String getNom() { return nom; }
    public int getPoints() { return points; }

    public void ajouterCarte(Carte c) {
        main.add(c);
    }

    public Carte tirerCarte() {
        if (main.isEmpty()) return null;
        return main.remove(0);
    }

    public void ajouterPoint() {
        points++;
    }


    public int tailleMain() {
        return main.size();
    }
}

