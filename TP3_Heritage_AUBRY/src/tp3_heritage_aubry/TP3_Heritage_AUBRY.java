/*
 * TP3 Partie 1
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp3_heritage_aubry;

import Personnages.*;
import Armes.*;


/**
 *
 * @author bapti
 */
public class TP3_Heritage_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // création de 2 épées et de 2 batons "tests"
        Epée epee1 = new Epée("Excalibur", 7, 5);
        Epée epee2 = new Epée("Durandal", 4, 7);
        Epée epee3 = new Epée("Enma", 2, 20);
        Baton baton1 = new Baton("Chene", 4, 5 );
        Baton baton2 = new Baton("Charme", 5, 6 );
        Baton baton3 = new Baton("Baguette", 8, 10 );
        
        
        // création de deux Guerriers et deux Magiciens 
        Magicien mage1 = new Magicien("Gandalf",65,"confirme");
        Magicien mage2 = new Magicien("Garcimore",44,"novice");
        Guerrier guerrier1 = new Guerrier("Conan", 78,"a pied");
        Guerrier guerrier2 = new Guerrier("Lannister", 45, "cheval");
        
        //ajout d'un baton et de deux épées au guerrier1, et on equipe la premiere épée
        guerrier1.ajouterArme(baton1);
        guerrier1.ajouterArme(epee1);
        guerrier1.ajouterArme(epee2);
        guerrier1.equiperArme("Excalibur");
        
        //Idem pour le mage1
        mage1.ajouterArme(baton2);
        mage1.ajouterArme(baton3);
        mage1.ajouterArme(epee3);
        mage1.equiperArme("Charme");
        
        System.out.println("ARMES DE PREDILECTIONS : " +mage1.nbArmePredilection());
        
       System.out.println(guerrier1);
       System.out.println(mage1);
       
       System.out.println(mage1.getNbPersos());
       
       mage1.attaquer(guerrier1);
       guerrier1.attaquer(mage1);
       
       
       System.out.println("PV Mage1 : "+mage1.getHP());
       System.out.println("PV Guerrier1 : "+guerrier1.getHP());
       
    }
    
    
    
    public void finalize(Personnage personnage){
        
        personnage.suppr();
        personnage = null;
        System.gc();
        
    }
    
    
    
}
