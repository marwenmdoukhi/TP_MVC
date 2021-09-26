package metier;

import java.io.Serializable;

public class Produit implements Serializable {
	
	private long idProduit;
	private String nomProduit;
	private double prix;
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit(String nomProduit, double prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	
	
	
	
	
	
	

}
