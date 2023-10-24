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

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        matriceCellules = this.genererNouvelleMatriceCellulesLumineuses();
    }

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

    public void eteindreToutesLesCellules() {
        // parcours et eteint chaque cellule du tableau
        for (int i = 0; i < nbColonnes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneOuCelluleOuDiagonaleAleatoire() {
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
            case 1:
                // activer colonnes
                int colonne = generateurAleat.nextInt(this.nbColonnes);
                for (int i = 0; i < this.nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
            case 2:
                //activer diagonale 
                int diag = generateurAleat.nextInt(1);
                if (diag == 0) {
                    // diagonale déscendante
                    for (int i = 0; i < this.nbColonnes; i++) {
                        matriceCellules[i][i].activerCellule();
                    }
                } else {
                    // diagonale montante
                    for (int i = this.nbColonnes; i > 0; i--) {
                        matriceCellules[i][this.nbColonnes - 1 - i].activerCellule();
                    }
                }
        }
    }

    public CelluleLumineuse[][] genererMatriceAleatoire(int nbTours) {
        // génération d'une matrice
        CelluleLumineuse[][] matrice = this.genererNouvelleMatriceCellulesLumineuses();
        // on la mélange autant de fois que demandé dans nbTours
        for (int i = 0; i < nbTours; i++) {
            this.activerLigneOuCelluleOuDiagonaleAleatoire();
        }
        return matrice;
    }

    public void activerLigneDeCellules(int idLigne) {
        // parcours la ligne en question et active chaque élément
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[idLigne][i].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        // parcours la colonne en question et active chaque élément
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        // activer diagonale déscendante
        for (int i = 0; i < this.nbColonnes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        // activer diagonale montante
        for (int i = this.nbColonnes; i > 0; i--) {
            matriceCellules[i][this.nbColonnes - 1 - i].activerCellule();
        }
    }

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

    @Override
    public String toString() {
        // premier espace
        String resultat = "   |";

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
            // numéro de ligne 
            resultat += " " + i + " |";
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

        return resultat;
    }

}
