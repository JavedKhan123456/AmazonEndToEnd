package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy(xpath="//input[@id='ap_email_login']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement cont;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin;
	public void user()
	{
		username.sendKeys("kjaved9892khan@gmail.com");
		
	}
	
	public void continueButton()
	{
		cont.click();
	}
	
	public void pwd()
	{
		password.sendKeys("CdacVita@20182019");
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signIn()
	{
		signin.click();
	}

}
