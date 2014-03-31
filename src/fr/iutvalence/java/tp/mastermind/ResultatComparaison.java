package fr.iutvalence.java.tp.mastermind;

/**
 * Resultat de la comparaison, avec le nombre de pions bien, et mal placés.
 * @author chevrotl
 *
 */
public class ResultatComparaison
{
	/**
	 * Nb de pions de la bonne couleur a la bonne place
	 */
	private final int nombreDePionsBienPlaces;
	
	/**
	 * Nb de pions de la bonne couleur mais pas a la bonne place
	 */
	private final int nombreDePionsMalPlaces;
	
	
	/**
	 * Constructeur par defaut
	 * @param nombreDePionsBienPlaces
	 * @param nombreDePionsMalPlaces
	 */
	public ResultatComparaison(int nombreDePionsBienPlaces, int nombreDePionsMalPlaces)
	{
		super();
		this.nombreDePionsBienPlaces = nombreDePionsBienPlaces;
		this.nombreDePionsMalPlaces = nombreDePionsMalPlaces;
	}
	
	

	/**
	 * Accesseur pour renvoyer la variable nombreDePionsBienPlaces
	 * @return nombreDePionsBienPlaces
	 */
	public int obtenirNombreDePionsBienPlaces()
	{
		return this.nombreDePionsBienPlaces;
	}

	
	/**
	 * Accesseur pour renvoyer la variable nombreDePionsBienPlaces
	 * @return nombreDePionsMalPlaces
	 */
	public int obtenirNombreDePionsMalPlaces()
	{
		return this.nombreDePionsMalPlaces;
	}
	

	
	
	@Override
	public String toString()
	{
		return "ResultatComparaison [nombreDePionsBienPlaces=" + this.nombreDePionsBienPlaces + ", nombreDePionsMalPlaces="
				+ this.nombreDePionsMalPlaces + "]";
	}
	
	
	

}
