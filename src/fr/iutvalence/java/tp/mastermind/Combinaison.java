package fr.iutvalence.java.tp.mastermind;
/**
 * Necessaire pour l'utilisation de la classe random.
 */
import java.util.Random;

/**
 * Combinaison de pions, suivant plusieurs parametres
 * @author chevrotl
 *
 */
public class Combinaison
{

	/**
	 * couleur du pion par défaut
	 */
	private int couleurDuPion ;
	/**
	 * Contructeur par defaut créant un tableau de pions aléatoire d'une longeur par défaut
	 */
	
	
	/**
	 * Creation d'un tableau de pion avec une taille donnée 
	 * @param tailleCombinaisonAleatoire
	 */
	public Combinaison(int tailleCombinaisonAleatoire)
	{
		Pion[] combinaisonADecouvrir = new Pion[tailleCombinaisonAleatoire];
		
		for(int i = 0; i <= tailleCombinaisonAleatoire ; i++)
		{
			int couleurAleatoire = new Random().nextInt(8); couleurAleatoire++; 
			//Creation d'un nombre aleatoire compris entre 1 et 8 pour la couleur du pion
			combinaisonADecouvrir[i].couleur = couleurAleatoire ;
			
		}
		
	}
	
}
