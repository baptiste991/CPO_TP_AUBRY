/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_aubry;

/**
 *
 * @author bapti
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String modele, String marque, int puissance){
    Modele = modele;
    Marque = marque;
    PuissanceCV = puissance;
    proprietaire = null;
    }
    
    @Override
    public String toString(){
        return "Modele : "+Modele+"\n"+"Marque : " + Marque +"\n"+"Puissance (CV) : " +PuissanceCV;
    }
}

