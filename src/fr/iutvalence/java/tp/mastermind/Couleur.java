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

	BLANC,
	/**
	 * Definition couleur rouge
	 */
	ROUGE,

	/**
	 * Definition couleur jaune
	 */
	JAUNE,

	/**
	 * Definition couleur vert
	 */
	VERT,

	/**
	 * Definition couleur bleu
	 */
	BLEU,

	/**
	 * Definition couleur violet
	 */
	VIOLET,

	/**
	 * Definition couleur rose
	 */
	ROSE,

	/**
	 * Definition couleur orange
	 */
	ORANGE;

	/**
	 * Renvoi une couleur aléatoire définie dans la classe
	 * 
	 * @return une couleur aléatoire
	 */

	public static Couleur obtenirCouleurAleatoire()
	{
		Random random = new Random();

		switch (random.nextInt(8))
		{
		case 0:
			return BLANC;
		case 1:
			return ROUGE;
		case 2:
			return JAUNE;
		case 3:
			return VERT;
		case 4:
			return BLEU;
		case 5:
			return VIOLET;
		case 6:
			return ROSE;
		case 7:
		default:
			return ORANGE;
		}

	}
}
