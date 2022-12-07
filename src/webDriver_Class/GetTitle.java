package webDriver_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{


		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://vctcpune.com/");
		 
		 System.out.println( driver.getTitle());
		 
		 String myTitle = driver.getTitle();
		 System.out.println("title of wepage "+myTitle);
		 
	}

}
