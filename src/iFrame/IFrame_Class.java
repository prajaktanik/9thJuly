package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Class {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");//we are swtiching focus on main page to sub page 
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		
	}

}
