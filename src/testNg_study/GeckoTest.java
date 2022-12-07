package testNg_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GeckoTest {
  @Test
  public void FirefoxTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//System.out.println("Hi flipkar is lunched");
	    Reporter.log("Hi flipkar is lunched ",true);
		driver.get("https://www.facebook.com/");
	
  }
}
