package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1st_SeleniumCode {

	public static void main(String[] args)
	{
	 
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

	 WebDriver driver=new ChromeDriver();
	
	  driver.get("https://in.bookmyshow.com/explore/movies");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
