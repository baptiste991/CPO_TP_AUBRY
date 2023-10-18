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
public class Personnage implements etreVivant{
    private String nom;
    private int HP = 100;
    private ArrayList <Arme> tabArmes = new ArrayList <Arme>();
    private Arme Arme_en_Main = null;
    private static int nbPersos = 0;
    private static int nbGuerriers = 0;
    private static int nbMages = 0;
    private boolean attri;

    public void setAttri(boolean attri) {
        this.attri = attri;
    }
    
    public void seFatiguer(){
        HP -= 10;
    }
    
    public boolean estVivant(){
        return HP > 0;
    }
    
    public void estAttaqué(int points){
        HP -= points;
    }
    
    public void nbPersos(){
        nbPersos+=1;
    }

    public void nbGuerriers(){
        nbGuerriers +=1;
    }
    
    public void nbMages(){
        nbMages =+1;
    }

    public int getNbPersos() {
        return nbPersos;
    }

    public int getNbGuerriers() {
        return nbGuerriers;
    }

    public int getNbMages() {
        return nbMages;
    }

    public int getHP() {
        return HP;
    }
    
    //constructeur
    public Personnage(String nom, int HP) {
        this.nom = nom;
        this.HP = HP;
    }
    
    @Override
    public String toString() {
        if (Arme_en_Main==null)return "Personnage{" + "nom=" + nom + '}';
        else{
        return "Personnage{" + "nom=" + nom + ", Arme_en_Main=" + Arme_en_Main + '}';
        }
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
    public int nbArmePredilection(){
        int nbArme = 0;
        //parcours le tableau et incrémente si l'arme correspond au perso
        for (Arme arme : tabArmes){
            
            if (((this instanceof Magicien )&& (arme instanceof Baton))|| ((this instanceof Guerrier) && (arme instanceof Epée))){
            nbArme++;
            }
        }
        return nbArme;
    }
    
    public void suppr(){
        nbPersos --;
        if (this instanceof Magicien)nbMages--;
        else nbGuerriers--;        
    }
    
    public void attaquer(Personnage personnage){
        double pv;
        //enleve 20 ou 30 hp a celui quie est attaqué selon si on est un mage ou un guerrier
        if (this instanceof Magicien) pv=20;
        else pv = 30;
        
        if (Arme_en_Main instanceof Baton && this instanceof Magicien){
        pv *= Arme_en_Main.getAttribut();
        }
        else if (this.Arme_en_Main instanceof Epée && this instanceof Guerrier){
        pv *= Arme_en_Main.getAttribut();
        }
        if (attri == true) pv *= 0.5;
        
        personnage.HP -= pv;
        
        this.seFatiguer();
        
    }
}