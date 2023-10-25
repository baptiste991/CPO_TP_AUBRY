/* Mini projet AUBRY Baptiste
* VERSION CONSOLE
* OCTOBRE 2023
 */
package lightoff_aubry_version_console;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class LightOff_AUBRY_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = demanderDifficulté();

        Partie partie = new Partie(n);

        partie.initialiserPartie(n);

        partie.lancerPartie();
    }

    /**
     * demande et récupère le niveau de difficulté choisi par l'utilisateur
     *
     * @return int le niveau de difficulté
     */
    static int demanderDifficulté() {
        int diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir une difficulté :\n 1 Facile \n 2 Moyen \n 3 Difficile");
        diff = sc.nextInt();
        int n = 5;
        // mélange la grille
        switch (diff) {
            case 1 ->
                n = 5;
            case 2 ->
                n = 6;
            case 3 ->
                n = 7;

        }
        return n;
    }
}
