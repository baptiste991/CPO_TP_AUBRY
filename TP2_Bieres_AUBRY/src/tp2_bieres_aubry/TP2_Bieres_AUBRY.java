/*
 * TP2 Exercice 1 bieres
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp2_bieres_aubry;

/**
 *
 * @author bapti
 */
public class TP2_Bieres_AUBRY {



    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        BouteilleBiere autreBiere = new BouteilleBiere("Heineken", 12.4,"Abbaye de Heinken") ;
        
        uneBiere.lireEtiquette();        
        secondeBiere.lireEtiquette();
        autreBiere.lireEtiquette();
        
        uneBiere.decapsuler();
        System.out.println(uneBiere.ouverte);
        
        System.out.println(uneBiere) ;
        System.out.println(secondeBiere) ;
        System.out.println(autreBiere) ;

    }
    
}
