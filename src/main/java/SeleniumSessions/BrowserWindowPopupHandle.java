package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		System.out.println("Parent window id is"+parentWindowId);

		
		driver.switchTo().window(childWindowId);
		System.out.println("child window id is"+childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
	    driver.switchTo().window(parentWindowId);
	    System.out.println(driver.getTitle());
	    driver.quit();
      }

}
