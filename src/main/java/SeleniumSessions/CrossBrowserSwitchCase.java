package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserSwitchCase {

	public static void main(String[] args) {
	WebDriver driver = null;
		String browser = "Microsoft Edge";
		switch(browser) {
		case "chrome":	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 System.out.println("chrome is launched");
		break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 System.out.println("FF is launched");
			 break;
		case "Microsoft Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("please print the right browser....");
		}
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		
		
		}

	}


