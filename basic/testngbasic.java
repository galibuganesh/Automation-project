package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class testngbasic {
	WebDriver driver;
	
  @Test
  public void f() {
	  chromedriver = new chromedriver();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.globalsqa.com/samplepagetest/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	Thread.sleep(5000);
	driver.close();
  }

}
