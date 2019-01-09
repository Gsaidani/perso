package org.labaraka.dev.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="produit")
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private TypeProduit type;
	private double pu;
	private double quantite;
	private double totalProduit;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeProduit getType() {
		return type;
	}
	public void setType(TypeProduit type) {
		this.type = type;
	}
	public double getPu() {
		return pu;
	}
	public void setPu(double pu) {
		this.pu = pu;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public double getTotalProduit() {
		return totalProduit;
	}
	public void setTotalProduit(double totalProduit) {
		this.totalProduit = totalProduit;
	}
	public Produit() {
		super();
	}
	public Produit(Long id, TypeProduit type, double pu, double quantite, double totalProduit) {
		super();
		this.id = id;
		this.type = type;
		this.pu = pu;
		this.quantite = quantite;
		this.totalProduit = totalProduit;
	}
	

}
