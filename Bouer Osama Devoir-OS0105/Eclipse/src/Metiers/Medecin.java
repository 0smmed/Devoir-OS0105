package Metiers;

import java.sql.Date;

public class Medecin {
	public int Id;
	public String Nom;
	public String Prenom;
	public String Specialite;
	public Date date;
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur
	public Medecin(int id, String nom, String prenom, String specialite, Date date) {
		super();
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Specialite = specialite;
		this.date = date;
	}
	
	//getters setters
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getSpecialite() {
		return Specialite;
	}
	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//toString
	@Override
	public String toString() {
		return "Medecin [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Specialite=" + Specialite + ", date="
				+ date + "]";
	}
	
	

}
