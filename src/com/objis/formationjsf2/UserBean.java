package com.objis.formationjsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userbean")
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(name = "prenom", value = "MICHEL")
	public String prenom;
	@ManagedProperty(name = "nom", value = "DUPOND")
	public String nom;
	@ManagedProperty(name = "genre", value = "homme")
	public String genre;
	public Date datedenaissance;
	@ManagedProperty(name = "email", value = "particpant@objis.com")
	public String email;

	public String niveaudeservice;
	private static final List<User> userList = new ArrayList<User>(
			Arrays.asList(
			new User("Dupont", "Michel", "homme", "27/10/1977",
					"dupont@objis.com", "medium"), new User("Paulin",
					"Jacques", "homme", "12/06/1965", "paulin@objis.com",
					"medium"), new User("Participant", "Objis", "homme",
					"07/10/1987", "particpany@objis.com", "medium"), new User(
					"Nathalie", "Tango", "femme", "17/07/1980",
					"nathalie@objis.com", "premium")));

	public UserBean() {
		
	}
	
	public UserBean(String prenom, String nom, String genre,
			Date datedenaissance, String email, String niveaudeservice) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.datedenaissance = datedenaissance;
		this.email = email;
		this.niveaudeservice = niveaudeservice;
	}


	public List<User> getUserList() {

		return userList;

	}

	public void addAction() {

		User u = new User(this.prenom, this.nom, this.genre,
				new Date(), this.email, this.niveaudeservice);
		userList.add(u);

	}

	public void deleteAction(User user) {
		
		System.out.println("avant: "+userList.size());
		userList.remove(user);
		System.out.println("Apres: "+userList.size());
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	

	public Date getDatedenaissance() {
		return datedenaissance;
	}

	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNiveaudeservice() {
		return niveaudeservice;
	}

	public void setNiveaudeservice(String niveaudeservice) {
		this.niveaudeservice = niveaudeservice;
	}

}
