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
            
            int face = random.nextInt(5);
            tab[face] += 1;
        
        }
        // reste à mettre sous forme de stats + afficher
        for (int j=0; j < 6; j++){
            tab[j]=tab[j]/ nbLances;
        }
        
        for (int k=0; k < 6; k++){
            System.out.println((k+1)+ " : "+tab[k]*100+"%");
        }
        
    }
    
}
