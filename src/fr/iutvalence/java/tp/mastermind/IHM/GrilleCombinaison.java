package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;
import fr.iutvalence.java.tp.mastermind.Mastermind;

public class GrilleCombinaison extends JPanel
{
	
	private ButtonCouleur[] tableauBoutonCouleur = new ButtonCouleur[Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT];
	
	public GrilleCombinaison()
	{
		GridLayout grilleAffichageCombinaison = new GridLayout(0,4);
		
		this.setLayout(grilleAffichageCombinaison);
		
		
		
		for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
		{
			
			this.add(tableauBoutonCouleur[numeroButton] = new ButtonCouleur());
			
		}
		System.out.println(this.tableauBoutonCouleur[3].toString());
		
	}

	public ButtonCouleur[] getTableauBoutonCouleur() 
	{
		return tableauBoutonCouleur;
	}

	
	
}
