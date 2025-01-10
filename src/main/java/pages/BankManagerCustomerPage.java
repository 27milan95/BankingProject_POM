package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtilities.BaseClass;
import testUtilities.CommonMethods;

public class BankManagerCustomerPage extends BaseClass{
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	private WebElement AddCustomerButton;
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	private WebElement OpenAccountButton;
	
	@FindBy(xpath="//button[@ng-click='showCust()']")
	private WebElement CustomersButton;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	private WebElement FirstnameTab;

	@FindBy(xpath="//input[@ng-model='lName']")
	private WebElement LastnameTab;
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	private WebElement PostalCodeTab;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement SaveCustomerdetailsbutton;
	
	
	public BankManagerCustomerPage() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddCustuomer() {
		return AddCustomerButton;
	}
	
	public WebElement SaveCustuomerdetails() {
		return SaveCustomerdetailsbutton;
	}
	
	public void addCustomerDetails(String firstname, String lastname, String postalcode) {
		FirstnameTab.sendKeys(firstname);
		LastnameTab.sendKeys(lastname);
		PostalCodeTab.sendKeys(postalcode);
	}
	
	
	
	
	

}
