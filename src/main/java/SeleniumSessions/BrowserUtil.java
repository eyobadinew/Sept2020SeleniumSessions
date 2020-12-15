package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;
	/**
	 * 
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initialize_driver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Microsoft Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("Opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {System.out.println("Print the browser name  "+browserName);}
	      return driver;
	}
     public void launchUrl(String url) {
    	 System.out.println("Url is :" +url);
    	 driver.get(url);
     }
     public void navigateToUrl(String url) {
    	 System.out.println("Url is"+url);
    	 driver.navigate().to(url);
     }
     public String getTitle(String title) {
    	return driver.getTitle();
     }
     public void quitBrowser() {
    	 driver.quit();
     }
     public void closeBrowser() {
    	 driver.close();
     }

}



