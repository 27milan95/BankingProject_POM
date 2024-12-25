package testUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public static WebDriver driver;
	
	
	public void openbrowser(String BrowserName, String url) {
	 if(BrowserName.equals("Chrome")) {
		 driver = new ChromeDriver();
	 } else if(BrowserName.equals("Firefox")){
		 driver = new FirefoxDriver();
	 } else{
		 driver = new EdgeDriver();
	 }
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.get(url);
	}
	

	public void closeBrowser() {
		driver.close();
		}

}
