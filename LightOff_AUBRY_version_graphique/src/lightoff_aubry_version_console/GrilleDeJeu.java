/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_aubry_version_console;

import java.util.Random;

/**
 *
 * @author bapti
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * constructeur
     *
     * @param nbLignes nombre de lignes de la matrice à créer
     * @param nbColonnes nombre de colonnes de la matrice à créer
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        matriceCellules = this.genererNouvelleMatriceCellulesLumineuses();
    }

    /**
     * génère une matrice avec chaque cellule éteinte
     *
     * @return une matrice de cellulles lumineuses vierge
     */
    public CelluleLumineuse[][] genererNouvelleMatriceCellulesLumineuses() {
        // parcours toutes les lignes et colonnes en ajoutant une cellule 
        // lumineuse dans chaque éléments du tableau
        for (int i = 0; i < nbColonnes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
        return matriceCellules;
    }

    /**
     * change l'état de toutes les cellules en éteint (false)
     */
    public void eteindreToutesLesCellules() {
        // parcours et eteint chaque cellule du tableau
        for (int i = 0; i < nbColonnes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * change l'état aléatoirement d'une ligne, colonne ou diagonale
     */
    void activerLigneOuCelluleOuDiagonaleAleatoire() {
        Random generateurAleat = new Random();
        // on génere un nb aléatoire afin de choisir aléatoirement un cas
        int cas = generateurAleat.nextInt(2);
        switch (cas) {
            case 0:
                // activer lignes
                int ligne = generateurAleat.nextInt(this.nbLignes);
                for (int i = 0; i < this.nbColonnes; i++) {
                    matriceCellules[ligne][i].activerCellule();
                }
                break;
            case 1:
                // activer colonnes
                int colonne = generateurAleat.nextInt(this.nbColonnes);
                for (int i = 0; i < this.nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
                break;
            case 2:
                //activer diagonale 
                int diag = generateurAleat.nextInt(1);
                if (diag == 0) {
                    // diagonale déscendante
                    this.activerDiagonaleDescendante();
                } else {
                    // diagonale montante
                    activerDiagonaleMontante();
                }
                break;
        }
    }

    /**
     * Mélange la matrice nbTours fois
     *
     * @param nbTours nombre de fois que la matrice sera mélangée
     */
    public void genererMatriceAleatoire(int nbTours) {
        Random generateurAleat = new Random();
        // on la mélange autant de fois que demandé dans nbTours
        for (int i = 0; i < nbTours; i++) {
            this.activerLigneOuCelluleOuDiagonaleAleatoire();
            if ( i%3 == 0){
                int diag = generateurAleat.nextInt(1);
                if (diag == 0) {
                    // diagonale déscendante
                    this.activerDiagonaleDescendante();
                    }
                } else {
                    // diagonale montante
                    this.activerDiagonaleMontante();
                }
            }
            
        }
    

    /**
     * change l'état de la ligne de cellule en question
     *
     * @param idLigne identificateur de ligne à activer
     */
    public void activerLigneDeCellules(char idLigne) {
        // parcours la ligne en question et active chaque élément
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[idLigne - 65][i].activerCellule();
        }
    }

    /**
     * change l'état de la colonne de cellule en question
     *
     * @param idColonne numéro colonne à activer
     */
    public void activerColonneDeCellules(int idColonne) {
        // parcours la colonne en question et active chaque élément
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * change l'état de la diagnale descendante de cellule en question
     */
    public void activerDiagonaleDescendante() {
        // activer diagonale déscendante
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * change l'état de la diagnale montante de cellule en question
     */
    public void activerDiagonaleMontante() {
        // activer diagonale montante
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }

    /**
     * vérifie si les cellules sont toutes éteintes
     *
     * @return boolean vrai si toutes éteintes faux si non
     */
    public boolean cellulesToutesEteintes() {
        boolean ok = true;
        // parcours toute la matrice
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                if (this.matriceCellules[i][j].estEteint() == false) {
                    ok = false;
                    break;
                }
            }
        }
        return ok;
    }

    /**
     * affiche grille de jeu
     *
     * @return la grile de jeu sous un format facile à comprendre
     */
    @Override
    public String toString() {
        // premier espace
        String resultat = " Y |";

        //premiereLigne
        for (int i = 0; i < this.nbColonnes; i++) {
            resultat += " " + i + " |";
        }
        // retour chariot
        resultat += "\n";
        // l'entre deux lignes
        for (int i = 0; i < this.nbColonnes + 1; i++) {
            resultat += "----";
        }
        // retour chariot
        resultat += "\n";

        for (int i = 0; i < this.nbLignes; i++) {
            // lettre de ligne 
            resultat += " " + Character.toString(i + 'A') + " |";
            for (int j = 0; j < this.nbColonnes; j++) {
                // contenue chaque case de la matrice
                resultat += " " + matriceCellules[i][j].toString() + " |";
            }
            resultat += "\n";
            // l'entre deux lignes
            for (int k = 0; k < this.nbColonnes + 1; k++) {
                resultat += "----";
            }
            resultat += "\n";
        }
        resultat += " Z |";

        return resultat;
    }

}
