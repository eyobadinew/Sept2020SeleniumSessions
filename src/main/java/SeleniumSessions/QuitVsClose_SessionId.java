package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose_SessionId {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eyoba\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // (1)open browser
		driver.get("http://www.google.com"); // (2)launch the url
		String title = driver.getTitle();
		System.out.println("Page title is :"+title);   //(3) get the page title
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
	
		driver.quit();
	 System.out.println(driver.getTitle());  // NoSuchSessionException:......tried to open after quitting the browser.
	}

}
