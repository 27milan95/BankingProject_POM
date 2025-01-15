package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtilities.BaseClass;

public class UserIdentifierPage extends BaseClass {
	@FindBy(xpath="//button[text()='Customer Login']")
	private WebElement customerLoginButton;
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement BankManagerLoginButton;
	
	public UserIdentifierPage() {
		super();
		PageFactory.initElements(driver,this);
	}
	public void clickOnIdentifierButton(String User) {
		if(User.equals("Customer")) {
			customerLoginButton.click();
		} else if(User.equals("Bank Manager")) {
			BankManagerLoginButton.click();
		}
		
	}

}
