package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AskTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtilAsk browser = new BrowserUtilAsk();
		WebDriver driver = browser.initialize_browser("Firefox");
		
		browser.getUrl("http://ask-stage.portnov.com/#/login");
		Thread.sleep(2000);
		
		By Email = By.id("mat-input-0");
		By Password = By.id("mat-input-1");
		
		ElementUtilAsk test = new ElementUtilAsk(driver);
		test.doSendKeys(Email,"qa.sofi@gmail.com");
		test.doSendKeys(Password,"12345");
	
		browser.closeBrowser();
	}

}
