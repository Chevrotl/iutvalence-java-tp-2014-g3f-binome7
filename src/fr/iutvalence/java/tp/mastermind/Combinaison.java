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
	 * declaration du tableau de pions pour ne pas que ce soit une variable locale
	 */
	private Pion[] combinaisonADecouvrir ;
	
	
	/**
	 * Renvoi une representation numerique des couleur sous la forme d'une chaine
	 */
	public String toString()
	{
		String result ="";
		
		for (int i = 0; i < this.combinaisonADecouvrir.length ; i++ )
		{
			result += this.combinaisonADecouvrir[i].couleur;
		}
		
		return result;
		
	}
	
		
	/**
	 * Creation d'un tableau de pion avec une taille donnée 
	 * @param tailleCombinaisonAleatoire taille de la combinaison a découvir
	 */
	public Combinaison(int tailleCombinaisonAleatoire)
	{
		this.combinaisonADecouvrir = new Pion[tailleCombinaisonAleatoire];
		
		for(int i = 0; i < tailleCombinaisonAleatoire ; i++)
		{
			
			int couleurAleatoire = new Random().nextInt(8); couleurAleatoire++; 
			//Creation d'un nombre aleatoire compris entre 1 et 8 pour la couleur du pion
			this.combinaisonADecouvrir[i] = new Pion (couleurAleatoire) ;
			
		}
		
	}
	
}
