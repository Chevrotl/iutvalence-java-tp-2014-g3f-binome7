package fr.iutvalence.java.tp.mastermind;
/**
 * Represente une partie de Mastermind
 * @author chevrotl
 *
 */
public class Mastermind
{
	//Constantes
	// TODO renommer (plus lisible)
	// TODO écrire le commentaire
	public final static int DEFAUT_NB_PIONS_SECRET = 5;
	
	// attributs
	// TODO renommer (plus lisible)
	// TODO écrire le commentaire
	private int nbPionsSecret ;
	
	//constructeurs
	// TODO écrire le commentaire
	public Mastermind()
	{
		this.nbPionsSecret = DEFAUT_NB_PIONS_SECRET ;
	}
	
	// TODO écrire un commentaire plus précis
	/**
	 * Lance l'integralite d'une partie
	 */
	public void jouer()
	{
		System.out.println("Lancement d'une partie");
		
	}
}
