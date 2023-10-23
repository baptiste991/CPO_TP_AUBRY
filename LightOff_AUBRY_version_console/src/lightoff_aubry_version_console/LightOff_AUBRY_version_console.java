/* Mini projet AUBRY Baptiste
* VERSION CONSOLE
* OCTOBRE 2023
 */
package lightoff_aubry_version_console;

/**
 *
 * @author bapti
 */
public class LightOff_AUBRY_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrilleDeJeu grille = new GrilleDeJeu(3, 3);
        System.out.println(grille.matriceCellules);
    }
    
}
