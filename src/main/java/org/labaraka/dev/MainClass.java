package org.labaraka.dev;

import java.sql.Date;
import java.util.Calendar;

import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.ListSemaines;
import org.labaraka.dev.service.IService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//Spring doit aller lire ce fichier applicationContext.xml pour faire l'injection des dependances
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		IService service = (IService) context.getBean("service");
		service.addRecetteJournee("autre", 0 , new Date(2019/01/01));
		
		/*AutresCharges ac = null;
		//service.addAutrescharges(ac);
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int date = c.get(Calendar.MONTH);
		
		ListSemaines ls = new ListSemaines();
		ls.getList().add(1, new Date(01/01/2019));
		System.out.println(ls.getList().size());
		
		Date today = new Date(2019,1,1);
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
		System.out.println(dayOfWeek);
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(date);*/
		

	}

}
