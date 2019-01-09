package org.labaraka.dev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="recetteJournee")
public class RecetteJournee implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private String type;
	private double totalTypeRecette;
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getTotalTypeRecette() {
		return totalTypeRecette;
	}
	public void setTotalTypeRecette(double totalTypeRecette) {
		this.totalTypeRecette = totalTypeRecette;
	}
	public RecetteJournee() {
		super();
	}
	public RecetteJournee(Long id, String type, double totalTypeRecette) {
		super();
		this.id = id;
		this.type = type;
		this.totalTypeRecette = totalTypeRecette;
	}

}
