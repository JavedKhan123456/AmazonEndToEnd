package test;

import org.testng.annotations.Test;

import main.HomePage;
import main.LoginPage;
import utility.BaseClass;

public class TestCase2_LoginToAmazonSearchProduct extends BaseClass {
	@Test(priority=2)
	public void search()
	{
	LoginPage lp=new LoginPage(driver);
	lp.user();
	lp.continueButton();
	lp.pwd();
	lp.signIn();
	
	HomePage hp=new HomePage(driver);
	hp.searching();

}
}