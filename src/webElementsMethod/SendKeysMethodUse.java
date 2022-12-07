package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeysMethodUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prajaktanikose22@gmail.com");
       
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("praju777");
	}

}
