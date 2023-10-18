/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author bapti
 */
public class Arme {
    private String nom;
    private int niveauAttaque;
    private double attribut;

    public void setAttribut(double attribut) {
        this.attribut = attribut;
    }

    public double getAttribut() {
        return attribut;
    }
    
    public double recupPoint(){
        return this.niveauAttaque;
    }
    

    //constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + '}';
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
