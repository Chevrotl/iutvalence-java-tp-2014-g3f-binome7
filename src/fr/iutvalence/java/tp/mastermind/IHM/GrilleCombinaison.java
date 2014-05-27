package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;
import fr.iutvalence.java.tp.mastermind.Mastermind;

public class GrilleCombinaison extends JPanel
{

	public GrilleCombinaison()
	{

		for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
		{
			this.add(new JButton());
		}

	}

}
