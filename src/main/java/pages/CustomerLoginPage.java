package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testUtilities.BaseClass;

public class CustomerLoginPage extends BaseClass{
	
//	@FindBy(id="userSelect")
//	WebElement userNameDropDown;
//	
//	@FindBy(xpath = "//button[normalize-space()='Login']")
//	WebElement loginButton;
	
	private By userNameDropDown = By.id("userSelect");
	private By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	public CustomerLoginPage() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getuserNameDropDown() {
		return driver.findElement(userNameDropDown);
	}
	
	public WebElement getloginButton() {
		return driver.findElement(loginButton);
	}
	
	public void loginUserName(String UserName) {
		//WebElement userNameDropDown = driver.findElement(userNameDropDown);
		Select select = new Select(getuserNameDropDown());
		select.selectByVisibleText(UserName);
		
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		getloginButton().click();
	}
}
