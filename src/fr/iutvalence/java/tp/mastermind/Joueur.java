package fr.iutvalence.java.tp.mastermind;


/**
 * Classe mere des joueurs IA et Humain
 * @author chevrotl
 *
 */
public interface Joueur
{
	/**
	 * Obtenir la combinaison proposée par le joueur
	 * @return la combinaison proposée par le joueur
	 */
	public Combinaison obtenirCombinaison();
}
