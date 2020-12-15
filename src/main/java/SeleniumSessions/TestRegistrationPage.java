package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtilRegn browser = new BrowserUtilRegn();
		WebDriver driver = browser.initializeBrowser("chrome");
		driver.get("http://ask-stage.portnov.com/#/registration");
        Thread.sleep(2000);
        
        By First_Name = By.id("mat-input-10");
        By Last_Name = By.id("mat-input-11");
        By Email = By.id("mat-input-12");
        By Group_Code = By.id("mat-input-13");
        By Password = By.id("mat-input-14");
        By Confirm_Password = By.id("mat-input-15");
        
        ElementUtilRegn test = new ElementUtilRegn(driver);
        test.doSendKeys(First_Name, "Job");
        test.doSendKeys(Last_Name, "Save him");
        test.doSendKeys(Email, "abcd@gmail.com");
        test.doSendKeys(Group_Code, "123456");
        test.doSendKeys(Password, "@12345");
        test.doSendKeys(Confirm_Password ,"@12345");
        
        Thread.sleep(3000);
        browser.closeBrowser();
        
   
	}

}
