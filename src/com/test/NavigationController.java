package com.test;

import java.io.Serializable;

public class NavigationController implements Serializable {

	public NavigationController() {
		      System.out.println("(stdout) NavigationController started!");
		   }
	
	   public String moveToPage1() {
		   	  // generate log1 input
		      System.out.println("(stdout) NavigationController moveToPage1 called!");
		      return "page1";
		   }

	   public String moveToPage2() {
		   	  // generate log2 input
		      System.out.println("(stdout) NavigationController moveToPage2 called!");
		      return "page2";
		   }
}
