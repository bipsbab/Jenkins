package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {
 
	 public WebDriver driver; 

	 
      @Parameters({"Browsers", "Urls"})
	  @BeforeClass
	public void Mbrowser (String Name_of_Browser, String url) throws InterruptedException {
	 if (Name_of_Browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\TestngoverallOwn\\drivers\\chromedriver.exe"); 

		driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 		
			}
			else if (Name_of_Browser.equalsIgnoreCase("Edge")){
		System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\TestngoverallOwn\\drivers\\msedgedriver.exe"); 
		driver= new EdgeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				}
			
			}
      
      
	  @AfterClass
	  public void Screenshotss() throws IOException {
			Date datetime = new Date(); 
			String converted= datetime.toString().replace(" ", "_").replace(":", "_"); 
			
			File screenshotsFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshotsFile, new File("U:\\eclipsework bipasha\\Eclipse work\\TestngoverallOwn\\Pictures\\Amazon"+ converted +"ss.jpeg"));
		
			//driver.close();
		}
	  
	  @Test
	  public void f() throws InterruptedException {
		  Mbrowser("Chrome", "https://www.facebook.com");
	  }
	  

	  
}
