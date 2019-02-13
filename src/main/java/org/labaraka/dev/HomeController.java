package org.labaraka.dev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.labaraka.dev.entities.AutresCharges;
import org.labaraka.dev.entities.RecetteJournee;
import org.labaraka.dev.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	IService service = (IService) context.getBean("service");
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws ParseException 
	 */
	
	@RequestMapping(value = "/")			
	public String home(Locale locale, Model model,
			@RequestParam(value="page",defaultValue="0") int p,
			@RequestParam(value="size",defaultValue="5") int s) throws ParseException {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("", new Date(2019/02/01));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date parsed = format.parse("2019/02/01");
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        System.out.println(sql);
        AutresCharges ac = new AutresCharges();
        ac.setCharge(100);
        System.out.println(ac.getCharge());
		long numSemaine = service.findSemaineByDate(sql);		
		model.addAttribute("num", sql );
		//System.out.println(numSemaine);
      //model.addAttribute("num", ac.getCharge() );
		RecetteJournee rj;
		
		
		return "home";
	}
	
}
