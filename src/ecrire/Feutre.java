package ecrire;

import afficher.TableauBlanc;
import afficher.TableauErreur;
import java.util.Objects;

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
    private Encre reservoir;
    private static TableauBlanc monTableau = null;
    private static TableauErreur maConsole = null;

    // constructeurs
    public Feutre() {
        this(100,"noir");
    }

    public Feutre(int capacite, String coul) {
        reservoir = new Encre(capacite, coul);
        estBouche = true;
        if (null == monTableau) {
            monTableau = new TableauBlanc("Tableau Blanc");
        }
        if (null == maConsole) {
            maConsole = new TableauErreur("Console");
        }
    }

    /*public Feutre(TableauBlanc monT) {
     reservoir = new Encre();
     estBouche = true;
     monTableau = monT;
     }

     public Feutre(int capacite, String coul,TableauBlanc monT) {
     reservoir = new Encre(capacite, coul);
     estBouche = true;
     monTableau = monT;                
     }
     */
    //Operations
    /**
     * renvoie l'état du bouchon du feutre
     */
    public boolean estBouche() {
        return estBouche;
    }

    public void boucher() {
        estBouche = true;
        printErr("!!!! Le feutre est bouché");
    }

    public void deboucher() {
        estBouche = false;
        printErr("!!!! Le feutre est débouché");
    }
    /*
     on teste si le feutre est débouché, ensuite on verifie caractère par 
     caractère si on a atteint la fin de la chaine, ou si il n'y a plus d'encre.
     */

    public void ecrire(String texte) {
        if (this.estBouche()) {// le feutre n'est pas débouché : message d'erreur
            printErr("#### Le feutre est bouché !!!");
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
                printErr("#### Le réservoir est vide !!!");
            }
            printErr("!!!! Il reste " + reservoir.getNvEncre() + " caractères dans mon réservoir");
        }
    }

    private void print(char texte) {
        //System.out.print(texte);
        monTableau.afficher(Character.toString(texte));
    }

    private void printErr(String texte) {
        //System.err.print(texte);
        maConsole.afficher(texte);
    }
    
    public TableauBlanc getMonTableau() {
        return monTableau;
    }
    
    @Override
    public String toString(){
        String xml="<feutre>\n\t";
        xml+="<estBouche>\n\t"+Boolean.toString(estBouche)+"\n\t</estBouche>\n\t";
        xml+="<reservoir>\n\t"+reservoir.toString()+"</reservoir>\n\t";
        xml+="<monTableau>\n\t"+monTableau.toString()+"</monTableau>\n\t";
        xml+="<maConsole>\n\t"+maConsole.toString()+"</maConsole>\n";
        return xml+"</feutre>";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.estBouche ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.reservoir);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Feutre other = (Feutre) obj;
        if (this.estBouche != other.estBouche) {
            return false;
        }
        if (!Objects.equals(this.reservoir, other.reservoir)) {
            return false;
        }
        return true;
    }
    

} //End Class Feutre

