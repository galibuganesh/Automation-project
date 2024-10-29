package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropdownHandling {
	ChromeDriver driver = new ChromeDriver();
  @Test
  public void DropdownHandlingf() {
	  WebDriver driver;
  }
  @BeforeMethod
  public void DropdownHandlingbeforeMethod() {
	  driver.get("https://www.globalsqa.com/samplepagetest/");
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"g2599-experienceinyears\"]")));  
	  for (WebElement element: dropdown.getOptions()) { 
		 System.out.println( element.getText());
	  }
 
  
  }

  @AfterMethod
  
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
