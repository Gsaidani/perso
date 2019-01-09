package org.labaraka.dev.service;

import java.util.Date;
import java.util.List;

import org.labaraka.dev.dao.Dao;
import org.labaraka.dev.dao.IDao;
import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.ChargeSemaine;
import org.labaraka.dev.entities.Produit;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.entities.RecetteSemaine;
import org.labaraka.dev.entities.TypeProduitsVente;
import org.labaraka.dev.entities.VenteJournee;
import org.labaraka.dev.entities.VenteSemaine;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Service implements IService {
	
	private IDao dao;
	

	public void setDao(IDao dao) {
		this.dao = dao;
		
	}


	@Override
	public void addRecetteJournee(String type, double total, Date date) {
		dao.addRecetteJournee(type, total, date);
		
	}


	@Override
	public void addRecetteSemaine(List<RecetteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine) {
		// TODO Auto-generated method stub
		
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
