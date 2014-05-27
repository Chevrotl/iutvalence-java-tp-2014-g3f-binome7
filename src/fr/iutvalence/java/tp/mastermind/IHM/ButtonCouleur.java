package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.iutvalence.java.tp.mastermind.Couleur;

public class ButtonCouleur extends JButton implements ActionListener
{

	public Couleur couleurButton = Couleur.BLEU ;

	private int numeroCouleur = 0 ;

	public ButtonCouleur()
	{
		this.mettreAJourCouleur();

		this.addActionListener(this);

	}

	private void mettreAJourCouleur() 
	{

		this.setText(this.couleurButton.values()[numeroCouleur].toString());
		this.couleurButton = this.couleurButton.values()[numeroCouleur] ;

	}

	public void actionPerformed(ActionEvent event)
	{
		if(this.numeroCouleur == this.couleurButton.values().length - 1)
		{	
			this.numeroCouleur = 0 ;
		}
		else
		{
			this.numeroCouleur++;
		}
		this.mettreAJourCouleur();
	}
	
	public Couleur getCouleurButton()
	{
		return this.couleurButton ;
	}

	public void setNumeroCouleur(int numeroCouleur)
	{
		this.numeroCouleur = numeroCouleur;
		this.mettreAJourCouleur();
		
	}

	
	
	
	

}
