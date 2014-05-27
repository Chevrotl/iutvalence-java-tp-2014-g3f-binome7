package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;
import fr.iutvalence.java.tp.mastermind.Mastermind;

public class PanelDeJeu extends JSplitPane
{
	private PanelValidation panelValidation ;
	
	private GrilleCombinaison grilleCombinaison ;

	public PanelDeJeu()
	{
		super(SwingConstants.VERTICAL);
		
		 this.panelValidation = new PanelValidation(this.grilleCombinaison);
		 this.grilleCombinaison = new GrilleCombinaison();
		this.setResizeWeight(1.0);
		this.setEnabled(false);
		this.add(this.grilleCombinaison);
		this.add(this.panelValidation);
		
		
	}

	public GrilleCombinaison getGrilleCombinaison()
	{
		return this.grilleCombinaison;
	}
	
	
	
	
}
