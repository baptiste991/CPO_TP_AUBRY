/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_aubry_version_console;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Partie {

    GrilleDeJeu grille;
    int nbCoups;
    int nbCoupsMax;

    /**
     * constructeur : génère une grille vide et initialise les coups de
     * l'utilisateur à 0
     *
     * @param dim dimension de la matrice/grille
     */
    public Partie(int dim) {
        this.grille = new GrilleDeJeu(dim, dim);
        this.grille.genererNouvelleMatriceCellulesLumineuses();
        nbCoups = 0;
    }

    /**
     * initialise la partie : mélange la grille
     *
     * @param diff difficulté choisi
     */
    public void initialiserPartie(int diff) {
        int n = 5;
        // mélange la grille
        switch (diff) {
            case 5 -> {
                n = 20;
                nbCoupsMax = 20;
                break;
            }
            case 6 -> {
                n = 100;
                nbCoupsMax = 10;
                break;
            }
            case 7 -> {
                n = 300;
                nbCoupsMax = 8;
                break;
            }
        }
        grille.genererMatriceAleatoire(n);
    }

    /**
     * demande et récupère le niveau de difficulté choisi par l'utilisateur
     *
     * @return int le niveau de difficulté
     */
    /**
     * lance la partie, contient la boucle jeu
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        // affichage du message de bienvenu
        bienvenu();

        // affiche l'état initial de la grille
        System.out.println(grille.toString());

        while (!grille.cellulesToutesEteintes()) {
            // boucle jeu
            System.out.println("Choississez une ligne, une colonne ou une diagonale :");
            char coup = sc.next().charAt(0);
            // demande le coup + fais la saisie clavier

            if (Character.isDigit(coup)) {
                // activation dans le cas de la colonne
                grille.activerColonneDeCellules(Character.getNumericValue(coup));
            } else if (coup == 'Y') {
                grille.activerDiagonaleDescendante();
            } else if (coup == 'Z') {
                grille.activerDiagonaleMontante();
            } else {
                grille.activerLigneDeCellules(coup);
            }

            System.out.println(grille.toString());
            nbCoups += 1;
        }
        // affichage du message de fin de jeu
        terminerPartie();

    }

    void terminerPartie() {
        System.out.println("Félicitation vous avez gagner en " + nbCoups + "coups !");
    }

    void bienvenu() {
        System.out.println("Beinvenu dans LightOff !");
    }

}
