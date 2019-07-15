package org.labaraka.dev.service;


import java.sql.Date;
import java.util.List;

import org.labaraka.dev.dao.IDao;
import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.entities.VenteJournee;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ServiceMetier implements IService {
	
	private IDao dao;
	
	public void setDao(IDao dao) {
		this.dao = dao;
		
	}

	@Override
	public void addRecetteJournee(String type, double valeur, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVenteJournee(VenteJournee venteJournee, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChargeJournee(ChargeJournee cj, Date dateJournee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAutrescharges(List<AutresCharges> list, Date date, long numSemaine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyRecetteJournee(Long id, String type, double valeur, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyVenteJournee(Long id, String type, double quantite, double valeur, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyChargeJournee(Long id, String type, double quantite, double valeur, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAutrescharges(Long id, String type, double charge, long numSemaine, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecetteJournee> consultRecetteJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChargeJournee> consultChargeJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VenteJournee> consultVenteJournee(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AutresCharges> consultAutresCharges(Date di, Date df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findSemaineByDate(Date date) {
		return dao.findSemaineByDate(date);
	}

	@Override
	public void deleteRecetteJournee(Long id, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVenteJournee(Long id, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteChargeJournee(Long id, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAutrescharges(Long id, Date date) {
		// TODO Auto-generated method stub
		
	}

	
}
