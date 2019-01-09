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
@Table(name="recetteSemaine")
public class RecetteSemaine implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@OneToMany(cascade = CascadeType.ALL)
	private List<RecetteJournee> listeDesTotaux;
	private double totalSemaine;
	private Date dateSemaine;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<RecetteJournee> getListeDesTotaux() {
		return listeDesTotaux;
	}
	public void setListeDesTotaux(List<RecetteJournee> listeDesTotaux) {
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
	public RecetteSemaine() {
		super();
	}
	public RecetteSemaine(long id, double totalSemaine, Date dateSemaine) {
		super();
		this.id = id;
		this.totalSemaine = totalSemaine;
		this.dateSemaine = dateSemaine;
	}
	
	

}