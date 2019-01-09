package org.labaraka.dev.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="typeProduitsVente")
public class TypeProduitsVente implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private TypeProduitVente type;
	private double pu;
	private double quantite;
	private double totalProduitVendu;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeProduitVente getType() {
		return type;
	}
	public void setType(TypeProduitVente type) {
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
	public double getTotalProduitVendu() {
		return totalProduitVendu;
	}
	public void setTotalProduitVendu(double totalProduitVendu) {
		this.totalProduitVendu = totalProduitVendu;
	}
	public TypeProduitsVente() {
		super();
	}
	public TypeProduitsVente(Long id, double pu, double quantite, double totalProduitVendu) {
		super();
		this.id = id;
		this.pu = pu;
		this.quantite = quantite;
		this.totalProduitVendu = totalProduitVendu;
	}
	

}
