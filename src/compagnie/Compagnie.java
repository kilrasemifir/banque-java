package compagnie;

import java.util.ArrayList;
import java.util.List;

import compagnie.competences.Codeur;
import compagnie.competences.Manager;

public class Compagnie {

	private String nom;
	private List<Employe> employes = new ArrayList<Employe>();
	private List<Codeur> codeurs = new ArrayList<Codeur>();
	private List<Manager> managers = new ArrayList<Manager>();
	
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
	
	public void ajouterCodeur(Codeur codeur) {
		this.codeurs.add(codeur);
	}
	
	public List<Codeur> getCodeurs() {
		return codeurs;
	}
	
	public void lancerProjet() {
		for (Codeur codeur : codeurs) {
			codeur.coder();
		}
	}
	
	public void ajouterManager(Manager manager) {
		this.managers.add(manager);
	}
	
	public List<Manager> getManagers() {
		return managers;
	}
	
	public void manager() {
		for (Manager manager : managers) {
			manager.manager();
		}
	}
	
	public void embaucher(Employe employe) {
		boolean employable = false;
		if (this.codeurs.size() < 10 && employe instanceof Codeur) {
			this.ajouterCodeur((Codeur)employe);
			employable = true;
		}
		if (this.managers.size() < 3 && employe instanceof Manager) {
			this.ajouterManager((Manager)employe);
			employable = true;
		}
		if (employable) this.employes.add(employe);
		
	}
	
}
