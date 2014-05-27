package fr.iutvalence.java.tp.mastermind;

public class AffichageConsole implements Affichage
{

	@Override
	public void afficherDebutDeTout(int numeroDuTour)
	{
		System.out.println("Tour " + numeroDuTour);
		
	}

	@Override
	public void afficherDemandeDeCombinaison()
	{
		System.out.println("Choisir une combinaison");
		
	}

	@Override
	public void afficherResultatcomparaison(
			ResultatComparaison resultatComparaison)
	{
		System.out.println(resultatComparaison);
	}

	@Override
	public void afficherVictoire(int numeroDuTour)
	{
		System.out.println("Gagné en " + numeroDuTour + " tours !");
		
	}

	@Override
	public void afficherDefaite(Combinaison combinaison)
	{
		System.out.println("Combinaison a decouvrir" + "\n" + combinaison);
		
	}

}
