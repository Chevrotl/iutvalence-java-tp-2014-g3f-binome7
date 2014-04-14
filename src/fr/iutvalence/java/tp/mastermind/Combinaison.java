package fr.iutvalence.java.tp.mastermind;

/**
 * Combinaison de pions, suivant plusieurs parametres
 * 
 * @author chevrotl
 * 
 */
public class Combinaison
{

	/**
	 * declaration du tableau de pions pour ne pas que ce soit une variable
	 * locale
	 */
	private Pion[] pions;

	/**
	 * Renvoi une representation numerique des couleur sous la forme d'une
	 * chaine
	 */
	public String toString()
	{
		String result = "";

		for (int i = 0; i < this.pions.length; i++)
		{
			result += this.pions[i].obtenirCouleur() + " ";
		}

		return result;

	}

	/**
	 * Creation d'une combinaison aléatoire, de taille donnée
	 * 
	 * @param taille
	 *            taille de la combinaison a découvrir
	 */
	public Combinaison(int taille)
	{
		this.pions = new Pion[taille];

		for (int numeroDuPion = 0; numeroDuPion < taille; numeroDuPion++)
			this.pions[numeroDuPion] = new Pion();

	}

	/**
	 * Creation d'une combinaison de taille et de couleurs données
	 * @param pions tableau de pion pour la combinaison
	 */
	public Combinaison(Pion[] pions)
	{
		this.pions = pions;
	}
	
	/**
	 * Creation d'une combinaison en fonction d'un mot compose de code couleurs
	 * @param combinaisonADecouper String de code couleurs
	 * @return une combinaison en fonction du string rentree
	 */
	public static Combinaison parseCombinaison(String combinaisonADecouper)
	{
		Pion[] pions = new Pion[combinaisonADecouper.length()];
		
		for(int numeroDuPion = 0; numeroDuPion < combinaisonADecouper.length() ; numeroDuPion++)
		{
			Couleur couleur = Couleur.parseCouleur(combinaisonADecouper.charAt(numeroDuPion));
			if (couleur == null) return null;
			pions[numeroDuPion] = new Pion(couleur);
		}
			
		return new Combinaison(pions);
	}
	
	
	


	/**
	 * Compare la combinaison actuelle de pion avec une autre, renvoi un objet ResultatComparaison
	 * @param autreCombinaison combinaison avec laquelle la combinaison actuelle sera comparee
	 * @return ResultatComparaison avec les variables nombreDePionsBienPlaces et nombreDePionsBienPlaces
	 */
	public ResultatComparaison comparerAvec(Combinaison autreCombinaison)
	{

		int nombreDePionsBienPlaces = 0;
		int nombreDePionsMalPlaces = 0;
		boolean[] pionANegligerDansLaCombinaison = new boolean[this.pions.length];
		boolean[] pionANegligerDansLAutreCombinaison = new boolean[this.pions.length];

		for (int numeroDuPion = 0; numeroDuPion < this.pions.length; numeroDuPion++)
		{
				pionANegligerDansLaCombinaison[numeroDuPion] = false;
				pionANegligerDansLAutreCombinaison[numeroDuPion] = false;
		}

		for (int numeroDuPion = 0; numeroDuPion < this.pions.length; numeroDuPion++)
		{
			if ((this.pions[numeroDuPion].equals(autreCombinaison.pions[numeroDuPion])))
			{
				nombreDePionsBienPlaces++;
				pionANegligerDansLaCombinaison[numeroDuPion] = true;
				pionANegligerDansLAutreCombinaison[numeroDuPion] = true;
			}
		}
		
		for (int numeroDuPionDansLaCombinaison = 0; numeroDuPionDansLaCombinaison < this.pions.length; numeroDuPionDansLaCombinaison++)
		{
			if (pionANegligerDansLaCombinaison[numeroDuPionDansLaCombinaison]) continue;
			
			for (int numeroDuPionDansLAutreCombinaison = 0; numeroDuPionDansLAutreCombinaison < this.pions.length; numeroDuPionDansLAutreCombinaison++)
			{
				if (pionANegligerDansLAutreCombinaison[numeroDuPionDansLAutreCombinaison])
					continue;

				if (this.pions[numeroDuPionDansLaCombinaison].equals(autreCombinaison.pions[numeroDuPionDansLAutreCombinaison]))
				{
					nombreDePionsMalPlaces++;
					pionANegligerDansLaCombinaison[numeroDuPionDansLaCombinaison] = true;
					pionANegligerDansLAutreCombinaison[numeroDuPionDansLAutreCombinaison] = true;
					break;
				}

			}

		}
		return new ResultatComparaison(nombreDePionsBienPlaces, nombreDePionsMalPlaces);

	}

}
