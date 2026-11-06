package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorUtils {
	
	
	public static void windowScrollTo(WebDriver driver, int xAxis, int yAxis) {
		if (driver instanceof JavascriptExecutor) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollTo("+xAxis+","+yAxis+")");
		}
	}
}
