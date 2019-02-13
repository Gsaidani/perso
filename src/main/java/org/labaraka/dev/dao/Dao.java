package org.labaraka.dev.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ChargeJournee;
import org.labaraka.dev.entities.RecetteJournee;

import org.labaraka.dev.entities.Semaine;
import org.labaraka.dev.entities.TypeProduitsVente;
import org.labaraka.dev.entities.VenteJournee;

import org.labaraka.dev.service.Service;
import org.springframework.transaction.annotation.Transactional;

public class Dao implements IDao {
	@PersistenceContext
	private EntityManager em;
	private Logger logger;
	private static final Logger LOGGER = Logger.getLogger(Dao.class);
	private static SessionFactory sessionFactory;
	
	@Override
	public void addRecetteJournee(String type, double valeur, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : addRecetteJournee --START");
		}
		
		RecetteJournee rj = new RecetteJournee();
		rj.setType(type);
		rj.setValeur(valeur);
		rj.setDate(date);
		em.persist(rj);
		LOGGER.debug("Dao : addRecetteJournee --END");
	}

	/*
	public void addRecetteSemaine(List<RecetteJournee> listeDesTotaux, double totalSemaine, Long numSemaine) {
		List<RecetteJournee> listeRJ = null;
		Query q = em.createQuery(" select l from RecetteJournee l where s.numSemaine:= ns");
		q.setParameter("ns", numSemaine);
		listeRJ = q.getResultList();
		//RecetteSemaine rs = new RecetteSemaine();
		//rs.setNumSemaine(numSemaine);
		//rs.setListeDesTotaux(listeRJ);
		for(int i=0; i<listeRJ.size(); i++) {
			totalSemaine=0;
			totalSemaine+=listeRJ.get(i).getTotalTypeRecette();
			
		}
		//rs.setTotalSemaine(totalSemaine);
		//em.persist(rs);
		
	}

	

	
	public void addVenteSemaine(List<VenteJournee> listeDesTotaux, double totalSemaine, Date dateSemaine,Long numSemaine) {
		List<VenteJournee> listeVJ = null;
		Query q = em.createQuery(" select v from VenteJournee v where v.numSemaine:= ns");
		q.setParameter("ns", numSemaine);
		listeVJ = q.getResultList();
		//VenteSemaine vs = new VenteSemaine();
		//vs.setNumSemaine(numSemaine);
		//vs.setListeDesTotaux(listeVJ);
		for(int i=0; i<listeVJ.size(); i++) {
			totalSemaine=0;
			totalSemaine+=listeVJ.get(i).getTotalJournee();
			
		}
		//vs.setTotalSemaine(totalSemaine);
		//em.persist(vs);
	}

	*/	


	public void addSemaines(String annee, Long num, Date debut, Date fin) {
		LOGGER.debug("Dao : addsemaine --START");
		Semaine semaine = new Semaine();
		semaine.setAnnee(annee);
		semaine.setDebut(debut);
		semaine.setFin(fin);
		em.persist(semaine);
		LOGGER.debug("Dao : addsemaine --END");
		
	}

	
	public long findSemaine(Date date) {
		long numSemaine = 0;
		Query q = em.createQuery("FROM Semaine AS s WHERE dj BETWEEN :s.debut AND :s.fin");
		q.setParameter("dj", date);
		Semaine s =(Semaine)q.getSingleResult();
		numSemaine = s.getNumero();		
		return numSemaine;
	}

	@Override
	public void addVenteJournee(VenteJournee venteJournee, Date dateJournee) {
		
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("Dao : addVenteJournee --START");
				}
				if (venteJournee==null) throw new RuntimeException("Vente journée introuvable"); 
				venteJournee.setDate(dateJournee);
				em.persist(venteJournee);
				LOGGER.debug("Dao : addVenteJournee --END");
		
	}

	@Override
	public void addChargeJournee(ChargeJournee cj,Date dateJournee) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : addChargeJournee --START");
		}
		if (cj==null) throw new RuntimeException("Charge journée introuvable"); 
		cj.setDate(dateJournee);
		em.persist(cj);
		LOGGER.debug("Dao : addChargeJournee --END");
		
	}

	@Override
	public void addAutrescharges(List<AutresCharges> list,Date date, long numSemaine) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : addAutrescharges --START");
		}
		//if (cj==null) throw new RuntimeException(" introuvable"); 
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setDateJour(date);
			em.persist(list.get(i));
		}
		
		LOGGER.debug("Dao : addAutrescharges --END");
		
		
	}

	@Override
	public void modifyRecetteJournee(Long id, String type, double valeur, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : modifyRecetteJournee --START");
		}
		
		RecetteJournee rj = em.find(RecetteJournee.class, id);
		if (rj==null) throw new RuntimeException("recette journée introuvable"); 
				rj.setDate(date);
				rj.setType(type);
				rj.setValeur(valeur);
				em.persist(rj);
		LOGGER.debug("Dao : modifyRecetteJournee --END");
		
	}

	@Override
	public void modifyVenteJournee(Long id, String type, double quantite, double valeur, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : modifyVenteJournee --START");
		}
		
		VenteJournee vj = em.find(VenteJournee.class, id);
		if (vj==null) throw new RuntimeException("vente journée introuvable"); 
				vj.setDate(date);
				vj.setQuantite(quantite);
				vj.setType(type);
				
				em.persist(vj);
		LOGGER.debug("Dao : modifyVenteJournee --END");
		
	}

	@Override
	public void modifyChargeJournee(Long id, String type, double quantite, double valeur, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : modifyChargeJournee --START");
		}
		
		ChargeJournee cj = em.find(ChargeJournee.class, id);
		if (cj==null) throw new RuntimeException("charge journée introuvable"); 
				cj.setDate(date);
				cj.setQuantite(quantite);
				cj.setType(type);
				cj.setValeur(valeur);
				
				em.persist(cj);
		LOGGER.debug("Dao : modifyChargeJournee --END");
		
	}

	@Override
	public void modifyAutrescharges(Long id, String type, double charge, long numSemaine, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : modifyAutrescharges --START");
		}
		
		AutresCharges ac = em.find(AutresCharges.class, id);
		if (ac==null) throw new RuntimeException("AutresCharges introuvable"); 
				ac.setCharge(charge);
				ac.setDateJour(date);
				
				em.persist(ac);
		LOGGER.debug("Dao : modifyAutrescharges --END");
		
	}

	@Override
	public List<RecetteJournee> consultRecetteJournee(Date di, Date df) {
		List<RecetteJournee> list;
		Query q = em.createQuery(" select r from RecetteJournee r where r.date<= :df and r.date=>: di");
		q.setParameter("df", df);
		q.setParameter("di", di);
		list=q.getResultList();
		return list;
	}

	@Override
	public List<ChargeJournee> consultChargeJournee(Date di, Date df) {
		List<ChargeJournee> list;
		Query q = em.createQuery(" select r from ChargeJournee r where r.date<= :df and r.date=>: di");
		q.setParameter("df", df);
		q.setParameter("di", di);
		list=q.getResultList();
		return list;
	}

	@Override
	public List<VenteJournee> consultVenteJournee(Date di, Date df) {
		List<VenteJournee> list;
		Query q = em.createQuery(" select r from VenteJournee r where r.date<= :df and r.date=>: di");
		q.setParameter("df", df);
		q.setParameter("di", di);
		list=q.getResultList();
		return list;
	}

	@Override
	public List<AutresCharges> consultAutresCharges(Date di, Date df) {
		List<AutresCharges> ac;
		Query q = em.createQuery(" select r from AutresCharges r where r.date<= :df and r.date=>: di");
		q.setParameter("df", df);
		q.setParameter("di", di);
		ac=q.getResultList();
		return ac;
	}

	@Override
	public long findSemaineByDate(Date date) {
		Long numSemaine;	
		try {
			
		/*Query q = em.createQuery(" FROM Semaine AS s ");
		System.out.println(q.getParameterValue(0));
		q.setParameter("d", date);
		//WHERE d BETWEEN :s.debut AND :s.fin
		numSemaine=((Semaine) q.getResultList().get(0)).getNumero();*/
		sessionFactory.getCurrentSession()
		.createQuery("FROM Semaine AS s WHERE d BETWEEN :s.debut AND :s.fin ")
		.setParameter("d", date)
		.list();
		System.out.println(sessionFactory.getCurrentSession()
				.createQuery("FROM Semaine AS s WHERE d BETWEEN :s.debut AND :s.fin ")
				.setParameter("d", date)
				.list().get(0));
		//return numSemaine;
		
		} catch (Exception e) {
			System.out.println("sql error");
		}
		return 0;
	}

	@Override
	public void deleteRecetteJournee(Long id, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : deleteRecetteJournee --START");
		}
		
		RecetteJournee rj = em.find(RecetteJournee.class, id);
		if (rj==null) throw new RuntimeException("recette journée introuvable"); 
				em.remove(rj);
		LOGGER.debug("Dao : deleteRecetteJournee --END");
		
	}

	@Override
	public void deleteVenteJournee(Long id, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : deleteRecetteJournee --START");
		}
		
		RecetteJournee rj = em.find(RecetteJournee.class, id);
		if (rj==null) throw new RuntimeException("recette journée introuvable"); 
				em.remove(rj);
		LOGGER.debug("Dao : deleteRecetteJournee --END");
		
	}

	@Override
	public void deleteChargeJournee(Long id, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : deleteChargeJournee --START");
		}
		
		ChargeJournee rj = em.find(ChargeJournee.class, id);
		if (rj==null) throw new RuntimeException("Charge journée introuvable"); 
				em.remove(rj);
		LOGGER.debug("Dao : deleteChargeJournee --END");
		
	}

	@Override
	public void deleteAutrescharges(Long id, Date date) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Dao : deleteAutrescharges --START");
		}
		
		AutresCharges rj = em.find(AutresCharges.class, id);
		if (rj==null) throw new RuntimeException("AutresCharges introuvable"); 
				em.remove(rj);
		LOGGER.debug("Dao : deleteAutrescharges --END");
		
	}
	
}
