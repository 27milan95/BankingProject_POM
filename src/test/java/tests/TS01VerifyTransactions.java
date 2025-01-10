package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CustomerLoginPage;
import pages.TransactionPage;
import pages.UserIdentifierPage;
import reRun.ReRunFailedCases;
import testUtilities.BaseClass;
import testUtilities.CommonMethods;

public class TS01VerifyTransactions {
	BaseClass base;
	UserIdentifierPage userIdentifierPage;
	CustomerLoginPage customerPage;
	TransactionPage transactionPage;
	CommonMethods methods;
	
	@BeforeClass
	public void setup() {
		base = new BaseClass();
		base.openbrowser("Chrome", "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		userIdentifierPage = new UserIdentifierPage();
		customerPage = new CustomerLoginPage();
		transactionPage = new TransactionPage();
		methods = new CommonMethods();
	}
	
	@AfterClass
	public void teardown() {
		base.closeBrowser();
	}
	
	@Test
	public void verifyDepositFunctionality() throws Throwable {
		userIdentifierPage.clickOnIdentifierButton("Customer");	
		customerPage.loginUserName("Neville Longbottom");	
		transactionPage.depositMoney(methods.convertToString(1000));	
		Assert.assertEquals(transactionPage.getDepositMessage(), "Deposit Successful");
		Assert.assertEquals(methods.convertToInteger(transactionPage.getBalance()),1000);
	}
	
	@Test
	public void verifyWithDrawlFunctionality() throws Throwable {
		transactionPage.withdrawlMoney(methods.convertToString(500));
		Assert.assertEquals(transactionPage.getTransactionMessage(), "Transaction successful");
		Assert.assertEquals(methods.convertToInteger(transactionPage.getBalance()), 500);
	}

}
