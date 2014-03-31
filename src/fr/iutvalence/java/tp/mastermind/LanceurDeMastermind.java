package fr.iutvalence.java.tp.mastermind;
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
	private static final int NOMBRE_DE_TOUR_PAR_DEFAUT = 10;

	/**
	 * Methode main, creant une nouvelle partie 
	 * @param args Parametre de main
	 */
	public static void main(String[] args)
	{
		System.out.println("Creation d'une partie de Mastermind");
		Mastermind PartieDeMastermind = new Mastermind();
		System.out.println("Demarage de la partie");
		PartieDeMastermind.jouerIAVersusIA(NOMBRE_DE_TOUR_PAR_DEFAUT);
		System.out.println("Fin de la partie");
		
		
	}

}
