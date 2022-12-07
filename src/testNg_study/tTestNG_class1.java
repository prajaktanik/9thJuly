package testNg_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tTestNG_class1 {
  
  @Test 
  public void Flipkart()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//System.out.println("Hi flipkar is lunched");
	    Reporter.log("Hi flipkar is lunched ",true);
		driver.get("https://www.flipkart.com/");
	
	
	 
}
  
  @Test
  public void Google()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//System.out.println("Hi  is Google lunched");
		Reporter.log("Hi Google is lunched",true);
		driver.get("https://www.google.co.in/");
	
  
  
  
}
}