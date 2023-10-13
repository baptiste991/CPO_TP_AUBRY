/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_aubry;

/**
 *
 * @author bapti
 */
public class Arme {
    private String nom;
    private int niveauAttaque;

    //constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
//getter nom
    public String getNom() {
        return nom;
    }
//setter nom
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
