/*
 * TP3 Partie 1
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp3_heritage_aubry;

import Personnages.*;
import Armes.*;
import java.util.ArrayList;


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
        Baton baton1 = new Baton("Chene", 4, 5 );
        Baton baton2 = new Baton("Charme", 5, 6 );
        
        // Création d'un tableau dynamique
        ArrayList <Arme> tabArmes = new ArrayList <Arme>();
        
        // ajout des éléments dans le tableau dynamique
        tabArmes.add(epee1);
        tabArmes.add(epee2);
        tabArmes.add(baton1);
        tabArmes.add(baton2);
        
        // affichage des caractéristique de chaque éléments du tableau dynamique
        // par une boucle for
        for (int i = 0; i < tabArmes.size(); i++){
            
            System.out.println(tabArmes.get(i));
        }
        
        // création de deux Guerriers et deux Magiciens 
        Magicien mage1 = new Magicien("Gandalf",65,"confirme");
        Magicien mage2 = new Magicien("Garcimore",44,"novice");
        Guerrier guerrier1 = new Guerrier("Conan", 78,"a pied");
        Guerrier guerrier2 = new Guerrier("Lannister", 45, "cheval");
        
        //création d'un tableau dynamique de personnages
        ArrayList <Personnage> tabPersos = new ArrayList <Personnage>();
        
        // ajout des éléments dans le tableau dynamique
        tabPersos.add(mage1);
        tabPersos.add(mage2);
        tabPersos.add(guerrier1);
        tabPersos.add(guerrier2);
        
        // affichage des caractéristique de chaque éléments du tableau dynamique
        // par une boucle for
        for (int i = 0; i < tabPersos.size(); i++){
            
            System.out.println(tabPersos.get(i));
        }
    }
    
}
