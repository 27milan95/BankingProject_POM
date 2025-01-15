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
	private WebElement Deposit;
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	private WebElement Withdrawl;
	
	@FindBy(xpath="//button[@ng-click='transactions()']")
	private WebElement Transactions;
	
	@FindBy(xpath="//form[@ng-submit='deposit()']/div/input")
	private WebElement EnterDepositAmount;
	
	@FindBy(xpath="//form[@ng-submit='withdrawl()']/div/input")
	private WebElement EnterWithdrawlAmount;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//span[@class=\"error ng-binding\"]")
	private WebElement DepositMessage;
	
	@FindBy(xpath="//span[@class='error ng-binding']")
	private WebElement TransactionMessage;
	
	@FindBy(xpath="//div[@ng-hide='noAccount']/strong[2]")
	private WebElement Balance;
	
	@FindBy(xpath="//tr[@id='anchor0']/td[2]")
	private WebElement transactionAmount;
	
	@FindBy(xpath="//tr[@id='anchor0']/td[3]")
	private WebElement transactionType;
	
	@FindBy(xpath="//tbody")
	private WebElement table;
	
	@FindBy(xpath="//button[@ng-click=\"back()\"]")
	private WebElement BackButton;
	
	@FindBy(xpath="//button[@class='btn logout']")
	private WebElement LogoutButton;
	
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
