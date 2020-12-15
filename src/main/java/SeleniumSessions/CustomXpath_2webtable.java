package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_2webtable {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.livescore.com/en/soccer/england/premier-league/");
		   Thread.sleep(4000);
	/*	driver.findElement(By.xpath("//*[text()='Go to CRM']")).click();
		driver.navigate().to("https://cogmento.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Log In']")).click();
        */
      
    //    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("eyobabizuneh@gmail.com");
     //   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("%1Tsebayesenay");
    //    driver.findElement(By.xpath("//div[text()='Login']")).click();
        
        
	
	System.out.println(scoreSheet( "Liverpool"));
	System.out.println(scoreSheet("Everton"));
	System.out.println(scoreSheet("Manchester United"));
	System.out.println(scoreSheet("Manchester City"));
	System.out.println(scoreSheet("Chelsea"));
	System.out.println(scoreSheet("Fulham"));
	}
  
	
	
	public static List<String> scoreSheet(String teamName) {
	List<String> teamList = new ArrayList<String>();
		List<WebElement> scores = driver.findElements(By.xpath("(//*[text()='"+ teamName +"'])[3]//following-sibling::td"));
	 	System.out.println(scores.size());
	 for (WebElement e:scores) {
		 String text = e.getText();
		 teamList.add(text);
			 }
	 return teamList;
 }
}
