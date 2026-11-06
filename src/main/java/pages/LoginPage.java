package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="btn")
	WebElement loginbtn;
	
	
	
	/*private By username = By.name("username");
	private By password = By.id("password");
	private By loginbtn = By.className("btn");*/
	
	public void login(String user, String pass) {
		type(username, user);
		type(password, pass);
		click(loginbtn);
	}

	public boolean isLoginSuccessful() {
		System.out.println("Answer is : " + driver.getCurrentUrl().contains("logged-in-successfully"));
	    return driver.getCurrentUrl().contains("logged-in-successfully"); 
	    // or check for a welcome message element
	}

}
