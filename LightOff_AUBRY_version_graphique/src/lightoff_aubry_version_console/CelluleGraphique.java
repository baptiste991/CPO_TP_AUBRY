/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_aubry_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author bapti
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleAssociee;

    public CelluleGraphique(CelluleLumineuse uneCellule) {
        this.celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setContentAreaFilled(false);
        setBorderPainted(false);

        //on attribut l'image 
        if (celluleAssociee.getEtat()) {
            G.setColor(Color.yellow); //on attribut la couleur du bouton
        } else {
            G.setColor(Color.red);
        }
        G.fillOval(0, 0, 50, 50);
        //G.draw3DRect(0, 0, 20, 20, true);
    }

}
