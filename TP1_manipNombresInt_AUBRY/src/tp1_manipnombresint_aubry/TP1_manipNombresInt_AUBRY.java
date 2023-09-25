/*
 * TP1 Exercice 1
 * Sept 2023
 * AUBRY Baptiste
 */
package tp1_manipnombresint_aubry;
import java.util.Scanner;

public class TP1_manipNombresInt_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1; int num2;
        System.out.println("Veuillez saisir deux nombres entiers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("somme = " + (num1+num2));
        System.out.println("Difference = " + (num1-num2));
        System.out.println("Produit = " + (num1*num2));
        System.out.println("Quotient entier = " + (num1/num2));
        System.out.println("Division oeuclidienne = " + (num1%num2));
    }
    
}
