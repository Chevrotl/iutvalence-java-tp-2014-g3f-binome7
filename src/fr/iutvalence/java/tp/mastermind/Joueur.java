package fr.iutvalence.java.tp.mastermind;



public abstract class Joueur
{
	
	
	// Besoin d'une methode renvoyant une combinaison

	

	/**
	 * Methode abstraite qui renvoi une combinaison redefinie dans les classe des joueurs
	 * @param tailleCombinaison
	 * @return une Combinaison
	 */
	public abstract Combinaison obtenirCombinaison(int tailleCombinaison);

		
	//Creer une methode obtenir couleur, que l'on repetera 5 fois pour faire une combinaison
	// ou
	// 5 couleur d'un coup.


}
