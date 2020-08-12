/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxcombat.personnage;



/**
 *
 * @author assane
 */
public  class Personnage {
    private String prenom;
    private String nom;
    private int vie;

    public Personnage(String prenom, String nom) {
        this.vie = 5;
        this.prenom = prenom;
        this.nom = nom;
    }
    
    
    /**
     * permet de calculer et de renseinger  l'impact de l'attaque
     * @param joueur1
     * @param joueur2
     * @param attaque 
     * @param perteVie 
     */
    public static void attaque(Personnage joueur1, Personnage joueur2 , int attaque, int perteVie) {        
        if (attaque == 1) {
            System.out.println(joueur1.getPrenom() + " " + joueur1.getNom() + " vient de vous frapper " );
           joueur2.setVie(joueur2.getVie() - perteVie);
            System.out.println(joueur2.getPrenom() + " " + joueur2.getNom() + " perd 1 points de vie");
            joueurMort(joueur2);

        }
    }
    
    /**
     * permet de verifier si un joueur est mort
     * @param joueur 
     */
     public static void joueurMort(Personnage joueur) {

        if(joueur.getVie() <= 0) {
            System.out.println(joueur.getPrenom()+" "+joueur.getNom() + " est mort");
        }
    }
    
    public int getVie(){
    return vie;
    }
    
    public String getPrenom(){
    return prenom;
    }
    public String getNom(){
    return nom;
    }
     public void setprenom(String prenom) {
        this.prenom = prenom;
    }
      public void setnom(String nom) {
        this.nom = nom;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
