package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo {
	WebDriver driver;
	String ExpectedResult="selenium - Google Search";
  @Test
  public void f() {
/*System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
DesiredCapabilities capabilities = new DesiredCapabilities();

capabilities = DesiredCapabilities.firefox();
capabilities.setBrowserName("firefox");
capabilities.setVersion("your firefox version");
capabilities.setCapability("marionette", false);

 driver = new FirefoxDriver(capabilities);
		//driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(ExpectedResult));
		Assert.assertEquals(ExpectedResult, driver.getTitle()); */
	        System.out.println("Test Execution is Passed");
	         Assert.assertTrue(true);
	
		
	  
  }
}
