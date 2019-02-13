package org.labaraka.dev.entities;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="autresCharges")
public class AutresCharges implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	private String type;
	private double charge;
	private Date dateJour;
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "semaine_id", nullable = false)
	private Semaine semaine;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}	
	
	public Date getDateJour() {
		return dateJour;
	}
	public void setDateJour(Date dateJour) {
		this.dateJour = dateJour;
	}
	public Semaine getSemaine() {
		return semaine;
	}
	public void setSemaine(Semaine semaine) {
		this.semaine = semaine;
	}

	public AutresCharges() {
		super();
	}
	
	

}
