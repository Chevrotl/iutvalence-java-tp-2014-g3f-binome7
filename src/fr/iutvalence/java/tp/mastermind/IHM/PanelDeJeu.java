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

	public PanelDeJeu()
	{
		super(SwingConstants.VERTICAL);
		
		PanelVerification panelVerification = new PanelVerification();
		GrilleCombinaison grilleCombinaison = new GrilleCombinaison();
		this.setResizeWeight(1.0);
		this.setEnabled(false);
		this.add(grilleCombinaison);
		this.add(panelVerification);
		
		
	}
	
}
