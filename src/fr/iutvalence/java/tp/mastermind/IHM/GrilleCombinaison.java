package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp.mastermind.Combinaison;
import fr.iutvalence.java.tp.mastermind.Couleur;
import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;
import fr.iutvalence.java.tp.mastermind.Mastermind;
import fr.iutvalence.java.tp.mastermind.Pion;

public class GrilleCombinaison extends JPanel
{
	
	public ButtonCouleur[] tableauBoutonCouleur = new ButtonCouleur[Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT];
	
	public GrilleCombinaison()
	{
		GridLayout grilleAffichageCombinaison = new GridLayout(0,4);
		
		this.setLayout(grilleAffichageCombinaison);
		
		
		
		for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
		{
			
			this.add(this.tableauBoutonCouleur[numeroButton] = new ButtonCouleur());
			
		}
		
		
	}

	public ButtonCouleur[] getTableauBoutonCouleur() 
	{
		return this.tableauBoutonCouleur ;
	}
	
	public Combinaison combinaisonCouleurButton()
	{
		Pion[] pions = new Pion[Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT];
		
		for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
		{
			pions[numeroButton] = new Pion(this.tableauBoutonCouleur[numeroButton].getCouleurButton()) ;
		}
		
		return new Combinaison(pions);
	}

	public void remiseAZeroCombinaisonAffichée()
	{
		for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
		{
			
			this.tableauBoutonCouleur[numeroButton].setNumeroCouleur(0); 
			
		}
	}
	
	
}
