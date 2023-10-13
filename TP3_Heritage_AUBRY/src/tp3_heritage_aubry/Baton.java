/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_aubry;

/**
 *
 * @author bapti
 */
public class Baton extends Arme{
    int age;

    public Baton(String nom, int age, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (age <0 ) age = 0;
        else if (age >= 100) age = 100;
        this.age = age;
    }
    
}
