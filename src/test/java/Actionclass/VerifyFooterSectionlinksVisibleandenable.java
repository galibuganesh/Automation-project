package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class VerifyFooterSectionlinksVisibleandenable {
	  
	ChromeDriver driver = new ChromeDriver();
	
	
	
  @Test
  public void VerifyFooterSectionlinksVisibleandenable1 () {
	  WebDriver driver;
     
  }
  @BeforeMethod
  public void VerifyFooterSectionlinksVisibleandenable2() {
	  driver.get("https://www.globalsqa.com/samplepagetest/");
	WebElement footer = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div[1]"));
List<WebElement> links = footer.findElements(By.tagName("h3"));
		int count = links.size();
	  System.out.println("THE NUMBER OF LINKS IN THE FOOTER SECTION " +count);

  }

  @AfterMethod
  public void afterMethod () throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
