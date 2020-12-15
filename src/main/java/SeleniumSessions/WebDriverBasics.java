package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		 //automation steps from line 11 - 15....when we add on it 17-23(verification pt) all are called automation testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eyoba\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // (1)open browser

		driver.get("http://www.google.com"); // (2)launch the url
		//chrome on WINDOWS (fca6c9c4d79cf28e22e705ae8c97d2f1)
		String title = driver.getTitle();
		System.out.println("Page title is :"+title);   //(3) get the page title
		//chrome on WINDOWS (fca6c9c4d79cf28e22e705ae8c97d2f1)
		// check point(Verification point)
		if(title.equals("Google")){
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect Title");
		}
	
	// get the current url
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("google")) {
			System.out.println("url is correct");
		}
	// get the page source  ... though not that much necessary
	//	System.out.println(driver.getPageSource());

	driver.quit();  // to close the browser.... once done
	//driver.close(); // also to close but they differ
	
	
	}

}
