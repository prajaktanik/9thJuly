package neobaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base1 

{     protected WebDriver driver;
	public void lunchBrowser() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://neostox.com/");
		Reporter.log("Launching browser",true);
		Thread.sleep(1000);
	}

}
