package com.test;

//import javax.faces.bean.ManagedBean;
import org.apache.log4j.Logger;

public class MyBean1 {

	final static Logger logger = Logger.getLogger(MyBean1.class.getName());	


	   public MyBean1() {
		      System.out.println("(stdout) MyBean1 started!");
		      try {
		    	if(logger.isDebugEnabled()){
					logger.debug("This is debug : (log4j) MyBean1 started!");
				}
				
				if(logger.isInfoEnabled()){
					logger.info("This is info : (log4j) MyBean1 started!");
				}
				
				if(logger.isWarnEnabled()){
					logger.warn("This is warn : (log4j) MyBean1 started!");
				}
				if(logger.isErrorEnabled()){
					logger.error("This is error : (log4j) MyBean1 started!");
				}
				//if(logger.isFatalEnabled()){
				//	logger.fatal("This is fatal : (log4j) MyBean1 started!");		      
				//}
		      } catch (Exception e) {
		    	  e.printStackTrace();
		      }
		   }
			
		   public String getMessage() {
		      return "my-app started (JSF 2.1)!";
		   }
}
