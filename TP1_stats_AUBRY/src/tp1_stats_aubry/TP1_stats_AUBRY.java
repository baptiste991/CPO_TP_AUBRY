/*
 * TP1 Exercice 4
 * Sept 2023
 * AUBRY Baptiste
 */
package tp1_stats_aubry;
import java.util.Random;
import java.util.Scanner;



public class TP1_stats_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] tab = new double[6];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int nbLances = 0;
        
        System.out.println("Saisissez un nombre de lancés ");
        nbLances = sc.nextInt();
        
        for (int i=1; i <= nbLances; i++){
            
            tab[i] += 1;
            
        }
        
        
        
        
        
    }
    
}
