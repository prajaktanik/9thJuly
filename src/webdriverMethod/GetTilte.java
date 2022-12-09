package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTilte {

	public static void main(String[] args) throws InterruptedException
	{
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		Thread.sleep(1000);
		String Title = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("title of webpage is "+Title);

	}

}
