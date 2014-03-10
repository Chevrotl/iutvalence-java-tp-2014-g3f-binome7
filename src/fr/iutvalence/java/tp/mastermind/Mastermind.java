package fr.iutvalence.java.tp.mastermind;
/**
 * Represente une partie de Mastermind
 * @author chevrotl
 *
 */
public class Mastermind
{
	//Constantes
	// TODO renommer (plus lisible)
	// TODO écrire le commentaire
	/**
	 * Nombres de pions par defaut de la combinaison a decouvrir
	 */
	public final static int NOMBRE_PIONS_A_DECOUVRIR_PAR_DEFAUT = 5;
	
	// attributs
	// TODO renommer (plus lisible)
	// TODO écrire le commentaire
	/**
	 * Nombres de pions à découvrir
	 */
	private int nombrePionsADecouvrir ;
	
	/**
	 * Combinaison aléatoire de pion de couleur
	 */
	private Combinaison CombinaisonAleatoire ;
	
	
	
	//constructeurs
	// TODO écrire le commentaire
	/**
	 * Constructeur par defaut, avec les valeurs par defaut
	 */
	public Mastermind()
	{
		this.nombrePionsADecouvrir = NOMBRE_PIONS_A_DECOUVRIR_PAR_DEFAUT ;
		this.CombinaisonAleatoire = new Combinaison(this.nombrePionsADecouvrir);
		System.out.println(this.CombinaisonAleatoire);
	}
	
	// TODO écrire un commentaire plus précis
	/**
	 * Lance l'integralite d'une partie : Tirage d'une combinaison aléatoire, 
	 * création grille ...
	 */
	public void jouer()
	{
		System.out.println("Lancement d'une partie");
	}
}
