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
	private Pion[] pions ;
	
	
	/**
	 * Renvoi une representation numerique des couleur sous la forme d'une chaine
	 */
	public String toString()
	{
		String result ="";
		
		for (int i = 0; i < this.pions.length ; i++ )
		{
			result += this.pions[i].obtenirCouleur()+" ";
		}
		
		return result;
		
	}
	
		
	/**
	 * Creation d'une combinaison aléatoire, de taille donnée
	 * @param taille taille de la combinaison a découvrir
	 */
	public Combinaison(int taille)
	{
		this.pions = new Pion[taille];
		
		for(int numeroDuPion = 0; numeroDuPion < taille ; numeroDuPion++)
			this.pions[numeroDuPion] = new Pion ();

	}
	
	

	
	public ResultatComparaison comparerAvec(Combinaison autreCombinaison)
	{

		int nombreDePionsBienPlaces = 0;
		int nombreDePionsMalPlaces = 0; 
		boolean [] pionCompare = new boolean[this.pions.length];  



		for (int numeroDuPion = 0 ; numeroDuPion < this.pions.length ; numeroDuPion++ )
		{

			if ((this.pions[numeroDuPion].equals(autreCombinaison.pions[numeroDuPion])))
			{
				nombreDePionsBienPlaces++; 
				pionCompare[numeroDuPion] = true ;				
			}
			else
			{

				for (int numeroDuPionAutreCombinaison = 0 ; numeroDuPionAutreCombinaison < this.pions.length ; numeroDuPionAutreCombinaison++)
				{
					if (pionCompare[numeroDuPionAutreCombinaison]) 
						continue;

					if (this.pions[numeroDuPion].equals(autreCombinaison.pions[numeroDuPionAutreCombinaison]))
					{
						nombreDePionsMalPlaces++;
						pionCompare[numeroDuPionAutreCombinaison]=true;
						break;
					}

				}

			}

		}

		
		return new ResultatComparaison(nombreDePionsBienPlaces, nombreDePionsMalPlaces);


	}

	
}
