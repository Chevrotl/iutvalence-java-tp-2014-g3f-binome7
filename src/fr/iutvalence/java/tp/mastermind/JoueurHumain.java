package fr.iutvalence.java.tp.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoueurHumain extends Joueur
{

	private String nomJoueur ;
	
	private final BufferedReader lecteurDeLignesDeTexteSurLEntreeStandard;
	
	public JoueurHumain(String nomJoueur)
	{
		this.nomJoueur = nomJoueur ;
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(new InputStreamReader(System.in));
	}
	

	
	
	
	
	public Combinaison obtenirCombinaison(int tailleCombinaison)
	{
		
		// obtenir combinaison renvoi une methode parseCombinaison qui decoupe une ligne de texte
		// et qui appelle parseCouleur
		return null;
	}

	
	//Creer une methode utilisant le bufferedreader pour lire les entree clavier
	//cf code TD3 pendu


}
