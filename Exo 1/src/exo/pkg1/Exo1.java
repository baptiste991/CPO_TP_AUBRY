/*
 * TP0 Exercice 1
 * Sept 2023
 * AUBRY Baptiste 
 */

package exo.pkg1;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Exo1 {
    public static void main(String[] args) {
        String prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Welcome "+prenom+" !");
    }
}
