package org.labaraka.dev.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;

public class Utils {
	private Logger logger;
	
	
			public Utils() {
		super();
	}
			


			public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public String getNow() {
		return now;
	}


			protected final String now = new SimpleDateFormat("dd/MM/yyyy",
	        Locale.FRANCE).format(new Date());
	
	
			public final java.sql.Date convertirUtilDateToSqlDate(final java.util.Date date) {
				if (date != null) {
					return new java.sql.Date(date.getTime());
				} else {
					return null;
				}
			}

}
