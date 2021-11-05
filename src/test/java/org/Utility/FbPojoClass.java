package org.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojoClass extends BaseClass {
	
	public FbPojoClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	
	private WebElement userTxt; 
	
	@FindBy(id="pass")
	
	private WebElement userPass; 
		
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;

	public WebElement getUserTxt() {
		return userTxt;
	}

	public WebElement getUserPass() {
		return userPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	} 
		
	
	
	
	
	
	
	

	}
	


