package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();


		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		
		
		

	}

}
