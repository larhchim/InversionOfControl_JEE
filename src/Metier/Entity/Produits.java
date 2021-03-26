package Metier.Entity;



import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="PRODUIT")

public class Produits implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRODUIT")
	private int idP;
	
	
	@Column(name="DESCRIPTION")
	private String des;
	
	
	@Column(name="PRIX")
	private double prix;
	
	
	
	
	@Column(name="Disponiblite")
	private boolean disponibilite;
	
	
	@Column(name="QUANTITE_STOCK")
	private int quantite;
	
	

	
	
	public Produits() {
		
	}
	
	

	public Produits(String des, double prix, boolean disponibilite,int quan) {
		
		this.des = des;
		this.prix = prix;
		this.disponibilite = disponibilite;
		this.quantite=quan;
		
	}

	public int getId() {
		return idP;
	}

	public void setId(int id) {
		this.idP = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	
	

	public int getQuantite() {
		return quantite;
	}
	
	

	public boolean isDisponibilite() {
		return disponibilite;
	}



	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	
	



	
	@Override
	public String toString() {
		return "Produits [des=" + des + ", prix=" + prix + ", disponibilite=" + disponibilite + ", quantite=" + quantite
				+ "]";
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	

	
	



}
