/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feutre2016;

import ecrire.Feutre;

/**
 *
 * @author sylvain
 */
public class Feutre2016 {

    static Feutre monFeutre, mon2eFeutre;

    public static void main(String[] args) {
        monFeutre = new Feutre();
        monFeutre.ecrire("Bonjour le monde");
        monFeutre.deboucher();
        for (int i = 0; i < 10; i++) {
            monFeutre.ecrire("Bonjour le monde");
        }
        mon2eFeutre= new Feutre();
        mon2eFeutre.deboucher();
        mon2eFeutre.ecrire("Hello, je suis le deuxieme feutre !!!!");
    }

}
