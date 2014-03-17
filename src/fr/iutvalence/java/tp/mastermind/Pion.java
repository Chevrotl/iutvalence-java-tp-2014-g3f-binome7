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
	private Couleur couleur ;
	
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
	
	/**
	 * accesseur en lecture de l'attribut de la couleur du pion
	 * @return la couleur du pion 
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur ;
	}
}
