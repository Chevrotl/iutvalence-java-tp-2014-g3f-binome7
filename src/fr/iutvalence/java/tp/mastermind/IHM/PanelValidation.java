package fr.iutvalence.java.tp.mastermind.IHM;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.java.tp.mastermind.Combinaison;
import fr.iutvalence.java.tp.mastermind.Joueur;
import fr.iutvalence.java.tp.mastermind.LanceurDeMastermind;
import fr.iutvalence.java.tp.mastermind.Mastermind;
import fr.iutvalence.java.tp.mastermind.Pion;

public class PanelValidation extends JPanel implements Joueur,ActionListener
{
	
	GrilleCombinaison grilleCombinaisonJeu ;
	private JButton buttonValidation ;
	private JButton buttonAnnuler ;
	private boolean combinaisonValidee = false ;
	public PanelValidation(GrilleCombinaison grilleCombinaison)
	{
		this.grilleCombinaisonJeu = grilleCombinaison ;
		this.buttonValidation = new JButton("Valider") ;
		this.buttonAnnuler = new JButton("Annuler");
		
		this.buttonValidation.addActionListener(this);
		this.buttonAnnuler.addActionListener(this);
		
		GridLayout grillePanelJeux = new GridLayout(1, 0) ;

		this.setLayout(grillePanelJeux);


		this.add(this.buttonValidation); 
		this.add(this.buttonAnnuler);



	}

	@Override
	public Combinaison obtenirCombinaison()
	{
		Pion[] pions = new Pion[Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT] ;
		
		while(!(this.combinaisonValidee))
		{
			System.out.println("Veuillez validé la combinaison");
		}
		
		for(int numeroPion = 0 ; numeroPion < Mastermind.NOMBRE_DE_PIONS_A_DECOUVRIR_PAR_DEFAUT ; numeroPion++)
		{
			pions[numeroPion] = new Pion(this.grilleCombinaisonJeu.tableauBoutonCouleur[numeroPion].getCouleurButton());
		}
		this.combinaisonValidee = false ;
		return new Combinaison(pions);
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(((JButton) event.getSource()).getText() == "Annuler")
		{
			this.grilleCombinaisonJeu.remiseAZeroCombinaisonAffichée();
			
		}
		
		if(((JButton) event.getSource()).getText() == "Valider")
		{
		
			this.combinaisonValidee = true ;
		}
		
		
	}



}
