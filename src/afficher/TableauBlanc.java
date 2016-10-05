package afficher;

public class TableauBlanc {
    // Pour simuler la description de l'écran utilisé
    private boolean estGraphique = false;

    private String contenu;
    private AffichageTxt fenetre;

    public TableauBlanc(String titre) {
        this(20, 100, 0, 0, titre);
    }

    public TableauBlanc(int hauteur, int largeur, int x, int y, String titre) {
        contenu = new String();
        if (estGraphique) {
            fenetre = new FrmAffichageText(hauteur, largeur, x, y, titre);
        } else {
            fenetre = new Console();
        }
    }

    public void afficher(String texte) {
        fenetre.setAffichage(texte);
        contenu += texte;
    }

}
