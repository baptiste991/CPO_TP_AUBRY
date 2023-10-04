/*
 * TP2 Exercice 4 relation
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp2_relation_1_aubry;

/**
 *
 * @author bapti
 */
public class TP2_relation_1_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " +
        bob.liste_voitures[0] ) ;

    }
    
}
