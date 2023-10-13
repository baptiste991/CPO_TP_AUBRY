/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
public class Magicien extends Personnage{
    private boolean confirme;

    public Magicien(String nom, int HP, String confirme) {
        super(nom, HP);
        this.confirme = "confirme".equals(confirme);
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
}
