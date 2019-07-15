package org.labaraka.dev;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.Semaine;
import org.labaraka.dev.service.IService;
import org.labaraka.dev.utils.Utils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(MainClass.class);
		//Spring doit aller lire ce fichier applicationContext.xml pour faire l'injection des dependances
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		IService service = (IService) context.getBean("service");
		Utils util = new Utils();
		logger.debug("Fin du main!");
		logger.error("This is Error message");
		logger.info("Fin du main!");
		service.addRecetteJournee("autre", 0 , new Date(2019/01/01));
		service.findSemaineByDate(new Date(2019/02/01));
		//service.addSemaines("", 0, util.convertirUtilDateToSqlDate(new Date(01/01/2019)), util.convertirUtilDateToSqlDate(new Date(01/01/2019)));
		
		AutresCharges ac = null;
		//service.addAutrescharges(ac);
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int date = c.get(Calendar.MONTH);
		
		List<Semaine> ls = null;
		//ls.add(new Semaine(1, new Date(01/01/2019)));
		System.out.println(ls.size());
		
		Date today = new Date(2019,1,1);
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
		System.out.println(dayOfWeek);
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(date);
		

	}

}
