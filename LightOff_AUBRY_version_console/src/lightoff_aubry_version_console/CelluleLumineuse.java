package lightoff_aubry_version_console;

/**
 *
 * @author bapti
 */
public class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse() {
        etat = false;
    }
    
    public void activerCellule(){
        // inversion de l'état de la cellule
        this.etat = !this.etat;
    }
    
    public void eteindreCellule(){
        // eteint la cellule, si allumé ne fait rien
        this.etat = false;
    }
    
    public boolean estEteint(){
        // renvoie true si la cellule est eteinte et false si elle est allumée
        return !this.etat;
    }

    public boolean getEtat() {
        // renvoie l'etat de la cellule
        return etat;
    }

    @Override
    public String toString() {
        if (this.etat) return "X";
        else return "O";
    }
    
    
}
        