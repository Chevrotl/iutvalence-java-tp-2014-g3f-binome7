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
	 * Constructeur par defaut, avec les valeurs par defaut
	 * @param joueurLanceur joueur creer dans le lanceur
	 */

	// Faire donner une valeur a l'entrée pour le nombreDePionsADecouvrir
	public Mastermind(Joueur joueurLanceur)
	{
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		this.joueur = joueurLanceur;

	}

	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire,
	 * création grille ...
	 * @param nomJoueur Nom entree lors de la creation du joueur
	 * @param nombreDeTourMaximum Nombre de tour maximum avant de finir la partie
	 */
	public void jouer(String nomJoueur, int nombreDeTourMaximum)
	{

		// Mettre ce qu'il ya dans joueur IA dans joueur, dont le tirage
		// automatique
		// Enlever la classe Joueur IA

		// generation combinaison aléatoire a decouvrir
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		

		// Affichage
		for (int numeroDuTour = 1; numeroDuTour <= nombreDeTourMaximum; numeroDuTour++)
		{
			System.out.println("Tour " + numeroDuTour);

			Combinaison combinaisonProposee = this.joueur.obtenirCombinaison();
			
			if (combinaisonProposee == null)
					continue;
			
			System.out.println("Combinaison proposee : " + combinaisonProposee);

			ResultatComparaison resultatComparaison = this.combinaisonAleatoire.comparerAvec(combinaisonProposee);
			System.out.println(resultatComparaison);

			if (resultatComparaison.obtenirNombreDePionsBienPlaces() == this.nombreDePionsADecouvrir)
			{
				System.out.println("Gagné en " + numeroDuTour + " tours !");
				break;
			}
		}
		System.out.println("Combinaison a decouvrir" + "\n" + this.combinaisonAleatoire);
	}



}
