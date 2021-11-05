package org.stepdefinition;

import org.Utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{
	
	
	@Before
	public void beforescenario() {
	System.out.println("scenario start");	
	launchChrome();
	launchurl("https://www.facebook.com/");
	winmax();
	}

	
	@After
	public void afterscenario() {
	

	}
}
