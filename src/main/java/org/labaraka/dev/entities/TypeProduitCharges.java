package org.labaraka.dev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="produitCharges")
public class TypeProduitCharges implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private TypeProduitAcheteEnum type;
	private double pu;
	private double quantite;
	private double totalJour;
	private Date dateJour;
	private double totalSemaine;
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "semaine_id", nullable = false)
	private Semaine semaine;
	 
	public double getTotalJour() {
		return totalJour;
	}
	public void setTotalJour(double totalJour) {
		this.totalJour = totalJour;
	}
	public Date getDateJour() {
		return dateJour;
	}
	public void setDateJour(Date dateJour) {
		this.dateJour = dateJour;
	}
	public double getTotalSemaine() {
		return totalSemaine;
	}
	public void setTotalSemaine(double totalSemaine) {
		this.totalSemaine = totalSemaine;
	}
	public Semaine getSemaine() {
		return semaine;
	}
	public void setSemaine(Semaine semaine) {
		this.semaine = semaine;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
	public TypeProduitAcheteEnum getType() {
		return type;
	}
	public void setType(TypeProduitAcheteEnum type) {
		this.type = type;
	}
	public TypeProduitCharges() {
		super();
	}
	

}
