package main;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement havour;
	@FindBy(xpath="//span[text()='Sign Out']")
	
	WebElement log;
	
	public void searching()
	{
		search.sendKeys("shoes"+Keys.ENTER);	
		
	}
	
	public void havour(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(havour).perform();
	}
	
	public void logout()
	{
		log.click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
