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
public class Console implements AffichageTxt {

    @Override
    public void setAffichage(char texte) {
        System.out.print(texte);
    }

    @Override
    public void setAffichage(String texte) {
        System.out.print(texte);
    }
    
}
