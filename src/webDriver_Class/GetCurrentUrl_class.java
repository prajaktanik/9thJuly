package webDriver_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_class {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://paytm.com/");
		 
		 driver.manage().window().maximize();		 
		 
		 String currentUrl = driver.getCurrentUrl();
            
		 System.out.println("my current Url is "+currentUrl);
		 
	}

}
