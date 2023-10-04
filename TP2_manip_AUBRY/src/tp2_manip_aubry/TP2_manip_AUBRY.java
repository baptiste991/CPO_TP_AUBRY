/*
 * TP2 Exercice 3 manip
 * Octobre 2023
 * AUBRY Baptiste
 */
package tp2_manip_aubry;

/**
 *
 * @author bapti
 */
public class TP2_manip_AUBRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        Moussaka[] tab = new Moussaka[10];
        
        System.out.println("nb de calories de Assiette 1 : " +
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        Tartiflette temp = new Tartiflette(0);
        
        temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        for (int i = 0; i < 10; i++){
            tab[i] = new Moussaka(200);
        }
    }
    
}
