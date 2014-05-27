package fr.iutvalence.java.tp.mastermind;

import javax.swing.SwingUtilities;

import fr.iutvalence.java.tp.mastermind.IHM.PanelValidation;
import fr.iutvalence.java.tp.mastermind.IHM.TacheAffichageMastermind;

/**
 * Represente le lanceur du jeu
 * @author chevrotl
 *
 */
public class LanceurDeMastermind
{
	/**
	 * nombre de tour de jeu par defaut
	 */
	public static final int NOMBRE_DE_TOUR_PAR_DEFAUT = 15;

	/**
	 * Methode main, creant une nouvelle partie 
	 * @param args Parametre de main
	 */
	public static void main(String[] args)
	{

		
		SwingUtilities.invokeLater(new TacheAffichageMastermind());
		System.out.println("Creation d'une partie de Mastermind");


		Joueur joueur = new JoueurHumain("Cedric") ;
		
		
		
		//Joueur joueur = new JoueurIA() ;

//		Mastermind PartieDeMastermind = new Mastermind(joueur, null);
		
		System.out.println("Demarage de la partie");		

		Mastermind PartieDeMastermind = new Mastermind(joueur, new TacheAffichageMastermind());
		PartieDeMastermind.jouer("nomJoueur",NOMBRE_DE_TOUR_PAR_DEFAUT);	
		System.out.println("Fin de la partie");
	}



}
