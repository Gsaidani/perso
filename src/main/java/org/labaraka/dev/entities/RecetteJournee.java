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
@Table(name="recetteJournee")
public class RecetteJournee implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	private String type;
	private double valeur;
	private Date date;
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "semaine_id", nullable = false)
	private Semaine semaine;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Semaine getSemaine() {
		return semaine;
	}
	public void setSemaine(Semaine semaine) {
		this.semaine = semaine;
	}
	public RecetteJournee() {
		super();
	}
	 
	 

}
