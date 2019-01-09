package org.labaraka.dev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="autresCharges")
public class AutresCharges implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	private String chargeType;
	private double charge;
	private double totalSemaine;
	private Date dateSemaine;
	private double totalMois;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public double getTotalSemaine() {
		return totalSemaine;
	}
	public void setTotalSemaine(double totalSemaine) {
		this.totalSemaine = totalSemaine;
	}
	
	public Date getDateSemaine() {
		return dateSemaine;
	}
	public void setDateSemaine(Date dateSemaine) {
		this.dateSemaine = dateSemaine;
	}
	public double getTotalMois() {
		return totalMois;
	}
	public void setTotalMois(double totalMois) {
		this.totalMois = totalMois;
	}
	public AutresCharges() {
		super();
	}
	public AutresCharges(long id, String chargeType, double charge, double totalSemaine, Date dateSemaine,
			double totalMois) {
		super();
		this.id = id;
		this.chargeType = chargeType;
		this.charge = charge;
		this.totalSemaine = totalSemaine;
		this.dateSemaine = dateSemaine;
		this.totalMois = totalMois;
	}
	

}
