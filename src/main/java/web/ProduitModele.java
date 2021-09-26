package web;

import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class ProduitModele {

	private String motcle;
	private List<Produit>produits=new ArrayList<>();
	public String getMotcle() {
		return motcle;
	}
	public void setMotclé(String motcle) {
		this.motcle = motcle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
	
	
	
}
