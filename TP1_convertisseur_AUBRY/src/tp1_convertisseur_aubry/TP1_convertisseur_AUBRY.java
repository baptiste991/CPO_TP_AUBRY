/*
 * TP1 Exercice 2
 * Sept 2023
 * AUBRY Baptiste
 */
package tp1_convertisseur_aubry;
import java.util.Scanner;
public class TP1_convertisseur_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur :");
        double reel = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit");
        System.out.println("4) De Farenheit vers Celcius");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        
       int ch = sc.nextInt();
       
       switch(ch){
           case 1:
               double tKel = CelciusVersKelvin(reel);
               System.out.println(reel +" degrés Celcius correspond à "+ tKel+ " degrés Kelvin");
               break;
           case 2:
               double tCel = KelvinVersCelcius(reel);
               System.out.println(reel +" degrés Kelvin correspond à "+ tCel+ " degrés Celcius");
               break;
           case 3: 
               double tFar = CelciusVersFarenheit(reel);
               System.out.println(reel +" degrés Celcius correspond à "+ tFar+ " degrés Farenheit");
               break;
           case 4:
               double tCelc = FarenheitVersCelcius(reel);
               System.out.println(reel +" degrés Farenheit correspond à "+ tCelc+ " degrés Celcius");
               break;
           case 5:
               double tFare = KelvinVersFarenheit(reel);
               System.out.println(reel +" degrés Kelvin correspond à "+ tFare+ " degrés Farenheit");
               break;
           case 6:
               double tKelv = FarenheitVersKelvin(reel);
               System.out.println(reel +" degrés Farenheit correspond à "+ tKelv+ " degrés Kelvin");
               break;
               
       }
        
               
        
        
        
        
        
       
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit = tCelcius * 1.8 + 32;
        return tFarenheit;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius = (tFarenheit - 32) /1.8;
        return tCelcius;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit = ( tKelvin - 273.15) * 1.8 + 32;
        return tFarenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin = ( tFarenheit - 32) * 5 / 9;
        return tKelvin;
    }
}
