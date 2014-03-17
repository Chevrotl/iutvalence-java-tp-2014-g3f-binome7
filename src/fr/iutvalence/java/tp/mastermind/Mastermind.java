package fr.iutvalence.java.tp.mastermind;
/**
 * Represente une partie de Mastermind
 * @author chevrotl
 *
 */
public class Mastermind
{
	//Constantes
	/**
	 * Nombres de pions par defaut de la combinaison a decouvrir
	 */
	public final static int NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT = 5;
	
	// attributs
	/**
	 * Nombres de pions à découvrir
	 */
	private int nombreDePionsADecouvrir ;
	
	/**
	 * Combinaison aléatoire de pion de couleur
	 */
	// TODO respecter les conventions de nommage
	private Combinaison CombinaisonAleatoire ;
	
	//constructeurs
	/**
	 * Constructeur par defaut, avec les valeurs par defaut
	 */
	public Mastermind()
	{
		this.nombreDePionsADecouvrir = NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ;
		this.CombinaisonAleatoire = new Combinaison(this.nombreDePionsADecouvrir);
		System.out.println(this.CombinaisonAleatoire);
	}
	
	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire, 
	 * création grille ...
	 */
	public void jouer()
	{
		System.out.println("Lancement d'une partie");
	}
}
