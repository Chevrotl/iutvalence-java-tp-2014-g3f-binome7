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
		
		JButton buttonValidation = new JButton("Valider") ;
		JButton buttonAnnuler = new JButton("Annuler");
		GridLayout grillePanelJeux = new GridLayout(1, 0) ;

		this.setLayout(grillePanelJeux);


		this.add(buttonValidation); 
		this.add(buttonAnnuler);



	}

}
