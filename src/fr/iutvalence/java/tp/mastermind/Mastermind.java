package fr.iutvalence.java.tp.mastermind;
/**
 * Represente une partie de Mastermind
 * @author chevrotl
 *
 */
public class Mastermind
{
	//Constantes
	public final static int DEFAUT_NB_PIONS_SECRET = 5;
	
	// attributs
	private int nbPionsSecret ;
	
	//constructeurs
	public Mastermind()
	{
		this.nbPionsSecret = DEFAUT_NB_PIONS_SECRET ;
	}
	
	/**
	 * Lance l'integralitee d'une partie
	 */
	public void jouer()
	{
		System.out.println("Lancement d'une partie");
		
	}
}
