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
public class ConsoleErr implements AffichageErr {

    @Override
    public void setAffichage(String texte) {
        System.err.println(texte);
    }
    
}
