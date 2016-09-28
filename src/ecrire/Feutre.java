package ecrire;

import afficher.TableauBlanc;

/**
 * ************************************************************************
 * Source File	: Feutre.java Author : Lycee Bertran de Born Project name : Non
 * enregistr�* Created : 14/09/2016 Modified : 14/09/2016 Description	:
 * Definition of the class Feutre
 * ************************************************************************
 */
public class Feutre {

    private boolean estBouche;
    //Attributes Association
    Encre reservoir;
    TableauBlanc monTableau;

    // constructeurs
    public Feutre() {
        reservoir = new Encre();
        estBouche = true;
        monTableau = new TableauBlanc("Tableau Blanc");
    }

    public Feutre(int capacite, String coul) {
        reservoir = new Encre(capacite, coul);
        estBouche = true;
        monTableau = new TableauBlanc("Tableau Blanc");                
    }

    //Operations
    /**
     * renvoie l'état du bouchon du feutre
     */
    public boolean estBouche() {
        return estBouche;
    }

    public void boucher() {
        estBouche = true;
        System.err.println("!!!! Le feutre est bouché");
    }

    public void deboucher() {
        estBouche = false;
        System.err.println("!!!! Le feutre est débouché");
    }
    /*
     on teste si le feutre est débouché, ensuite on verifie caractère par 
     caractère si on a atteint la fin de la chaine, ou si il n'y a plus d'encre.
     */

    public void ecrire(String texte) {
        if (this.estBouche()) {// le feutre n'est pas débouché : message d'erreur
            System.err.println("#### Le feutre est bouché !!!");
        } else {
            int i = 0;
            boolean fin = reservoir.estVide() || i >= texte.length();
            while (!fin) {
                print(texte.charAt(i++));
                reservoir.decEncre();
                fin = reservoir.estVide() || i >= texte.length();
            }
            print('\n');
            if (reservoir.estVide()) {
                System.err.println("#### Le réservoir est vide !!!");
            }
            System.err.println("!!!! Il reste "+reservoir.getNvEncre()+" caractères dans mon réservoir");
        }
    }
    
    private void print(char texte){
        //System.out.print(texte);
        monTableau.afficher(Character.toString(texte));
    }

} //End Class Feutre

