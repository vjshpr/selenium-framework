package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By username = By.name("username");
	private By password = By.id("password");
	private By loginbtn = By.className("btn");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}

}
