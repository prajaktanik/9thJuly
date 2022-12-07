package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3rdClass {

	public static void main(String[] args) 
	 {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		 WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.instagram.com/");
		  driver.findElement(By.xpath("//button[@type='button']")).click();
	 }
		

	}


