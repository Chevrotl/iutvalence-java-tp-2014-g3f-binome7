package fr.iutvalence.java.tp.mastermind;

/**
 * classe renvoyant des combinaison aleatoirement
 * @author chevrotl
 *
 */
public class JoueurIA extends Joueur
{
	/**
	 * taille de la combinaison aleatoire de l'IA
	 */
	private final int tailleCombinaison;
	
	/**
	 * constructeur d'un joueur IA
	 * @param tailleCombinaison	taille de la combinaison de l'IA
	 */
	public JoueurIA(int tailleCombinaison)
	{
		this.tailleCombinaison = tailleCombinaison;
	}
	
	/**
	 * Renvoi une combinaison Aleatoire d'une taille donnee aleatoire
	 * @param tailleCombinaison 	taille de la combinaison de l'IA
	 * @return un nouvel objet combinaison 
	 */
	public Combinaison obtenirCombinaison()
	{
		return new Combinaison(this.tailleCombinaison);
	}
	
	
	
}
