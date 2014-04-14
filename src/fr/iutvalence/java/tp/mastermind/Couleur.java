package fr.iutvalence.java.tp.mastermind;

import java.util.Random;

/**
 * Definition des 8 couleurs utilisable pour trouver la combinaison
 * 
 * @author chevrotl
 * 
 */
public enum Couleur
{

	/**
	 * Definition d'une palette limitée de couleur, gérée par des entiers
	 */

	BLANC('b'),
	/**
	 * Definition couleur rouge
	 */
	ROUGE('r'),

	/**
	 * Definition couleur jaune
	 */
	JAUNE('j'),

	/**
	 * Definition couleur vert
	 */
	VERT('v'),

	/**
	 * Definition couleur bleu
	 */
	BLEU('B'),

	/**
	 * Definition couleur violet
	 */
	VIOLET('V'),

	/**
	 * Definition couleur rose
	 */
	ROSE('R'),

	/**
	 * Definition couleur orange
	 */
	ORANGE('o');

	/**
	 * variable utilise pour le code couleur
	 */
	private final char colorChar;

	/**
	 * Constructeur interne pour affecter a la variable de la classe la valeur de celle recu en parametre
	 * @param colorChar character representant une couleur (cf enum)
	 */
	private Couleur(char colorChar)
	{
		this.colorChar = colorChar;
	}
	
	/**
	 * renvoi le code couleur actuel
	 * @return colorChar
	 */
	public char obtenirColorChar()
	{
		return this.colorChar;
	}

	/**
	 * Renvoi une couleur aléatoire définie dans la classe
	 * 
	 * @return une couleur aléatoire
	 */

	public static Couleur obtenirCouleurAleatoire()
	{
		Random random = new Random(); //couleur.values renvoi le tableau des enum

		int colorNumber = random.nextInt(Couleur.values().length);
		return Couleur.values()[colorNumber]; 
		// Une enum est un tableau, on tire une case au hasard, sortant une Couleur au hasard
	}

	/**
	 * renvoi la liste des couleur en String
	 * 
	 * @return Liste des couleurs
	 */
	public static String listeCouleur()
	{
		String result = "";
		for (Couleur couleur : Couleur.values())
			result = result + couleur.name()+" : "+couleur.colorChar+" ";
		return result;
	}

	/**
	 * Renvoi une couleur en fonction de son code couleur, 
	 * renvoi null si le code n 'est pas dans la liste
	 * @param codeCouleur character representant une couleur
	 * @return Couleur une couleur
	 */
	public static Couleur parseCouleur(char codeCouleur)
	{
		for (Couleur couleur : Couleur.values())
			if (couleur.colorChar == codeCouleur)
				return couleur;
		return null;
	}
}
