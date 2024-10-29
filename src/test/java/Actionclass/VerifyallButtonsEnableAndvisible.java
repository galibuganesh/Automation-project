package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.annotations.AfterMethod;

public class VerifyallButtonsEnableAndvisible {
	  ChromeDriver driver = new ChromeDriver();
	  
  @Test
  public void VerifyingButtons () {
	  WebDriver driver;
  }
  @BeforeMethod
  public void VerifyallButtonsEnableAndvisiblebeforeMethod() {
	  driver.get("https://phptravels.com/demo");
	  boolean enable =   driver.findElement(By.xpath("//*[@id=\"loginSignup\"]/li[2]")).isEnabled();
	boolean displayed = driver.findElement(By.xpath("//*[@id=\"loginSignup\"]/li[2]")).isDisplayed();
	
	
	  if (enable) {
	System.out.println("isEnabled ");
	  }else {
		  System.out.println("is notEnable");
	  }
		  
		  if (displayed) {
			  System.out.println("isDisplayed ");
		  }else {
			  System.out.println("is notDisplayed ");
			  
		
		  }
			  
  }

  @AfterMethod
  public void Closepage() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
