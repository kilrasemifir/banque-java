package compagnie.postes;

import compagnie.Employe;
import compagnie.competences.Administratif;

public class AgentAdministratif extends Employe implements Administratif {

	@Override
	public void administrer() {
		System.out.println(String.format("[%s %s]: administrer", this.getNom(), this.getPrenom()));
	}

}
