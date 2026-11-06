package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import driver.DriverManager;
import pages.LoginPage;
import utils.ConfigReader;

@Listeners(listeners.TestListener.class)
public class LoginTest extends BaseTest {

	
	@Test(retryAnalyzer = utils.RetryAnalyzer.class, dataProvider="loginData")
	public void loginTest(String username, String password, String browser) {
		
		driver = DriverManager.getDriver(browser);
		driver.get(ConfigReader.getProperty("loginTestUrl"));
		
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		Assert.assertTrue(lp.isLoginSuccessful(), "Login was not successful");

	}
	
	@DataProvider(name = "loginData")
	public Object[][] loginData(){
		return new Object[][] {
			{"student","Password123", "chrome"}
		};
	}
	
}

