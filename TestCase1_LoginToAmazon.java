package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
import main.LoginPage;
import utility.BaseClass;
import utility.ListenerLogic;
import utility.RetryLogic;
@Listeners(ListenerLogic.class)
public class TestCase1_LoginToAmazon extends BaseClass {
	
	@Test
	public void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.user();
		lp.continueButton();
		lp.pwd();
		lp.signIn();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	

}
