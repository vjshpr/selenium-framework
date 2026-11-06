package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//driver=DriverManager.getDriver(browser);
	}
	
	@AfterMethod
	public void teardown() {
		DriverManager.quitDriver();
	}

}
