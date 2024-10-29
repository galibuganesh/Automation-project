package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Verifyheader {
 ChromeDriver driver = new ChromeDriver();
  @Test
  public void Verifyheader() {
	  WebDriver driver;
	  
  }
  @BeforeMethod
  public void VerifyheaderbeforeMethod() {
	  
	 driver.get("https://www.globalsqa.com/");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]"));
	}
  
 @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
