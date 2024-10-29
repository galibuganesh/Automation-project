package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class PageFactoryintestng {
	WebDriver driver = new ChromeDriver();
	
 @BeforeMethod
 public void FrameworkofPageFactorybeforeMethod() {
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 PageFactory.initElements(driver, this);
	 
  }
  @Test
	  public void FrameworkPageFactory() {
	  
	  @FindBy (className ="oxd-input oxd-input--active")WebElement username;
	  @FindBy(className = "oxd-input oxd-input--active")WebElement password;
		  
  }

  @AfterMethod
  public void afterMethod() {
  }

}