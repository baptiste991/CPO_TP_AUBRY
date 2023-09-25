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
                
             int n = generateurAleat.nextInt(100);
        System.out.println("Saississez un entier entre 0 et 100");
        int nUser = sc.nextInt();
        
        while (nUser != n){
            if (nUser < n)
                System.out.println("Trop petit");
            else if (nUser > n){
                System.out.println("Trop grand");
            System.out.println("Saississez un autre nombre :");
            nUser = sc.nextInt();
            int cpt += 1; 
            
            }
        }
    }

}
