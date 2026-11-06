package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver(String browser) {
		
		if (driver.get() ==null) {
			if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
			}
			else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver.set(new EdgeDriver());
				}
			else if (browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver());
				}
			else {
				throw new RuntimeException("Invalid browser: " + browser );
			}
		}
		
		return driver.get();
		
		
	}
	
	public static void quitDriver() {
		if (driver.get() !=null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
