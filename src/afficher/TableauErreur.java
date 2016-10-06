/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afficher;

import pseudoSystem.PseudoSystem;



/**
 *
 * @author sylvain
 */
public class TableauErreur {
    
    private AffichageErr maConsole;
    private String contenu;
    private boolean estGraphique ;

    public TableauErreur(String titre) {
        estGraphique= PseudoSystem.estGraphique;
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
    
    @Override
    public String toString(){
        String xml="<TableauErreur>\n\t";
        xml+="<estGraphique>\n\t"+Boolean.toString(estGraphique)+"\n\t</estGraphique>\n\t";
        return xml+"</TableauErreur>";
    }
}
