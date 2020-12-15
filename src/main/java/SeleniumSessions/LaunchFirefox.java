package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdrive.gecko.driver", "C:\\Users\\eyoba\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	    System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
