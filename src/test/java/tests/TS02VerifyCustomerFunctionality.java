package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BankManagerCustomerPage;
import pages.CustomerLoginPage;
import pages.TransactionPage;
import pages.UserIdentifierPage;
import testUtilities.BaseClass;
import testUtilities.CommonMethods;

public class TS02VerifyCustomerFunctionality {
	
	BaseClass base;
	UserIdentifierPage userIdentifierPage;
	CustomerLoginPage customerPage;
	TransactionPage transactionPage;
	CommonMethods methods;
	BankManagerCustomerPage BMcustomerPage;
	
	@BeforeClass
	public void setup() {
		base = new BaseClass();
		base.openbrowser("Chrome", "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		userIdentifierPage = new UserIdentifierPage();
		customerPage = new CustomerLoginPage();
		transactionPage = new TransactionPage();
		methods = new CommonMethods();
		BMcustomerPage = new BankManagerCustomerPage();
	}
	
	@AfterClass
	public void teardown() {
		base.closeBrowser();
	}
	
	@Test
	public void verifyAddCustomer() {
		userIdentifierPage.clickOnIdentifierButton("Bank Manager");
		methods.clickOnButton(BMcustomerPage.getAddCustuomer());
		BMcustomerPage.addCustomerDetails("Ross", "Gellar", "N2P3Y6");
		methods.clickOnButton(BMcustomerPage.SaveCustuomerdetails());
		Assert.assertEquals(methods.getAlertMessage(), "Customer added successfully with customer id :6");
		methods.acceptAlert();
	}

}
