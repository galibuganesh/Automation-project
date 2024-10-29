package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerifyingTitlewithAsserts {
	ChromeDriver driver  = new ChromeDriver();

	
  @Test
  public void VerifyingTitle() {
	  WebDriver driver;
	  
	
  }
  @BeforeMethod
  public void Asserts() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title = driver.getTitle();
		System.out.println("page tittle " + title);
		Assert.assertTrue(title.contains("OrangeHRM"));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
