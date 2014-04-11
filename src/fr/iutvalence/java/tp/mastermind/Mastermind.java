package fr.iutvalence.java.tp.mastermind;
/**
 * Represente une partie de Mastermind
 * @author chevrotl
 *
 */
public class Mastermind
{
	
	/**
	 * Nombres de pions par defaut de la combinaison a decouvrir
	 */
	public final static int NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT = 5;
	
	
	/**
	 * Nombres de pions à découvrir
	 */
	private int nombreDePionsADecouvrir ;
	
	/**
	 * Combinaison aléatoire de pion de couleur
	 */
	// TODO respecter les conventions de nommage
	private Combinaison combinaisonAleatoire ;
	
	private Joueur joueur ;
	
	
	/**
	 * Constructeur par defaut, avec les valeurs par defaut
	 */
	
	// Faire donner une valeur a l'entrée pour le nombreDePionsADecouvrir
	public Mastermind(Joueur joueurLanceur)
	{
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		this.joueur = joueurLanceur ;
	
	}


	
	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire, 
	 * création grille ...
	 */
	public void jouer(String nomJoueur, int nombreDeTourMaximum)
	{
			
			
			// Mettre ce qu'il ya dans joueur IA dans joueur, dont le tirage automatique
			// Enlever la classe Joueur IA
			
			// generation combinaison aléatoire a decouvrir
			this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ;
			this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
			System.out.println("Combinaison a decouvrir"+this.combinaisonAleatoire);
			
			//Affichage
			for(int numeroDuTour = 0 ; numeroDuTour < nombreDeTourMaximum ; numeroDuTour++)
			{
				if (this.combinaisonAleatoire.comparerAvec(joueur.obtenirCombinaison(this.nombreDePionsADecouvrir)).obtenirNombreDePionsBienPlaces() == this.nombreDePionsADecouvrir)
					System.out.println("Gagné en "+numeroDuTour+" tours !");
				
				
				System.out.println("Tour "+numeroDuTour);
				
				// a changer par une methode de joueur avec l'entree au clavier
				System.out.println("Combinaison proposee : "+joueur.obtenirCombinaison(this.nombreDePionsADecouvrir));
				
					
				System.out.println(this.combinaisonAleatoire.comparerAvec(joueur.obtenirCombinaison(this.nombreDePionsADecouvrir)).toString());
				
				System.out.println("");
			
			
			}
			
				
			
			

	}
	
	/**
	 * Renvoi la combinaison aleatoire actuelle de l'ordinateur
	 * @return combinaisonAleatoire 
	 */
	private Combinaison obtenirCombinaisonAleatoire()
	{
		return this.combinaisonAleatoire;
	}
	
	
}


