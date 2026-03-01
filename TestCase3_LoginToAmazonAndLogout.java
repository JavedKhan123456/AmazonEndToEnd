package test;

import org.testng.annotations.Test;

import main.HomePage;
import main.LoginPage;
import utility.BaseClass;

public class TestCase3_LoginToAmazonAndLogout extends BaseClass {
	
	@Test
	public void logout()
	{
		LoginPage lp=new LoginPage(driver);
		lp.user();
		lp.continueButton();
		lp.pwd();
		lp.signIn();
		HomePage hp=new HomePage(driver);
		hp.havour(driver);
		hp.logout();
	}

}
