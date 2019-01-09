package org.labaraka.dev.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.ChargeSemaine;
import org.labaraka.dev.entities.Produit;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.entities.RecetteSemaine;
import org.labaraka.dev.entities.TypeProduitsVente;
import org.labaraka.dev.entities.TypesAutresCharges;
import org.labaraka.dev.entities.VenteJournee;
import org.labaraka.dev.entities.VenteSemaine;

public class Dao implements IDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addRecetteJournee(String type, double total, Date date) {
		RecetteJournee rj = new RecetteJournee();
		rj.setType(type);
		rj.setTotalTypeRecette(total);
		rj.setDate(date);
		em.persist(rj);
	}

	@Override
	public void addRecetteSemaine(List<RecetteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		RecetteSemaine rs = new RecetteSemaine();
		rs.setDateSemaine(dateSemaine);
		for(int i=0; i<6; i++) {
			
		}
		
	}

	@Override
	public void addVenteJournee(List<TypeProduitsVente> produits, double totalJournee, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVenteSemaine(List<VenteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChargeJournee(List<Produit> produits, double totalJournee, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChargeSemaine(List<VenteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAutrescharges(String chargeType, double charge, double totalSemaine, Date dateSemaine,
			double totalMois) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyRecetteJournee(Long id, String type, double totalTypeRecette, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyRecetteSemaine(long id, List<RecetteJournee> listeDesTotaux, double totalSemaine,
			Date dateSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyVenteJournee(List<TypeProduitsVente> produits, double totalJournee, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyVenteSemaine(List<VenteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyChargeJournee(List<Produit> produits, double totalJournee, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyChargeSemaine(List<VenteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAutrescharges(String chargeType, double charge, double totalSemaine, Date dateSemaine,
			double totalMois) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecetteJournee> consultRecetteJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecetteSemaine consultRecetteSemaine(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChargeJournee> consultChargeJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeSemaine consultchargeSemaine(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VenteJournee> consultVenteJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VenteSemaine consultVenteSemaine(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
