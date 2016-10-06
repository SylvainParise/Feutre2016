/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feutre2016;

import ecrire.Feutre;
import pseudoSystem.PseudoSystem;

/**
 *
 * @author sylvain
 */
public class Feutre2016_2 {

    static Feutre monFeutre;

    public static void ecrireBeaucoup(Feutre monF) {
        int i;
        for (i = 0; i < 100; i++) {
            monF.ecrire("J'écris beaucoup !");
        }
    }

    public static void main(String[] args) {
        PseudoSystem.unsetGraphique();

        monFeutre = new Feutre(1000, "noir");
        ecrireBeaucoup(monFeutre);
        monFeutre.deboucher();
        ecrireBeaucoup(monFeutre);

    }

}
