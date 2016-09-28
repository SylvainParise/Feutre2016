package ecrire;

/**
 * ************************************************************************
 * Source File	: Encre.java Author : Lycee Bertran de Born Project name : Non
 * enregistr�* Created : 14/09/2016 Modified : 14/09/2016 Description	:
 * Definition of the class Encre
 * ************************************************************************
 */
public class Encre {
    //Attributes

    private int nvEncre;
    private java.lang.String libCouleur;

    //Attributes Association
    //Operations
    //constructeurs
    public Encre() {
        this(100, "noir");
    }

    public Encre(String lib) {
        this(100, lib);
    }

    public Encre(int nb, String lib) {
        libCouleur = lib;
        if (nb < 0) {
            nvEncre = 100;
        } else {
            nvEncre = nb;
        }
    }

    public java.lang.String getCouleur() {
        return libCouleur;
    }

    public int getNvEncre() {
        return nvEncre;
    }

    public void decEncre() {
        if (0 < nvEncre) {
            nvEncre--;
        }
    }

    public boolean estVide() {
        /*if (nvEncre<=0) return true;
        else return false;*/
        return (nvEncre<=0);
    }

} //End Class Encre

