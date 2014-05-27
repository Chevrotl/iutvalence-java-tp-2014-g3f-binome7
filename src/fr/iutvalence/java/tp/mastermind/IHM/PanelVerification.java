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

	private int nombreDePionsBienPlaces  = 0;
	private int nombreDePionsMalPlaces  = 0;

	public PanelVerification()
	{
		GridLayout grilleVerification = new GridLayout(2,0);
		this.setLayout(grilleVerification);
		
		this.add(new JLabel("Bien Places : "+this.nombreDePionsBienPlaces));
		this.add(new JLabel("Mal Places : "+this.nombreDePionsMalPlaces));
	}

	public int getNombreDePionsBienPlaces()
	{
		return nombreDePionsBienPlaces;
	}

	public void setNombreDePionsBienPlaces(int nombreDePionsBienPlaces)
	{
		this.nombreDePionsBienPlaces = nombreDePionsBienPlaces;
	}

	public int getNombreDePionsMalPlaces()
	{
		return nombreDePionsMalPlaces;
	}

	public void setNombreDePionsMalPlaces(int nombreDePionsMalPlaces)
	{
		this.nombreDePionsMalPlaces = nombreDePionsMalPlaces;
	}
	
	
}
