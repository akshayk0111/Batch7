package com.LoginPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginClass {
	
	WebDriver driver;
	


	public LoginClass(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how=How.XPATH, using="//input[@id='email']")
	private WebElement EmailId;
	
	@FindBy(how=How.XPATH, using="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	private WebElement Loginbtn;
	
	
	
	
	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	
	
	
	

}
