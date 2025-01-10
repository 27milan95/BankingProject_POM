package testUtilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass{
	
	public CommonMethods() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void waitForElement(int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public int convertToInteger(String str) {
		return Integer.parseInt(str);
	}
	
	public String convertToString(int value) {
		return String.valueOf(value);
	}
	
	public void clickOnButton(WebElement element) {
		element.click();
	}
	
	public String getAlertMessage() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
