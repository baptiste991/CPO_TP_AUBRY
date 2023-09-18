/*
 * TP0 Exercice 2
 * Sept 2023
 * AUBRY Baptiste
 */

package exo2;
import java.util.Scanner;
/**
 *
 * @author bapti
 */
public class Exo2 {

    public static void main(String[] args) {
        //Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
Scanner sc = new Scanner(System.in);
int ind; //indice
//nb=5;
result=0;
// Addition des nb premiers entiers
ind=1;
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
while (ind <= nb) {
result=result+ind;
ind+=1;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
}
