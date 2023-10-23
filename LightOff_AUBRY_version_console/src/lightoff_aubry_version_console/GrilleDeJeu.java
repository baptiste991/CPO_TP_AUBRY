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
    
    public CelluleLumineuse[][] genererNouvelleMatriceCellulesLumineuses(){
        // parcours toutes les lignes et colonnes en ajoutant une cellule 
        // lumineuse dans chaque éléments du tableau
        for (int i = 0; i < nbColonnes; i++){
            for (int j = 0; j < nbLignes; j++){
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
        return matriceCellules;
    }
    
    public void eteindreToutesLesCellules(){
        // parcours et eteint chaque cellule du tableau
        for (int i = 0; i < nbColonnes; i++){
            for (int j = 0; j < nbLignes; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    public void activerLigneOuCelluleOuDiagonaleAleatoire(){
        Random generateurAleat = new Random();
        // on génere un nb aléatoire afin de choisir aléatoirement un cas
        int cas = generateurAleat.nextInt(2);
            switch (cas){
                case 0:
                    // activer lignes
                    int ligne = generateurAleat.nextInt(this.nbLignes);
                    for (int i = 0; i < this.nbColonnes; i++){
                        matriceCellules[ligne][i].activerCellule();
                    }
                case 1:
                    // activer colonnes
                    int colonne = generateurAleat.nextInt(this.nbColonnes);
                    for (int i = 0; i < this.nbLignes; i++){
                        matriceCellules[i][colonne].activerCellule();
                    }
                case 2:
                    //activer diagonale 
                    int diag = generateurAleat.nextInt(1);
                    if (diag == 0){
                        // diagonale déscendante
                        for (int i = 0; i < this.nbColonnes; i++){
                        matriceCellules[i][i].activerCellule();
                        }
                    }
                    else{
                        // diagonale montante
                        for (int i = nbColonnes; i > 0; i--){
                        matriceCellules[i][i].activerCellule();
                        /// FINIR POUR LA DIAGONALE PAS BON DU TOUT CA
                        }
                    }
            }
    }
}
