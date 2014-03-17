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
	
	private Combinaison combinaisonAleatoireIA ;
	
	
	/**
	 * Constructeur par defaut, avec les valeurs par defaut
	 */
	
	// Faire donner une valeur a l'entrée pour le nombreDePionsADecouvrir
	public Mastermind()
	{
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ;
		this.combinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		System.out.println(this.combinaisonAleatoire);
	}
	
	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire, 
	 * création grille ...
	 */
	public void jouer()
	{
		System.out.println("Lancement d'une partie");
	}
	
	

	
	
	public void jouerIAVersusIA()
	{
		this.combinaisonAleatoireIA = new Combinaison(NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT);		
		
	
	
	}
	
	 
		
		
		 
}


