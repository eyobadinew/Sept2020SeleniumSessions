package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();   // Browser
		driver.get("http://www.londonfreelance.org/courses/frames/index.htm"); // page
		//String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		//System.out.println(text);      .. this results in no such elt exception and we must switch the driver to 
		// the frame and catch data
				driver.switchTo().frame("main"); 
			// or   	driver.switchTo().frame(driver.findElement(By.name("main")));

				String header = driver.findElement(By.xpath("/html/body/h2")).getText();
				System.out.println(header);
				// the driver is still in the frame hence turn it back to the main page via
				driver.switchTo().defaultContent();


	}

}
