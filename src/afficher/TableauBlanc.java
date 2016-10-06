package afficher;

import pseudoSystem.PseudoSystem;

public class TableauBlanc {
    
    private String contenu;
    private AffichageTxt fenetre;
    private boolean estGraphique;

    public TableauBlanc(String titre) {
        this(20, 100, 0, 0, titre);
    }

    public TableauBlanc(int hauteur, int largeur, int x, int y, String titre) {
        contenu = new String();
        estGraphique= PseudoSystem.estGraphique;
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
  @Override
    public String toString(){
        String xml="<TableauBlanc>\n\t";
        xml+="<estGraphique>\n\t"+Boolean.toString(estGraphique)+"\n\t</estGraphique>\n\t";
        return xml+"</TableauBlanc>";
    }
}
