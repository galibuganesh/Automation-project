package chrometest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.testng.annotations.AfterMethod;


public class Verifyingkeyboardevents {
	  WebDriver driver = new ChromeDriver();
	  
	  @BeforeMethod
	  public void VerifyingbeforeMethod() {
		  
		  driver.get("https://www.globalsqa.com/samplepagetest/");
		  
		  driver.manage().window().maximize();
 
	  }
 @Test
 
 public void  Verifying() {
	  
	  Actions actions = new Actions(driver);
	  
	  driver.findElement(By.id("g2599-name")).sendKeys("gannu");
	  actions.doubleClick().perform();
	  }

@AfterMethod
  public void afterMethod() {
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.close();
  }

}
