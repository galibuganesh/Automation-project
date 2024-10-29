package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ActionClass {
	
	WebDriver driver;
	private WebElement ele;
	
	
  @Test
  public void testAccountField() {
	WebElement  ele = driver.findElement(By.xpath("(//*[@class=\"header-wrapper\"])[3]"));
 Actions action = new Actions(driver);
 action.scrollToElement(ele).clickAndHold().build().perform();
 
 WebElement eleLogin = driver.findElement(By.xpath("//span[normalize-space()='Browser"));
 eleLogin.click();
 String title = driver.getTitle();
 System.out.println("page title" + title);
  
  
  
  }
  @BeforeMethod
  public void openBrowser() {
	  driver = new ChromeDriver();
	  driver.get("https://demoga.com/interaction");
  }

  @AfterMethod
  public void closeBrowser() throws InterruptedException {
	 Thread.sleep(5000);
  }

}
