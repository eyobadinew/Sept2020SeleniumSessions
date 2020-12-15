package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());  // to print outcome in console
        driver.navigate().to("http://www.amazon.com");
        System.out.println(driver.getTitle()); // to print outcome in console
        driver.navigate().back();
        System.out.println(driver.getTitle()); // to print outcome in console
        driver.navigate().forward();
        System.out.println(driver.getTitle());      // to print outcome in console 
	
	    driver.navigate().refresh();
	
	}

}
