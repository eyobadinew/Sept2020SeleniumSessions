package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtilOrange browser = new BrowserUtilOrange();
		WebDriver driver = browser.initializeDriver("firefox");
		browser.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		
		By First_Name = By.id("Form_submitForm_FirstName");
		By Last_Name = By.id("Form_submitForm_LastName");
		By Email = By.id("Form_submitForm_Email");
		By Job_title = By.id("Form_submitForm_JobTitle");
		By company = By.id("Form_submitForm_CompanyName");
		By Phone_number = By.id("Form_submitForm_Contact");
		By Submit = By.id("Form_submitForm_action_request");
		ElementUtilOrange eli = new ElementUtilOrange(driver);
		eli.doSendKeys(First_Name, "Eboy");
		eli.doSendKeys(Last_Name, "Adinew");
		eli.doSendKeys(Email, "abcd@gmail.com");
		eli.doSendKeys(Job_title,"Automation Tester");
		eli.doSendKeys(company, "WinWin");
		eli.doSendKeys(Phone_number, "+415623890");
		eli.doClick(Submit);
	
		
	
	    browser.quitBrowser();
	
	}

}
