package org.labaraka.dev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="chargeJournee")
public class ChargeJournee implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produit> produits;
	private double totalJournee;
	private Date dateJournee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public double getTotalJournee() {
		return totalJournee;
	}
	public void setTotalJournee(double totalJournee) {
		this.totalJournee = totalJournee;
	}
	public Date getDateJournee() {
		return dateJournee;
	}
	public void setDateJournee(Date dateJournee) {
		this.dateJournee = dateJournee;
	}
	public ChargeJournee() {
		super();
	}
	public ChargeJournee(long id, double totalJournee, Date dateJournee) {
		super();
		this.id = id;
		this.totalJournee = totalJournee;
		this.dateJournee = dateJournee;
	}

}