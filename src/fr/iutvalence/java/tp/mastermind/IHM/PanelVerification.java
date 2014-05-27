package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.java.tp.mastermind.Combinaison;
import fr.iutvalence.java.tp.mastermind.Mastermind;

public class PanelVerification extends JPanel 
{

	

	public PanelVerification()
	{
		GridLayout grilleVerification = new GridLayout(2,0);
		this.setLayout(grilleVerification);
		
		this.add(new JLabel("Bien Places : "));
		this.add(new JLabel("Mal Places : "));
	}
	
}
