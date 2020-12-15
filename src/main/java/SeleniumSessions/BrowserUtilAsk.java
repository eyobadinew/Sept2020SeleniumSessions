package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilAsk {
	WebDriver driver;
	
	public WebDriver initialize_browser(String browserName) {
		
		if(browserName.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();}
		else if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {System.out.println("the browser is"+browserName);}
		return driver;
		
	}	
	
	public void getUrl(String url) {
		driver.get(url);
	}
    public void navigateToUrl(String url) {
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



