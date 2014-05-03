package fr.iutvalence.java.tp.mastermind;

/**
 * Interface décrivant l'affichage
 * @author sebastienjean
 *
 */
public interface Affichage
{

	public void afficherDebutDeTout(int numeroDuTour);

	public void afficherDemandeDeCombinaison();

	public void afficherResultatcomparaison(
			ResultatComparaison resultatComparaison);

	public void afficherVictoire(int numeroDuTour);

	public void afficherDefaite(Combinaison combinaisonAleatoire);

}
