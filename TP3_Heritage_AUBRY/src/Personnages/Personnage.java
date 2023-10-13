/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class Personnage {
    private String nom;
    private int HP;
    private ArrayList <Arme> tabArmes = new ArrayList <Arme>();
    private Arme Arme_en_Main = null;

    //constructeur
    public Personnage(String nom, int HP) {
        this.nom = nom;
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", Arme_en_Main=" + Arme_en_Main + '}';
    }
    
    //getter
    public String getNom() {
        return nom;
    }
    
    public void ajouterArme (Arme arme){
        //test que le nombre d'arme n'est pas déjà au nb max (5)
        if (tabArmes.size() < 6){
            tabArmes.add(arme);
        }
    }
    
    public void equiperArme (String nomArme){
        boolean equipee = false;
        // parcours chaque élément du tableau et test s'il contient bien l'arme demandé
        for (Arme arme : tabArmes){
            // si l'arme est dans le tableau on l'equipe 
            if (arme.getNom().equals(nomArme)){
                Arme_en_Main = arme;
                equipee = true;
                System.out.println(nomArme + " equipee");
            }
        }
        if (equipee == false) System.out.println(nomArme + "non possedee");
        
    }
    public int nbArmePredilection(Personnage personnage){
        int nbArme = 0;
        //parcours le tableau et incrémente si l'arme correspond au perso
        for (Arme arme : tabArmes){
            
            if (((this instanceof Magicien )&& (arme instanceof Baton))|| ((this instanceof Guerrier) && (arme instanceof Epée))){
            nbArme++;
            }
        }
        return nbArme;
    }
    
}
