package org.labaraka.dev.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.ChargeSemaine;
import org.labaraka.dev.entities.Produit;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.entities.RecetteSemaine;
import org.labaraka.dev.entities.TypeProduitsVente;
import org.labaraka.dev.entities.VenteJournee;
import org.labaraka.dev.entities.VenteSemaine;

public interface IDao {
	public void addRecetteJournee(String type, double total, Date date);
	public void addRecetteSemaine(List<RecetteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void addVenteJournee(List<TypeProduitsVente> produits,double totalJournee,Date dateJournee);
	public void addVenteSemaine(List<VenteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void addChargeJournee(List<Produit> produits,double totalJournee,Date dateJournee);
	public void addChargeSemaine(List<VenteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void addAutrescharges(String chargeType,double charge, double totalSemaine,Date dateSemaine,double totalMois);
	
	public void modifyRecetteJournee(Long id,String type,double totalTypeRecette, Date date);
	public void modifyRecetteSemaine(long id, List<RecetteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void modifyVenteJournee(List<TypeProduitsVente> produits,double totalJournee,Date dateJournee);
	public void modifyVenteSemaine(List<VenteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void modifyChargeJournee(List<Produit> produits,double totalJournee,Date dateJournee);
	public void modifyChargeSemaine(List<VenteJournee> listeDesTotaux,double totalSemaine,Date dateSemaine);
	public void modifyAutrescharges(String chargeType,double charge, double totalSemaine,Date dateSemaine,double totalMois);
	
	public List<RecetteJournee> consultRecetteJournee(Date di, Date df);
	public RecetteSemaine consultRecetteSemaine(Date di, Date df);
	public List<ChargeJournee> consultChargeJournee(Date di, Date df);
	public ChargeSemaine consultchargeSemaine(Date di, Date df);
	public List<VenteJournee> consultVenteJournee(Date di, Date df);
	public VenteSemaine consultVenteSemaine(Date di, Date df);
	
}
