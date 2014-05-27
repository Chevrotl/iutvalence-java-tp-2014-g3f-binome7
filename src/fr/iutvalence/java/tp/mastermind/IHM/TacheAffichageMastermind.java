package fr.iutvalence.java.tp.mastermind.IHM;


import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import fr.iutvalence.java.tp.mastermind.*;

public class TacheAffichageMastermind implements Runnable
{

	public void run()
	{
		PanelValidation panelValidation = new PanelValidation();
		PanelDeJeu panelDeJeu = new PanelDeJeu();
		
		
		JFrame fenetreMastermind = new JFrame() ;
		fenetreMastermind.setTitle("Minecraft");
		fenetreMastermind.setSize(700, 900);
		fenetreMastermind.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
		JPanel panelPrincipal = new JPanel() ;
		
		GridLayout grillePanelCombinaison = new GridLayout(LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT, 1) ;
		
		JSplitPane splitPaneprincipal = new JSplitPane(SwingConstants.VERTICAL,panelValidation,panelDeJeu) ;
		
		 grillePanelCombinaison.setVgap(10);
		
		for(int numeroCase = 0 ; numeroCase < LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT ; numeroCase++)
		{
			for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
			{
				panelPrincipal.add(splitPaneprincipal);
			}
			
		}
		
		panelPrincipal.setLayout(grillePanelCombinaison);
		
		fenetreMastermind.getContentPane().add(panelPrincipal);
	
		fenetreMastermind.setVisible(true);
	
	}
	
	
}
