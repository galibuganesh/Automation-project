package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WindowsPopupHandling {
	ChromeDriver driver = new ChromeDriver();
  @Test
  public void PopupHandling() {
	  WebDriver driver ;
	  
	  
 }
  @BeforeMethod
  public void PopupHandlingbeforeMethod() {
	  
	  driver.get("https://www.globalsqa.com/samplepagetest/");
		
		 driver.manage().window().maximize();
		 driver.findElement(By.id("g2599-name")).sendKeys("Vinay");
			driver.findElement(By.id("g2599-email")).sendKeys("vinayselenium@gmail.com");
			driver.findElement(By.id("g2599-website")).sendKeys("www.vinaytettiselenium.com");
			driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("I LOVE U SOFTWARE");
			driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/button")).click();
		Alert alert = driver.switchTo().alert();
	  alert.accept();
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
