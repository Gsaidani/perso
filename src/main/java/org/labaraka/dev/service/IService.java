package org.labaraka.dev.service;


import java.sql.Date;
import java.util.List;

import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.entities.TypeProduitsVente;
import org.labaraka.dev.entities.VenteJournee;


public interface IService {

public void addRecetteJournee(String type, double valeur, Date date);
	
	public void addVenteJournee(VenteJournee venteJournee, Date dateJournee);
	
	public void addChargeJournee(ChargeJournee cj,Date dateJournee);
	
	public void addAutrescharges(List<AutresCharges> list,Date date, long numSemaine);
	
	public void modifyRecetteJournee(Long id,String type,double valeur, Date date);
	
	public void modifyVenteJournee(Long id,String type,double quantite,double valeur, Date date);
	
	public void modifyChargeJournee(Long id,String type,double quantite,double valeur, Date date);
	
	public void modifyAutrescharges(Long id,String type,double charge,long numSemaine,Date date);
	
	public List<RecetteJournee> consultRecetteJournee(Date di, Date df);
	
	public List<ChargeJournee> consultChargeJournee(Date di, Date df);
	
	public List<VenteJournee> consultVenteJournee(Date di, Date df);
	
	public List<AutresCharges> consultAutresCharges(Date di, Date df);
	
	public long findSemaineByDate(Date date);
	
	public void deleteRecetteJournee(Long id,Date date);
	
	public void deleteVenteJournee(Long id,Date date);
	
	public void deleteChargeJournee(Long id,Date date);
	
	public void deleteAutrescharges(Long id,Date date);
	

}
