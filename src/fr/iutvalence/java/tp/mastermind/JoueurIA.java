package fr.iutvalence.java.tp.mastermind;

/**
 * classe renvoyant des combinaison aleatoirement
 * @author chevrotl
 *
 */
public class JoueurIA
{
	
	/**
	 * Renvoi une combinaison Aleatoire d'une taille donnee aleatoire
	 * @param tailleCombinaison
	 * @return un nouvel objet combinaison 
	 */
	public Combinaison obtenirCombinaison(int tailleCombinaison)
	{
		return(new Combinaison(tailleCombinaison));
	}
	
	
	
}
