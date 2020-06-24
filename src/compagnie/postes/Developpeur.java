package compagnie.postes;

import compagnie.Employe;
import compagnie.competences.Codeur;

public class Developpeur extends Employe implements Codeur {

	public Developpeur(String nom, String prenom, String email) {
		super(nom, prenom, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void coder() {
		System.out.println(String.format("[%s %s]: code!", this.getNom(), this.getPrenom()));
	}

}
