/*
 * TP2 Exercice 2 Convertisseur objet
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp2_convertisseurobjet_aubry;
import java.util.Scanner;
/**
 *
 * @author bapti
 */
public class TP2_convertisseurObjet_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur convertisseur = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur a convertir :");
        double reel = sc.nextDouble();
        
        int ch = 0;
        
       do{
           
            System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
            System.out.println("1) De Celcius vers Kelvin");
            System.out.println("2) De Kelvin vers Celcius");
            System.out.println("3) De Celcius vers Farenheit");
            System.out.println("4) De Farenheit vers Celcius");
            System.out.println("5) De Kelvin vers Farenheit");
            System.out.println("6) De Farenheit vers Kelvin");

           ch = sc.nextInt();
           
       switch(ch){
           case 1:
               double tKel = convertisseur.CelciusVersKelvin(reel);
               System.out.println(reel +" degrés Celcius correspond à "+ tKel+ " degrés Kelvin");
               break;
           case 2:
               double tCel = convertisseur.KelvinVersCelcius(reel);
               System.out.println(reel +" degrés Kelvin correspond à "+ tCel+ " degrés Celcius");
               break;
           case 3: 
               double tFar = convertisseur.CelciusVersFarenheit(reel);
               System.out.println(reel +" degrés Celcius correspond à "+ tFar+ " degrés Farenheit");
               break;
           case 4:
               double tCelc = convertisseur.FarenheitVersCelcius(reel);
               System.out.println(reel +" degrés Farenheit correspond à "+ tCelc+ " degrés Celcius");
               break;
           case 5:
               double tFare = convertisseur.KelvinVersFarenheit(reel);
               System.out.println(reel +" degrés Kelvin correspond à "+ tFare+ " degrés Farenheit");
               break;
           case 6:
               double tKelv = convertisseur.FarenheitVersKelvin(reel);
               System.out.println(reel +" degrés Farenheit correspond à "+ tKelv+ " degrés Kelvin");
               break;
          
       }}
       while(ch < 1 || ch > 6);
       
       
       System.out.println(convertisseur);
    }
}
