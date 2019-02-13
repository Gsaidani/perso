package org.labaraka.dev.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="venteJournee")
public class VenteJournee implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	private String type;
	private double quantite;
	private Date date;
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "semaine_id", nullable = false)
	private Semaine semaine;
	 
		
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public long getId() {
		return id;
	}
	
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public Semaine getSemaine() {
		return semaine;
	}
	public void setSemaine(Semaine semaine) {
		this.semaine = semaine;
	}
	public void setId(long id) {
		this.id = id;
	}
	public VenteJournee() {
		super();
	}
	
	

}
