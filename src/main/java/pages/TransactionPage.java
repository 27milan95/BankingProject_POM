package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testUtilities.BaseClass;

public class TransactionPage extends BaseClass{
	
	@FindBy(xpath="//button[@ng-click='deposit()']")
	WebElement Deposit;
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	WebElement Withdrawl;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement EnterAmount;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//span[@class=\"error ng-binding\"]")
	WebElement DepositMessage;
	
	@FindBy(xpath="//div[@ng-hide='noAccount']/strong[2]")
	WebElement Balance;
	
	public TransactionPage() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void depositMoney(String number){
		Deposit.click();
		EnterAmount.sendKeys(number);
		SubmitButton.click();
	}
	
	public void withdrawlMoney() {
		Withdrawl.click();
		EnterAmount.sendKeys("100");
		SubmitButton.click();
	}
	
	public String getDepositMessage() {
		return DepositMessage.getText();
	}
	
	public String getBalance() {
		return Balance.getText();
	}

}
