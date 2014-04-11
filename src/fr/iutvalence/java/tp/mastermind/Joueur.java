package fr.iutvalence.java.tp.mastermind;

import java.util.Scanner;

public class Joueur
{
	
	/**
	 * nom du joueur
	 */
	private String nomJoueur ;
	// Besoin d'une methode renvoyant une combinaison
	
	
	
	
	/**
	 * constructeur par defaut
	 * @param nomJoueur
	 */
	public Joueur (String nomJoueur)
	{
		this.nomJoueur = nomJoueur ;
	}
	
	public Combinaison obtenirCombinaison(int tailleCombinaison) // Pour l'instant aléatoire 
	{
		return(new Combinaison(tailleCombinaison));
	}
	
	
	//Creer une methode obtenir couleur, que l'on repetera 5 fois pour faire une combinaison
	// ou
	// 5 couleur d'un coup.


}
