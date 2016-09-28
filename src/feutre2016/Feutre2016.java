/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feutre2016;

import afficher.TableauBlanc;
import ecrire.Feutre;

/**
 *
 * @author sylvain
 */
public class Feutre2016 {

    static Feutre monFeutre, mon2eFeutre;
    private static TableauBlanc monTableau;

    public static void main(String[] args) {
        // création du tableau blanc
        monTableau = new TableauBlanc("Tableau Blanc");
        
        monFeutre = new Feutre(monTableau);
        monFeutre.ecrire("Bonjour le monde");
        monFeutre.deboucher();
        for (int i = 0; i < 10; i++) {
            monFeutre.ecrire("Bonjour le monde");
        }
        mon2eFeutre= new Feutre(monTableau);
        mon2eFeutre.deboucher();
        mon2eFeutre.ecrire("Hello, je suis le deuxieme feutre !!!!");
    }

}
