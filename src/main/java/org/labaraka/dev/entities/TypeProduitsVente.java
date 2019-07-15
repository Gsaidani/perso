package org.labaraka.dev.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name="typeProduitsVente")
public class TypeProduitsVente implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private String type;
	private double pu;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vente_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private VenteJournee vente;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	public TypeProduitsVente() {
		super();
	}
	
	

}
