package ss.AAAA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Edgetest {
	
	public static WebDriver driver;

  @BeforeMethod
  public void openBrowser() {
    driver = new EdgeDriver();
    driver.get("http://www.globalsqa.com/samplepagetest/");
  }
  
   @Test
	
   public void testSamplePage() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.id("g2599-name")).sendKeys("Arif Ahamad");
		driver.findElement(By.id("g2599-email")).sendKeys("test@yahoo.com");
		driver.findElement(By.id("g2599-website")).sendKeys("www.ghgd.com");
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys();
		 driver.findElement(By.id("pushbutton-wide")).click();
		 
	 
	driver.close();
  }
}
