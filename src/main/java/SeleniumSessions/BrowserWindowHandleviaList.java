package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleviaList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handles = driver.getWindowHandles();
		// here starts the difference ..we store such non ordered Set list in List and get specific index
		List<String> handleList = new ArrayList<String>(handles);
		String parentWindowId = handleList.get(0);
		String childWindowId = handleList.get(1);
		// the difference ends here....// interview potential candidate
        System.out.println("The parent window is"+parentWindowId);
        driver.switchTo().window(childWindowId);
        System.out.println(driver.getTitle());
        driver.close();
        
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
        driver.quit();;
	}

}
