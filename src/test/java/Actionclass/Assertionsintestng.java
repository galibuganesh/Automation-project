package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class Assertionsintestng {
	 
	 WebDriver driver = new ChromeDriver();
	
	 
	 @BeforeMethod
	  public void beforeMethod() {
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in");
     
     
      
  }
	 @Test
	  public void verifyingtitle () {
		 driver.findElement(By.name("q")).sendKeys("https://opensource-demo.orangehrmlive.com/",Keys.ENTER);
	      String ExcpectedTitle = ("https://opensource-demo.orangehrmlive.com/-Google Search");
	      String ActualTitle = (driver.getTitle());
	      assertEquals(ActualTitle,ExcpectedTitle,"Title IS MISMATCHED");
		assertTrue(false);
		 
		  }

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.close();
  }

}

