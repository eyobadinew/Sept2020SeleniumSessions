package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver =browser.initialize_driver("chrome");
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        browser.launchUrl("http://hubspot.com/login");
        
        Thread.sleep(6000);
        
        By email = By.id("username");
        By Password = By.id("password");
        By Login = By.id("loginBtn");
        
        ElementUtil test = new ElementUtil(driver);
        test.doSendKeys(email, "test@1234");
        test.doSendKeys(Password, "12345");
        test.doClick(Login);
        
       // String s = driver.findElement(By.linkText("Sign up")).getText();
    	//System.out.println(s);
        
        browser.closeBrowser();
        
        
	}

}
