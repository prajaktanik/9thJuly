package webDriver_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//5. navigate: this method is use to open an application, move forward, backward & refresh the 
//webpage.

public class NavigateMethod_Use {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

	 WebDriver driver=new ChromeDriver();
	 
	 driver.navigate().to("https://www.youtube.com/");
	
	 Thread.sleep(1000);
     driver.navigate().to("https://www.whatsapp.com/");
     
     Thread.sleep(1000);
     driver.navigate().back();
     
     Thread.sleep(1000);
     driver.navigate().forward();
     
     Thread.sleep(500);
     driver.navigate().refresh();
     
	}

}









