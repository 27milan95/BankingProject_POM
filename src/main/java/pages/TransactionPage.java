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
	
	@FindBy(xpath="//button[@ng-click='transactions()']")
	WebElement Transactions;
	
	@FindBy(xpath="//form[@ng-submit='deposit()']/div/input")
	WebElement EnterDepositAmount;
	
	@FindBy(xpath="//form[@ng-submit='withdrawl()']/div/input")
	WebElement EnterWithdrawlAmount;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//span[@class=\"error ng-binding\"]")
	WebElement DepositMessage;
	
	@FindBy(xpath="//span[@class='error ng-binding']")
	WebElement TransactionMessage;
	
	@FindBy(xpath="//div[@ng-hide='noAccount']/strong[2]")
	WebElement Balance;
	
	@FindBy(xpath="//tr[@id='anchor0']/td[2]")
	WebElement transactionAmount;
	
	@FindBy(xpath="//tr[@id='anchor0']/td[3]")
	WebElement transactionType;
	
	@FindBy(xpath="//tbody")
	WebElement table;
	
	@FindBy(xpath="//button[@ng-click=\"back()\"]")
	WebElement BackButton;
	
	@FindBy(xpath="//button[@class='btn logout']")
	WebElement LogoutButton;
	
	public TransactionPage() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void depositMoney(String number){
		Deposit.click();
		EnterDepositAmount.sendKeys(number);
		SubmitButton.click();
	}
	
	public void withdrawlMoney(String number) {
		Withdrawl.click();
		EnterWithdrawlAmount.sendKeys(number);
		SubmitButton.click();
	}
	
	public void transactionDetails() {
		Transactions.click();
		BackButton.click();
		Transactions.click();
	}
	
	public void logout() {
	LogoutButton.click();
	}
	public String getDepositMessage() {
		return DepositMessage.getText();
	}
	
	public String getTransactionMessage() {
		return TransactionMessage.getText();
	}
	
	public String getBalance() {
		return Balance.getText();
	}
	
	public String getTransactionAmount() {
		return transactionAmount.getText();
	}
	
	public String getTransactiontype() {
		return transactionType.getText();
	}
	
	public WebElement getTableElement() {
		return table;
	}

}
