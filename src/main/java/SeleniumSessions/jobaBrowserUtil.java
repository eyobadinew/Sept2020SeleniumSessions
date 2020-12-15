package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class jobaBrowserUtil {
	WebDriver driver;
	public WebDriver initialize_browser(String browserName) {
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
		else {System.out.println("The browser name is"+browserName);
		}
	   return driver;
	}
	   public void getUrl(String url) {
		  System.out.println("The url is"+url); 
		   driver.get(url);
	   }
	   public String getTitle(String title) {
		 System.out.println("The tiltle is"+title); 
			  return driver.getTitle();
		   }
	   public String getCurrentUrl(String url) {
		   System.out.println("Current url is" +url);
		   return driver.getCurrentUrl();
	   }
       public void closeBrowser() {
    	   driver.close();
       }

}

