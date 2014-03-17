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
	
	/**
	 * methode permettant de comparer la couleur deux pions
	 * @param pionAComparer
	 * @return true si le pion a la meme couleur
	 */
	public boolean equals(Pion pionAComparer)
	{
		if (pionAComparer == null) return false ;
		if (pionAComparer == this) return true ;
		
		if (pionAComparer.couleur == this.couleur)
			return true ;
		return false;
		
	}
}
