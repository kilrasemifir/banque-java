package compagnie.postes;

import compagnie.competences.Manager;

public class LeadDev extends Developpeur implements Manager {

	public LeadDev(String nom, String prenom, String email) {
		super(nom, prenom, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manager() {
		System.out.println(String.format("[%s %s]: lead le developpement", this.getNom(), this.getPrenom()));
	}

	
}
