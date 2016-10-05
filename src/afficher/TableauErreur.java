/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afficher;



/**
 *
 * @author sylvain
 */
public class TableauErreur {
    
    private AffichageErr maConsole;
    private String contenu;
    private boolean estGraphique = true;

    public TableauErreur(String titre) {
         if (estGraphique) {
            
            maConsole = new FrmAffichageTextCouleur(20, 20, 1500, 0, titre);
        } else {
            maConsole = new ConsoleErr();
        }
        contenu = null;
    }
    
       public void afficher(String texte) {
        maConsole.setAffichage(texte+'\n');
        contenu += texte;
    }
    
    
}
