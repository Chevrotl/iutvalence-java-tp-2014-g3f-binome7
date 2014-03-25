package fr.iutvalence.java.tp.mastermind;

public class ResultatComparaison
{
	private final int nombreDePionsBienPlaces;
	private final int nombreDePionsMalPlaces;
	
	public ResultatComparaison(int nombreDePionsBienPlaces, int nombreDePionsMalPlaces)
	{
		super();
		this.nombreDePionsBienPlaces = nombreDePionsBienPlaces;
		this.nombreDePionsMalPlaces = nombreDePionsMalPlaces;
	}
	
	

	public int obtenirNombreDePionsBienPlaces()
	{
		return nombreDePionsBienPlaces;
	}

	public int obtenirNombreDePionsMalPlaces()
	{
		return nombreDePionsMalPlaces;
	}
	

	
	
	@Override
	public String toString()
	{
		return "ResultatComparaison [nombreDePionsBienPlaces=" + this.nombreDePionsBienPlaces + ", nombreDePionsMalPlaces="
				+ this.nombreDePionsMalPlaces + "]";
	}
	
	
	

}
