package fr.iutvalence.java.tp.mastermind;
/**
 * Represente le lanceur du jeu
 * @author chevrotl
 *
 */
public class LanceurDeMastermind
{

	/**
	 * Methode main, creant une nouvelle partie 
	 * @param args Parametre de main
	 */
	public static void main(String[] args)
	{
		System.out.println("Creation d'une partie de Mastermind");
		Mastermind PartieDeMastermind = new Mastermind();
		System.out.println("Demarage de la partie");		
		PartieDeMastermind.jouer();
		System.out.println("Fin de la partie");
	}

}
