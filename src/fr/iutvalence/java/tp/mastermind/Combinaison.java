package fr.iutvalence.java.tp.mastermind;
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
			result += this.combinaisonADecouvrir[i].couleur+" ";
		}
		
		return result;
		
	}
	
		
	/**
	 * Creation d'une combinaison aléatoire, de taille donnée
	 * @param taille taille de la combinaison a découvrir
	 */
	public Combinaison(int taille)
	{
		this.combinaisonADecouvrir = new Pion[taille];
		
		for(int numeroDuPion = 0; numeroDuPion < taille ; numeroDuPion++)
			this.combinaisonADecouvrir[numeroDuPion] = new Pion ();

	}
	
}
