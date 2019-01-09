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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="venteSemaine")
public class VenteSemaine implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@OneToMany(cascade = CascadeType.ALL)
	private List<VenteJournee> listeDesTotaux;
	private double totalSemaine;
	private Date dateSemaine;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<VenteJournee> getListeDesTotaux() {
		return listeDesTotaux;
	}
	public void setListeDesTotaux(List<VenteJournee> listeDesTotaux) {
		this.listeDesTotaux = listeDesTotaux;
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
	
	public VenteSemaine(long id, double totalSemaine, Date dateSemaine) {
		super();
		this.id = id;
		this.totalSemaine = totalSemaine;
		this.dateSemaine = dateSemaine;
	}
	public VenteSemaine() {
		super();
	}
	

}
