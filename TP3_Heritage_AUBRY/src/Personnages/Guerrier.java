/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
public class Guerrier extends Personnage{
    private boolean cheval;

    public Guerrier(String nom, int HP, String cheval) {
        super(nom, HP);
        this.cheval = "cheval".equals(cheval);
        this.nbPersos();
        this.nbGuerriers();
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
}
