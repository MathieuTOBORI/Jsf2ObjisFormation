package com.objis.formationjsf2;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Toutes les propriétés de type String
	 */
	public String prenom;
	public String nom;
	public String genre;
	public String datedenaissance;
	public String email;

	public String niveaudeservice;
	
	public User() {
		
	}
	public User(String prenom, String nom, String genre,
			String datedenaissance, String email, String niveaudeservice) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.datedenaissance = datedenaissance;
		this.email = email;
		this.niveaudeservice = niveaudeservice;
	}



	public User(String prenom2, String nom2, String genre2, Date date,
			String email2, String niveaudeservice2) {
		
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



	public String getDatedenaissance() {
		return datedenaissance;
	}



	public void setDatedenaissance(String datedenaissance) {
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
