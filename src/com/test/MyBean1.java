package com.test;

//import javax.faces.bean.ManagedBean;

public class MyBean1 {
	   public MyBean1() {
		      System.out.println("(stdout) MyBean1 started!");
		   }
			
		   public String getMessage() {
		      return "my-app started (JSF 2.1)!";
		   }
}
