package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

public class BasePage {
private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(WebElement element) {
		System.out.println("Clicking the Element: " + element);
		WaitUtils.waitForClickable(driver, element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	public void type(WebElement element, String text) {
		System.out.println("Entering the text in " + element);
		element.sendKeys(text);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	

}
