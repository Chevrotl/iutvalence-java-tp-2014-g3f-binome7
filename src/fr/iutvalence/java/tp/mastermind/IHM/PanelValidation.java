package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;

public class PanelValidation extends JPanel
{

	public PanelValidation()
	{
		GridLayout grillePanelJeux = new GridLayout(LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT, 1) ;
		
		 this.setLayout(grillePanelJeux);
		 grillePanelJeux.setVgap(10);
		
		for(int numeroCase = 0 ; numeroCase < LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT ; numeroCase++)
		{
			this.add(new JButton()); 
			this.add(new JButton());
		}
		
		
	}

}
