/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_aubry;

/**
 *
 * @author bapti
 */
public class Convertisseur {
    
    int nbConversions;
    
    @Override
    public String toString () {
    return "nb de conversions : "+ nbConversions;
    }
    
    
    // Constructeur
    public Convertisseur(){
        nbConversions = 0;
    }
    public double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        nbConversions++;
        return tKelvin;
    }
    public double KelvinVersCelcius (double tKelvin) {
        double tCelcius = tKelvin - 273.15;
        nbConversions++;
        return tCelcius;
    }
    public double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit = tCelcius * 1.8 + 32;
        nbConversions++;
        return tFarenheit;
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius = (tFarenheit - 32) /1.8;
        nbConversions++;
        return tCelcius;
    }
    public double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit = ( tKelvin - 273.15) * 1.8 + 32;
        nbConversions++;
        return tFarenheit;
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin = ( tFarenheit - 32) * 5 / 9;
        nbConversions++;
        return tKelvin;
    }
    
}
