package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import driver.DriverManager;
import utils.ConfigReader;

public class DriverTest extends BaseTest {
	
	@Test
	public void launchBrowser() {
		driver = DriverManager.getDriver("chrome");
		driver.get(ConfigReader.getProperty("googleUrl"));
		Assert.assertTrue(driver.getCurrentUrl().contains("google"), "Not launched");
		//Adding a new line

		
	}

}
