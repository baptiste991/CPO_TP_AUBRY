/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_aubry;

/**
 *
 * @author bapti
 */
public class Personne {
    String Nom;
    String Prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
    public Personne (String nom, String prenom){
        Nom = nom;
        Prenom = prenom;
        liste_voitures = new Voiture[3];
        
    }
    
    @Override
    public String toString(){
        return "La personne s'appelle "+Nom +" "+ Prenom;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    
        if (voiture_a_ajouter.proprietaire != null){
            if (nbVoitures != 3){
                switch (nbVoitures){
                    case 0 : 
                        liste_voitures[0] = voiture_a_ajouter;
                        voiture_a_ajouter.proprietaire = this;
                        nbVoitures++;
                        break;
                    case 1 :
                        liste_voitures[1] = voiture_a_ajouter;
                        nbVoitures++;
                        voiture_a_ajouter.proprietaire = this;
                        break;
                    case 2 : 
                        liste_voitures[2] = voiture_a_ajouter;
                        nbVoitures++;
                        voiture_a_ajouter.proprietaire = this;
                        break;
                }
                return true;
            }
            else{
                return false;
            }
            
        }
        else{
            return false;
        }
            
        
    }
}
