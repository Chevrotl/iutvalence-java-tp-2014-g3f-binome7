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

public class TacheAffichageMastermind implements Runnable, Affichage 
{
	PanelVerification panelVerification = new PanelVerification(); 
	PanelDeJeu panelDeJeu = new PanelDeJeu();

	public void run()
	{
		
		
		
		
		JFrame fenetreMastermind = new JFrame() ;
		fenetreMastermind.setTitle("Minecraft");
		fenetreMastermind.setSize(700, 900);
		fenetreMastermind.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
		JPanel panelPrincipal = new JPanel() ;
		
		GridLayout grillePanelCombinaison = new GridLayout(LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT, 1) ;
		
		JSplitPane splitPaneprincipal = new JSplitPane(SwingConstants.VERTICAL,this.panelVerification,this.panelDeJeu) ;
		splitPaneprincipal.setEnabled(false);
		
		
		for(int numeroCase = 0 ; numeroCase < LanceurDeMastermind.NOMBRE_DE_TOUR_PAR_DEFAUT ; numeroCase++)
		{
			for(int numeroButton = 0 ; numeroButton < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroButton++)
			{
				panelPrincipal.add(splitPaneprincipal);
				//panelPrincipal.add(new JSplitPane(SwingConstants.VERTICAL,new PanelValidation(), new PanelDeJeu()));
				//methode qui joue un tour du jeu, puis creer un nouveau splitpan avec les nouvelles coordonn�es
			}
			
		}
		
		panelPrincipal.setLayout(grillePanelCombinaison);
		
		fenetreMastermind.getContentPane().add(panelPrincipal);
	
		fenetreMastermind.setVisible(true);
	
	}

	@Override
	public void afficherDebutDeTout(int numeroDuTour)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherDemandeDeCombinaison()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherResultatcomparaison(ResultatComparaison resultatComparaison)
	{
		this.panelVerification.setNombreDePionsBienPlaces(resultatComparaison.obtenirNombreDePionsBienPlaces());
		this.panelVerification.setNombreDePionsMalPlaces(resultatComparaison.obtenirNombreDePionsMalPlaces());
		
		
	}

	@Override
	public void afficherVictoire(int numeroDuTour)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherDefaite(Combinaison combinaisonAleatoire)
	{
		// TODO Auto-generated method stub
		
	}
}
	

