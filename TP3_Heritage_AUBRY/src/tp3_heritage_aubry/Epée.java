/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_aubry;

/**
 *
 * @author bapti
 */
public class Epée extends Arme {
    double finesse;

    public Epée(String nom, int finesse, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (finesse <0 ) finesse = 0;
        else if (finesse >= 100) finesse = 100;
        this.finesse = finesse;
    }

    
}
