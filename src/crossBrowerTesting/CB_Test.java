package crossBrowerTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB_Test {
  @Parameters("browsername")
  @Test
  public void lunchBrower(String bname)
  { 
	  WebDriver driver = null;
	
	if(bname.equals("chrome"))
	  {

	        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
	  }
	  else if (bname.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
			
		  driver=new FirefoxDriver();
			
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
  }
  
}
