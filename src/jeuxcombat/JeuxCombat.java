/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxcombat;

import java.util.Random;
import java.util.Scanner;
import jeuxcombat.personnage.Personnage;
import static jeuxcombat.personnage.Personnage.attaque;



/**
 *
 * @author assane
 */
public class JeuxCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         char reponse = 'O';
         do{
             boolean finDuJeu = true;
            Scanner sc = new Scanner(System.in);
            int compteurJoueur = 1;
            int attaque = 0;
            int perteVie =1;
            Personnage joueur1 = new Personnage("Assane","Dione");
            Personnage joueur2 = new Personnage("Moussa","Top");

            // generation de nombre aleatoire
            Random random = new Random();
            compteurJoueur  = random.nextInt(2);
        // la boucle du jeu
        do {
            
            
            //specification du joueur qui attaquera en premier
            if(compteurJoueur == 1 ) {

                System.out.println(joueur1.getPrenom() + " Joueur 1 vie (" + joueur1.getVie() + " Vitalité) veuillez taper 1 pour attaquer");
               // la valeur de l'attaque
                attaque = sc.nextInt();

                if(testAttaque(attaque)) {

                    attaque(joueur1, joueur2, attaque,perteVie);
                    compteurJoueur = 2;

                } else {
                    compteurJoueur = 1;
                }

            } else {

                System.out.println(joueur2.getPrenom() + " Joueur 2 vie (" + joueur2.getVie() + " Vitalité) veuillez taper 1 pour attaquer");
                attaque = sc.nextInt();

                if(testAttaque(attaque)) {
                    // on appelle la fonction attaque
                    attaque(joueur2, joueur1, attaque,perteVie);
                    compteurJoueur = 1;

                } else {
                    compteurJoueur = 2;
                }
            }
            // on verifie la vie d'un des joueur est inferieur à 0
            if(joueur1.getVie() <= 0 || joueur2.getVie() <= 0) {
                finDuJeu = false;
            }

        } while(finDuJeu);
        // Fin du jeu
        if(joueur1.getVie() <= 0) {
            System.out.println("Game Over !!!!!!");
        } else {
            System.out.println("Game Over !!!!!!");
        }
        
         //On demande si la personne veut rejouer
            System.out.println("Voulez-vous rejouer ? (oui/non)");
            reponse = sc.next().charAt(0);
       }
        //while(rejouer ==1);
        while (reponse == 'O');
    }
    /**
     * permet de tester si le joueur entre les bonnes valeurs pour attaquer (1 ou 2)
     * @param attaque
     * @return 
     */
    public static boolean testAttaque(int attaque) {
        if(attaque == 1) {
            return true;
        } else {
            System.out.println("L'action ne peux être que 1 !");
            return false;
        }
    }

   
    
    
    
}
