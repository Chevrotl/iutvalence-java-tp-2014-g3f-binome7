package fr.iutvalence.java.tp.mastermind;

/**
 * Represente une partie de Mastermind
 * 
 * @author chevrotl
 * 
 */
public class Mastermind
{

	/**
	 * Nombres de pions par defaut de la combinaison a decouvrir
	 */
	public final static int NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT = 4;

	/**
	 * Nombres de pions à découvrir
	 */
	private int nombreDePionsADecouvrir;

	/**
	 * Combinaison aléatoire de pion de couleur
	 */
	// TODO respecter les conventions de nommage
	private Combinaison combinaisonAleatoire;
	
	/**
	 * Variable locale joueur
	 */
	private Joueur joueur;

	/**
	 * L'affichage
	 */
	private Affichage affichage;

	/**
	 * Constructeur par defaut, avec les valeurs par defaut
	 * @param joueurLanceur joueur creer dans le lanceur
	 */

	// Faire donner une valeur a l'entrée pour le nombreDePionsADecouvrir
	public Mastermind(Joueur joueurLanceur, Affichage affichage)
	{
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		this.joueur = joueurLanceur;
		this.affichage = affichage;

	}

	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire,
	 * création grille ...
	 * @param nomJoueur Nom entree lors de la creation du joueur
	 * @param nombreDeTourMaximum Nombre de tour maximum avant de finir la partie
	 */
	public void jouer(String nomJoueur, int nombreDeTourMaximum)
	{

		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		
		// Affichage
		for (int numeroDuTour = 1; numeroDuTour <= nombreDeTourMaximum; numeroDuTour++)
		{
			this.affichage.afficherDebutDeTout(numeroDuTour);

			this.affichage.afficherDemandeDeCombinaison();
			
			Combinaison combinaisonProposee = this.joueur.obtenirCombinaison();
			
			if (combinaisonProposee == null)
					continue;

			ResultatComparaison resultatComparaison = this.combinaisonAleatoire.comparerAvec(combinaisonProposee);
			this.affichage.afficherResultatcomparaison(resultatComparaison);

			if (resultatComparaison.obtenirNombreDePionsBienPlaces() == this.nombreDePionsADecouvrir)
			{
				this.affichage.afficherVictoire(numeroDuTour);
				break;
			}
		}
		this.affichage.afficherDefaite(this.combinaisonAleatoire);
	}



}
