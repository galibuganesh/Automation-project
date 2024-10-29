package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class VerifyHeaderofWebsite {
	WebDriver driver = new  ChromeDriver();
  @Test
  public void VerifyHeader() {
  }
  @BeforeMethod
  public void VerifyHeaderofWebsite() {
	  driver.get("https://www.globalsqa.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]"));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Thread.sleep(5000);
	  driver.close();
  }

}
