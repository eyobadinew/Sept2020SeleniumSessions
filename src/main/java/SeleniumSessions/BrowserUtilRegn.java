package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilRegn {
            WebDriver driver;
    
     public WebDriver initializeBrowser(String browserName) {
    	 if(browserName.equals("chrome")) {
    		 WebDriverManager.chromedriver().setup();
    		 driver = new ChromeDriver();
    	 }
    	 else if(browserName.equals("Microsoft Edge")) {
    		 WebDriverManager.edgedriver().setup();
    		 driver = new EdgeDriver();
    	 }
    	 else {System.out.println("The title is"+browserName);}
            return driver;
     }   
       public void getUrl(String url) {
    	   System.out.println("The url is"+url);
    	   driver.get(url);
       }
      public void navigateToUrl(String url) {
    	  System.out.println("url ="+url);
    	  driver.navigate().to(url);
      }
      public String getTitle(String title) {
    	  System.out.println("The page title is"+title);
    	  return driver.getTitle();
      }      
      public void quitBrowser() {
    	  driver.quit();
      }      
          
      public void closeBrowser() {
    	  driver.close();
      }     
            
}
