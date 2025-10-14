public class Bataille {

    public static void main(String[] args) {

        Joueur j1 = new Joueur("Joueur 1");
        Joueur j2 = new Joueur("Joueur 2");
        Carte[] paquet = new Carte[52];
        int index = 0;
        for (String couleur : Carte.COULEURS) {
            for (int valeur : Carte.VALEURS) {
                paquet[index++] = new Carte(couleur, valeur); // utilisation du constructeur
            }
        }

        melanger(paquet);
        for (int i = 0; i < 26; i++) {
            j1.ajouterCarte(paquet[i]);
            j2.ajouterCarte(paquet[i + 26]);
        }
        for (int manche = 1; manche <= 26; manche++) {
            Carte c1 = j1.tirerCarte();
            Carte c2 = j2.tirerCarte();

            System.out.println("Manche " + manche + " : " + j1.getNom() + " [" + c1 + "] vs " + j2.getNom() + " [" + c2 + "]");

            int resultat = c1.compareTo(c2);
            if (resultat > 0) {
                j1.ajouterPoint();
                System.out.println("→ " + j1.getNom() + " gagne");
            } else if (resultat < 0) {
                j2.ajouterPoint();
                System.out.println("→ " + j2.getNom() + " gagne");
            } else {
                System.out.println("→ Égalité !");
            }

            System.out.println("Score : " + j1.getPoints() + " - " + j2.getPoints());
        }
        if (j1.getPoints() > j2.getPoints()) {
            System.out.println("Vainqueur : " + j1.getNom());
        } else if (j2.getPoints() > j1.getPoints()) {
            System.out.println("Vainqueur : " + j2.getNom());
        } else {
            System.out.println("Match nul !");
        }
    }

    private static void melanger(Carte[] t) {
        for (int i = t.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Carte temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
    }
}
