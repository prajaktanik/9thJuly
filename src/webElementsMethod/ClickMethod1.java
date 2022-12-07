package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod1 {

	public static void main(String[] args) throws InterruptedException 
	{

	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice ')]")).click();
		
		 
		Thread.sleep(2000);
	 //driver.close();
		driver.quit();
		
		
		
		
	}

}
