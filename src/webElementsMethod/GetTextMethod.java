package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String result = driver.findElement(By.xpath("//h1[contains(text(),'To Practice Page')]")).getText();
		System.out.println("text present is "+result);
		
		//WebElement myElement = driver.findElement(By.xpath("//h1[contains(text(),'To Practice Page')]"));
		
		//myElement.click();
		//myElement.getText();
	}

}
