package webDriver_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerOpen {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("");

		
	}

}
