package ss.AAAA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autom {
	
	public static void main (String[] args) throws InterruptedException {
		
	System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\GANESH\\Downloads\\chromedriver_win32 (1)\"");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https;//testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.id("g2599-name")).sendKeys("Arif Ahamad");
		driver.findElement(By.id("g2599-email")).sendKeys("test@yahoo.com");
		driver.findElement(By.id("g2599-website")).sendKeys("www.ghgd.com");
	    driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys(args);
		 driver.findElement(By.id("pushbutton-wide")).click();
		 
		 
		driver.close();
		
		
		
	}

	}

	


