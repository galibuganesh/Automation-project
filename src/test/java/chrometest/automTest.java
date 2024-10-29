package chrometest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class automTest{
	public static WebDriver driver;

	@BeforeMethod
  
	  public void openBroser() {
			driver = new ChromeDriver();
			driver.get("https://www.globalsqa.com/samplepagetest/");
	}
			
			  @Test
			  public void testDropdownFieldByIndex() throws InterruptedException {
				  
				  driver.findElement(By.id("g2599-name")).sendKeys("ravan");
				  driver.findElement(By.id("g2599-email")).sendKeys("ragav@gmail.com");
				  driver.findElement(By.id("g2599-website")).sendKeys("ragav.google.com");
			    WebElement  element = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears'"));
			    
			    Select select = new Select(element);
			    select.selectByValue("3-5");
			    
			    
			    Thread.sleep(5000);
			    driver.findElement(By.id("contact-form-2599")).sendKeys("test common");
			    driver.findElement(By.className("pushbutton-wide")).click();
			    
			  
  }

  @AfterMethod
  public void afterTest() {
	  driver.close();
  }

}
