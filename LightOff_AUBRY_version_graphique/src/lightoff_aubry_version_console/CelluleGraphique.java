/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_aubry_version_console;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author bapti
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));

    public CelluleGraphique(CelluleLumineuse uneCellule) {
        this.celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide); //on attribut l'image celluleVide.png
        if (celluleAssociee.getEtat()) {
            setIcon(img_jetonJaune); //on attribut l'image jetonJaune.png
        }
        else{
            setIcon(img_jetonRouge);
        }
    }

}
