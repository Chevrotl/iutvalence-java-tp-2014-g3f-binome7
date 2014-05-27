package fr.iutvalence.java.tp.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.iutvalence.java.tp.mastermind.IHM.PanelValidation;
/**
 * Classe joueur humain avec l'interaction au clavier
 * @author chevrotl
 *
 */
public class JoueurHumain implements Joueur
{
	/**
	 * variable locale du nom du joueur entree en parametre lors de la creation de celui ci
	 */
	private String nomJoueur ;
	
	/**
	 * objet permettant la lecture de texte au clavier
	 */
	private final BufferedReader lecteurDeLignesDeTexteSurLEntreeStandard;
	
	/**
	 * Constructeur de joueur
	 * @param nomJoueur	nom du joueur
	 */
	public JoueurHumain(String nomJoueur)
	{
		this.nomJoueur = nomJoueur ;
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Combinaison obtenirCombinaison()
	{
		/**
		 * Combinaison servant a eter modifie par l'entree clavier
		 */
		String combinaisonEntreParLeJoueur = null ;
		
		try
		{	
			System.out.println(Couleur.listeCouleur());
			combinaisonEntreParLeJoueur = this.lecteurDeLignesDeTexteSurLEntreeStandard.readLine();
			
						
			if (combinaisonEntreParLeJoueur == null)
				return null;
				
			if (combinaisonEntreParLeJoueur.length() == 0)
				return null;
		
			return Combinaison.parseCombinaison(combinaisonEntreParLeJoueur);
		}
		catch (IOException e)
		{
			return null ;
		}
		
		
	}

	
	
	
	//Creer une methode utilisant le bufferedreader pour lire les entree clavier
	//cf code TD2 pendu


}
