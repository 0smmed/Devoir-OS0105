package Metiers;

public class Medicament {
	public String code;
	public String nom;
	public String dosage;
	public int prix_parmite;
	public String stock_disponible;
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur
	public Medicament(String code, String nom, String dosage, int prix_parmite, String stock_disponible) {
		super();
		this.code = code;
		this.nom = nom;
		this.dosage = dosage;
		this.prix_parmite = prix_parmite;
		this.stock_disponible = stock_disponible;
	}
	
	//getters setters
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public int getPrix_parmite() {
		return prix_parmite;
	}
	public void setPrix_parmite(int prix_parmite) {
		this.prix_parmite = prix_parmite;
	}
	public String getStock_disponible() {
		return stock_disponible;
	}
	public void setStock_disponible(String stock_disponible) {
		this.stock_disponible = stock_disponible;
	}
	
	//toString
	@Override
	public String toString() {
		return "Medicament [code=" + code + ", nom=" + nom + ", dosage=" + dosage + ", prix_parmite=" + prix_parmite
				+ ", stock_disponible=" + stock_disponible + "]";
	}

	public String getEmplacement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
