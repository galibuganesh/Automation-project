package chrometest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Verifyingrightclickmethod {
	WebDriver driver = new ChromeDriver();
	
	
	 @BeforeMethod
	  public void VerifyingrightclickmethodbeforeMethod()  {
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		  driver.manage().window().maximize();
 
  }
	 @Test
	  public void Verifyingrightclickmethodf() {
		 Actions actions1 = new Actions(driver);
		actions1.contextClick( driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).perform();
driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
		  Alert alert = driver.switchTo().alert();
				  System.out.println(alert.getText());
				  alert.accept();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.close();
  }

}
