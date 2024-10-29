package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.annotations.AfterMethod;

public class Verifylinksinmenusection {
	ChromeDriver driver = new ChromeDriver();
			
	 @Test
  public void Verifylinks() {
		 WebDriver driver;
		
		    }
  @BeforeMethod
  public void VerifylinksinmenusectionbeforeMethod() {
	  driver.get("https://www.globalsqa.com/samplepagetest/");
			WebElement menu = driver.findElement(By.id("sidebar"));
		List<WebElement> links = menu.findElements(By.tagName("a"));
				int count = links.size();
			  System.out.println("THE NUMBER OF LINKS IN THE MENU " +count);


	
                              
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
		Thread.sleep(4000);
	  driver.close();
  }

}
