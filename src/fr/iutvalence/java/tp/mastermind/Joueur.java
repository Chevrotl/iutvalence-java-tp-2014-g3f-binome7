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
	
	public void demanderCouleur() // a finir, mettre "couleur" en type de retour
	{
		System.out.println("Saisissez une des couleurs suivantes :" +Couleur.listeCouleur());
		Scanner scanner = new Scanner(System.in);
		
		String couleurEntree = scanner.nextLine();
		
		
		
		
		
	}
}
