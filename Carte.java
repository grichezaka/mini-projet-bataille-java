public class Carte implements Comparable<Carte> {
    public static final String[] COULEURS = {"Pique ♠", "Cœur ♥", "Carreau ♦", "Trèfle ♣"};

    public static final int[] VALEURS = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    private final String couleur;
    private final int valeur;

    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getCouleur() { return couleur; }
    public int getValeur() { return valeur; }

    @Override
    public int compareTo(Carte autre) {
        return Integer.compare(this.valeur, autre.valeur);
    }

    @Override
    public String toString() {
        String nom;
        switch (valeur) {
            case 11: nom = "Valet"; break;
            case 12: nom = "Dame"; break;
            case 13: nom = "Roi"; break;
            case 14: nom = "As"; break;
            default: nom = String.valueOf(valeur);
        }
        return nom +" "+ couleur;
    }
}
