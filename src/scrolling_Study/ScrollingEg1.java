package scrolling_Study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
	

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();
	    
	    driver.get("https://paytm.com/");
		
		Thread.sleep(1000);
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	
	    js.executeScript("window.scrollBy(1000,500)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(1000,-500)");
		
	}

}
