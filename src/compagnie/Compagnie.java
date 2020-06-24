package compagnie;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {

	private String nom;
	private List<Employe> employes = new ArrayList<Employe>();
	
	public Compagnie() {
	}
	
	
	public Compagnie(String nom) {
		this.nom = nom;
	}


	public Compagnie(String nom, List<Employe> employes) {
		this.nom = nom;
		this.employes = employes;
	}


	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Employe> getEmployes() {
		return employes;
	}
	
}
