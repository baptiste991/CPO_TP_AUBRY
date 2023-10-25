package lightoff_aubry_version_console;

/**
 *
 * @author bapti
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * constructeur : initialise par défaut la cellule lumineuse éteinte
     */
    public CelluleLumineuse() {
        etat = false;
    }
    
    /**
     * change l'état de la cellule
     */
    public void activerCellule(){
        // inversion de l'état de la cellule
        this.etat = !this.etat;
    }
    
    /**
     * éteintnla cellule
     */
    public void eteindreCellule(){
        // eteint la cellule, si allumé ne fait rien
        this.etat = false;
    }
    
    /**
     * test si la cellule est éteinte
     * @return boolean vrai si la cellule est éteinte faux si non
     */
    public boolean estEteint(){
        // renvoie true si la cellule est eteinte et false si elle est allumée
        return !this.etat;
    }

    /**
     * getter de l'attribut état
     * @return valeur etat
     */
    public boolean getEtat() {
        // renvoie l'etat de la cellule
        return etat;
    }

    /**
     * affiche la cellule 
     * @return string 
     */
    @Override
    public String toString() {
        if (this.etat) return "X";
        else return "O";
    }
    
    
}
        