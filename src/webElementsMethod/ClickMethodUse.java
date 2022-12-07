package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
    WebDriver driver=new ChromeDriver();

    driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	

	//driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	//Thread.sleep(500);
	//driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	
	
	//driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
	//Thread.sleep(500);
	
	driver.findElement(By.id("checkBoxOption1")).click();
	
	Thread.sleep(500);
	driver.findElement(By.name("checkBoxOption3")).click();
	}

	}
