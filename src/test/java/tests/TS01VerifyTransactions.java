package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CustomerLoginPage;
import pages.TransactionPage;
import pages.UserIdentifierPage;
import testUtilities.BaseClass;

public class TS01VerifyTransactions {
	BaseClass base;
	UserIdentifierPage userIdentifierPage;
	CustomerLoginPage customerPage;
	TransactionPage transactionPage;
	
	@BeforeMethod
	public void setup() {
		base = new BaseClass();
		base.openbrowser("Chrome", "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		userIdentifierPage = new UserIdentifierPage();
		customerPage = new CustomerLoginPage();
		transactionPage = new TransactionPage();
	}
	
	@AfterMethod
	public void teardown() {
		base.closeBrowser();
	}
	
	@Test
	public void verifyDepositFunctionality() throws Throwable {
		userIdentifierPage.clickOnIdentifierButton("Customer");	
		customerPage.loginUserName("Harry Potter");	
//		driver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
	
		transactionPage.depositMoney("100");	
		Assert.assertEquals(transactionPage.getDepositMessage(), "Deposit Successful");
		Assert.assertEquals(transactionPage.getBalance(), "100");

	}

}
