package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Test
public class VerifyallaccountOptionsVisible {
	ChromeDriver driver = new ChromeDriver();
	
  public void f() {
  WebDriver driver;
  
  }
  
  @BeforeMethod
  public void VerifyingInbeforeMethod() {
 driver.get("https://www.globalsqa.com/samplepagetest/");

   driver.manage().window().maximize();
	  
	  driver.findElement(By.id("g2599-name")).sendKeys("gani");
	  driver.findElement(By.id("g2599-email")).sendKeys("ganeshgani@gmail.com");
	  driver.findElement(By.id("g2599-website")).sendKeys("ganeshgoogle.com");

	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"g2599-experienceinyears\"]"));
Select select = new Select(ele);
select.selectByValue("3-5");
{
WebElement radio = driver.findElement(By.className("grunion-field-label"));
boolean rad = radio.isEnabled();
Assert.assertTrue(rad);
boolean rad1 = radio.isDisplayed();
Assert.assertTrue(rad1);
boolean rad3 = radio.isSelected();
	
	
	WebElement  ele1 = driver.findElement(By.className("grunion-field-label"));
	boolean radio2 = ele1.isDisplayed();
	Assert.assertTrue(radio2);
			boolean radio3 = ele1.isEnabled();
			Assert.assertTrue(radio3);
			boolean rad4 = ele1.isSelected();
}
      Assert.assertTrue(ele.isDisplayed(), "dropdownelement is not displayed");
	  Assert.assertTrue(ele.isEnabled(),"dropdownelement is not enabled" );
	  
	  driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("test comment");
	  
	  driver.findElement(By.className("pushbutton-wide")).click();
	  
  }	  
	  
	  @AfterMethod
  public void  closeMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}

