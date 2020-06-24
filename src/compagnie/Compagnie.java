package compagnie;

import java.util.ArrayList;
import java.util.List;

import compagnie.competences.Administratif;
import compagnie.competences.Codeur;
import compagnie.competences.Manager;

public class Compagnie {

	private String nom;
	private List<Employe> employes = new ArrayList<Employe>();
	private List<Codeur> codeurs = new ArrayList<Codeur>();
	private List<Manager> managers = new ArrayList<Manager>();
	private List<Administratif> administratifs = new ArrayList<Administratif>();
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
	
	public void ajouterAdministratif(Administratif admin) {
		this.administratifs.add(admin);
	}
	
	public List<Administratif> getAdministratifs() {
		return administratifs;
	}
	
	public void administrer() {
		for (Administratif administratif : administratifs) {
			administratif.administrer();
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
		if (this.administratifs.size() < 3 && employe instanceof Administratif) {
			this.ajouterAdministratif((Administratif)employe);
			employable = true;
		}
		if (employable) this.employes.add(employe);
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Compagnie         : ").append(this.getNom()).append('\n');
		sb.append("Nombre de codeurs : ").append(this.codeurs.size()).append('\n');
		sb.append("Nombre de managers: ").append(this.managers.size()).append('\n');
		sb.append("Nombre de administ: ").append(this.administratifs.size()).append('\n');
		sb.append("Effectif Total    : ").append(this.employes.size()).append('\n');
		return super.toString();
	}
	
}
