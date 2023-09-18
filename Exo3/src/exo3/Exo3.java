/*
 * TP0 Exercice 3
 * Sept 2023
 * AUBRY Baptiste
 */
package exo3;
import java.util.Scanner;
/**
 *
 * @author bapti
 */
public class Exo3 {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Newligne=System.getProperty("line.separator");
        Scanner sc = new Scanner(System.in);
        double res = 0;
        
        System.out.println("1) add"+ Newligne +"2) substract"+Newligne+ "3) multiply"+Newligne+"4) devide"+Newligne+"5) modulo");
        int operateur = sc.nextInt();
        
        System.out.println("Veuillez saisir la première valeur");
        double operande1 = sc.nextDouble();
        
        System.out.println("Veuillez saisir la saconde valeur");
        double operande2 = sc.nextDouble();
        
        switch (operateur){
            case 1:
            res = operande1 + operande2;
            System.out.println(res);
            break;
            
            case 2:
            res =  operande1 - operande2;
            System.out.println(res);

            break;

            case 3:
            res = operande1 * operande2;
            System.out.println(res);

            break;

            case 4:
            res = operande1 / operande2;
            System.out.println(res);
            break;
            
            case 5:
            res = operande1 % operande2;
            System.out.println(res);
            break;
            
            default :
            System.out.println("Choix incorrect");
        }
    }
    
}
