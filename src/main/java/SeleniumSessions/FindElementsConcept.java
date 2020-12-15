package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.amazon.com/");
     //to get total number of links
     List<WebElement> text_list = driver.findElements(By.tagName("a"));
     System.out.println(text_list.size());  // 392 links from amazon page
      // to print each text in the console...
    for(int i = 0; i<text_list.size();i++) {
    	String s = text_list.get(i).getText();
    	System.out.println(s);
     }
     // to ignore blank text lists
   for(int i = 0; i<text_list.size();i++) {
    	String s = text_list.get(i).getText();
     	if(! s.isEmpty()) {
     System.out.println(s);}
     }
     // to print all the lists with their index number
     for(int i = 0; i<text_list.size();i++) {
      	String s = text_list.get(i).getText();
      	if(! s.isEmpty()) {
      	System.out.println(i +"->"+s);}
      }
     
	}

}
