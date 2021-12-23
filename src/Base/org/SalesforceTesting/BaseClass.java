package Base.org.SalesforceTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeMethod
public void basemethod()

{
	System.setProperty ("webdriver.chrome.driver", "../Salesforce automation/chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://d5g000004gz7qeaa-dev-ed.my.salesforce.com/") ;
	}
}



