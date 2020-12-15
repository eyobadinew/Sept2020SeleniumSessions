package SeleniumSessions;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		List<WebElement> googleList = driver.findElements(By.xpath("//ul/li[@class = 'sbct']"));
		//ul[@class='erkvQe']/li//div[@class ='sbl1']//span      naveens xpath for the above case
		System.out.println(googleList.size());
		
	for(WebElement e : googleList) {
			
		String text = e.getText();
			System.out.println(text);
			
			if(text.contains("api testing")) {
				e.click();
				break;
			}
		}
	

	
	}
	}
	  

