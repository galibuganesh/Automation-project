package Actionclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.annotations.AfterMethod;

public class Uploadingfile {
	ChromeDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  WebDriver driver;
  }
  @BeforeMethod
  public void UploadingfilebeforeMethod() {
	  
	  driver.get("https://demoqa.com/upload-download");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\GANESH\\Documents\\Datatypes.java");
	 		
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
	  
  }

}
