package compagnie.postes;

import compagnie.Employe;
import compagnie.competences.Manager;

public class ProjetManager extends Employe implements Manager {

	@Override
	public void manager() {
		System.out.println(String.format("[%s %s]: gére le projet!", this.getNom(), this.getPrenom()));
	}

}
