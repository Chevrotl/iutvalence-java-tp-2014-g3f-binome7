package fr.iutvalence.java.tp.mastermind;
/**
 * Creation d'un objet pion
 * @author chevrotl
 *
 */
public class Pion
{
	// TODO l'attribut ne doit pas être visible
	/**
	 * couleur du pion
	 */
	public Couleur couleur ;
	
	/**
	 * Creer un pion d'une couleur aléatoire
	 */
	public Pion ()
	{
		this.couleur = Couleur.obtenirCouleurAleatoire(); 
	}
	
	/**
	 * Creer un pion d'une couleur donnée
	 * @param couleur couleur du pion
	 */
	public Pion (Couleur couleur)
	{
		this.couleur = couleur; 
	}
}
