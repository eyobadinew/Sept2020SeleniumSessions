package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilOrange {
 WebDriver driver;
 
 public WebDriver initializeDriver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {System.out.println("The browser is" +browserName);}
		return driver;
 }
	public void launchUrl(String url) {
		System.out.println("the url is"+url);
		driver.get(url);
	}
	public void navigateTo(String url) {
		System.out.println("title is" +url);
		driver.navigate().to(url);
	}
		
	public String getTitle(String title) {
		System.out.println("the page title is" +title);
		return driver.getTitle();
		}
	public void closeBrowser() {
		driver.close();
	}
public void quitBrowser(){
	driver.quit();
}

}


