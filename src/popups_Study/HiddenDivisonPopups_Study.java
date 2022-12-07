package popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisonPopups_Study {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
