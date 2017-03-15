package fr.epsi.poe.hardis;

/**
 * Plage : classe pour tester la branche feature
 * @version : 1.0
 * @author : Marie PÉTROD
 */

public class Plage {
    //Nom de la plage
    private String nom;

    //Nombre de parasols
    private int nbParasol;

    //Température de l'eau
    private int temp;

    //Nombre de grains de sable
    private long grains;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    //********************CONSTRUCTEURS********************//
    public Plage(String pNom, int pNbParasol, int pTemp) {
        nom = pNom;
        nbParasol = pNbParasol;
        temp = pTemp;
    }
}
