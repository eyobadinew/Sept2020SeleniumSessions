package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserIfElse {
 // static WebDriver driver;       // Global variable or initialized local variable line no. 14
	public static void main(String[] args) {
		WebDriver driver = null; // initialize with default value i.e null or use line number 12
		String browser = "chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if (browser.equals("safari")) {
		     driver = new SafariDriver();
		}
		else if (browser.equals("Microsoft Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {System.out.println("please print the right browser....");
		}
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
				
		driver.quit();
		
	}

	
	
}
