/*
 * TP1 Exercice 3
 * Sept 2023
 * AUBRY Baptiste
 */
package tp1_guessmynumber_aubry;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int diff = 0;
        int intervalle =0;
        int vie = 30;
        boolean cauchemar = false;

        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1 Facile");
        System.out.println("2 Moyen");
        System.out.println("3 Difficile");

        System.out.println("4 cauchemar");
        diff = sc.nextInt();
        do{
        switch (diff) {
            case 1:
                intervalle = 10;
                vie = 5;
                break;
            case 2:
                intervalle = 50;
                vie = 10;
                break;
            case 3:
                intervalle = 100;
                vie = 20;
                break;
            case 4:
                intervalle = 100;
                vie = 20;
                cauchemar = true;
                break;
            default:
                System.out.println("Saississez le niveau de difficulté entre 1, 2, 3 et 4");
                diff = sc.nextInt();
        }} while (diff <0 || diff >4);

        int n = generateurAleat.nextInt(intervalle);
        System.out.println("Saississez un entier entre 0 et " + intervalle + ", vous avez " + vie + " essais");
        int nUser = sc.nextInt();
        int cpt = 0;

        while (nUser != n && vie > 0 && cauchemar == false) {

            vie -= 1;
            System.out.println("il vous reste " + vie + " essais");

            if (nUser < n) {
                System.out.println("Trop petit");
            } else if (nUser > n) {
                System.out.println("Trop grand");
            }
            // bonne indication
            System.out.println("Saississez un autre nombre :");
            nUser = sc.nextInt();
            cpt++;

        }
        while (nUser != n && vie > 0 && cauchemar == true) {
            int random = generateurAleat.nextInt(9);
            
            vie -= 1;
            System.out.println("il vous reste " + vie + " essais");

            if (random < 3) {
                
            //  dans le cas (30% des cas) ou les indications sont mauvaises
                if (nUser < n) {
                    System.out.println("Trop grand (cette instruction est peut etre fausse...)");
                } else if (nUser > n) {
                    System.out.println("Trop petit (cette instruction est peut etre fausse...)");
                }

            } else {
                // indications bonnes
                if (nUser < n) {
                    System.out.println("Trop petit (cette instruction est peut etre fausse...)");
                } else if (nUser > n) {
                    System.out.println("Trop grand (cette instruction est peut etre fausse...)");
                }
            }
            System.out.println("Saississez un autre nombre :");
            nUser = sc.nextInt();
            cpt++;
        }

        if (vie == 0) {
            System.out.println("Vous avez perdu, vous avez épuisé votre nombre de vies");
        } else {
            System.out.println("Vous avez trouvé le nombre " + n + " en " + cpt + " essais" + " en ayant encore " + vie + " essais !");
        }

    }
}
